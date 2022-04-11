//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import net.minecraft.item.*;
import net.minecraft.client.*;
import net.minecraft.client.network.*;
import net.minecraft.network.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private Entity pointedEntity;
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH min;
    private static float collision;
    private HHHHHHH spoof;
    private static double reach;
    private Random random;
    private HHHHHHH invis;
    private static HHHHHHH misplace;
    private HHHHHHH ony_sword;
    private MovingObjectPosition moving;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH chance;
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH max;
    
    public void onEnable() {
        if (this.getState() && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.min.getValue() > HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.max.getValue()) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.min.setValue(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.max.getValue() - 0.3);
        }
    }
    
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH getMax() {
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.max;
    }
    
    @SubscribeEvent
    public void Recuder(final TickEvent.ClientTickEvent clientTickEvent) {
        if (this.getState() && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.currentScreen instanceof HHHHHHHHHH && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.min.getValue() > HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.max.getValue()) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.min.setValue(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.max.getValue() - 0.1);
        }
    }
    
    @SubscribeEvent
    public void onMouse(final MouseEvent mouseEvent) {
        final double random = Math.random();
        if (this.ony_sword.getState()) {
            if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword) && !(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemAxe)) {
                return;
            }
        }
        if (this.invis.getState() && (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.isSneaking() || HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.isInWater() || !HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.isSprinting())) {
            return;
        }
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.misplace.getState()) {
            return;
        }
        if (random < this.chance.getValue() / 100.0) {
            final double value = HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.min.getValue();
            final double value2 = HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.max.getValue();
            final double n = value * 100.0;
            final double n2 = value2 * 100.0;
            final int n3 = (int)n;
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.reach = (new Random().nextInt((int)n2 - n3 + 1) + n3) / 100.0;
            this.getMouseOver(1.0f);
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.objectMouseOver = this.moving;
        }
    }
    
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH getMin() {
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.min;
    }
    
    public static double getReach() {
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.reach;
    }
    
    public static void setCollision(final int n) {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.collision = (float)n;
    }
    
    @SubscribeEvent
    public void onClientTick(final TickEvent.ClientTickEvent clientTickEvent) {
        if (!this.getState() && !HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.misplace.getState()) {
            return;
        }
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer == null && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.theWorld == null) {
            return;
        }
        final INetHandler getNetHandler = Minecraft.getMinecraft().thePlayer.sendQueue.getNetworkManager().getNetHandler();
        if (!(getNetHandler instanceof HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH)) {
            Minecraft.getMinecraft().thePlayer.sendQueue.getNetworkManager().setNetHandler((INetHandler)new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH((NetHandlerPlayClient)getNetHandler));
        }
    }
    
    public void onDisable() {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.reach = 3.0;
    }
    
    public static HHHHHHH getMisplace() {
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.misplace;
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        super("Reach", 0, HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.Category.Ghost);
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.max = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Min", 3.0, 3.0, 7.0);
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.min = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Max", 3.0, 3.0, 7.0);
        this.chance = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Chance", 100.0, 0.0, 100.0);
        this.invis = new HHHHHHH("Invis", false);
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.misplace = new HHHHHHH("Misplace", false);
        this.ony_sword = new HHHHHHH("Sword / Axe", false);
        this.addValue(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.min);
        this.addValue(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.max);
        this.addValue(this.chance);
        this.addBoolean(this.invis);
        this.addBoolean(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.misplace);
        this.addBoolean(this.ony_sword);
    }
    
    private void getMouseOver(final float n) {
        if (Minecraft.getMinecraft().getRenderViewEntity() != null && Minecraft.getMinecraft().theWorld != null) {
            Minecraft.getMinecraft().pointedEntity = null;
            final double reach = HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.reach;
            this.moving = Minecraft.getMinecraft().getRenderViewEntity().rayTrace(reach, n);
            double distanceTo = reach;
            final Vec3 getPositionEyes = Minecraft.getMinecraft().getRenderViewEntity().getPositionEyes(n);
            if (this.moving != null) {
                distanceTo = this.moving.hitVec.distanceTo(getPositionEyes);
            }
            final Vec3 getLook = Minecraft.getMinecraft().getRenderViewEntity().getLook(n);
            final Vec3 addVector = getPositionEyes.addVector(getLook.xCoord * reach, getLook.yCoord * reach, getLook.zCoord * reach);
            this.pointedEntity = null;
            Vec3 vec3 = null;
            final float n2 = 1.0f;
            final List getEntitiesWithinAABBExcludingEntity = Minecraft.getMinecraft().theWorld.getEntitiesWithinAABBExcludingEntity(Minecraft.getMinecraft().getRenderViewEntity(), Minecraft.getMinecraft().getRenderViewEntity().getEntityBoundingBox().addCoord(getLook.xCoord * reach, getLook.yCoord * reach, getLook.zCoord * reach).expand((double)n2, (double)n2, (double)n2));
            double n3 = distanceTo;
            for (int i = 0; i < getEntitiesWithinAABBExcludingEntity.size(); ++i) {
                final Entity pointedEntity = getEntitiesWithinAABBExcludingEntity.get(i);
                if (pointedEntity.canBeCollidedWith()) {
                    if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule((Class)HHHHHHHHHHHHHHHHHHHHHHHHH.class).getState()) {
                        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.collision = pointedEntity.getCollisionBorderSize() * HHHHHHHHHHHHHHHHHHHHHHHHH.getHitbox();
                    }
                    else {
                        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.collision = pointedEntity.getCollisionBorderSize();
                    }
                    final AxisAlignedBB expand = pointedEntity.getEntityBoundingBox().expand((double)HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.collision, (double)HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.collision, (double)HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.collision);
                    final MovingObjectPosition calculateIntercept = expand.calculateIntercept(getPositionEyes, addVector);
                    if (expand.isVecInside(getPositionEyes)) {
                        if (0.0 < n3 || n3 == 0.0) {
                            this.pointedEntity = pointedEntity;
                            vec3 = ((calculateIntercept == null) ? getPositionEyes : calculateIntercept.hitVec);
                            n3 = 0.0;
                        }
                    }
                    else if (calculateIntercept != null) {
                        final double distanceTo2 = getPositionEyes.distanceTo(calculateIntercept.hitVec);
                        if (distanceTo2 < n3 || n3 == 0.0) {
                            if (pointedEntity == Minecraft.getMinecraft().getRenderViewEntity().ridingEntity && !pointedEntity.canRiderInteract()) {
                                if (n3 == 0.0) {
                                    this.pointedEntity = pointedEntity;
                                    vec3 = calculateIntercept.hitVec;
                                }
                            }
                            else {
                                this.pointedEntity = pointedEntity;
                                vec3 = calculateIntercept.hitVec;
                                n3 = distanceTo2;
                            }
                        }
                    }
                }
            }
            if (this.pointedEntity != null && (n3 < distanceTo || this.moving == null)) {
                this.moving = new MovingObjectPosition(this.pointedEntity, vec3);
                if (this.pointedEntity instanceof EntityLivingBase) {
                    Minecraft.getMinecraft().pointedEntity = this.pointedEntity;
                }
            }
        }
    }
    
    static {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.reach = 3.0;
    }
}
