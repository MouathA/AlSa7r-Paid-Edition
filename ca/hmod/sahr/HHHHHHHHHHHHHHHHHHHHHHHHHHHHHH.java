//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

public abstract class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private long lastTime;
    
    public void reset() {
        this.lastTime = this.getCurrentTime();
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        this.reset();
    }
    
    public abstract int getDelay();
    
    public boolean output() {
        final boolean b = this.elapsedTime() >= this.getDelay();
        if (b) {
            this.lastTime = this.getCurrentTime();
        }
        return b;
    }
    
    public long elapsedTime() {
        return this.getCurrentTime() - this.lastTime;
    }
    
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }
    
    public boolean finished() {
        return this.elapsedTime() >= this.getDelay();
    }
}
