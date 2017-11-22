package com.jtrent238.orespawndzport;

import com.jtrent238.orespawndzport.blocks.BlockColor;
import com.jtrent238.orespawndzport.blocks.BlockMaterial;
import com.jtrent238.orespawndzport.blocks.BlockModFlower;
import com.jtrent238.orespawndzport.blocks.BlockModOre;
import com.jtrent238.orespawndzport.blocks.BlockToxicDirt;
import com.jtrent238.orespawndzport.blocks.BlockToxicLeaves;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLoader {

	public static Block fossilbone;
	public static Block toxicdirt;
	public static Block toxicleaves;
	public static Block dargonstone1;
	public static Block dargonstone2;
	public static Block blockbloodstone;
	public static Block blockcopper;
	public static Block blockplatinum;
	public static Block blocksilver;
	public static Block blocksunstone;
	public static Block blocktin;
	public static Block orebloodstone;
	public static Block orecopper;
	public static Block oreplatinum;
	public static Block oresilver;
	public static Block oresunstone;
	public static Block oretin;
	public static Block block_blue;
	public static Block block_brown;
	public static Block block_darkblue;
	public static Block block_darkbrown;
	public static Block block_darkgreen;
	public static Block block_darkgrey;
	public static Block block_darkorange;
	public static Block block_darkpurple;
	public static Block block_darkred;
	public static Block block_darkviolet;
	public static Block block_darkyellow;
	public static Block block_green;
	public static Block block_grey;
	public static Block block_lightblue;
	public static Block block_lightbrown;
	public static Block block_lightgreen;
	public static Block block_lightgrey;
	public static Block block_lightorange;
	public static Block block_lightpurple;
	public static Block block_lightred;
	public static Block block_lightviolet;
	public static Block block_lightyellow;
	public static Block block_orange;
	public static Block block_purple;
	public static Block block_red;
	public static Block block_violet;
	public static Block block_yellow;
	
	public static Block flower_pink;
	public static Block flower_purple;
	public static Block flower_red;
	public static Block flower_yellow;
	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {

		fossilbone = new BlockStone().setBlockName("fossilbone").setBlockTextureName("orespawndzport:fossilbone").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(CreativeTabs.tabBlock);
		toxicdirt = new BlockToxicDirt(null, null).setBlockName("toxicdirt").setBlockTextureName("orespawndzport:darkdirt").setCreativeTab(CreativeTabs.tabBlock);
		toxicleaves = new BlockToxicLeaves().setBlockName("toxicleaves").setBlockTextureName("orespawndzport:darkleaves").setCreativeTab(CreativeTabs.tabBlock);
		dargonstone1 = new BlockStone().setBlockName("dargonstone1").setBlockTextureName("orespawndzport:dargonstone1").setCreativeTab(CreativeTabs.tabBlock);
		dargonstone2 = new BlockStone().setBlockName("dargonstone2").setBlockTextureName("orespawndzport:dargonstone2").setCreativeTab(CreativeTabs.tabBlock);
		
		blockbloodstone = new BlockMaterial(Material.iron).setBlockName("blockbloodstone").setBlockTextureName("orespawndzport:blockbloodstone").setCreativeTab(CreativeTabs.tabBlock);
		blockcopper = new BlockMaterial(Material.iron).setBlockName("blockcopper").setBlockTextureName("orespawndzport:blockcopper").setCreativeTab(CreativeTabs.tabBlock);
		blockplatinum = new BlockMaterial(Material.iron).setBlockName("blockplatinum").setBlockTextureName("orespawndzport:blockplatinum").setCreativeTab(CreativeTabs.tabBlock);
		blocksilver = new BlockMaterial(Material.iron).setBlockName("blocksilver").setBlockTextureName("orespawndzport:blocksilver").setCreativeTab(CreativeTabs.tabBlock);
		blocksunstone = new BlockMaterial(Material.iron).setBlockName("blocksunstone").setBlockTextureName("orespawndzport:blocksunstone").setCreativeTab(CreativeTabs.tabBlock);
		blocktin = new BlockMaterial(Material.iron).setBlockName("blocktin").setBlockTextureName("orespawndzport:blocktin").setCreativeTab(CreativeTabs.tabBlock);
		blockbloodstone = new BlockMaterial(Material.iron).setBlockName("blockbloodstone").setBlockTextureName("orespawndzport:blockbloodstone").setCreativeTab(CreativeTabs.tabBlock);
		
		orebloodstone = new BlockModOre(Material.rock).setBlockName("orebloodstone").setBlockTextureName("orespawndzport:orebloodstone").setCreativeTab(CreativeTabs.tabBlock);
		orecopper = new BlockModOre(Material.rock).setBlockName("orecopper").setBlockTextureName("orespawndzport:orecopper").setCreativeTab(CreativeTabs.tabBlock);
		oreplatinum = new BlockModOre(Material.rock).setBlockName("oreplatinum").setBlockTextureName("orespawndzport:oreplatinum").setCreativeTab(CreativeTabs.tabBlock);
		oresilver = new BlockModOre(Material.rock).setBlockName("oresilver").setBlockTextureName("orespawndzport:oresilver").setCreativeTab(CreativeTabs.tabBlock);
		oresunstone = new BlockModOre(Material.rock).setBlockName("oresunstone").setBlockTextureName("orespawndzport:oresunstone").setCreativeTab(CreativeTabs.tabBlock);
		oretin = new BlockModOre(Material.rock).setBlockName("oretin").setBlockTextureName("orespawndzport:oretin").setCreativeTab(CreativeTabs.tabBlock);

		block_blue = new BlockColor(Material.rock).setBlockName("block_blue").setBlockTextureName("orespawndzport:block_blue").setCreativeTab(CreativeTabs.tabBlock);
		block_brown = new BlockColor(Material.rock).setBlockName("block_brown").setBlockTextureName("orespawndzport:block_brown").setCreativeTab(CreativeTabs.tabBlock);
		block_darkblue = new BlockColor(Material.rock).setBlockName("block_darkblue").setBlockTextureName("orespawndzport:block_darkblue").setCreativeTab(CreativeTabs.tabBlock);
		block_darkbrown = new BlockColor(Material.rock).setBlockName("block_darkbrown").setBlockTextureName("orespawndzport:block_darkbrown").setCreativeTab(CreativeTabs.tabBlock);
		block_darkgreen = new BlockColor(Material.rock).setBlockName("block_darkgreen").setBlockTextureName("orespawndzport:block_darkgreen").setCreativeTab(CreativeTabs.tabBlock);
		block_darkgrey = new BlockColor(Material.rock).setBlockName("block_darkgrey").setBlockTextureName("orespawndzport:block_darkgrey").setCreativeTab(CreativeTabs.tabBlock);
		block_darkorange = new BlockColor(Material.rock).setBlockName("block_darkorange").setBlockTextureName("orespawndzport:block_darkorange").setCreativeTab(CreativeTabs.tabBlock);
		block_darkpurple = new BlockColor(Material.rock).setBlockName("block_darkpurple").setBlockTextureName("orespawndzport:block_darkpurple").setCreativeTab(CreativeTabs.tabBlock);
		block_darkred = new BlockColor(Material.rock).setBlockName("block_darkred").setBlockTextureName("orespawndzport:block_darkred").setCreativeTab(CreativeTabs.tabBlock);
		block_darkviolet = new BlockColor(Material.rock).setBlockName("block_darkviolet").setBlockTextureName("orespawndzport:block_darkviolet").setCreativeTab(CreativeTabs.tabBlock);
		block_darkyellow = new BlockColor(Material.rock).setBlockName("block_darkyellow").setBlockTextureName("orespawndzport:block_darkyellow").setCreativeTab(CreativeTabs.tabBlock);
		block_green = new BlockColor(Material.rock).setBlockName("block_green").setBlockTextureName("orespawndzport:block_green").setCreativeTab(CreativeTabs.tabBlock);
		block_grey = new BlockColor(Material.rock).setBlockName("block_grey").setBlockTextureName("orespawndzport:block_grey").setCreativeTab(CreativeTabs.tabBlock);
		block_lightblue = new BlockColor(Material.rock).setBlockName("block_lightblue").setBlockTextureName("orespawndzport:oretin").setCreativeTab(CreativeTabs.tabBlock);
		block_lightbrown = new BlockColor(Material.rock).setBlockName("block_lightbrown").setBlockTextureName("orespawndzport:block_lightbrown").setCreativeTab(CreativeTabs.tabBlock);
		block_lightgreen = new BlockColor(Material.rock).setBlockName("block_lightgreen").setBlockTextureName("orespawndzport:block_lightgreen").setCreativeTab(CreativeTabs.tabBlock);
		block_lightgrey = new BlockColor(Material.rock).setBlockName("block_lightgrey").setBlockTextureName("orespawndzport:block_lightgrey").setCreativeTab(CreativeTabs.tabBlock);
		block_lightorange = new BlockColor(Material.rock).setBlockName("block_lightorange").setBlockTextureName("orespawndzport:block_lightorange").setCreativeTab(CreativeTabs.tabBlock);
		block_lightpurple = new BlockColor(Material.rock).setBlockName("block_lightpurple").setBlockTextureName("orespawndzport:block_lightpurple").setCreativeTab(CreativeTabs.tabBlock);
		block_lightred = new BlockColor(Material.rock).setBlockName("block_lightred").setBlockTextureName("orespawndzport:block_lightred").setCreativeTab(CreativeTabs.tabBlock);
		block_lightviolet = new BlockColor(Material.rock).setBlockName("block_lightviolet").setBlockTextureName("orespawndzport:block_lightviolet").setCreativeTab(CreativeTabs.tabBlock);
		block_lightyellow = new BlockColor(Material.rock).setBlockName("block_lightyellow").setBlockTextureName("orespawndzport:block_lightyellow").setCreativeTab(CreativeTabs.tabBlock);
		block_orange = new BlockColor(Material.rock).setBlockName("block_orange").setBlockTextureName("orespawndzport:block_orange").setCreativeTab(CreativeTabs.tabBlock);
		block_purple = new BlockColor(Material.rock).setBlockName("block_purple").setBlockTextureName("orespawndzport:block_purple").setCreativeTab(CreativeTabs.tabBlock);
		block_red = new BlockColor(Material.rock).setBlockName("block_red").setBlockTextureName("orespawndzport:block_red").setCreativeTab(CreativeTabs.tabBlock);
		block_violet = new BlockColor(Material.rock).setBlockName("block_violet").setBlockTextureName("orespawndzport:block_violet").setCreativeTab(CreativeTabs.tabBlock);
		block_yellow = new BlockColor(Material.rock).setBlockName("block_yellow").setBlockTextureName("orespawndzport:block_yellow").setCreativeTab(CreativeTabs.tabBlock);
		
		flower_pink = new BlockModFlower(0).setBlockName("flower_pink").setBlockTextureName("orespawndzport:" + BlockModFlower.field_149860_M).setCreativeTab(CreativeTabs.tabDecorations);
		flower_purple = new BlockModFlower(1).setBlockName("flower_purple").setBlockTextureName("orespawndzport:" + BlockModFlower.field_149860_M).setCreativeTab(CreativeTabs.tabDecorations);
		flower_red = new BlockModFlower(2).setBlockName("flower_red").setBlockTextureName("orespawndzport:" + BlockModFlower.field_149860_M).setCreativeTab(CreativeTabs.tabDecorations);
		flower_yellow = new BlockModFlower(3).setBlockName("flower_yellow").setBlockTextureName("orespawndzport:" + BlockModFlower.field_149860_M).setCreativeTab(CreativeTabs.tabDecorations);
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){

		GameRegistry.registerBlock(fossilbone, "fossilbone");
		GameRegistry.registerBlock(toxicdirt, "toxicdirt");
		GameRegistry.registerBlock(toxicleaves, "toxicleaves");
		GameRegistry.registerBlock(dargonstone1, "dargonstone1");
		GameRegistry.registerBlock(dargonstone2, "dargonstone2");
		
		GameRegistry.registerBlock(blockbloodstone, "blockbloodstone");
		GameRegistry.registerBlock(blockcopper, "blockcopper");
		GameRegistry.registerBlock(blockplatinum, "blockplatinum");
		GameRegistry.registerBlock(blocksilver, "blocksilver");
		GameRegistry.registerBlock(blocksunstone, "blocksunstone");
		GameRegistry.registerBlock(blocktin, "blocktin");
		
		GameRegistry.registerBlock(orebloodstone, "orebloodstone");
		GameRegistry.registerBlock(orecopper, "orecopper");
		GameRegistry.registerBlock(oreplatinum, "oreplatinum");
		GameRegistry.registerBlock(oresilver, "oresilver");
		GameRegistry.registerBlock(oresunstone, "oresunstone");
		GameRegistry.registerBlock(oretin, "oretin");
		
		GameRegistry.registerBlock(block_blue, "block_blue");
		GameRegistry.registerBlock(block_brown, "block_brown");
		GameRegistry.registerBlock(block_darkblue, "block_darkblue");
		GameRegistry.registerBlock(block_darkbrown, "block_darkbrown");
		GameRegistry.registerBlock(block_darkgreen, "block_darkgreen");
		GameRegistry.registerBlock(block_darkgrey, "block_darkgrey");
		GameRegistry.registerBlock(block_darkorange, "block_darkorange");
		GameRegistry.registerBlock(block_darkpurple, "block_darkpurple");
		GameRegistry.registerBlock(block_darkred, "block_darkred");
		GameRegistry.registerBlock(block_darkviolet, "block_darkviolet");
		GameRegistry.registerBlock(block_darkyellow, "block_darkyellow");
		GameRegistry.registerBlock(block_green, "block_green");
		GameRegistry.registerBlock(block_grey, "block_grey");
		GameRegistry.registerBlock(block_lightblue, "block_lightblue");
		GameRegistry.registerBlock(block_lightbrown, "block_lightbrown");
		GameRegistry.registerBlock(block_lightgreen, "block_lightgreen");
		GameRegistry.registerBlock(block_lightgrey, "block_lightgrey");
		GameRegistry.registerBlock(block_lightorange, "block_lightorange");
		GameRegistry.registerBlock(block_lightpurple, "block_lightpurple");
		GameRegistry.registerBlock(block_lightred, "block_lightred");
		GameRegistry.registerBlock(block_lightviolet, "block_lightviolet");
		GameRegistry.registerBlock(block_lightyellow, "block_lightyellow");
		GameRegistry.registerBlock(block_orange, "block_orange");
		GameRegistry.registerBlock(block_purple, "block_purple");
		GameRegistry.registerBlock(block_red, "block_red");
		GameRegistry.registerBlock(block_violet, "block_violet");
		GameRegistry.registerBlock(block_yellow, "block_yellow");
		
		GameRegistry.registerBlock(flower_pink, "flower_pink");
		GameRegistry.registerBlock(flower_purple, "flower_purple");
		GameRegistry.registerBlock(flower_red, "flower_red");
		GameRegistry.registerBlock(flower_yellow, "flower_yellow");
		
	}
	
	
}
