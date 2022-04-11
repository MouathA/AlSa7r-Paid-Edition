//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import com.sun.jna.platform.unix.*;
import net.minecraft.client.*;
import java.awt.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import com.ibm.icu.math.*;
import org.lwjgl.input.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHH
{
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH parent;
    private X11.Screen color;
    private boolean hovered;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH value;
    private int y;
    private Minecraft mc;
    private int offset;
    private int x;
    
    public void setOff(final int offset) {
        this.offset = offset;
    }
    
    public void render() {
        final int n = (int)(this.value.getValue() / this.value.getMax() * 70.0);
        Gui.drawRect(this.parent.parent.getX() + 1, this.parent.parent.getY() + this.offset, this.parent.parent.getX() + this.parent.parent.getWidth() - 2, this.parent.parent.getY() + this.offset + 16, new Color(32, 32, 32).getRGB());
        Gui.drawRect(this.parent.parent.getX() + 4, this.parent.parent.getY() + this.offset, this.parent.parent.getX() + 4 + n + 2, this.parent.parent.getY() + this.offset + 12, new Color(128, 128, 128).getRGB());
        GL11.glPushMatrix();
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        final Minecraft mc = this.mc;
        Minecraft.getMinecraft().fontRendererObj.drawString(String.valueOf(this.value.getName() + " : " + this.value.getValue()), this.parent.parent.getX() * 2 + 12, (this.parent.parent.getY() + this.offset - 1) * 2 + 6, -1);
        GL11.glPopMatrix();
    }
    
    private double round(final double n, final int n2) {
        return new BigDecimal(n).setScale(n2, 4).doubleValue();
    }
    
    public boolean isMouseOnButtonD(final int n, final int n2) {
        return n > this.x && n < this.x + (this.parent.parent.getWidth() / 2 + 1) && n2 > this.y && n2 < this.y + 12;
    }
    
    public boolean isMouseOnButtonI(final int n, final int n2) {
        return n > this.x + this.parent.parent.getWidth() / 2 && n < this.x + this.parent.parent.getWidth() && n2 > this.y && n2 < this.y + 12;
    }
    
    public void mouseClicked(final int n, final int n2, final int n3) {
        if (this.isMouseOnButtonD(n, n2) && n3 == 0 && this.parent.open) {
            final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH value = this.value;
            value.setValue(Math.round((value.getValue() - 0.1) * 10.0) / 10.0);
        }
        if (this.isMouseOnButtonI(n, n2) && n3 == 0 && this.parent.open) {
            final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH value2 = this.value;
            value2.setValue(Math.round((value2.getValue() + 0.1) * 10.0) / 10.0);
        }
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH(final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH value, final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH parent, final int offset) {
        this.mc = Minecraft.getMinecraft();
        this.value = value;
        this.parent = parent;
        this.x = parent.parent.getX() + parent.parent.getWidth();
        this.y = parent.parent.getY() + parent.offset;
        this.offset = offset;
    }
    
    public void updateComponent(final int n, final int n2) {
        this.hovered = (this.isMouseOnButtonD(n, n2) || this.isMouseOnButtonI(n, n2));
        this.y = this.parent.parent.getY() + this.offset;
        this.x = this.parent.parent.getX();
        if (this.hovered && this.parent.open && Mouse.isButtonDown(0)) {
            this.value.setValue(this.round((n - this.parent.parent.getX()) / (double)(this.parent.parent.getWidth() - 1) * this.value.getMax(), 1));
        }
    }
}
