package com.darkwolfie.items;


import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;



public class DarkAxeMaterial implements ToolMaterial {
    public static final DarkAxeMaterial INSTANCE = new DarkAxeMaterial();
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
    

    
}
