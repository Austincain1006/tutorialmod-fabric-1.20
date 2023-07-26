package com.john.tutorialmod;

import com.john.tutorialmod.block.ModBlocks;
import com.john.tutorialmod.item.ModItems;
import com.john.tutorialmod.item.ModItemsGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroup.registerItemGroups();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
	}
}