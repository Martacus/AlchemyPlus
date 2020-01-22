package com.mart.alchemyplus.potion;

import com.mart.alchemyplus.AlchemyPlus;
import com.mart.alchemyplus.potioneffect.EnderFluEffect;
import com.mart.alchemyplus.potioneffect.WaterWalkingEffect;
import net.minecraft.potion.Effect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class ModEffects {

    public static Effect ENDER_FLU, WATER_WALKING;

    public static void init(){
        ENDER_FLU = Registry.register(Registry.EFFECTS, new ResourceLocation(AlchemyPlus.MODID, "ender_flu"), new EnderFluEffect());
        WATER_WALKING = Registry.register(Registry.EFFECTS, new ResourceLocation(AlchemyPlus.MODID, "water_walking"), new WaterWalkingEffect());
    }

}
