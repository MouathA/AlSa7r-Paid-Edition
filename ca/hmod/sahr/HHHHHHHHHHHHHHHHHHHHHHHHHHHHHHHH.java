//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;
import java.util.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.*;
import net.minecraft.network.play.server.*;

public abstract class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private int key;
    private String name;
    private ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH> values;
    private boolean Toggled;
    private boolean enabled;
    private Category category;
    protected static Minecraft mc;
    private ArrayList<HHHHHHH> booleans;
    private boolean state;
    
    public String getName() {
        return this.name;
    }
    
    public boolean isEnabled() {
        return this.enabled;
    }
    
    public void onEnable() {
    }
    
    public ArrayList<HHHHHHH> getBooleans() {
        return this.booleans;
    }
    
    public void onDisable() {
    }
    
    public void setKey(final int key) {
        this.key = key;
    }
    
    public void toggle() {
        this.setState(!this.state);
    }
    
    public static ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH> getCategoryModules(final Category category) {
        final ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH> list = new ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH>();
        for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH e : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModuleManager().getModules()) {
            if (e.getCategory() == category) {
                list.add(e);
            }
        }
        return list;
    }
    
    public void setState(final boolean state) {
        if (this.state == state) {
            return;
        }
        this.state = state;
        if (state) {
            MinecraftForge.EVENT_BUS.register((Object)this);
            FMLCommonHandler.instance().bus().register((Object)this);
            this.onEnable();
        }
        else {
            MinecraftForge.EVENT_BUS.unregister((Object)this);
            FMLCommonHandler.instance().bus().unregister((Object)this);
            this.onDisable();
        }
    }
    
    public boolean onRelativeMove(final S14PacketEntity s14PacketEntity) {
        return false;
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH(final String name, final int key, final Category category) {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc = Minecraft.getMinecraft();
        this.booleans = new ArrayList<HHHHHHH>();
        this.values = new ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH>();
        this.name = name;
        this.key = key;
        this.state = false;
        this.category = category;
    }
    
    public boolean getState() {
        return this.state;
    }
    
    public S18PacketEntityTeleport onEntityTeleport(final S18PacketEntityTeleport s18PacketEntityTeleport) {
        return s18PacketEntityTeleport;
    }
    
    public void update() {
    }
    
    public Category getCategory() {
        return this.category;
    }
    
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH getModule(final Class<? extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH> clazz) {
        for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModuleManager().getModules()) {
            if (hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getClass() == clazz) {
                return hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh;
            }
        }
        return null;
    }
    
    public boolean setToggled(final boolean state) {
        return this.state = state;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public boolean isToggle() {
        return this.Toggled;
    }
    
    public ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH> getValues() {
        return this.values;
    }
    
    public void onDestroyEntities(final S13PacketDestroyEntities s13PacketDestroyEntities) {
    }
    
    public void addBoolean(final HHHHHHH e) {
        this.booleans.add(e);
    }
    
    public void addValue(final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH e) {
        this.values.add(e);
    }
    
    public int getKey() {
        return this.key;
    }
    
    public void setup() {
    }
    
    public enum Category
    {
        Other, 
        Ghost, 
        Blatant, 
        Player;
        
        private static final Category[] $VALUES;
        
        static {
            $VALUES = new Category[] { Category.Ghost, Category.Blatant, Category.Player, Category.Other };
        }
    }
    
    public enum Modules
    {
        Hud;
        
        private static final Modules[] $VALUES;
        
        Destruct, 
        ClickGUI;
        
        static {
            $VALUES = new Modules[] { Modules.ClickGUI, Modules.Hud, Modules.Destruct };
        }
    }
}
