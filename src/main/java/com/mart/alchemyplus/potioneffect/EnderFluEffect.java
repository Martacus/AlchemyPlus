package com.mart.alchemyplus.potioneffect;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;

public class EnderFluEffect extends Effect {

    public EnderFluEffect() {
        super(EffectType.NEUTRAL, 3080192);
    }

    public static void act(PlayerEntity entity){
        if (entity.world.isRemote) {
            return;

        }
        if (!entity.getEntityWorld().isRemote) {
            double d0 = entity.getPosX();
            double d1 = entity.getPosY();
            double d2 = entity.getPosZ();

            for(int i = 0; i < 16; ++i) {
                double d3 = entity.getPosX() + (entity.getRNG().nextDouble() - 0.5D) * 16.0D;
                double d4 = MathHelper.clamp(entity.getPosY() + (double)(entity.getRNG().nextInt(16) - 8), 0.0D, (double)(entity.getEntityWorld().getActualHeight() - 1));
                double d5 = entity.getPosZ() + (entity.getRNG().nextDouble() - 0.5D) * 16.0D;
                if (entity.isPassenger()) {
                    entity.stopRiding();
                }

                if (entity.attemptTeleport(d3, d4, d5, true)) {
                    entity.getEntityWorld().playSound(null, d0, d1, d2, SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
                    entity.playSound(SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, 1.0F, 1.0F);
                    break;
                }
            }
        }
    }

}
