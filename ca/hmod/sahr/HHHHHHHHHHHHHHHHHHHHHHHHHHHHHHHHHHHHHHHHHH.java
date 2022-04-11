//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import java.util.concurrent.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private long lastMS;
    
    public long getCurrentMS() {
        return System.nanoTime() / 10000000L;
    }
    
    public boolean hasReached(final long n) {
        return this.getCurrentMS() - this.lastMS >= n;
    }
    
    public void reset() {
        this.lastMS = this.getCurrentMS();
    }
    
    public int getRandomInt(final int origin, final int bound) {
        return ThreadLocalRandom.current().nextInt(origin, bound);
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        this.lastMS = 0L;
    }
}
