package io.phone.build.sdk.voiptest

import android.app.Application
import android.util.Log
import io.phone.build.sdk.voipsdkandroid.configuration.ApplicationSetup
import io.phone.build.sdk.voipsdkandroid.configuration.AuthAssistant
import io.phone.build.sdk.voipsdkandroid.startAndroidPIL
import io.phone.build.sdk.voiptest.ui.call.CallActivity
import io.phone.build.sdk.voiptest.ui.call.IncomingCallActivity

class AppRoot : Application() {

    override fun onCreate() {
        super.onCreate()

        // val licenceConfig = AuthAssistant(accessToken = "V1RCa1MwNUZOVlZaTTFacFZqSjRNMWRYTlc1a1YxSjBUa1F4YVU1dFJteGFSR3hvV1dwa2FscEhXVFJPVkZGNlRXMU5lazFxUlROT1ZHUnBUa2RSTUU5RVJURk5NRFZWVmxSS1QyUjZNRGxaYWxwb1dsZFJOVmxYU1ROWk1sSnRUMFJWTUUxNlNtcE5la2w0VG5wVk0xbHFVbXRPUkdkNFRsUk9hazF0ZUROWk1HaExaRzFXU1dFelpFNVZla0kxVkZWU1NtUXdlSFJOV0VKcVVqQnZNRlJITldGa1Ywa3lXVmRXYTA5WFJtbE9NazVyV21wbk1VNUVUWGxaZWsxNVRWUmpNVTR5U1RCYVJGRTBUVlJWZWxRd1VrSmtNRFV6VUZReGFVNXRSbXhhUkd4b1dXcGthbHBIV1RST1ZGRjZUVzFOZWsxcVJUTk9WR1JwVGtkUk1FOUVSVEZOTVhCeFVWUkNUMDFyVlhkVU1WSlNUV3MxY1ZOWVpHRldSVVY2VkRCU1MySkZPVVZSVkVaUVVrZDBObGRXVWs1T1ZtdzJXa2RvVG1Gck1EbFphbHBvV2xkUk5WbFhTVE5aTWxKdFQwUlZNRTE2U21wTmVrbDRUbnBWTTFscVVtdE9SR2Q0VGxST2ExSXphRFk9", licencesKey = "trialabc")


        startAndroidPIL{
            // oauth = licenceConfig
            ApplicationSetup(
                application = this@AppRoot,
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
    }
}