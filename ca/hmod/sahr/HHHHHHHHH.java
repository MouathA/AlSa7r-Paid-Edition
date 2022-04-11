//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH time;
    private HHHHHHH AutoCloseInv;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH Delay;
    
    public HHHHHHHHH() {
        super("ChestStealer", 0, Category.Blatant);
        this.Delay = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Delay", 0.0, 0.0, 250.0);
        this.AutoCloseInv = new HHHHHHH("Close Inventory", false);
        this.addValue(this.Delay);
        this.addBoolean(this.AutoCloseInv);
        this.time = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH();
    }
    
    private boolean isContainerEmpty(final Container container) {
        boolean b = true;
        for (int i = 0; i < ((container.inventorySlots.size() == 90) ? 54 : 27); ++i) {
            if (container.getSlot(i).getHasStack()) {
                b = false;
            }
        }
        return b;
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        final Container openContainer = HHHHHHHHH.mc.thePlayer.openContainer;
        if (openContainer != null && openContainer instanceof ContainerChest) {
            final ContainerChest containerChest = (ContainerChest)openContainer;
            for (int i = 0; i < containerChest.getLowerChestInventory().getSizeInventory(); ++i) {
                if (containerChest.getLowerChestInventory().getStackInSlot(i) != null && this.time.hasReachedMS(this.Delay.getValue())) {
                    HHHHHHHHH.mc.playerController.windowClick(containerChest.windowId, i, 0, 1, (EntityPlayer)HHHHHHHHH.mc.thePlayer);
                    this.time.reset();
                }
            }
            if (this.isContainerEmpty(openContainer) && this.AutoCloseInv.getState()) {
                HHHHHHHHH.mc.thePlayer.closeScreen();
            }
        }
    }
}
