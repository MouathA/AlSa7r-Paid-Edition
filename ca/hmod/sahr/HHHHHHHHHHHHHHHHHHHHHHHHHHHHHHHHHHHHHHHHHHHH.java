//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    public long previousMS;
    
    public boolean hasReachedMS(final double n) {
        return this.getTime() - this.previousMS >= n;
    }
    
    public void reset() {
        this.previousMS = this.getTime();
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        this.previousMS = 0L;
    }
    
    public long getTime() {
        return System.nanoTime() / 1000000L;
    }
}
