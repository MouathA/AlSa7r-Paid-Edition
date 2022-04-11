//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import java.lang.reflect.*;
import java.util.*;
import net.minecraft.client.entity.*;
import net.minecraft.item.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.lwjgl.input.*;
import java.awt.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.init.*;
import net.minecraft.client.settings.*;
import net.minecraft.util.*;
import net.minecraft.client.gui.*;
import java.awt.event.*;

public class HHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHH sword;
    private double value;
    private long right_up;
    private boolean stop;
    public long delay;
    private long next;
    private boolean skip;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH min;
    private Method screen;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH bhit_value;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH timer;
    private static Field btn;
    private long down;
    private static Field btns;
    public long alive;
    public long hold;
    private long up;
    private long right_down;
    private Random random;
    private HHHHHHH block_hit;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH max;
    private HHHHHHH break_blocks;
    private long klashrop;
    
    private boolean check(final EntityPlayerSP entityPlayerSP) {
        return !this.sword.getState() || (entityPlayerSP.getCurrentEquippedItem() != null && (entityPlayerSP.getCurrentEquippedItem().getItem() instanceof ItemSword || entityPlayerSP.getCurrentEquippedItem().getItem() instanceof ItemAxe));
    }
    
    @SubscribeEvent
    public void bhit(final AttackEntityEvent attackEntityEvent) {
        if (HHHHHH.mc.currentScreen != null) {
            return;
        }
        final float n = (float)((int)this.bhit_value.getValue() * 100);
        this.alive = System.nanoTime() / 1000000L;
        if (this.getState() && (this.alive - this.hold >= n || this.hold == -1L)) {
            this.hold = System.nanoTime() / 1000000L;
            if (this.block_hit.getState()) {
                this.bhit_bot();
            }
        }
    }
    
    private void delay() {
        if (this.min.getValue() > this.max.getValue()) {
            return;
        }
        if (Mouse.isButtonDown(1)) {
            return;
        }
        long n = (int)Math.round(900.0 / this.min.getValue() + this.random.nextDouble() * (this.max.getValue() - this.min.getValue()) - 9.0);
        if (System.currentTimeMillis() > this.klashrop) {
            if (!this.stop && this.random.nextInt(100) >= 85) {
                this.stop = true;
                this.value = 1.1 + this.random.nextDouble() * 0.15;
            }
            else {
                this.stop = false;
            }
            this.klashrop = System.currentTimeMillis() + 500L + this.random.nextInt(1500);
        }
        if (this.stop) {
            n *= (long)this.value;
        }
        if (System.currentTimeMillis() > this.next) {
            if (this.random.nextInt(100) >= 80) {
                n += 50L + this.random.nextInt(150);
            }
            this.next = System.currentTimeMillis() + 500L + this.random.nextInt(1500);
        }
        this.down = System.currentTimeMillis() + n;
        this.up = System.currentTimeMillis() + n / 2L - this.random.nextInt(10);
    }
    
    private void bhit_bot() {
        try {
            final Robot robot = new Robot();
            robot.mousePress(4);
            robot.mouseRelease(4);
        }
        catch (AWTException ex) {
            ex.printStackTrace();
        }
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.ClientTickEvent clientTickEvent) {
        if (this.getState() && this.min.getValue() >= this.max.getValue()) {
            this.min.setValue(this.max.getValue() - 3.0);
        }
        if (HHHHHH.mc.currentScreen == null && this.check(HHHHHH.mc.thePlayer)) {
            Mouse.poll();
            if (Mouse.isButtonDown(0)) {
                if (this.break_blocks.getState() && HHHHHH.mc.objectMouseOver != null) {
                    final BlockPos getBlockPos = HHHHHH.mc.objectMouseOver.getBlockPos();
                    if (getBlockPos != null) {
                        if (HHHHHH.mc.theWorld.getBlockState(getBlockPos).getBlock() != Blocks.air) {
                            KeyBinding.setKeyBindState(this.getKey(), true);
                            KeyBinding.onTick(this.getKey());
                            return;
                        }
                        KeyBinding.setKeyBindState(this.getKey(), false);
                    }
                }
                if (this.down > 0L && this.up > 0L) {
                    if (System.currentTimeMillis() > this.down) {
                        KeyBinding.setKeyBindState(HHHHHH.mc.gameSettings.keyBindAttack.getKeyCode(), true);
                        KeyBinding.onTick(HHHHHH.mc.gameSettings.keyBindAttack.getKeyCode());
                        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.sendClick(0, true);
                        this.delay();
                    }
                    else if (System.currentTimeMillis() > this.up) {
                        KeyBinding.setKeyBindState(HHHHHH.mc.gameSettings.keyBindAttack.getKeyCode(), false);
                        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.sendClick(0, false);
                    }
                }
                else {
                    this.delay();
                }
                if (!Mouse.isButtonDown(1)) {
                    this.right_up = 0L;
                    this.right_down = 0L;
                }
            }
            else {
                this.right_up = 0L;
                this.right_down = 0L;
                this.up = 0L;
                this.down = 0L;
            }
        }
    }
    
    public HHHHHH() {
        super("AutoClicker", 0, Category.Ghost);
        this.alive = 0L;
        this.delay = 1L;
        this.hold = 0L;
        this.max = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Max", 5.0, 5.0, 20.0);
        this.min = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Min", 5.0, 5.0, 19.0);
        this.bhit_value = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("BHPS", 5.0, 5.0, 15.0);
        this.sword = new HHHHHHH("Sword / Axe", false);
        this.block_hit = new HHHHHHH("Block Hit", false);
        this.break_blocks = new HHHHHHH("Break Blocks", false);
        this.addValue(this.min);
        this.addValue(this.max);
        this.addValue(this.bhit_value);
        this.addBoolean(this.block_hit);
        this.addBoolean(this.break_blocks);
        this.addBoolean(this.sword);
        this.random = new Random();
        try {
            this.screen = GuiScreen.class.getDeclaredMethod("mouseClicked", Integer.TYPE, Integer.TYPE, Integer.TYPE);
        }
        catch (Exception ex) {
            try {
                this.screen = GuiScreen.class.getDeclaredMethod("mouseClicked", Integer.TYPE, Integer.TYPE, Integer.TYPE);
            }
            catch (Exception ex2) {
                this.onDisable();
            }
        }
        try {
            HHHHHH.btn = MouseEvent.class.getDeclaredField("button");
            HHHHHH.btns = Mouse.class.getDeclaredField("buttons");
        }
        catch (NoSuchFieldException ex3) {}
    }
}
