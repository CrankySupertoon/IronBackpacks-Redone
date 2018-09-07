package v0id.vsb.net;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import v0id.api.vsb.capability.IVSBPlayer;
import v0id.api.vsb.data.VSBRegistryNames;
import v0id.vsb.net.message.*;
import v0id.vsb.util.EnumGuiType;

public class VSBNet
{
    private static final SimpleNetworkWrapper WRAPPER = NetworkRegistry.INSTANCE.newSimpleChannel(VSBRegistryNames.MODID);

    static
    {
        WRAPPER.registerMessage(OpenGUI.Handler.class, OpenGUI.class, 0, Side.CLIENT);
        WRAPPER.registerMessage(SwitchContextContainer.Handler.class, SwitchContextContainer.class, 1, Side.SERVER);
        WRAPPER.registerMessage(SyncPlayerData.Handler.class, SyncPlayerData.class, 2, Side.CLIENT);
        WRAPPER.registerMessage(RemoveBackpack.Handler.class, RemoveBackpack.class, 3, Side.SERVER);
        WRAPPER.registerMessage(OpenWornBackpack.Handler.class, OpenWornBackpack.class, 4, Side.SERVER);
        WRAPPER.registerMessage(ChangeFilterParam.Handler.class, ChangeFilterParam.class, 5, Side.SERVER);
        WRAPPER.registerMessage(OpenContainer.Handler.class, OpenContainer.class, 6, Side.SERVER);
    }

    public static void sendOpenGUI(EntityPlayer player, int slotID, boolean openFromInventory, int slot, EnumGuiType guiType)
    {
        WRAPPER.sendTo(new OpenGUI(slot, player.openContainer.windowId, guiType, slotID, openFromInventory), (EntityPlayerMP) player);
    }

    public static void requestContextContainerSwitch()
    {
        WRAPPER.sendToServer(new SwitchContextContainer());
    }

    public static void sendPlayerDataSync(EntityPlayerMP of, EntityPlayerMP to)
    {
        WRAPPER.sendTo(new SyncPlayerData(of.getEntityId(), IVSBPlayer.of(of).getCurrentBackpack()), to);
    }

    public static void sendRemoveBackpack()
    {
        WRAPPER.sendToServer(new RemoveBackpack());
    }

    public static void sendOpenWornBackpack()
    {
        WRAPPER.sendToServer(new OpenWornBackpack());
    }

    public static void sendChangeFilterParam(int index)
    {
        WRAPPER.sendToServer(new ChangeFilterParam(index));
    }

    public static void sendOpenContainer(int slotIndex, int slotID)
    {
        WRAPPER.sendToServer(new OpenContainer(slotIndex, slotID));
    }
}
