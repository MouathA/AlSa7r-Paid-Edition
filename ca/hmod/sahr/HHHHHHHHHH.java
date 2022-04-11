//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.gui.*;
import net.minecraft.client.*;
import java.awt.*;
import net.minecraft.util.*;
import java.util.*;

public class HHHHHHHHHH extends GuiScreen
{
    private ArrayList<HHHHHHHHHHHHHHHHHHH> frames;
    private Minecraft mc;
    private int name_y;
    
    public void drawScreen(final int n, final int n2, final float n3) {
        this.drawDefaultBackground();
        this.mc.fontRendererObj.drawStringWithShadow(EnumChatFormatting.BOLD + HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getName(), 9.0f, (float)this.name_y, new Color(51, 146, 64).getRGB());
        this.mc.getTextureManager().bindTexture(new ResourceLocation("hmodd", "Icon.png"));
        this.drawTexturedModalRect(-1, -1, 105, 80, 250, 250);
        for (final HHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhh : this.frames) {
            hhhhhhhhhhhhhhhhhhh.renderFrame(this.fontRendererObj);
            hhhhhhhhhhhhhhhhhhh.updatePosition(n, n2);
            final Iterator<HHHHHHHHHHHH> iterator2 = hhhhhhhhhhhhhhhhhhh.getComponents().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().updateComponent(n, n2);
            }
        }
    }
    
    protected void mouseReleased(final int n, final int n2, final int n3) {
        final Iterator<HHHHHHHHHHHHHHHHHHH> iterator = this.frames.iterator();
        while (iterator.hasNext()) {
            iterator.next().setDrag(false);
        }
    }
    
    protected void keyTyped(final char c, final int n) {
        for (final HHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhh : this.frames) {
            if (hhhhhhhhhhhhhhhhhhh.isOpen() && n != 1 && !hhhhhhhhhhhhhhhhhhh.getComponents().isEmpty()) {
                final Iterator<HHHHHHHHHHHH> iterator2 = hhhhhhhhhhhhhhhhhhh.getComponents().iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().keyTyped(c, n);
                }
            }
        }
        if (n == 1) {
            this.mc.displayGuiScreen((GuiScreen)null);
        }
    }
    
    public HHHHHHHHHH() {
        this.name_y = 70;
        this.mc = Minecraft.getMinecraft();
        this.frames = new ArrayList<HHHHHHHHHHHHHHHHHHH>();
        int x = 100;
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.Category[] values;
        for (int length = (values = HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.Category.values()).length, i = 0; i < length; ++i) {
            final HHHHHHHHHHHHHHHHHHH e = new HHHHHHHHHHHHHHHHHHH(values[i]);
            e.setX(x);
            this.frames.add(e);
            x += e.getWidth() + 3;
        }
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    protected void mouseClicked(final int n, final int n2, final int n3) {
        for (final HHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhh : this.frames) {
            if (hhhhhhhhhhhhhhhhhhh.isWithinHeader(n, n2) && n3 == 0) {
                hhhhhhhhhhhhhhhhhhh.setDrag(true);
                hhhhhhhhhhhhhhhhhhh.drag_x = n - hhhhhhhhhhhhhhhhhhh.getX();
                hhhhhhhhhhhhhhhhhhh.drag_y = n2 - hhhhhhhhhhhhhhhhhhh.getY();
            }
            if (hhhhhhhhhhhhhhhhhhh.isWithinHeader(n, n2) && n3 == 1) {
                hhhhhhhhhhhhhhhhhhh.setOpen(!hhhhhhhhhhhhhhhhhhh.isOpen());
            }
            if (hhhhhhhhhhhhhhhhhhh.isOpen() && !hhhhhhhhhhhhhhhhhhh.getComponents().isEmpty()) {
                final Iterator<HHHHHHHHHHHH> iterator2 = hhhhhhhhhhhhhhhhhhh.getComponents().iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().mouseClicked(n, n2, n3);
                }
            }
        }
    }
}
