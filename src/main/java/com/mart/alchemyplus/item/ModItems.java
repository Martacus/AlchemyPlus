package com.mart.alchemyplus.item;

import com.mart.alchemyplus.AlchemyPlus;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static Item PHANTOM_FOOT;

    public static void init(final IForgeRegistry<Item> registry){
        registry.register(PHANTOM_FOOT = new Item(new Item.Properties()).setRegistryName(AlchemyPlus.MODID, "phantom_foot"));
    }
}
