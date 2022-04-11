//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.gui.*;

public class HHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    public HHHHHHHHHH clickgui;
    
    @Override
    public void onEnable() {
        if (this.clickgui == null) {
            this.clickgui = new HHHHHHHHHH();
        }
        HHHHHHHHHHHHHHHHHHHHHH.mc.displayGuiScreen((GuiScreen)this.clickgui);
        this.toggle();
    }
    
    public HHHHHHHHHHHHHHHHHHHHHH() {
        super(Modules.ClickGUI.name(), 54, Category.Ghost);
    }
}
