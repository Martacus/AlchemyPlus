package com.mart.alchemyplus.potion;

import com.mart.alchemyplus.AlchemyPlus;
import com.mart.alchemyplus.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.registries.IForgeRegistry;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ModPotions {

    public static Potion NAUSEA, NAUSEA_LONG, ENDER_FLU, ENDER_FLU_LONG, WITHER, SATURATION, WATER_BREATHING_SHORT, LOW_GRAVITY, WATER_WALKING;

    public static void init(final IForgeRegistry<Potion> registry){

        registry.register(NAUSEA = new Potion(new EffectInstance(Effects.NAUSEA, 60 * 20)).setRegistryName(new ResourceLocation(AlchemyPlus.MODID, "nausea")));
        registry.register(NAUSEA_LONG = new Potion(new EffectInstance(Effects.NAUSEA, 3 * 60 * 20)).setRegistryName(new ResourceLocation(AlchemyPlus.MODID, "nausea_long")));
        registry.register(ENDER_FLU = new Potion(new EffectInstance(ModEffects.ENDER_FLU, 60 * 20)).setRegistryName(new ResourceLocation(AlchemyPlus.MODID, "ender_flu")));
        registry.register(ENDER_FLU_LONG = new Potion(new EffectInstance(ModEffects.ENDER_FLU, 3 * 60 * 20)).setRegistryName(new ResourceLocation(AlchemyPlus.MODID, "ender_flu_long")));
        registry.register(WITHER = new Potion(new EffectInstance(Effects.WITHER, 60 * 20)).setRegistryName(new ResourceLocation(AlchemyPlus.MODID, "wither")));
        registry.register(WATER_BREATHING_SHORT = new Potion(new EffectInstance(Effects.WATER_BREATHING, 60 * 20)).setRegistryName(new ResourceLocation(AlchemyPlus.MODID, "water_breathing_short")));
        registry.register(LOW_GRAVITY = new Potion(new EffectInstance(Effects.SLOW_FALLING, 3 * 60 * 20), new EffectInstance(Effects.JUMP_BOOST, 3 * 60 * 20, 2)).setRegistryName(new ResourceLocation(AlchemyPlus.MODID, "low_gravity")));
        registry.register(WATER_WALKING = new Potion(new EffectInstance(ModEffects.WATER_WALKING, 5 * 60 * 20)).setRegistryName(new ResourceLocation(AlchemyPlus.MODID, "water_walking")));

        Method addMix = ObfuscationReflectionHelper.findMethod(PotionBrewing.class, "addMix", Potion.class, Item.class, Potion.class);
        try {
            addMix.invoke(null, Potions.AWKWARD, Items.ROTTEN_FLESH, NAUSEA);
            addMix.invoke(null, NAUSEA, Items.GLOWSTONE_DUST, NAUSEA_LONG);
            addMix.invoke(null, Potions.AWKWARD, Items.ENDER_PEARL, ENDER_FLU);
            addMix.invoke(null, ENDER_FLU, Items.GLOWSTONE_DUST, ENDER_FLU_LONG);
            addMix.invoke(null, Potions.AWKWARD, Items.WITHER_SKELETON_SKULL, NAUSEA);
            addMix.invoke(null, Potions.AWKWARD, Items.GOLDEN_APPLE, SATURATION);
            addMix.invoke(null, Potions.AWKWARD, Items.NAUTILUS_SHELL, WATER_BREATHING_SHORT);
            addMix.invoke(null, WATER_BREATHING_SHORT, Items.GLOWSTONE_DUST, Potions.WATER_BREATHING);
            addMix.invoke(null, Potions.AWKWARD, ModItems.PHANTOM_FOOT, LOW_GRAVITY);
            addMix.invoke(null, Potions.AWKWARD, Items.POISONOUS_POTATO, Potions.POISON);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
