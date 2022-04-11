//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import java.lang.reflect.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.nio.*;
import org.lwjgl.input.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private static Field buttonStateField;
    private static Field buttonsField;
    private static Field buttonField;
    
    public static void sendClick(final int i, final boolean b) {
        final MouseEvent mouseEvent = new MouseEvent();
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonField.setAccessible(true);
        try {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonField.set(mouseEvent, i);
        }
        catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonField.setAccessible(false);
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonStateField.setAccessible(true);
        try {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonStateField.set(mouseEvent, b);
        }
        catch (IllegalAccessException ex2) {
            ex2.printStackTrace();
        }
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonStateField.setAccessible(false);
        MinecraftForge.EVENT_BUS.post((Event)mouseEvent);
        try {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonsField.setAccessible(true);
            final ByteBuffer byteBuffer = (ByteBuffer)HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonsField.get(null);
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonsField.setAccessible(false);
            byteBuffer.put(i, (byte)(b ? 1 : 0));
        }
        catch (IllegalAccessException ex3) {
            ex3.printStackTrace();
        }
    }
    
    static {
        try {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonField = MouseEvent.class.getDeclaredField("button");
        }
        catch (NoSuchFieldException ex) {
            ex.printStackTrace();
        }
        try {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonStateField = MouseEvent.class.getDeclaredField("buttonstate");
        }
        catch (NoSuchFieldException ex2) {
            ex2.printStackTrace();
        }
        try {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.buttonsField = Mouse.class.getDeclaredField("buttons");
        }
        catch (NoSuchFieldException ex3) {
            ex3.printStackTrace();
        }
    }
}
