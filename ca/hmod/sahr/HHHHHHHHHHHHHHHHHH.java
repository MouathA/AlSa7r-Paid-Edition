//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHH vertical;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH Speed;
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (!this.getState()) {
            return;
        }
        if (!HHHHHHHHHHHHHHHHHH.mc.thePlayer.onGround) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getTimer().timer().timerSpeed = (float)this.Speed.getValue();
        }
        if (!this.vertical.getState()) {
            HHHHHHHHHHHHHHHHHH.mc.thePlayer.capabilities.isFlying = true;
        }
        else {
            final EntityPlayerSP thePlayer = HHHHHHHHHHHHHHHHHH.mc.thePlayer;
            thePlayer.motionY += 0.0095;
        }
    }
    
    @Override
    public void onEnable() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.class).getState()) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.class).setState(false);
        }
    }
    
    public HHHHHHHHHHHHHHHHHH() {
        super("Fly", 0, Category.Blatant);
        this.Speed = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Speed", 1.0, 0.1, 2.0);
        this.vertical = new HHHHHHH("Vertically", false);
        this.addValue(this.Speed);
        this.addBoolean(this.vertical);
    }
    
    @Override
    public void onDisable() {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getTimer().stopTmr();
        HHHHHHHHHHHHHHHHHH.mc.thePlayer.capabilities.isFlying = false;
    }
}
