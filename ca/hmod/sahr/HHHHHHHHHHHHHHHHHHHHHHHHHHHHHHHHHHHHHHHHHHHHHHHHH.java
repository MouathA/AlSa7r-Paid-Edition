//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;
import java.awt.*;
import java.sql.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.net.*;

@Mod(modid = "AutoGG", version = "1.0", useMetadata = true, clientSideOnly = true, acceptedMinecraftVersions = "[1.8.9]")
public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH utl_rotation;
    private static HHHHHHHHHHHHH cfgSystem;
    private static HHHHHHHHHH gui;
    private static Minecraft mc;
    private static final String CLIENT_NAME;
    private static final String CLIENT_DEVELOPER;
    private static HHHHHHHHHHHHHHHHHHHH frSystem;
    public static Color color;
    private static HHHHH api;
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH timer2;
    private boolean iwl;
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH module_manager;
    private static Connection connection;
    private static final String CLIENT_VERSION;
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH module;
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        this.iwl = false;
    }
    
    public static String getName() {
        return "AlSa7r";
    }
    
    private String tick(final String s) {
        final StringBuilder obj = new StringBuilder("");
        final char[] charArray = s.toCharArray();
        for (int length = charArray.length, i = 0; i < length; ++i) {
            obj.append((int)(char)(charArray[i] + '\b'));
        }
        return String.valueOf(obj);
    }
    
    public static String getDeveloper() {
        return "7m0d";
    }
    
    @Mod.EventHandler
    public void fmlInitialization(final FMLInitializationEvent fmlInitializationEvent) {
        MinecraftForge.EVENT_BUS.register((Object)this);
        FMLCommonHandler.instance().bus().register((Object)this);
        if (this.tick().equals("73106108125116105130113130469511311810811912712340575646798179737497927754")) {
            this.iwl = true;
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule((Class)HHHHHHHHHHH.class).setState(true);
        }
        else {
            this.iwl = false;
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule((Class)HHHHHHHHHHHHHHHHHHHHHH.class).setKey(0);
        }
    }
    
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH getRoations() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.utl_rotation == null) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.utl_rotation = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH();
        }
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.utl_rotation;
    }
    
    @SubscribeEvent
    public void tick(final InputEvent.KeyInputEvent keyInputEvent) {
        if (getMC().thePlayer == null) {
            return;
        }
        if (!Keyboard.getEventKeyState()) {
            return;
        }
        for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : getModuleManager().getModules()) {
            if (hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getKey() == Keyboard.getEventKey()) {
                hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.setState(!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getState());
            }
        }
    }
    
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH getModuleManager() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.module_manager == null) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.module_manager = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH();
        }
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.module_manager;
    }
    
    public static Color getColor() {
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.color;
    }
    
    public static HHHHH getApi() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.api == null) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.api = new HHHHH();
        }
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.api;
    }
    
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH getTimer() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.timer2 == null) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.timer2 = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH();
        }
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.timer2;
    }
    
    public static HHHHHHHHHH getGui() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.gui == null) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.gui = new HHHHHHHHHH();
        }
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.gui;
    }
    
    private String tick() {
        String tick = null;
        try {
            tick = this.tick(InetAddress.getLocalHost().getHostName() + "&" + System.getProperty("os.name") + "&" + System.getProperty("user.name") + ".");
        }
        catch (UnknownHostException ex) {}
        return tick;
    }
    
    public static Minecraft getMC() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc == null) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc = Minecraft.getMinecraft();
        }
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc;
    }
    
    public static String getVersion() {
        return "7.0.0";
    }
    
    static {
        CLIENT_DEVELOPER = "7m0d";
        CLIENT_VERSION = "7.0.0";
        CLIENT_NAME = "AlSa7r";
    }
}
