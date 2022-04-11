//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.util.*;
import net.minecraft.client.settings.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        final BlockPos blockPos = new BlockPos(HHHHHHHHHHHHHHH.mc.thePlayer.posX, HHHHHHHHHHHHHHH.mc.thePlayer.posY - 1.0, HHHHHHHHHHHHHHH.mc.thePlayer.posZ);
        if (HHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem() == null) {
            KeyBinding.setKeyBindState(HHHHHHHHHHHHHHH.mc.gameSettings.keyBindSneak.getKeyCode(), false);
            return;
        }
        if (!(HHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemBlock)) {
            KeyBinding.setKeyBindState(HHHHHHHHHHHHHHH.mc.gameSettings.keyBindSneak.getKeyCode(), false);
            return;
        }
        if (HHHHHHHHHHHHHHH.mc.theWorld.getBlockState(blockPos).getBlock() == Blocks.air) {
            KeyBinding.setKeyBindState(HHHHHHHHHHHHHHH.mc.gameSettings.keyBindSneak.getKeyCode(), true);
        }
        else {
            KeyBinding.setKeyBindState(HHHHHHHHHHHHHHH.mc.gameSettings.keyBindSneak.getKeyCode(), false);
        }
    }
    
    public HHHHHHHHHHHHHHH() {
        super("FastBrigde", 0, Category.Player);
    }
    
    @Override
    public void onDisable() {
        KeyBinding.setKeyBindState(HHHHHHHHHHHHHHH.mc.gameSettings.keyBindSneak.getKeyCode(), false);
    }
}
