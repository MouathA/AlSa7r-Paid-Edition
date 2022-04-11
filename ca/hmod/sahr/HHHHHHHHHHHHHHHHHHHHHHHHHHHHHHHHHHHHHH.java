//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.network.play.server.*;
import java.util.*;
import io.netty.channel.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH extends ChannelDuplexHandler
{
    public void channelRead(final ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        if (o instanceof S18PacketEntityTeleport) {
            S18PacketEntityTeleport onEntityTeleport = (S18PacketEntityTeleport)o;
            for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModuleManager().getModules()) {
                if (hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getState()) {
                    onEntityTeleport = hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.onEntityTeleport(onEntityTeleport);
                }
            }
            o = onEntityTeleport;
        }
        else if (o instanceof S14PacketEntity) {
            final S14PacketEntity s14PacketEntity = (S14PacketEntity)o;
            for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh2 : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModuleManager().getModules()) {
                if (hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh2.getState() && hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh2.onRelativeMove(s14PacketEntity)) {
                    return;
                }
            }
        }
        else if (o instanceof S13PacketDestroyEntities) {
            final S13PacketDestroyEntities s13PacketDestroyEntities = (S13PacketDestroyEntities)o;
            for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3 : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModuleManager().getModules()) {
                if (hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3.getState()) {
                    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3.onDestroyEntities(s13PacketDestroyEntities);
                }
            }
        }
        super.channelRead(channelHandlerContext, o);
    }
    
    public void write(final ChannelHandlerContext channelHandlerContext, final Object o, final ChannelPromise channelPromise) throws Exception {
        super.write(channelHandlerContext, o, channelPromise);
    }
}
