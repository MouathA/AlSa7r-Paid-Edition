//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import java.awt.*;

public class HHHHHHHH extends HHHHHHHHHHHH
{
    private int y;
    private int offset;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH parent;
    private HHHHHHH op;
    private boolean hovered;
    private int x;
    
    public boolean isMouseOnButton(final int n, final int n2) {
        return n > this.x && n < this.x + 105 && n2 > this.y && n2 < this.y + 12;
    }
    
    @Override
    public void render() {
        Gui.drawRect(this.parent.parent.getX() + 1, this.parent.parent.getY() + 12 + this.offset, this.parent.parent.getX() - 2 + this.parent.parent.getWidth() * 1, this.parent.parent.getY() + this.offset, this.hovered ? -14540254 : -15658735);
        GL11.glPushMatrix();
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        if (HHHHHHHHHHH.Rainbow.getState()) {
            Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(this.op.getName(), (float)((this.parent.parent.getX() + 10 + 4) * 2 + 5), (float)((this.parent.parent.getY() + this.offset + 2) * 2 + 4), Color.HSBtoRGB((System.currentTimeMillis() + 1500L) % 5000L / 4750.0f, 0.8f, 0.8f));
        }
        else {
            Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(this.op.getName(), (float)((this.parent.parent.getX() + 10 + 4) * 2 + 5), (float)((this.parent.parent.getY() + this.offset + 2) * 2 + 4), HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getColor().getRGB());
        }
        GL11.glPopMatrix();
        Gui.drawRect(this.parent.parent.getX() + 4 + 4, this.parent.parent.getY() + this.offset + 4, this.parent.parent.getX() + 8 + 4, this.parent.parent.getY() + this.offset + 8, -10066330);
        if (this.op.getState()) {
            if (HHHHHHHHHHH.Rainbow.getState()) {
                Gui.drawRect(this.parent.parent.getX() + 3 + 4, this.parent.parent.getY() + this.offset + 3, this.parent.parent.getX() + 9 + 4, this.parent.parent.getY() + this.offset + 9, Color.HSBtoRGB((System.currentTimeMillis() + 1500L) % 5000L / 4750.0f, 0.8f, 0.8f));
            }
            else {
                Gui.drawRect(this.parent.parent.getX() + 3 + 4, this.parent.parent.getY() + this.offset + 3, this.parent.parent.getX() + 9 + 4, this.parent.parent.getY() + this.offset + 9, HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getColor().getRGB());
            }
        }
    }
    
    @Override
    public void mouseClicked(final int n, final int n2, final int n3) {
        if (this.isMouseOnButton(n, n2) && n3 == 0 && this.parent.open) {
            this.op.toggle();
        }
    }
    
    @Override
    public void setOff(final int offset) {
        this.offset = offset;
    }
    
    @Override
    public void updateComponent(final int n, final int n2) {
        this.hovered = this.isMouseOnButton(n, n2);
        this.y = this.parent.parent.getY() + this.offset;
        this.x = this.parent.parent.getX();
    }
    
    public HHHHHHHH(final HHHHHHH op, final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH parent, final int offset) {
        this.op = op;
        this.parent = parent;
        this.x = parent.parent.getX() + parent.parent.getWidth();
        this.y = parent.parent.getY() + parent.offset;
        this.offset = offset;
    }
}
