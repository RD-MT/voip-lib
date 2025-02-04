package io.phone.build.sdk.voipsdkandroid.notifications

import io.phone.build.sdk.voipsdkandroid.PIL
import io.phone.build.sdk.voipsdkandroid.log

internal class NotificationManager(
    private val pil: PIL,
    private val incomingCallNotification: IncomingCallNotification,
) {

    /**
     * Dismiss any notifications that should no longer be active. This can be called liberally
     * as it will check the state before taking any action.
     *
     */
    fun dismissStale() {
        if (!pil.calls.isInCall) {
            log("Dismissing stale incoming call notification")

            incomingCallNotification.cancel()
        }
    }
}