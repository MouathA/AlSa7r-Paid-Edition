//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.event.entity.player.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;

public class HHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHH remove;
    private HHHHHHH list;
    private LinkedList<String> friends;
    private HHHHHHH add;
    
    public HHHHHHHHHHHHHHHHHHHH() {
        super("Friends", 0, Category.Other);
        this.add = new HHHHHHH("Add Friend", false);
        this.remove = new HHHHHHH("Remove Friend", false);
        this.list = new HHHHHHH("List Friend", false);
        this.friends = new LinkedList<String>();
        this.addBoolean(this.add);
        this.addBoolean(this.remove);
        this.addBoolean(this.list);
    }
    
    public LinkedList<String> getFriends() {
        return this.friends;
    }
    
    @SubscribeEvent
    public void addFriend(final AttackEntityEvent attackEntityEvent) {
        if (this.getState()) {
            if (this.add.getState()) {
                if (attackEntityEvent.target instanceof EntityPlayer) {
                    if (!this.friends.contains(attackEntityEvent.target.getName().toLowerCase())) {
                        this.friends.add(attackEntityEvent.target.getName().toLowerCase());
                        HHHHHHHHHHHHHHHHHHHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.DARK_GRAY + HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getName() + EnumChatFormatting.GRAY + "] " + attackEntityEvent.target.getName() + EnumChatFormatting.GREEN + " has been added to your friend list."));
                    }
                    else {
                        HHHHHHHHHHHHHHHHHHHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.DARK_GRAY + HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getName() + EnumChatFormatting.GRAY + "]" + attackEntityEvent.target.getName() + EnumChatFormatting.RED + " This player is already in your friend list."));
                    }
                }
            }
            else if (this.remove.getState() && attackEntityEvent.target instanceof EntityPlayer) {
                if (this.friends.contains(attackEntityEvent.target.getName().toLowerCase())) {
                    this.friends.remove(attackEntityEvent.target.getName().toLowerCase());
                    HHHHHHHHHHHHHHHHHHHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.DARK_GRAY + HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getName() + EnumChatFormatting.GRAY + "] " + attackEntityEvent.target.getName() + EnumChatFormatting.RED + " has been removed from your friend list."));
                }
                else {
                    HHHHHHHHHHHHHHHHHHHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.DARK_GRAY + HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getName() + EnumChatFormatting.GRAY + "] " + attackEntityEvent.target.getName() + EnumChatFormatting.RED + " This player is not in your friend list."));
                }
            }
        }
    }
    
    @Override
    public void onEnable() {
        if (this.list.getState()) {
            final Iterator<String> iterator = this.friends.iterator();
            while (iterator.hasNext()) {
                HHHHHHHHHHHHHHHHHHHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.DARK_GRAY + HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getName() + EnumChatFormatting.GRAY + "] " + iterator.next()));
            }
        }
    }
}
