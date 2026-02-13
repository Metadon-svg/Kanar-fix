package net.ccbluex.liquidbounce.utils.render

import net.minecraft.client.gui.DrawContext

object SafeRenderUtils {
    fun drawRect(context: DrawContext, x: Float, y: Float, width: Float, height: Float, color: Int) {
        context.fill(x.toInt(), y.toInt(), (x + width).toInt(), (y + height).toInt(), color)
    }

    fun drawString(context: DrawContext, text: String, x: Float, y: Float, color: Int) {
        context.drawTextWithShadow(null, text, x.toInt(), y.toInt(), color)
    }
}
