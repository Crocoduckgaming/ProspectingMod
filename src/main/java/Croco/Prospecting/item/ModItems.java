package Croco.Prospecting.item;

import Croco.Prospecting.Prospecting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item RockHammer;
    public static Item AmberGem;
    public static Item SapphireGem;
    public static Item AmethystGem;
    public static Item TurquoiseGem;
    public static Item JadeGem;
    public static Item RubyGem;
    public static Item TopazGem;
    public static Item BloodstoneGem;
    public static Item OpalGem;
    public static Item BaseGeode;
    public static void preInit() {
        RockHammer = new ProspectingTool("Rock_Hammer");
        AmberGem = new ProspectingItem("Amber_Gem");
        SapphireGem = new ProspectingItem("Sapphire_Gem");
        AmethystGem = new ProspectingItem("Amethyst_Gem");
        TurquoiseGem = new ProspectingItem("Turquoise_Gem");
        JadeGem = new ProspectingItem("Jade_Gem");
        RubyGem = new ProspectingItem("Ruby_Gem");
        TopazGem = new ProspectingItem("Topaz_Gem");
        BloodstoneGem = new ProspectingItem("Bloodstone_Gem");
        OpalGem = new ProspectingItem("Opal_Gem");
        BaseGeode = new ProspectingItem("Base_Geode");
        registerItems();

    }

    public static void registerItems() {
        GameRegistry.register(RockHammer, new ResourceLocation(Prospecting.MODID, "Rock_Hammer"));
        GameRegistry.register(AmberGem, new ResourceLocation(Prospecting.MODID, "Amber_Gem"));
        GameRegistry.register(SapphireGem, new ResourceLocation(Prospecting.MODID, "Sapphire_Gem"));
        GameRegistry.register(AmethystGem, new ResourceLocation(Prospecting.MODID, "Amethyst_Gem"));
        GameRegistry.register(TurquoiseGem, new ResourceLocation(Prospecting.MODID, "Turquoise_Gem"));
        GameRegistry.register(JadeGem, new ResourceLocation(Prospecting.MODID, "Jade_Gem"));
        GameRegistry.register(RubyGem, new ResourceLocation(Prospecting.MODID, "Ruby_Gem"));
        GameRegistry.register(TopazGem, new ResourceLocation(Prospecting.MODID, "Topaz_Gem"));
        GameRegistry.register(BloodstoneGem, new ResourceLocation(Prospecting.MODID, "Bloodstone_Gem"));
        GameRegistry.register(OpalGem, new ResourceLocation(Prospecting.MODID, "Opal_Gem"));
        GameRegistry.register(BaseGeode, new ResourceLocation(Prospecting.MODID, "Base_Geode"));
    }

    public static void registerRenders() {
        registerRender(RockHammer);
        registerRender(AmberGem);
        registerRender(SapphireGem);
        registerRender(AmethystGem);
        registerRender(TurquoiseGem);
        registerRender(JadeGem);
        registerRender(RubyGem);
        registerRender(TopazGem);
        registerRender(BloodstoneGem);
        registerRender(OpalGem);
        registerRender(BaseGeode);
    }
    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Prospecting.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
