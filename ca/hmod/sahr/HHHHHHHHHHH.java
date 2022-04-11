//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import java.awt.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    public static HHHHHHH Rainbow;
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH G;
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH B;
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH R;
    
    @SubscribeEvent
    public void onTick(final TickEvent tickEvent) {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.color = new Color((int)HHHHHHHHHHH.R.getValue(), (int)HHHHHHHHHHH.G.getValue(), (int)HHHHHHHHHHH.B.getValue());
    }
    
    public HHHHHHHHHHH() {
        super("Color", 0, Category.Other);
        HHHHHHHHHHH.R = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("R", 51.0, 0.0, 255.0);
        HHHHHHHHHHH.G = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("G", 146.0, 0.0, 255.0);
        HHHHHHHHHHH.B = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("B", 64.0, 0.0, 255.0);
        HHHHHHHHHHH.Rainbow = new HHHHHHH("Rainbow", false);
        this.addValue(HHHHHHHHHHH.R);
        this.addValue(HHHHHHHHHHH.G);
        this.addValue(HHHHHHHHHHH.B);
        this.addBoolean(HHHHHHHHHHH.Rainbow);
    }
}
