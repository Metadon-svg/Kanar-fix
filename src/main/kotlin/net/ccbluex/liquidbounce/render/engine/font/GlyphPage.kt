package net.ccbluex.liquidbounce.render.engine.font

import net.ccbluex.liquidbounce.utils.render.SafeRenderUtils
import net.minecraft.client.gui.DrawContext

class GlyphPage(private val context: DrawContext) {

    fun drawChar(char: Char, x: Float, y: Float, color: Int) {
        SafeRenderUtils.drawString(context, char.toString(), x, y, color)
    }

    fun drawRect(x: Float, y: Float, width: Float, height: Float, color: Int) {
        SafeRenderUtils.drawRect(context, x, y, width, height, color)
    }
}
