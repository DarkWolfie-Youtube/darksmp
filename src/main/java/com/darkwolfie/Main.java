package com.darkwolfie;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.darkwolfie.items.DarkAxe;

public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("darksmp");
	public static final String MOD_ID = "darksmp";
	public static final DarkAxe DARK_AXE = new DarkAxe(new FabricItemSettings().maxCount(1));
	private static final ItemGroup SICK_CREATIVE_INVENTORY = FabricItemGroup.builder()
	.icon(() -> new ItemStack(DARK_AXE))
        .displayName(Text.translatable("itemGroup.tutorial.test_group"))
	.build();
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dark_axe"), DARK_AXE);
		Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "sick_creative_inventory"), SICK_CREATIVE_INVENTORY);


		ItemGroupEvents.modifyEntriesEvent(SICK_CREATIVE_INVENTORY).register(content -> {
			content.add(DARK_AXE);
		});
	}
}