package com.Austin.tutorialmod.item;

import com.Austin.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.text.Text;

public class ModItemsGroup {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                // Add Custom Items Here
                entries.add(ModItems.RUBY);
                entries.add(ModItems.RAW_RUBY);

            }).build());

    public static void registerItemGroups(){
        TutorialMod.LOGGER.info( "Registering Item Groups for: " + TutorialMod.MOD_ID);
    }
}
