package Croco.Prospecting.item;

import Croco.Prospecting.Prospecting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item RockHammer;

    public static void preInit() {
        RockHammer = new ProspectingItem("Rock_Hammer");
        registerItems();

    }

    public static void registerItems() {
        GameRegistry.register(RockHammer, new ResourceLocation(Prospecting.MODID, "Rock_Hammer"));
    }

    public static void registerRenders() {
        registerRender(RockHammer);

    }
    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Prospecting.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
