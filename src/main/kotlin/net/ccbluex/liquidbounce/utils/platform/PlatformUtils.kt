package net.ccbluex.liquidbounce.utils.platform

object PlatformUtils {

    val isAndroid: Boolean by lazy {
        try {
            Class.forName("android.os.Build")
            true
        } catch (e: Exception) {
            false
        }
    }

    val isFCL: Boolean by lazy {
        System.getProperty("java.vendor")?.lowercase()?.contains("android") == true
    }
}
