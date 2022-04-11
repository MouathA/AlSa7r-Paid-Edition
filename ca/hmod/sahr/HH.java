//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.item.*;
import org.lwjgl.input.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHH Sword;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH yawspeed;
    private HHHHHHH Click;
    private boolean AimBot;
    private boolean Team;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH fov;
    private boolean Invisibles;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH distance;
    
    private double fov(final Entity entity) {
        return ((HH.mc.thePlayer.rotationYaw - this.angels(entity)) % 360.0 + 540.0) % 360.0 - 180.0;
    }
    
    private boolean isValideTarget(final Entity entity) {
        return !(entity instanceof EntityPlayer) || ((EntityPlayer)entity).getTeam() == null || !((EntityPlayer)entity).isOnSameTeam((EntityLivingBase)HH.mc.thePlayer) || !this.isTeam();
    }
    
    public boolean isTeam() {
        return this.Team;
    }
    
    public HH() {
        super("AimAssist", 0, Category.Ghost);
        this.yawspeed = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Speed", 0.0, 0.0, 600.0);
        this.distance = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Distance", 3.0, 3.0, 8.0);
        this.fov = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Fov", 30.0, 30.0, 360.0);
        this.Sword = new HHHHHHH("Sword / Axe", false);
        this.Click = new HHHHHHH("While Click", false);
        this.addValue(this.yawspeed);
        this.addValue(this.distance);
        this.addValue(this.fov);
        this.addBoolean(this.Click);
        this.addBoolean(this.Sword);
    }
    
    private Entity getEntity() {
        Entity entity = null;
        int n = (int)this.fov.getValue();
        for (final Entity entity2 : HH.mc.theWorld.loadedEntityList) {
            if (entity2.isEntityAlive() && !entity2.isInvisible() && entity2 != HH.mc.thePlayer && HH.mc.thePlayer.getDistanceToEntity(entity2) <= this.distance.getValue() && this.isValideTarget(entity2) && entity2 instanceof EntityPlayer && HH.mc.thePlayer.canEntityBeSeen(entity2) && this.rotation(entity2, (float)n)) {
                entity = entity2;
                n = (int)this.fov(entity2);
            }
        }
        return entity;
    }
    
    private boolean rotation(final Entity entity, float n) {
        n *= 0.5;
        final double n2 = ((HH.mc.thePlayer.rotationYaw - this.angels(entity)) % 360.0 + 540.0) % 360.0 - 180.0;
        return (n2 > 0.0 && n2 < n) || (-n < n2 && n2 < 0.0);
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (HH.mc.theWorld != null) {
            if (this.Sword.getState()) {
                if (HH.mc.thePlayer.getCurrentEquippedItem() == null) {
                    return;
                }
                if (!(HH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword)) {
                    return;
                }
            }
            if (this.Click.getState() && !Mouse.isButtonDown(0)) {
                return;
            }
            if (HH.mc.currentScreen != null) {
                return;
            }
            final Entity entity = this.getEntity();
            if (this.getState() && entity != null && (this.fov(entity) > 1.0 || this.fov(entity) < -1.0)) {
                final boolean b = this.fov(entity) > 0.0;
                final EntityPlayerSP thePlayer = HH.mc.thePlayer;
                thePlayer.rotationYaw += (float)(b ? (-(Math.abs(this.fov(entity)) / this.yawspeed.getValue())) : (Math.abs(this.fov(entity)) / this.yawspeed.getValue()));
            }
        }
    }
    
    private float angels(final Entity entity) {
        final double y = entity.posX - HH.mc.thePlayer.posX;
        final double n = entity.posY - HH.mc.thePlayer.posY;
        final double x = entity.posZ - HH.mc.thePlayer.posZ;
        final double n2 = -(Math.atan2(y, x) * 57.29577951308232);
        final double n3 = -(Math.asin(n / Math.sqrt(y * y + n * n + x * x)) * 57.29577951308232);
        return (float)n2;
    }
}
