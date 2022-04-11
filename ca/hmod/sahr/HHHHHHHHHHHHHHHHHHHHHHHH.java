//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.event.entity.living.*;
import net.minecraft.item.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH horizontal;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH chance;
    private HHHHHHH Sword;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH vertical;
    
    @SubscribeEvent
    public void tick(final LivingEvent.LivingUpdateEvent livingUpdateEvent) {
        final double random = Math.random();
        if (this.Sword.getState()) {
            if (HHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(HHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword) && !(HHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemAxe)) {
                return;
            }
        }
        if (HHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer == null && HHHHHHHHHHHHHHHHHHHHHHHH.mc.theWorld == null) {
            return;
        }
        if (HHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.hurtTime == HHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.maxHurtTime && HHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.maxHurtTime > 0 && random < this.chance.getValue() / 100.0) {
            final EntityPlayerSP thePlayer = HHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer;
            thePlayer.motionX *= this.horizontal.getValue() / 100.0;
            final EntityPlayerSP thePlayer2 = HHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer;
            thePlayer2.motionY *= this.vertical.getValue() / 100.0;
            final EntityPlayerSP thePlayer3 = HHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer;
            thePlayer3.motionZ *= this.horizontal.getValue() / 100.0;
        }
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHH() {
        super("Velocity", 0, Category.Ghost);
        this.horizontal = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Horizontal", 100.0, -15.0, 100.0);
        this.vertical = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Vertical", 100.0, -15.0, 100.0);
        this.chance = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Chance", 100.0, 0.0, 100.0);
        this.Sword = new HHHHHHH("Sword / Axe", false);
        this.addValue(this.horizontal);
        this.addValue(this.vertical);
        this.addValue(this.chance);
        this.addBoolean(this.Sword);
    }
}
