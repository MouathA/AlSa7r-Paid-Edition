//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.settings.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH timer;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH Delay;
    private HHHHHHH Jump;
    
    @Override
    public void onDisable() {
        KeyBinding.setKeyBindState(HHH.mc.gameSettings.keyBindForward.getKeyCode(), false);
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (!this.getState()) {
            return;
        }
        KeyBinding.setKeyBindState(HHH.mc.gameSettings.keyBindForward.getKeyCode(), true);
        if (this.timer.hasReachedMS((int)this.Delay.getValue())) {
            final EntityPlayerSP thePlayer = HHH.mc.thePlayer;
            thePlayer.rotationYaw += 180.0f;
            if (this.Jump.getState()) {
                HHH.mc.thePlayer.jump();
            }
            this.timer.reset();
        }
    }
    
    public HHH() {
        super("AntiAFK", 0, Category.Player);
        this.Delay = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Delay", 1000.0, 1000.0, 60000.0);
        this.Jump = new HHHHHHH("Jump", false);
        this.addValue(this.Delay);
        this.addBoolean(this.Jump);
        this.timer = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH();
    }
}
