package net.ccbluex.liquidbounce.ui.client.clickgui.panel

import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.ui.client.clickgui.theme.PurpleTheme
import net.ccbluex.liquidbounce.utils.render.RenderUtils
// Disabled for FCL

class CategoryPanel(
    val category: ModuleCategory,
    var x: Float,
    var y: Float,
    val width: Float,
    val height: Float
) {

    fun draw(g: Any) {
        if (!net.ccbluex.liquidbounce.utils.platform.PlatformUtils.isAndroid) RenderUtils.drawRoundedRect(
            x, y, width, height, 8f, PurpleTheme.panel
        )
        g.color = PurpleTheme.textMain
        g.drawString(category.displayName, (x + 10).toInt(), (y + 18).toInt())
    }
}
