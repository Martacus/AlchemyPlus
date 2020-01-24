package com.mart.alchemyplus;

import com.mart.alchemyplus.client.ClientProxy;
import com.mart.alchemyplus.potion.ModEffects;
import com.mart.alchemyplus.potion.ModPotions;
import com.mart.alchemyplus.setup.IProxy;
import com.mart.alchemyplus.setup.ModSetup;
import com.mart.alchemyplus.setup.ServerProxy;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("alchemyplus")
public class AlchemyPlus {

    public static final ItemGroup GROUP = new ItemGroup("alchemyplus") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(Items.POTION);
        }
    };

    public static final String MODID = "alchemyplus";
    public static final Logger LOG = LogManager.getLogger();

    // Sided setup
    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    // Side agnostic setup
    public static ModSetup setup = new ModSetup();

    public AlchemyPlus() {
        ModEffects.init();
    }



}
