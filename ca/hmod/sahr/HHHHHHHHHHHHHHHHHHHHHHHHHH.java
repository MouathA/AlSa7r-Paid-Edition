//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.client.event.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import net.minecraft.util.*;
import java.awt.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private int y;
    private int name_y;
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHH() {
        super(Modules.Hud.name(), 0, Category.Player);
        this.y = 16;
        this.name_y = 0;
    }
    
    @SubscribeEvent
    public void render(final RenderGameOverlayEvent.Post post) {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHH.mc.currentScreen instanceof GuiMainMenu) {
            return;
        }
        if (post.type != RenderGameOverlayEvent.ElementType.TEXT) {
            return;
        }
        GL11.glPushMatrix();
        HHHHHHHHHHHHHHHHHHHHHHHHHH.mc.fontRendererObj.drawStringWithShadow(EnumChatFormatting.BOLD + HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getName() + HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getVersion(), 0.0f, (float)this.name_y, Color.HSBtoRGB((System.currentTimeMillis() + 1500L) % 5000L / 4750.0f, 0.8f, 0.8f));
        for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModuleManager().getModules()) {
            if (hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh != null && hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh != HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule((Class<? extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH>)HHHHHHHHHHH.class) && hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh != this && hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getState()) {
                HHHHHHHHHHHHHHHHHHHHHHHHHH.mc.fontRendererObj.drawStringWithShadow(hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getName(), 0.0f, (float)this.y, this.rainbow(50));
                this.y += 8;
            }
        }
        GL11.glPopMatrix();
    }
    
    private int rainbow(final int n) {
        return Color.getHSBColor((float)(Math.ceil((double)((System.currentTimeMillis() + n) / 4L)) % 360.0 / 360.0), 0.2f, 2.0f).getRGB();
    }
}
