package io.phone.build.sdk.voipsdkandroid.exception

class PILAlreadyInitializedException internal constructor(): Exception("The PIL has already been initialized, make sure startAndroidPIL is only called once.")