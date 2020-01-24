package com.mart.alchemyplus.registration;

import com.mart.alchemyplus.AlchemyPlus;
import com.mart.alchemyplus.potion.ModPotions;
import net.minecraft.block.Block;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid= AlchemyPlus.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {

    @SubscribeEvent
    public static void setup(final FMLCommonSetupEvent event) {
        AlchemyPlus.setup.init();
        AlchemyPlus.proxy.setup();
    }

    @SubscribeEvent
    public static void onBlockRegistry(final RegistryEvent.Register<Block> event){


    }

    @SubscribeEvent
    public static void onPotionRegistry(final RegistryEvent.Register<Potion> event){
        ModPotions.init(event.getRegistry());
    }

}
