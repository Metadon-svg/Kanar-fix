import net.ccbluex.liquidbounce.utils.platform.PlatformUtils
package net.ccbluex.liquidbounce.ui.client.clickgui

import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.ui.client.clickgui.panel.CategoryPanel
import net.minecraft.client.gui.screen.Screen
import net.minecraft.text.Text
// Disabled for FCL

class ClickGuiScreen : Screen(Text.of("ClickGUI")) {

    private val panels = mutableListOf<CategoryPanel>()

    override fun init() {
        var startX = 20f
        for (category in ModuleCategory.values()) {
            panels.add(
                CategoryPanel(
                    category,
                    startX,
                    20f,
                    140f,
                    260f
                )
            )
            startX += 150f
        }
    }

    override fun render(context: net.minecraft.client.gui.DrawContext, mouseX: Int, mouseY: Int, delta: Float) {
        val g = context.matrices.peek().positionMatrix
        panels.forEach {
            it.draw(context.matrices.peek().positionMatrix as Any)
        }
        super.render(context, mouseX, mouseY, delta)
    }
}
