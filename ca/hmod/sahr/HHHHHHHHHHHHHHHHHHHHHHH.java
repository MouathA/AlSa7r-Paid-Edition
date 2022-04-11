//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.*;
import java.util.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.client.gui.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHH Aimbot;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH NoKBVValue;
    private HHHHHHH HitBox;
    private float health;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH NoKBHValue;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH Hearts;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH Timer;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH distance;
    private HHHHHHH attack;
    private HHHHHHH NoKB;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH timer;
    
    @Override
    public void onDisable() {
        HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.setHealth(HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getHealth());
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHH() {
        super("Hacker", 0, Category.Player);
        this.timer = (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH)new HHHHHHHHHHHHHHHHH(350);
        this.distance = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Distance", 3.0, 3.0, 6.0);
        this.Hearts = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Hearts", 1.0, 1.0, 10.0);
        this.attack = new HHHHHHH("Attack", true);
        this.Aimbot = new HHHHHHH("Aimbot", false);
        this.addValue(this.distance);
        this.addValue(this.Hearts);
        this.addBoolean(this.attack);
        this.addBoolean(this.Aimbot);
    }
    
    private void faceEntityManipulator(final Entity entity, final Entity entity2) {
        this.getClosestPlayer((float)this.distance.getValue());
        if (this.Aimbot.getState()) {
            final double n = entity.posX - entity2.posX;
            final double n2 = entity.posZ - entity2.posZ;
            entity2.rotationPitch = (float)(-(Math.atan2(entity.posY + entity.getEyeHeight() - (entity2.posY + entity2.getEyeHeight()), MathHelper.sqrt_double(n * n + n2 * n2)) * 180.0 / 3.141592653589793));
            final float rotationYaw = (float)(Math.atan2(n2, n) * 180.0 / 3.141592653589793) - 90.0f;
            entity2.setRotationYawHead((float)(-(Math.atan2(n, n2) * 180.0 / 3.141592653589793)));
            entity2.rotationYaw = rotationYaw;
        }
    }
    
    private boolean isAttackable(final EntityPlayer entityPlayer) {
        return Minecraft.getMinecraft().thePlayer.canEntityBeSeen((Entity)entityPlayer) && entityPlayer.getHealth() > 0.0f && !entityPlayer.isInvisible() && entityPlayer.ticksExisted > 60;
    }
    
    private EntityPlayer getClosestPlayer(final double n) {
        double n2 = n;
        EntityPlayer entityPlayer = null;
        for (final EntityPlayer entityPlayer2 : Minecraft.getMinecraft().theWorld.playerEntities) {
            if (entityPlayer2 != HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer && this.isAttackable(entityPlayer2)) {
                final double n3 = HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getDistanceToEntity((Entity)entityPlayer2);
                if (n3 > n2) {
                    continue;
                }
                n2 = n3;
                entityPlayer = entityPlayer2;
            }
        }
        return (entityPlayer != null) ? entityPlayer : null;
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.ClientTickEvent clientTickEvent) {
        if (this.Hearts.getValue() > 0.0) {
            final EntityPlayer closestPlayer = this.getClosestPlayer((float)this.distance.getValue());
            if (closestPlayer != null) {
                this.faceEntityManipulator((Entity)HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer, (Entity)closestPlayer);
                if (this.timer.output() && this.attack.getState()) {
                    if (HHHHHHHHHHHHHHHHHHHHHHH.mc.currentScreen instanceof GuiGameOver) {
                        return;
                    }
                    closestPlayer.swingItem();
                    HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.setHealth(HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getHealth() - (int)this.Hearts.getValue());
                    HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.performHurtAnimation();
                    HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.hurtResistantTime = 20;
                    HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.playSound("game.player.hurt", 1.0f, 1.0f);
                    HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.motionX = Math.cos(Math.toRadians(closestPlayer.rotationYaw)) * 0.10000000149011612;
                    HHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.motionZ = Math.sin(Math.toRadians(closestPlayer.rotationYaw)) * 0.10000000149011612;
                }
            }
        }
    }
}
