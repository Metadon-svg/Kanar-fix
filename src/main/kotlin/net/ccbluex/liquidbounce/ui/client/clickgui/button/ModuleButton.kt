package net.ccbluex.liquidbounce.ui.client.clickgui.button

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.ui.client.clickgui.theme.PurpleTheme
import net.ccbluex.liquidbounce.utils.render.RenderUtils
// Disabled for FCL

class ModuleButton(
    val module: Module,
    var x: Float,
    var y: Float,
    val width: Float,
    val height: Float
) {

    fun draw(g: Any) {
        if (!net.ccbluex.liquidbounce.utils.platform.PlatformUtils.isAndroid) RenderUtils.drawRoundedRect(
            x, y, width, height, 6f,
            if (module.state) PurpleTheme.accentDim else PurpleTheme.panel
        )

        g.color = PurpleTheme.textMain
        g.drawString(module.name, (x + 10).toInt(), (y + 16).toInt())
    }
}
