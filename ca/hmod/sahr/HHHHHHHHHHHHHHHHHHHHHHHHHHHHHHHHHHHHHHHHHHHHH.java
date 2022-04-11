//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import java.util.*;
import net.minecraft.client.*;
import java.util.concurrent.*;
import net.minecraft.util.*;
import java.lang.reflect.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private long lastMS;
    private Random rand;
    private long current;
    private Minecraft mc;
    private long last;
    
    public void updateTimer() {
        this.current = getCurrentMillis();
    }
    
    public boolean sleep(final long n) {
        return this.sleep(n, TimeUnit.MILLISECONDS);
    }
    
    public boolean hasTimePassedMS(final long n, final long n2) {
        return getCurrentMillis() >= n + n2;
    }
    
    public static long getCurrentMillis() {
        return System.nanoTime() / 1000000L;
    }
    
    public double randomDouble(final double n) {
        return this.rand.nextDouble() * n;
    }
    
    public int randomInt(final int bound) {
        return (bound > 0) ? this.rand.nextInt(bound) : 0;
    }
    
    public final long getLast() {
        return this.last;
    }
    
    public void updatebefore() {
        this.lastMS = getCurrentMillis();
    }
    
    public Timer timer() {
        try {
            final Field declaredField = Minecraft.class.getDeclaredField(new String(new char[] { 't', 'i', 'm', 'e', 'r' }));
            declaredField.setAccessible(true);
            return (Timer)declaredField.get(this.mc);
        }
        catch (Exception ex) {
            try {
                final Field declaredField2 = Minecraft.class.getDeclaredField(new String(new char[] { 'f', 'i', 'e', 'l', 'd', '_', '7', '1', '4', '2', '8', '_', 'T' }));
                declaredField2.setAccessible(true);
                return (Timer)declaredField2.get(this.mc);
            }
            catch (Exception ex2) {
                return null;
            }
        }
    }
    
    public boolean hasTimePassedMS(final long n) {
        return getCurrentMillis() >= this.lastMS + n;
    }
    
    public boolean hasTimePassedLS(final float n) {
        return getCurrentMillis() >= this.lastMS + 1000.0f / n;
    }
    
    public final void updateLast() {
        this.last = getCurrentMillis();
    }
    
    public void stopTmr() {
        this.timer().timerSpeed = 1.0f;
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        this.mc = Minecraft.getMinecraft();
        this.lastMS = -1L;
        this.rand = new Random();
    }
    
    public void reset() {
        this.last = System.nanoTime();
    }
    
    public boolean sleep(final long n, final TimeUnit timeUnit) {
        final long convert = timeUnit.convert(System.nanoTime() - this.last, TimeUnit.NANOSECONDS);
        if (convert >= n) {
            this.reset();
        }
        return convert >= n;
    }
}
