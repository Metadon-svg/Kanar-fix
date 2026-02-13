package net.ccbluex.liquidbounce.utils.render

import net.ccbluex.liquidbounce.utils.platform.PlatformUtils

object Safeif (!net.ccbluex.liquidbounce.utils.platform.PlatformUtils.isAndroid) RenderUtils.{

    fun canRenderAdvanced(): Boolean {
        return !PlatformUtils.isAndroid
    }
}
