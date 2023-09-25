package com.darkwolfie.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;



public class DarkAxe extends Item {
    public DarkAxe(Settings settings){
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, SoundCategory.MASTER, 1.0f, 1.0f);
        return TypedActionResult.pass(playerEntity.getStackInHand(hand));
    }
}
