package io.phone.build.sdk.voiptest.ui.settings

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.text.InputType
import android.widget.Toast
import androidx.preference.EditTextPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import androidx.preference.R
import androidx.preference.SwitchPreferenceCompat
import io.phone.build.sdk.voipsdkandroid.PIL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject

class SettingsFragment : PreferenceFragmentCompat() {

    private val prefs by lazy {
        activity?.let { PreferenceManager.getDefaultSharedPreferences(it) }
    }

    private val pil by lazy { PIL.instance }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        loadFromFile()
        setPreferencesFromResource(io.phone.build.sdk.voiptest.R.xml.settings, rootKey)

        findPreference<Preference>("status")?.setOnPreferenceClickListener {
            updateAuthenticationStatus()
            true
        }

        findPreference<Preference>("stop")?.setOnPreferenceClickListener {
            pil.stop()
            true
        }


        findPreference<Preference>("voipgrid_middleware_register")?.setOnPreferenceClickListener {
//            GlobalScope.launch {
//                val newToken = prefs.getString("voipgrid_api_token", "")
//                performRegister(newToken.toString())
//            }
            true
        }

        findPreference<Preference>("voipgrid_middleware_unregister")?.setOnPreferenceClickListener {
//            GlobalScope.launch {
//                val message = if (voIPGRIDMiddleware.unregister()) "Unregistered!" else "Unregistration failed..."
//                requireActivity().runOnUiThread { Toast.makeText(requireActivity(), message, Toast.LENGTH_LONG).show() }
//            }
            true
        }

        findPreference<SwitchPreferenceCompat>("use_application_provided_ringtone")?.setOnPreferenceChangeListener { _, newValue ->
            PIL.instance.preferences = PIL.instance.preferences.copy(useApplicationProvidedRingtone = newValue as Boolean)
            true
        }
    }

    private fun updateVoipgridSummary(authenticated: Boolean, token: String? = null) {
        print("[RETURN TOKEN SUMMARY] $token")
        val summary = if (authenticated) "$token" else "Authentication failed"

        activity?.runOnUiThread {
            findPreference<Preference>("voipgrid_status")?.summaryProvider = Preference.SummaryProvider<Preference> {
                summary
            }

            findPreference<Preference>("voipgrid_middleware_register")?.isEnabled = authenticated
            findPreference<Preference>("voipgrid_middleware_unregister")?.isEnabled = authenticated
        }

    }

    private fun performRegister(token: String) {
        print("[RETURN TOKEN SUMMARY] $token")
        findPreference<Preference>("status")?.summaryProvider = Preference.SummaryProvider<Preference> {
            "Checking authentication..."
        }
    }

    /**
     * Updates the authentication status field.
     *
     */
    private fun updateAuthenticationStatus() {
        findPreference<Preference>("status")?.summaryProvider = Preference.SummaryProvider<Preference> {
            "Checking authentication..."
        }

        pil.fetchAuth()

        GlobalScope.launch(Dispatchers.IO) {
            val summary = if (pil.performRegistrationCheck()) "Authenticated" else "Authentication failed"
            withContext(Dispatchers.Main) {
                Toast.makeText(context, summary, Toast.LENGTH_SHORT).show()
            }
            activity?.runOnUiThread {
                findPreference<Preference>("status")?.summaryProvider = Preference.SummaryProvider<Preference> {
                    summary
                }
            }
        }
    }

    @SuppressLint("ApplySharedPref")
    private fun loadFromFile() {
        /*val keyToDefault = mapOf(
            "username" to getString(io.phone.build.voipexample.R.string.default_sip_user),
            "password" to getString(io.phone.build.voipexample.R.string.default_sip_password),
            "domain" to getString(io.phone.build.voipexample.R.string.default_sip_domain),
            "port" to getString(io.phone.build.voipexample.R.string.default_sip_port),
            "voipgrid_username" to getString(io.phone.build.voipexample.R.string.default_voipgrid_username),
            "voipgrid_password" to getString(io.phone.build.voipexample.R.string.default_voipgrid_password)
        )

        keyToDefault.forEach {
            if (prefs.getString(it.key, "")!!.isEmpty()) {
                prefs.edit().putString(it.key, it.value).commit()
            }
        }*/
    }

    override fun onResume() {
        super.onResume()
        updateAuthenticationStatus()
    }
}