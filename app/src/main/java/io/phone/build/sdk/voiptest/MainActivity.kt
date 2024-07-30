package io.phone.build.sdk.voiptest

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import io.phone.build.sdk.voipsdkandroid.PIL
import io.phone.build.sdk.voipsdkandroid.configuration.ApplicationSetup
import io.phone.build.sdk.voipsdkandroid.configuration.AuthAssistant
import io.phone.build.sdk.voipsdkandroid.startAndroidPIL
import io.phone.build.sdk.voiptest.ui.call.CallActivity
import io.phone.build.sdk.voiptest.ui.call.IncomingCallActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    companion object {
        private const val REQUEST_CALL_PHONE = 1
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val pil = startAndroidPIL{
            // oauth = licenceConfig
            ApplicationSetup(
                application = this@MainActivity.application,
                activities = ApplicationSetup.Activities(
                    call = CallActivity::class.java,
                    incomingCall = IncomingCallActivity::class.java
                ),
                middleware = null,
                logger = { message, _ -> Log.i("PIL-Logger", message) },
                userAgent = "Android SDK Kotlin 1.8.0",
                notifyOnMissedCall = true,
                onMissedCallNotificationPressed = null
            )
        }

        pil.licenceConfig = AuthAssistant(accessToken = "V1RCa1MwNUZOVlZaTTFacFZqSjRNMWRYTlc1a1YxSjBUa1F4YVU1dFJteGFSR3hvV1dwa2FscEhXVFJPVkZGNlRXMU5lazFxUlROT1ZHUnBUa2RSTUU5RVJURk5NRFZWVmxSS1QyUjZNRGxaYWxwb1dsZFJOVmxYU1ROWk1sSnRUMFJWTUUxNlNtcE5la2w0VG5wVk0xbHFVbXRPUkdkNFRsUk9hazF0ZUROWk1HaExaRzFXU1dFelpFNVZla0kxVkZWU1NtUXdlSFJOV0VKcVVqQnZNRlJITldGa1Ywa3lXVmRXYTA5WFJtbE9NazVyV21wbk1VNUVUWGxaZWsxNVRWUmpNVTR5U1RCYVJGRTBUVlJWZWxRd1VrSmtNRFV6VUZReGFVNXRSbXhhUkd4b1dXcGthbHBIV1RST1ZGRjZUVzFOZWsxcVJUTk9WR1JwVGtkUk1FOUVSVEZOTVhCeFVWUkNUMDFyVlhkVU1WSlNUV3MxY1ZOWVpHRldSVVY2VkRCU1MySkZPVVZSVkVaUVVrZDBObGRXVWs1T1ZtdzJXa2RvVG1Gck1EbFphbHBvV2xkUk5WbFhTVE5aTWxKdFQwUlZNRTE2U21wTmVrbDRUbnBWTTFscVVtdE9SR2Q0VGxST2ExSXphRFk9", licencesKey = "trialabc")
        CoroutineScope(Dispatchers.Default).launch {
            pil.startedCore()
        }
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), REQUEST_CALL_PHONE)
        }

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_dashboard
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CALL_PHONE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Quyền được cấp, bắt đầu PIL
                startPIL()
            } else {
            }
        }
    }


    private fun startPIL() {

        /*pil.licenceConfig = AuthAssistant(accessToken = "V1RCa1MwNUZOVlZaTTFacFZqSjRNMWRYTlc1a1YxSjBUa1F4YVU1dFJteGFSR3hvV1dwa2FscEhXVFJPVkZGNlRXMU5lazFxUlROT1ZHUnBUa2RSTUU5RVJURk5NRFZWVmxSS1QyUjZNRGxaYWxwb1dsZFJOVmxYU1ROWk1sSnRUMFJWTUUxNlNtcE5la2w0VG5wVk0xbHFVbXRPUkdkNFRsUk9hazF0ZUROWk1HaExaRzFXU1dFelpFNVZla0kxVkZWU1NtUXdlSFJOV0VKcVVqQnZNRlJITldGa1Ywa3lXVmRXYTA5WFJtbE9NazVyV21wbk1VNUVUWGxaZWsxNVRWUmpNVTR5U1RCYVJGRTBUVlJWZWxRd1VrSmtNRFV6VUZReGFVNXRSbXhhUkd4b1dXcGthbHBIV1RST1ZGRjZUVzFOZWsxcVJUTk9WR1JwVGtkUk1FOUVSVEZOTVhCeFVWUkNUMDFyVlhkVU1WSlNUV3MxY1ZOWVpHRldSVVY2VkRCU1MySkZPVVZSVkVaUVVrZDBObGRXVWs1T1ZtdzJXa2RvVG1Gck1EbFphbHBvV2xkUk5WbFhTVE5aTWxKdFQwUlZNRTE2U21wTmVrbDRUbnBWTTFscVVtdE9SR2Q0VGxST2ExSXphRFk9", licencesKey = "trialabc")
        CoroutineScope(Dispatchers.Default).launch {
            pil.startedCore()
        }*/
    }


}