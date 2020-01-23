package com.mart.alchemyplus.event;

import com.mart.alchemyplus.AlchemyPlus;
import com.mart.alchemyplus.potion.ModEffects;
import com.mart.alchemyplus.potioneffect.EnderFluEffect;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AlchemyPlus.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PotionEffectEvents {

    @SubscribeEvent
    public static void playerDamage(LivingDamageEvent event){
        if(event.getEntity() instanceof PlayerEntity){
            PlayerEntity playerEntity = (PlayerEntity) event.getEntity();
            EffectInstance instance = playerEntity.getActivePotionEffect(ModEffects.ENDER_FLU);
            if(instance != null){
                EnderFluEffect.act(playerEntity);
            }
        }
    }

}
