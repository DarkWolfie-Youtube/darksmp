package com.darkwolfie.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;



public class DarkAxe extends Item implements ToolMaterial {
    public DarkAxe(Settings settings){
        super(settings);
    }
    public int getDurability(){
        return 500;
    }
    public float getMiningSpeed(){
        return 0.8f;
    }
    public float getAttackDamage(){
        return 2.0f;
    }
    public int getMiningLevel(){
        return 7;
    }
    public int getEnchantability(){
        return 100;
    }
    public Ingredient getRepairIngredient(){
        return Ingredient.ofItems(Items.ROTTEN_FLESH);
    }
    public float getMiningSpeedMultiplier(){
        return 1.0f;
    }
    
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, SoundCategory.MASTER, 1.0f, 1.0f);
        return TypedActionResult.pass(playerEntity.getStackInHand(hand));
    }
}
