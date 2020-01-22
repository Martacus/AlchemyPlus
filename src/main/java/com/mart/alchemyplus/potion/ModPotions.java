package com.mart.alchemyplus.potion;

import com.mart.alchemyplus.AlchemyPlus;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class ModPotions {

    public static Potion NAUSEA, NAUSEA_LONG, ENDER_FLU, ENDER_FLU_LONG, WITHER, SATURATION, WATER_BREATHING_SHORT, LOW_GRAVITY, WATER_WALKING;

    public static void init(){
        NAUSEA = Registry.register(Registry.POTION, new ResourceLocation(AlchemyPlus.MODID, "nausea"), new Potion(new EffectInstance(Effects.NAUSEA, 60 * 20)));
        NAUSEA_LONG = Registry.register(Registry.POTION, new ResourceLocation(AlchemyPlus.MODID, "nausea_long"), new Potion(new EffectInstance(Effects.NAUSEA, 3 * 60 * 20)));
        ENDER_FLU = Registry.register(Registry.POTION, new ResourceLocation(AlchemyPlus.MODID, "ender_flu"), new Potion(new EffectInstance(ModEffects.ENDER_FLU, 60 * 20)));
        ENDER_FLU_LONG = Registry.register(Registry.POTION, new ResourceLocation(AlchemyPlus.MODID, "ender_flu_long"), new Potion(new EffectInstance(ModEffects.ENDER_FLU, 3 * 60 * 20)));
        WITHER = Registry.register(Registry.POTION, new ResourceLocation(AlchemyPlus.MODID, "wither"), new Potion(new EffectInstance(Effects.WITHER, 60 * 20)));
        SATURATION = Registry.register(Registry.POTION, new ResourceLocation(AlchemyPlus.MODID, "saturation"), new Potion(new EffectInstance(Effects.SATURATION, 3 * 60 * 20)));
        WATER_BREATHING_SHORT = Registry.register(Registry.POTION, new ResourceLocation(AlchemyPlus.MODID, "water_breathing_short"), new Potion(new EffectInstance(Effects.WATER_BREATHING, 60 * 20)));
        LOW_GRAVITY = Registry.register(Registry.POTION, new ResourceLocation(AlchemyPlus.MODID, "low_gravity"), new Potion(new EffectInstance(Effects.SLOW_FALLING, 3 * 60 * 20), new EffectInstance(Effects.JUMP_BOOST, 3 * 60 * 20, 2)));
        WATER_WALKING = Registry.register(Registry.POTION, new ResourceLocation(AlchemyPlus.MODID, "water_walking"), new Potion(new EffectInstance(ModEffects.WATER_WALKING, 5 * 60 * 20)));

//
//        BrewingRecipeRegistryAccessor.registerPotionRecipe(Potions.AWKWARD, Items.ROTTEN_FLESH, NAUSEA);
//        BrewingRecipeRegistryAccessor.registerPotionRecipe(NAUSEA, Items.GLOWSTONE_DUST, NAUSEA_LONG);
//        BrewingRecipeRegistryAccessor.registerPotionRecipe(Potions.AWKWARD, Items.ENDER_PEARL, ENDER_FLU);
//        BrewingRecipeRegistryAccessor.registerPotionRecipe(ENDER_FLU, Items.GLOWSTONE_DUST, ENDER_FLU_LONG);
//        BrewingRecipeRegistryAccessor.registerPotionRecipe(Potions.AWKWARD, Items.WITHER_SKELETON_SKULL, NAUSEA);
//        BrewingRecipeRegistryAccessor.registerPotionRecipe(Potions.AWKWARD, Items.GOLDEN_APPLE, SATURATION);
//        BrewingRecipeRegistryAccessor.registerPotionRecipe(Potions.AWKWARD, Items.NAUTILUS_SHELL, WATER_BREATHING_SHORT);
//        BrewingRecipeRegistryAccessor.registerPotionRecipe(WATER_BREATHING_SHORT, Items.GLOWSTONE_DUST, Potions.WATER_BREATHING);
//        BrewingRecipeRegistryAccessor.registerPotionRecipe(Potions.AWKWARD, ModItems.PHANTOM_FOOT, LOW_GRAVITY);
//
//        BrewingRecipeRegistryAccessor.registerPotionRecipe(Potions.AWKWARD, Items.POISONOUS_POTATO, Potions.POISON);
    }

}
