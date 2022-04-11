//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.potion.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    public HHHHHHHHHHHHHHHHHHHHH() {
        super("Gamma", 0, Category.Player);
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (!this.getState()) {
            return;
        }
        if (!HHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.isPotionActive(16)) {
            HHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.addPotionEffect(new PotionEffect(16, 100, 1));
        }
    }
    
    @Override
    public void onEnable() {
        HHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.addPotionEffect(new PotionEffect(16, 100, 1));
    }
    
    @Override
    public void onDisable() {
        if (HHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.isPotionActive(16)) {
            HHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.removePotionEffect(16);
        }
    }
}
