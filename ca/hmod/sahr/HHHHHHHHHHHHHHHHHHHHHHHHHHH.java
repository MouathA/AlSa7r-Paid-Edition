//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.event.entity.player.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH chance;
    private HHHHHHH only_sword;
    
    @SubscribeEvent
    public void tick(final AttackEntityEvent attackEntityEvent) {
        final double random = Math.random();
        if (!this.getState()) {
            return;
        }
        if (!(attackEntityEvent.target instanceof EntityPlayer)) {
            return;
        }
        if (this.only_sword.getState()) {
            if (HHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(HHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword) && !(HHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemAxe)) {
                return;
            }
        }
        if (random < this.chance.getValue() / 100.0) {
            final EntityPlayerSP thePlayer = HHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer;
            thePlayer.motionX /= 0.6;
            final EntityPlayerSP thePlayer2 = HHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer;
            thePlayer2.motionZ /= 0.6;
            Minecraft.getMinecraft().thePlayer.setSprinting(true);
        }
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        super("KeepSprint", 0, Category.Blatant);
        this.chance = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Chance", 100.0, 0.0, 100.0);
        this.only_sword = new HHHHHHH("Sword / Axe", false);
        this.addValue(this.chance);
        this.addBoolean(this.only_sword);
    }
}
