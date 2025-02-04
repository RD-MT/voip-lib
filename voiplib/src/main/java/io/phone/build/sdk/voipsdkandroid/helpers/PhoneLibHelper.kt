package io.phone.build.sdk.voipsdkandroid.helpers

import io.phone.build.sdk.voipsdkandroid.PIL
import io.phone.build.sdk.voipsdkandroid.isNullOrInvalid
import io.phone.build.sdk.voipsdkandroid.logWithContext
import io.phone.build.sdk.voipsdkandroid.logging.LogLevel.ERROR
import io.phone.build.sdk.voiplib.VoIPLib
import io.phone.build.sdk.voiplib.model.RegistrationState.FAILED
import io.phone.build.sdk.voiplib.model.RegistrationState.REGISTERED
import io.phone.build.sdk.voipsdkandroid.logging.LogLevel as PilLogLevel

internal class VoIPLibHelper(
    private val pil: PIL,
    private val phoneLib: VoIPLib,
) {

    /**
     * Attempt to register if there are valid credentials.
     */
    fun register(callback: (Boolean) -> Unit) {
        if (pil.auth.isNullOrInvalid) {
            log("Unable to register as we have no authentication credentials", ERROR)
            callback.invoke(false)
            return
        }

        pil.writeLog("Attempting registration...")

        phoneLib.register { registrationState ->
            when (registrationState) {
                REGISTERED -> {
                    log("Registration was successful!")
                    callback.invoke(true)
                }
                FAILED -> {
                    log("Unable to register...")
                    callback.invoke(false)
                }
                else -> {}
            }
        }
    }

    private fun log(message: String, level: PilLogLevel = PilLogLevel.INFO) =
        logWithContext(message, "PHONE-LIB-HELPER", level)
}
