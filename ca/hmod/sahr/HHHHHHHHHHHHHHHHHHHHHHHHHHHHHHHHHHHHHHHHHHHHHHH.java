//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;
import net.minecraft.util.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.*;
import java.util.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private Minecraft mc;
    
    public float[] getRotationFromPosition(final double n, final double n2, final double n3) {
        final double x = n - Minecraft.getMinecraft().thePlayer.posX;
        final double y = n2 - Minecraft.getMinecraft().thePlayer.posZ;
        return new float[] { (float)(Math.atan2(y, x) * 180.0 / 3.141592653589793) - 90.0f, (float)(-(Math.atan2(n3 - Minecraft.getMinecraft().thePlayer.posY - 1.2, MathHelper.sqrt_double(x * x + y * y)) * 180.0 / 3.141592653589793)) };
    }
    
    public float getDistanceBetweenAngles(final float n, final float n2) {
        float n3 = Math.abs(n - n2) % 360.0f;
        if (n3 > 180.0f) {
            n3 = 360.0f - n3;
        }
        return n3;
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        this.mc = Minecraft.getMinecraft();
    }
    
    public float[] getBowAngles(final Entity entity) {
        final double n = (entity.posX - entity.lastTickPosX) * 0.4;
        final double n2 = (entity.posZ - entity.lastTickPosZ) * 0.4;
        final double n3 = Minecraft.getMinecraft().thePlayer.getDistanceToEntity(entity);
        final double n4 = n3 - n3 % 0.8;
        final boolean isSprinting = entity.isSprinting();
        final double n5 = n4 / 0.8 * n * (isSprinting ? 1.25 : 1.0);
        final double n6 = n4 / 0.8 * n2 * (isSprinting ? 1.25 : 1.0);
        final double x = entity.posX + n5 - Minecraft.getMinecraft().thePlayer.posX;
        final double y = entity.posZ + n6 - Minecraft.getMinecraft().thePlayer.posZ;
        return new float[] { (float)Math.toDegrees(Math.atan2(y, x)) - 90.0f, -((float)(-(Math.atan2(Minecraft.getMinecraft().thePlayer.posY + Minecraft.getMinecraft().thePlayer.getEyeHeight() - (entity.posY + entity.getEyeHeight()), MathHelper.sqrt_double(x * x + y * y)) * 180.0 / 3.141592653589793)) + Minecraft.getMinecraft().thePlayer.getDistanceToEntity(entity) * 0.11f) };
    }
    
    public float getNewAngle(float n) {
        n %= 360.0f;
        if (n >= 180.0f) {
            n -= 360.0f;
        }
        if (n < -180.0f) {
            n += 360.0f;
        }
        return n;
    }
    
    public boolean canEntityBeSeen(final Entity entity) {
        final Vec3 vec3 = new Vec3(this.mc.thePlayer.posX, this.mc.thePlayer.posY + this.mc.thePlayer.getEyeHeight(), this.mc.thePlayer.posZ);
        final AxisAlignedBB getEntityBoundingBox = entity.getEntityBoundingBox();
        final Vec3 vec4 = new Vec3(entity.posX, entity.posY + entity.getEyeHeight() / 1.32f, entity.posZ);
        final double n = entity.posX - 0.25;
        final double n2 = entity.posX + 0.25;
        final double posY = entity.posY;
        final double n3 = entity.posY + Math.abs(entity.posY - getEntityBoundingBox.maxY);
        final double n4 = entity.posZ - 0.25;
        final double n5 = entity.posZ + 0.25;
        return this.mc.theWorld.rayTraceBlocks(vec3, vec4) == null || this.mc.theWorld.rayTraceBlocks(vec3, new Vec3(n2, posY, n4)) == null || this.mc.theWorld.rayTraceBlocks(vec3, new Vec3(n, posY, n4)) == null || this.mc.theWorld.rayTraceBlocks(vec3, new Vec3(n, posY, n5)) == null || this.mc.theWorld.rayTraceBlocks(vec3, new Vec3(n2, posY, n5)) == null || this.mc.theWorld.rayTraceBlocks(vec3, new Vec3(n2, n3, n4)) == null || this.mc.theWorld.rayTraceBlocks(vec3, new Vec3(n, n3, n4)) == null || this.mc.theWorld.rayTraceBlocks(vec3, new Vec3(n, n3, n5 - 0.1)) == null || this.mc.theWorld.rayTraceBlocks(vec3, new Vec3(n2, n3, n5)) == null;
    }
    
    public float getTrajAngleSolutionLow(final float n, final float n2, final float n3) {
        final float n4 = 0.006f;
        return (float)Math.toDegrees(Math.atan((n3 * n3 - Math.sqrt(n3 * n3 * n3 * n3 - n4 * (n4 * (n * n) + 2.0f * n2 * (n3 * n3)))) / (n4 * n)));
    }
    
    public float[] getAngles(final Entity entity) {
        final double n = entity.posX - this.mc.thePlayer.posX;
        final double n2 = entity.posZ - this.mc.thePlayer.posZ;
        double n3;
        if (entity instanceof EntityEnderman) {
            n3 = entity.posY - this.mc.thePlayer.posY;
        }
        else {
            n3 = entity.posY + entity.getEyeHeight() - 1.9 - this.mc.thePlayer.posY + this.mc.thePlayer.getEyeHeight() - 1.9;
        }
        final double n4 = MathHelper.sqrt_double(n * n + n2 * n2);
        float n5 = (float)Math.toDegrees(-Math.atan(n / n2));
        final float n6 = (float)(-Math.toDegrees(Math.atan(n3 / n4)));
        if (n2 < 0.0 && n < 0.0) {
            n5 = (float)(90.0 + Math.toDegrees(Math.atan(n2 / n)));
        }
        else if (n2 < 0.0 && n > 0.0) {
            n5 = (float)(-90.0 + Math.toDegrees(Math.atan(n2 / n)));
        }
        return new float[] { n6, n5 };
    }
    
    public float getYawChange(final float n, final double n2, final double n3) {
        final double n4 = n2 - Minecraft.getMinecraft().thePlayer.posX;
        final double n5 = n3 - Minecraft.getMinecraft().thePlayer.posZ;
        double degrees = 0.0;
        if (n5 < 0.0 && n4 < 0.0) {
            if (n4 != 0.0) {
                degrees = 90.0 + Math.toDegrees(Math.atan(n5 / n4));
            }
        }
        else if (n5 < 0.0 && n4 > 0.0) {
            if (n4 != 0.0) {
                degrees = -90.0 + Math.toDegrees(Math.atan(n5 / n4));
            }
        }
        else if (n5 != 0.0) {
            degrees = Math.toDegrees(-Math.atan(n4 / n5));
        }
        return MathHelper.wrapAngleTo180_float(-(n - (float)degrees));
    }
    
    public float getStraitYaw() {
        final float wrapAngleTo180_float = MathHelper.wrapAngleTo180_float(this.mc.thePlayer.rotationYaw);
        float n;
        if (wrapAngleTo180_float < 45.0f && wrapAngleTo180_float > -45.0f) {
            n = 0.0f;
        }
        else if (wrapAngleTo180_float > 45.0f && wrapAngleTo180_float < 135.0f) {
            n = 90.0f;
        }
        else if (wrapAngleTo180_float > 135.0f || wrapAngleTo180_float < -135.0f) {
            n = 180.0f;
        }
        else {
            n = -90.0f;
        }
        return n;
    }
    
    public float getPitchChange(final float n, final Entity entity, final double n2) {
        final double n3 = entity.posX - Minecraft.getMinecraft().thePlayer.posX;
        final double n4 = entity.posZ - Minecraft.getMinecraft().thePlayer.posZ;
        return -MathHelper.wrapAngleTo180_float(n - (float)(-Math.toDegrees(Math.atan((n2 - 2.2 + entity.getEyeHeight() - Minecraft.getMinecraft().thePlayer.posY) / MathHelper.sqrt_double(n3 * n3 + n4 * n4))))) - 2.5f;
    }
    
    public float[] getRotations(final EntityLivingBase entityLivingBase) {
        return this.getRotationFromPosition(entityLivingBase.posX, entityLivingBase.posZ, entityLivingBase.posY + entityLivingBase.getEyeHeight() / 2.0f);
    }
    
    public float[] getPredictedRotations(final EntityLivingBase entityLivingBase) {
        return this.getRotationFromPosition(entityLivingBase.posX + (entityLivingBase.posX - entityLivingBase.lastTickPosX), entityLivingBase.posZ + (entityLivingBase.posZ - entityLivingBase.lastTickPosZ), entityLivingBase.posY + entityLivingBase.getEyeHeight() / 2.0f);
    }
    
    public float[] getAverageRotations(final List<EntityLivingBase> list) {
        double n = 0.0;
        double n2 = 0.0;
        double n3 = 0.0;
        for (final Entity entity : list) {
            n += entity.posX;
            n2 += entity.getEntityBoundingBox().maxY - 2.0;
            n3 += entity.posZ;
        }
        final double n4 = n / list.size();
        final double n5 = n2 / list.size();
        final double n6 = n3 / list.size();
        return new float[] { this.getRotationFromPosition(n4, n6, n5)[0], this.getRotationFromPosition(n4, n6, n5)[1] };
    }
    
    public void jitterEffect(final Random random) {
        if (random.nextBoolean()) {
            if (random.nextBoolean()) {
                this.mc.thePlayer.rotationPitch -= (float)(random.nextFloat() * 0.8);
            }
            else {
                this.mc.thePlayer.rotationPitch += (float)(random.nextFloat() * 0.8);
            }
        }
        else if (random.nextBoolean()) {
            this.mc.thePlayer.rotationYaw -= (float)(random.nextFloat() * 0.8);
        }
        else {
            this.mc.thePlayer.rotationYaw += (float)(random.nextFloat() * 0.8);
        }
    }
}
