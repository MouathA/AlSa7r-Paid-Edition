//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.event.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHH Sword;
    
    @SubscribeEvent
    public void crits(final AttackEntityEvent attackEntityEvent) {
        if (!this.getState()) {
            return;
        }
        if (!HHHHHHHHHHHHHH.mc.thePlayer.onGround) {
            return;
        }
        if (this.Sword.getState()) {
            if (HHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(HHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword) && !(HHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemAxe)) {
                return;
            }
        }
        if (attackEntityEvent.target instanceof EntityPlayer && !HHHHHHHHHHHHHH.mc.thePlayer.isInWater()) {
            HHHHHHHHHHHHHH.mc.thePlayer.jump();
        }
    }
    
    public HHHHHHHHHHHHHH() {
        super("Crits", 0, Category.Blatant);
        this.addBoolean(this.Sword = new HHHHHHH("Sword / Axe", false));
    }
}
