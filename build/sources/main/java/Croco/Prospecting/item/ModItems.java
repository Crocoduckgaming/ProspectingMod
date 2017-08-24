package Croco.Prospecting.item;

import Croco.Prospecting.Prospecting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    private static Item tutorialItem;

    public static void preInit() {
        tutorialItem = new Item().setUnlocalizedName("tutorial_item").setCreativeTab(Prospecting.tabProspecting);
        registerItems();

    }

    private static void registerItems() {
        GameRegistry.register(tutorialItem, new ResourceLocation(Prospecting.MODID, "tutorial_item"));
    }

    public static void registerRenders() {
        registerRender(tutorialItem);

    }
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Prospecting.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
