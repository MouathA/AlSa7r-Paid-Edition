//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

public class HHHHHHH
{
    private boolean value;
    private boolean isToggled;
    private String name;
    
    public boolean isToggled() {
        return this.isToggled;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setState(final boolean value) {
        if (value == this.value) {
            return;
        }
        this.value = value;
    }
    
    public boolean getState() {
        return this.value;
    }
    
    public void toggle() {
        this.value = !this.value;
    }
    
    public HHHHHHH(final String name, final boolean value) {
        this.isToggled = true;
        this.name = name;
        this.value = value;
    }
}
