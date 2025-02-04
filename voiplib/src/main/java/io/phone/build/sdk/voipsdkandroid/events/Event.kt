package io.phone.build.sdk.voipsdkandroid.events

import io.phone.build.sdk.voipsdkandroid.CallSessionState

interface PILEventListener {
    fun onEvent(event: Event)
}

sealed class Event {

    sealed class CallSessionEvent(val state: CallSessionState): Event() {
        class OutgoingCallStarted(state: CallSessionState) : CallSessionEvent(state)
        class IncomingCallReceived(state: CallSessionState) : CallSessionEvent(state)
        class CallEnded(state: CallSessionState) : CallSessionEvent(state)
        class CallReleased(state: CallSessionState) : CallSessionEvent(state)
        class CallConnected(state: CallSessionState) : CallSessionEvent(state)
        class CallDurationUpdated(state: CallSessionState) : CallSessionEvent(state)
        class AudioStateUpdated(state: CallSessionState) : CallSessionEvent(state)
        class CallStateUpdated(state: CallSessionState) : CallSessionEvent(state)

        sealed class AttendedTransferEvent(state: CallSessionState): CallSessionEvent(state) {
            class AttendedTransferStarted(state: CallSessionState) : CallSessionEvent(state)
            class AttendedTransferConnected(state: CallSessionState) : CallSessionEvent(state)
            class AttendedTransferAborted(state: CallSessionState) : CallSessionEvent(state)
            class AttendedTransferEnded(state: CallSessionState) : CallSessionEvent(state)
        }
    }

    sealed class CallSetupFailedEvent(val reason: Reason): Event() {
        class OutgoingCallSetupFailed(reason: Reason): CallSetupFailedEvent(reason)
        class IncomingCallSetupFailed(reason: Reason): CallSetupFailedEvent(reason)

        enum class Reason {
            IN_CALL,
            REJECTED_BY_ANDROID_TELECOM_FRAMEWORK,
            UNABLE_TO_REGISTER
        }
    }
}