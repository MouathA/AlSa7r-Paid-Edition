//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.entity.*;
import net.minecraft.client.*;
import net.minecraft.client.multiplayer.*;

public class HHHHH
{
    public WorldClient getWorld() {
        return this.getMinecraft().theWorld;
    }
    
    public EntityPlayerSP getPlayer() {
        return this.getMinecraft().thePlayer;
    }
    
    public Minecraft getMinecraft() {
        return Minecraft.getMinecraft();
    }
    
    public void drawCenteredString(final String s, final int n, final int n2, final int n3) {
        this.getMinecraft().fontRendererObj.drawString(s, n - this.getMinecraft().fontRendererObj.getStringWidth(s) / 2, n2, n3);
    }
    
    public PlayerControllerMP getPlayerController() {
        return this.getMinecraft().playerController;
    }
}
