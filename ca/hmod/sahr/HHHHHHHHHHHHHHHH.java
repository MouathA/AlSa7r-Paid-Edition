//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.item.*;
import net.minecraft.client.*;
import java.lang.reflect.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHH OnlyBlocks;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH Delay;
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (HHHHHHHHHHHHHHHH.mc.thePlayer == null && HHHHHHHHHHHHHHHH.mc.theWorld == null) {
            return;
        }
        if (this.OnlyBlocks.getState()) {
            if (HHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(HHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemBlock)) {
                return;
            }
        }
        try {
            final Field declaredField = Minecraft.class.getDeclaredField("rightClickDelayTimer");
            declaredField.setAccessible(true);
            declaredField.set(HHHHHHHHHHHHHHHH.mc, (int)this.Delay.getValue());
        }
        catch (Exception ex) {
            try {
                final Field declaredField2 = Minecraft.class.getDeclaredField("rightClickDelayTimer");
                declaredField2.setAccessible(true);
                declaredField2.set(HHHHHHHHHHHHHHHH.mc, (int)this.Delay.getValue());
            }
            catch (Exception ex2) {
                HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHH.class).setState(false);
            }
        }
    }
    
    public HHHHHHHHHHHHHHHH() {
        super("FastPlace", 0, Category.Player);
        this.Delay = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Delay", 0.0, 0.0, 1.0);
        this.OnlyBlocks = new HHHHHHH("Blocks", false);
        this.addValue(this.Delay);
        this.addBoolean(this.OnlyBlocks);
    }
}
