package com.jtrent238.orespawndzport;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes {

	
	/**
	 * Register Recipes with Game Registry.
	 */
	public static void registerRecpies(){
		addShaplessRecpies();
		addShapedRecpies();
		addsmeltigrecipies();
	}

	/**
	 * Add Shaped Recipes.
	 */
	private static void addShapedRecpies(){
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.shrinkray), "XXX", "XGX", "XXX", 'X', ItemLoader.shrinkberries, 'G', danger.orespawn.OreSpawnMain.MyRayGun);
		GameRegistry.addShapedRecipe(new ItemStack(danger.orespawn.OreSpawnMain.MyUltimateSword), "U", "T", "P", 'U', danger.orespawn.OreSpawnMain.MyIngotUranium, 'T', danger.orespawn.OreSpawnMain.MyIngotTitanium, 'P', ItemLoader.lumpplatinum);
		GameRegistry.addShapedRecipe(new ItemStack(danger.orespawn.OreSpawnMain.MyUltimateShovel), "T", "U", "P", 'U', danger.orespawn.OreSpawnMain.MyIngotUranium, 'T', danger.orespawn.OreSpawnMain.MyIngotTitanium, 'P', ItemLoader.lumpplatinum);
		GameRegistry.addShapedRecipe(new ItemStack(danger.orespawn.OreSpawnMain.MyUltimateHoe), "UT", "P", "P", 'U', danger.orespawn.OreSpawnMain.MyIngotUranium, 'T', danger.orespawn.OreSpawnMain.MyIngotTitanium, 'P', ItemLoader.lumpplatinum);

		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blockbloodstone), "XXX", "XXX", "XXX", 'X', ItemLoader.bloodstone);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blockcopper), "XXX", "XXX", "XXX", 'X', ItemLoader.lumpcopper);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blockplatinum), "XXX", "XXX", "XXX", 'X', ItemLoader.lumpplatinum);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blocktin), "XXX", "XXX", "XXX", 'X', ItemLoader.lumptin);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blocksilver), "XXX", "XXX", "XXX", 'X', ItemLoader.lumpsilver);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blocksunstone), "XXX", "XXX", "XXX", 'X', ItemLoader.sunstone);
		
	}
	
	/**
	 * Add Shapeless Recipes.
	 */
	private static void addShaplessRecpies(){
		
		}
	/**
	 * Add Smelting Recipes
	 */
	private static void addsmeltigrecipies(){
		GameRegistry.addSmelting(BlockLoader.orebloodstone, new ItemStack (ItemLoader.bloodstone, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.orecopper, new ItemStack (ItemLoader.lumpcopper, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.oreplatinum, new ItemStack (ItemLoader.lumpplatinum, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.oresilver, new ItemStack (ItemLoader.lumpsilver, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.oresunstone, new ItemStack (ItemLoader.sunstone, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.oretin, new ItemStack (ItemLoader.lumptin, 1), 2F );
		GameRegistry.addSmelting(ItemLoader.moosemeat, new ItemStack (ItemLoader.moosemeat_cooked, 1), 2F );
		
		}
	
	}

	
	
	
