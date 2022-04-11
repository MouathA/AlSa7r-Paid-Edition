//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private Random rand;
    private HHHHHHH only_sword;
    private EntityLivingBase target;
    private HHHHHHH while_click;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH timer;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH attack_perk_seccond;
    private EntityLivingBase entity;
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer == null || HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.theWorld == null || HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.currentScreen != null || Mouse.isButtonDown(1)) {
            return;
        }
        if (this.while_click.getState() && !Mouse.isButtonDown(0)) {
            return;
        }
        if (this.only_sword.getState()) {
            if (HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword) && !(HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemAxe)) {
                return;
            }
        }
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.class).getState()) {
            this.target = this.getTarget(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getReach());
        }
        else {
            this.target = this.getTarget(3.0);
        }
        if (this.target != null && this.timer.hasReachedMS(1000.0 / this.attack_perk_seccond.getValue())) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.swingItem();
            HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.playerController.attackEntity((EntityPlayer)HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer, (Entity)this.target);
            this.timer.reset();
        }
    }
    
    private EntityLivingBase getTarget(final double n) {
        EntityLivingBase entityLivingBase = null;
        double n2 = 100.0;
        for (final Entity entity : HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.theWorld.loadedEntityList) {
            final double n3 = HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getDistanceToEntity(entity);
            if (n3 < n && entity != HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer && entity instanceof EntityPlayer && n2 > n3) {
                entityLivingBase = (EntityLivingBase)entity;
                n2 = n3;
            }
        }
        return entityLivingBase;
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        super("KillAura", 0, Category.Blatant);
        this.attack_perk_seccond = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("APS", 5.0, 5.0, 20.0);
        this.only_sword = new HHHHHHH("Sword / Axe", false);
        this.while_click = new HHHHHHH("While Click", false);
        this.addValue(this.attack_perk_seccond);
        this.addBoolean(this.only_sword);
        this.addBoolean(this.while_click);
        this.timer = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH();
        this.rand = new Random();
    }
}
