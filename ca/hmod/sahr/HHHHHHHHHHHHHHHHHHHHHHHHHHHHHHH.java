//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.network.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import java.lang.reflect.*;
import net.minecraft.util.*;
import net.minecraft.network.play.server.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH extends NetHandlerPlayClient
{
    private NetHandlerPlayClient parent;
    private Random a;
    private double misValue;
    private static Minecraft mc;
    public static double f;
    
    public void handleUpdateTileEntity(final S35PacketUpdateTileEntity s35PacketUpdateTileEntity) {
        this.parent.handleUpdateTileEntity(s35PacketUpdateTileEntity);
    }
    
    public void handleHeldItemChange(final S09PacketHeldItemChange s09PacketHeldItemChange) {
        this.parent.handleHeldItemChange(s09PacketHeldItemChange);
    }
    
    public void handleEffect(final S28PacketEffect s28PacketEffect) {
        this.parent.handleEffect(s28PacketEffect);
    }
    
    public void handlePlayerListItem(final S38PacketPlayerListItem s38PacketPlayerListItem) {
        this.parent.handlePlayerListItem(s38PacketPlayerListItem);
    }
    
    public void handleDisplayScoreboard(final S3DPacketDisplayScoreboard s3DPacketDisplayScoreboard) {
        this.parent.handleDisplayScoreboard(s3DPacketDisplayScoreboard);
    }
    
    public void handleSetExperience(final S1FPacketSetExperience s1FPacketSetExperience) {
        this.parent.handleSetExperience(s1FPacketSetExperience);
    }
    
    public void handleDestroyEntities(final S13PacketDestroyEntities s13PacketDestroyEntities) {
        this.parent.handleDestroyEntities(s13PacketDestroyEntities);
    }
    
    public void handleCollectItem(final S0DPacketCollectItem s0DPacketCollectItem) {
        this.parent.handleCollectItem(s0DPacketCollectItem);
    }
    
    public void handleParticles(final S2APacketParticles s2APacketParticles) {
        this.parent.handleParticles(s2APacketParticles);
    }
    
    public void handleStatistics(final S37PacketStatistics s37PacketStatistics) {
        this.parent.handleStatistics(s37PacketStatistics);
    }
    
    public void handleKeepAlive(final S00PacketKeepAlive s00PacketKeepAlive) {
        this.parent.handleKeepAlive(s00PacketKeepAlive);
    }
    
    public void handleChunkData(final S21PacketChunkData s21PacketChunkData) {
        this.parent.handleChunkData(s21PacketChunkData);
    }
    
    private static GuiScreen getGuiScreen(final NetHandlerPlayClient obj) {
        for (final Field field : obj.getClass().getDeclaredFields()) {
            if (field.getType().equals(GuiScreen.class)) {
                field.setAccessible(true);
                try {
                    return (GuiScreen)field.get(obj);
                }
                catch (Exception ex) {
                    return null;
                }
            }
        }
        return null;
    }
    
    public void handleMaps(final S34PacketMaps s34PacketMaps) {
        this.parent.handleMaps(s34PacketMaps);
    }
    
    public void handleRespawn(final S07PacketRespawn s07PacketRespawn) {
        this.parent.handleRespawn(s07PacketRespawn);
    }
    
    public void handleMapChunkBulk(final S26PacketMapChunkBulk s26PacketMapChunkBulk) {
        this.parent.handleMapChunkBulk(s26PacketMapChunkBulk);
    }
    
    public void handleSpawnObject(final S0EPacketSpawnObject s0EPacketSpawnObject) {
        this.parent.handleSpawnObject(s0EPacketSpawnObject);
    }
    
    public void handleBlockBreakAnim(final S25PacketBlockBreakAnim s25PacketBlockBreakAnim) {
        this.parent.handleBlockBreakAnim(s25PacketBlockBreakAnim);
    }
    
    public void handleBlockChange(final S23PacketBlockChange s23PacketBlockChange) {
        this.parent.handleBlockChange(s23PacketBlockChange);
    }
    
    public void handleMultiBlockChange(final S22PacketMultiBlockChange s22PacketMultiBlockChange) {
        this.parent.handleMultiBlockChange(s22PacketMultiBlockChange);
    }
    
    public void handleExplosion(final S27PacketExplosion s27PacketExplosion) {
        this.parent.handleExplosion(s27PacketExplosion);
    }
    
    public void handleEntityVelocity(final S12PacketEntityVelocity s12PacketEntityVelocity) {
        this.parent.handleEntityVelocity(s12PacketEntityVelocity);
    }
    
    public void handleSpawnPainting(final S10PacketSpawnPainting s10PacketSpawnPainting) {
        this.parent.handleSpawnPainting(s10PacketSpawnPainting);
    }
    
    static {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc = Minecraft.getMinecraft();
    }
    
    public void handleTeams(final S3EPacketTeams s3EPacketTeams) {
        this.parent.handleTeams(s3EPacketTeams);
    }
    
    public void onDisconnect(final IChatComponent chatComponent) {
        this.parent.onDisconnect(chatComponent);
    }
    
    public void handleOpenWindow(final S2DPacketOpenWindow s2DPacketOpenWindow) {
        this.parent.handleOpenWindow(s2DPacketOpenWindow);
    }
    
    public void handleScoreboardObjective(final S3BPacketScoreboardObjective s3BPacketScoreboardObjective) {
        this.parent.handleScoreboardObjective(s3BPacketScoreboardObjective);
    }
    
    public void handleConfirmTransaction(final S32PacketConfirmTransaction s32PacketConfirmTransaction) {
        this.parent.handleConfirmTransaction(s32PacketConfirmTransaction);
    }
    
    public void handleAnimation(final S0BPacketAnimation s0BPacketAnimation) {
        this.parent.handleAnimation(s0BPacketAnimation);
    }
    
    public void handleEntityEquipment(final S04PacketEntityEquipment s04PacketEntityEquipment) {
        this.parent.handleEntityEquipment(s04PacketEntityEquipment);
    }
    
    public void handleChat(final S02PacketChat s02PacketChat) {
        this.parent.handleChat(s02PacketChat);
    }
    
    public void handlePlayerAbilities(final S39PacketPlayerAbilities s39PacketPlayerAbilities) {
        this.parent.handlePlayerAbilities(s39PacketPlayerAbilities);
    }
    
    public void handleJoinGame(final S01PacketJoinGame s01PacketJoinGame) {
        this.parent.handleJoinGame(s01PacketJoinGame);
    }
    
    public void handleCustomPayload(final S3FPacketCustomPayload s3FPacketCustomPayload) {
        this.parent.handleCustomPayload(s3FPacketCustomPayload);
    }
    
    public static String a(final char[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append(array[i]);
        }
        return sb.toString();
    }
    
    public void handleEntityHeadLook(final S19PacketEntityHeadLook s19PacketEntityHeadLook) {
        this.parent.handleEntityHeadLook(s19PacketEntityHeadLook);
    }
    
    private float a(final double n, final double n2) {
        final double n3 = n - Minecraft.getMinecraft().thePlayer.posX;
        final double n4 = n2 - Minecraft.getMinecraft().thePlayer.posZ;
        float n5 = (float)Math.toDegrees(-Math.atan(n3 / n4));
        if (n4 < 0.0 && n3 < 0.0) {
            n5 = (float)(90.0 + Math.toDegrees(Math.atan(n4 / n3)));
        }
        else if (n4 < 0.0 && n3 > 0.0) {
            n5 = (float)(-90.0 + Math.toDegrees(Math.atan(n4 / n3)));
        }
        return n5;
    }
    
    public void handlePlayerPosLook(final S08PacketPlayerPosLook s08PacketPlayerPosLook) {
        this.parent.handlePlayerPosLook(s08PacketPlayerPosLook);
    }
    
    public void handleSpawnPosition(final S05PacketSpawnPosition s05PacketSpawnPosition) {
        this.parent.handleSpawnPosition(s05PacketSpawnPosition);
    }
    
    public void handleSetSlot(final S2FPacketSetSlot s2FPacketSetSlot) {
        this.parent.handleSetSlot(s2FPacketSetSlot);
    }
    
    public void handleEntityAttach(final S1BPacketEntityAttach s1BPacketEntityAttach) {
        this.parent.handleEntityAttach(s1BPacketEntityAttach);
    }
    
    public void handleWindowItems(final S30PacketWindowItems s30PacketWindowItems) {
        this.parent.handleWindowItems(s30PacketWindowItems);
    }
    
    public void handleTabComplete(final S3APacketTabComplete s3APacketTabComplete) {
        this.parent.handleTabComplete(s3APacketTabComplete);
    }
    
    private double a(final float n, final float n2) {
        float n3 = Math.abs(n - n2) % 360.0f;
        if (n3 > 180.0f) {
            n3 = 360.0f - n3;
        }
        return n3;
    }
    
    public void handleSpawnExperienceOrb(final S11PacketSpawnExperienceOrb s11PacketSpawnExperienceOrb) {
        this.parent.handleSpawnExperienceOrb(s11PacketSpawnExperienceOrb);
    }
    
    public void handleUseBed(final S0APacketUseBed s0APacketUseBed) {
        this.parent.handleUseBed(s0APacketUseBed);
    }
    
    public void handleSpawnPlayer(final S0CPacketSpawnPlayer s0CPacketSpawnPlayer) {
        this.parent.handleSpawnPlayer(s0CPacketSpawnPlayer);
    }
    
    public void handleChangeGameState(final S2BPacketChangeGameState s2BPacketChangeGameState) {
        this.parent.handleChangeGameState(s2BPacketChangeGameState);
    }
    
    public void handleEntityProperties(final S20PacketEntityProperties s20PacketEntityProperties) {
        this.parent.handleEntityProperties(s20PacketEntityProperties);
    }
    
    public void handleSpawnGlobalEntity(final S2CPacketSpawnGlobalEntity s2CPacketSpawnGlobalEntity) {
        this.parent.handleSpawnGlobalEntity(s2CPacketSpawnGlobalEntity);
    }
    
    public void handleTimeUpdate(final S03PacketTimeUpdate s03PacketTimeUpdate) {
        this.parent.handleTimeUpdate(s03PacketTimeUpdate);
    }
    
    public void handleEntityEffect(final S1DPacketEntityEffect s1DPacketEntityEffect) {
        this.parent.handleEntityEffect(s1DPacketEntityEffect);
    }
    
    public void handleEntityTeleport(final S18PacketEntityTeleport s18PacketEntityTeleport) {
        Minecraft.getMinecraft().theWorld.getEntityByID(s18PacketEntityTeleport.getEntityId());
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.class).getState() && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getMisplace().getState()) {
            final double n = s18PacketEntityTeleport.getX() / 32.0;
            final double n2 = s18PacketEntityTeleport.getZ() / 32.0;
            this.misValue = HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getMin().getValue() + this.a.nextDouble() * (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getMin().getValue() - HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getMax().getValue());
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.f = this.misValue - 3.0;
            if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.f == 0.0) {
                this.parent.handleEntityTeleport(s18PacketEntityTeleport);
                return;
            }
            final double hypot = Math.hypot(Minecraft.getMinecraft().thePlayer.posX - n, Minecraft.getMinecraft().thePlayer.posZ - n2);
            if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.f > hypot) {
                HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.f -= hypot;
            }
            final float a = this.a(n, n2);
            if (this.a(Minecraft.getMinecraft().thePlayer.rotationYaw, a) > 180.0) {
                this.parent.handleEntityTeleport(s18PacketEntityTeleport);
                return;
            }
            final double cos = Math.cos(Math.toRadians(a + 90.0f));
            final double sin = Math.sin(Math.toRadians(a + 90.0f));
            final double n3 = n - cos * HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.f;
            final double n4 = n2 - sin * HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.f;
            final Class<? extends S18PacketEntityTeleport> class1 = s18PacketEntityTeleport.getClass();
            try {
                final Field declaredField = class1.getDeclaredField("posX");
                declaredField.setAccessible(true);
                declaredField.set(s18PacketEntityTeleport, MathHelper.floor_double(n3 * 32.0));
                final Field declaredField2 = class1.getDeclaredField("posZ");
                declaredField2.setAccessible(true);
                declaredField2.set(s18PacketEntityTeleport, MathHelper.floor_double(n4 * 32.0));
            }
            catch (Exception ex) {
                try {
                    final Field declaredField3 = class1.getDeclaredField("posX");
                    declaredField3.setAccessible(true);
                    declaredField3.set(s18PacketEntityTeleport, MathHelper.floor_double(n3 * 32.0));
                    final Field declaredField4 = class1.getDeclaredField("posZ");
                    declaredField4.setAccessible(true);
                    declaredField4.set(s18PacketEntityTeleport, MathHelper.floor_double(n4 * 32.0));
                }
                catch (Exception ex2) {}
            }
        }
        this.parent.handleEntityTeleport(s18PacketEntityTeleport);
    }
    
    public void handleBlockAction(final S24PacketBlockAction s24PacketBlockAction) {
        this.parent.handleBlockAction(s24PacketBlockAction);
    }
    
    public void handleSpawnMob(final S0FPacketSpawnMob s0FPacketSpawnMob) {
        this.parent.handleSpawnMob(s0FPacketSpawnMob);
    }
    
    public void handleCloseWindow(final S2EPacketCloseWindow s2EPacketCloseWindow) {
        this.parent.handleCloseWindow(s2EPacketCloseWindow);
    }
    
    public void handleEntityMovement(final S14PacketEntity s14PacketEntity) {
        this.parent.handleEntityMovement(s14PacketEntity);
    }
    
    public void handleWindowProperty(final S31PacketWindowProperty s31PacketWindowProperty) {
        this.parent.handleWindowProperty(s31PacketWindowProperty);
    }
    
    public void handleRemoveEntityEffect(final S1EPacketRemoveEntityEffect s1EPacketRemoveEntityEffect) {
        this.parent.handleRemoveEntityEffect(s1EPacketRemoveEntityEffect);
    }
    
    public void handleUpdateSign(final S33PacketUpdateSign s33PacketUpdateSign) {
        this.parent.handleUpdateSign(s33PacketUpdateSign);
    }
    
    public void handleUpdateHealth(final S06PacketUpdateHealth s06PacketUpdateHealth) {
        this.parent.handleUpdateHealth(s06PacketUpdateHealth);
    }
    
    public void handleUpdateScore(final S3CPacketUpdateScore s3CPacketUpdateScore) {
        this.parent.handleUpdateScore(s3CPacketUpdateScore);
    }
    
    public void handleSoundEffect(final S29PacketSoundEffect s29PacketSoundEffect) {
        this.parent.handleSoundEffect(s29PacketSoundEffect);
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH(final NetHandlerPlayClient parent) {
        super(Minecraft.getMinecraft(), getGuiScreen(parent), parent.getNetworkManager(), parent.getGameProfile());
        this.a = new Random();
        this.parent = parent;
    }
    
    public void handleEntityMetadata(final S1CPacketEntityMetadata s1CPacketEntityMetadata) {
        this.parent.handleEntityMetadata(s1CPacketEntityMetadata);
    }
    
    public void handleSignEditorOpen(final S36PacketSignEditorOpen s36PacketSignEditorOpen) {
        this.parent.handleSignEditorOpen(s36PacketSignEditorOpen);
    }
    
    public void handleDisconnect(final S40PacketDisconnect s40PacketDisconnect) {
        this.parent.handleDisconnect(s40PacketDisconnect);
    }
    
    public void handleEntityStatus(final S19PacketEntityStatus s19PacketEntityStatus) {
        this.parent.handleEntityStatus(s19PacketEntityStatus);
    }
}
