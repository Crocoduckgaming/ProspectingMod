package Croco.Prospecting.Tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabProspecting extends CreativeTabs{
    public CreativeTabProspecting(int index, String label){
        super(index, label);
    }
    @Override
    public Item getTabIconItem() {
        return Items.PRISMARINE_CRYSTALS;
    }
}
