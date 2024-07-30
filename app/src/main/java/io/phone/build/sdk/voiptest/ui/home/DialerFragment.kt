package io.phone.build.sdk.voiptest.ui.home

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import io.phone.build.sdk.voipsdkandroid.PIL
import io.phone.build.sdk.voipsdkandroid.contacts.SupplementaryContact
import io.phone.build.sdk.voipsdkandroid.events.Event
import io.phone.build.sdk.voipsdkandroid.events.PILEventListener
import io.phone.build.sdk.voiptest.R
import io.phone.build.sdk.voiptest.ui.Dialer

class DialerFragment : Fragment(), PILEventListener {

    private val pil by lazy {
        PIL.instance
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_dialer, container, false)
        return root
    }

    override fun onResume() {
        super.onResume()
        pil.events.listen(this)
    }

    override fun onPause() {
        super.onPause()
        pil.events.stopListening(this)
    }

    override fun onEvent(event: Event) {
    }

    private fun requestCallingPermissions() {
        val requiredPermissions = arrayOf(
            Manifest.permission.CALL_PHONE,
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.READ_CONTACTS,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.BLUETOOTH_CONNECT,
        )

        requiredPermissions.forEach { permission ->
            if (ContextCompat.checkSelfPermission(requireActivity(), permission) == PackageManager.PERMISSION_DENIED) {
                requireActivity().requestPermissions(requiredPermissions, 101)
                return
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        /*dialer.onCallListener = Dialer.OnCallListener { number ->
            requestCallingPermissions()
            pil.preferences = pil.preferences.copy(supplementaryContacts = setOf(
                SupplementaryContact(name = "Supplementary Contact", number = number)
            ))

            if (ContextCompat.checkSelfPermission(requireActivity(), Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                pil.call(number)
            }
        }*/
    }
}