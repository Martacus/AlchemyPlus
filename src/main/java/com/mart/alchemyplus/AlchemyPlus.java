package com.mart.alchemyplus;

import com.mart.alchemyplus.client.ClientProxy;
import com.mart.alchemyplus.potion.ModEffects;
import com.mart.alchemyplus.potion.ModPotions;
import com.mart.alchemyplus.setup.IProxy;
import com.mart.alchemyplus.setup.ModSetup;
import com.mart.alchemyplus.setup.ServerProxy;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("alchemyplus")
public class AlchemyPlus {

    public static final String MODID = "alchemyplus";
    public static final Logger LOG = LogManager.getLogger();

    // Sided setup
    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    // Side agnostic setup
    public static ModSetup setup = new ModSetup();

    public AlchemyPlus() {
        // Register the setup method for mod loading
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ModPotions.init();
        ModEffects.init();
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.setup();
    }

}
