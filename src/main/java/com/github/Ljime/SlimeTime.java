package com.github.Ljime;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SlimeTime implements ModInitializer {

	public static final ItemGroup SLIMETIME_GROUP = FabricItemGroupBuilder.build(new Identifier("slimetime", "general"), () -> new ItemStack(SlimeTime.SLIME_CROWN));


	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("slimetime", "slime_crown"), SLIME_CROWN);

	}
	public static final Item SLIME_CROWN = new Item(new FabricItemSettings().maxCount(1).group(SLIMETIME_GROUP));

}
