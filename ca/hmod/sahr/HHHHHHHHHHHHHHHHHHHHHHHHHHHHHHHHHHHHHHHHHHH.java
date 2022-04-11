//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH Timer;
    
    public void onDisable() {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getTimer().stopTmr();
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (!this.getState()) {
            return;
        }
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getTimer().timer().timerSpeed = (float)this.Timer.getValue();
    }
    
    public void onEnable() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule((Class)HHHHHHHHHHHHHHHHHH.class).getState()) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule((Class)HHHHHHHHHHHHHHHHHH.class).setState(false);
        }
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        super("Timer", 0, HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.Category.Blatant);
        this.addValue(this.Timer = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Speed", 1.0, 0.0, 5.0));
    }
}
