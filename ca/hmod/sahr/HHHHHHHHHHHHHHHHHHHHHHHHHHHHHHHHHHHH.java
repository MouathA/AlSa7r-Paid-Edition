//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    public boolean isMoving() {
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().moveForward != 0.0f || HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().moveStrafing != 0.0f;
    }
    
    public void setSpeed(final double n) {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().motionX = -(Math.sin(this.getDirection()) * n);
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().motionZ = Math.cos(this.getDirection()) * n;
    }
    
    public void strafe(final float n) {
        if (!this.isMoving()) {
            return;
        }
        final double n2 = this.getDirection();
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().motionX = -Math.sin(n2) * n;
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().motionZ = Math.cos(n2) * n;
    }
    
    public float getSpeed() {
        return (float)Math.sqrt(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().motionX * HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().motionX + HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().motionZ * HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().motionZ);
    }
    
    public float getDirection() {
        float rotationYaw = HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().rotationYaw;
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().moveForward < 0.0f) {
            rotationYaw += 180.0f;
        }
        float n;
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().moveForward < 0.0f) {
            n = -0.5f;
        }
        else if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().moveForward > 0.0f) {
            n = 0.5f;
        }
        else {
            n = 1.0f;
        }
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().moveStrafing > 0.0f) {
            rotationYaw -= 90.0f * n;
        }
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getApi().getPlayer().moveStrafing < 0.0f) {
            rotationYaw += 90.0f * n;
        }
        return rotationYaw * 0.017453292f;
    }
}
