package Croco.Prospecting;

import Croco.Prospecting.Tab.CreativeTabProspecting;
import Croco.Prospecting.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Prospecting.MODID, version = Prospecting.VERSION, name = Prospecting.NAME)
public class Prospecting {
    public static final String MODID = "prospecting";
    public static final String VERSION = "1.0";
    public static final String NAME = "Prospecting";

    @SidedProxy(clientSide = "Croco.Prospecting.proxy.ClientProxy", serverSide = "Croco.Prospecting.proxy.CommonProxy")
        public static CommonProxy proxy;
    @Mod.Instance
        public static Prospecting instance;

    public static CreativeTabProspecting tabProspecting;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit(event);
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
        tabProspecting = new CreativeTabProspecting(CreativeTabs.getNextID(), "tab_Prospecting");
        proxy.init(event);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

        proxy.postInit(event);

    }
}