package com.jtrent238.orespawndzport;

import com.jtrent238.orespawndzport.items.EarthStaff;
import com.jtrent238.orespawndzport.items.FireStaff;
import com.jtrent238.orespawndzport.items.ItemCoin;
import com.jtrent238.orespawndzport.items.ItemFlag;
import com.jtrent238.orespawndzport.items.ItemLump;
import com.jtrent238.orespawndzport.items.ItemQuinoa;
import com.jtrent238.orespawndzport.items.ItemShrinkBerry;
import com.jtrent238.orespawndzport.items.ItemSpam;
import com.jtrent238.orespawndzport.items.ItemSpawnEgg;
import com.jtrent238.orespawndzport.items.ItemYellowApple;
import com.jtrent238.orespawndzport.items.ItemYucky;
import com.jtrent238.orespawndzport.items.LightningStaff;
import com.jtrent238.orespawndzport.items.MorphStaff;
import com.jtrent238.orespawndzport.items.PlantStaff;
import com.jtrent238.orespawndzport.items.ShrinkRay;
import com.jtrent238.orespawndzport.items.WaterStaff;
import com.jtrent238.orespawndzport.items.WindStaff;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemLoader {

	public static Item shrinkberries;
	public static Item shrinkray;
	public static Item spam;
	public static Item pig_guts;
	public static Item pig_nose;
	public static Item pig_toes;
	public static Item pig_tail;
	public static Item pig_ear;
	public static Item wormfood;
	public static Item earthstaff;
	public static Item windstaff;
	public static Item firestaff;
	public static Item waterstaff;
	public static Item lightningstaff;
	public static Item plantstaff;
	public static Item morphstaff;
	public static Item yellowapple;
	public static Item lumpcopper;
	public static Item lumptin;
	public static Item lumpplatinum;
	public static Item lumpsilver;
	public static Item spidersilk;
	public static Item sunstone;
	public static Item trophy;
	public static Item woodchips;
	public static Item woodpulp;
	public static Item moosebone;
	public static Item moosehead;
	public static Item moosemeat;
	public static Item moosemeat_cooked;
	public static Item furball;
	public static Item bloodstone;
	public static Item barrierkey;
	public static Item bread;
	public static Item charcoalstick;
	public static Item coingold;
	public static Item coinplatinum;
	public static Item coinsilver;
	public static Item flag;
	
	public static Item eggwhiner;
	public static Item eggvixen;
	public static Item eggsparklemuffin;
	
	public static void LoadItems() {
		// TODO Auto-generated method stub
		shrinkberries = new ItemShrinkBerry(0, 0, true).setUnlocalizedName("ShrinkBerry").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:shrinkberries");;
		shrinkray = new ShrinkRay(null, null).setUnlocalizedName("ShrinkRay").setCreativeTab(CreativeTabs.tabCombat).setTextureName("orespawndzport:ShrinkRay");
		spam = new ItemSpam(0, 0, true).setUnlocalizedName("Spam").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:spam");;
		pig_guts = new ItemYucky(0, 0, false).setUnlocalizedName("Pig_Guts").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:pig_guts");
		pig_nose = new ItemYucky(0, 0, false).setUnlocalizedName("Pig_Nose").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:pig_nose");
		pig_toes = new ItemYucky(0, 0, false).setUnlocalizedName("Pig_Toes").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:pig_toes");
		pig_tail = new ItemYucky(0, 0, false).setUnlocalizedName("Pig_Tail").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:pig_tail");
		pig_ear = new ItemYucky(0, 0, false).setUnlocalizedName("Pig_Ear").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:pig_ear");
		wormfood = new ItemYucky(0, 0, false).setUnlocalizedName("Worm_Food").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:worm_food");
		earthstaff = new EarthStaff().setUnlocalizedName("EarthStaff").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:earthstaff");
		windstaff = new WindStaff().setUnlocalizedName("WindStaff").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:windstaff");
		firestaff = new FireStaff().setUnlocalizedName("FireStaff").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:firestaff");
		waterstaff = new WaterStaff().setUnlocalizedName("WaterStaff").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:waterstaff");
		lightningstaff = new LightningStaff().setUnlocalizedName("LightningStaff").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:lightningstaff");
		plantstaff = new PlantStaff().setUnlocalizedName("PlantStaff").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:plantstaff");
		morphstaff = new MorphStaff().setUnlocalizedName("MorphStaff").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:staffofmorph");
		yellowapple = new ItemYellowApple(5, 0, true).setUnlocalizedName("YellowApple").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:yellowapple");
		lumpcopper = new ItemLump().setUnlocalizedName("lumpcopper").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:lumpcopper");
		lumptin = new ItemLump().setUnlocalizedName("lumptin").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:lumptin");
		lumpplatinum = new ItemLump().setUnlocalizedName("lumpplatinum").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:lumpplatinum");
		lumpsilver = new ItemLump().setUnlocalizedName("lumpsilver").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:lumpsilver");
		spidersilk = new Item().setUnlocalizedName("spidersilk").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:spidersilk");
		sunstone = new Item().setUnlocalizedName("sunstone").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:sunstone");
		trophy = new Item().setUnlocalizedName("trophy").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:trophy");
		woodchips = new Item().setUnlocalizedName("woodchips").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:woodchips");
		woodpulp = new Item().setUnlocalizedName("woodpulp").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:woodpulp");
		moosebone = new Item().setUnlocalizedName("moosebone").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:moosebone");
		moosehead = new Item().setUnlocalizedName("moosehead").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:moosehead");
		moosemeat = new ItemFood(0, 0, false).setUnlocalizedName("moosemeat").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:moosemeat");
		moosemeat_cooked = new ItemFood(0, 0, false).setUnlocalizedName("moosemeat_cooked").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:moosemeat_cooked");
		furball = new Item().setUnlocalizedName("furball").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:furball");
		bloodstone = new Item().setUnlocalizedName("bloodstone").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:bloodstone");
		barrierkey = new Item().setUnlocalizedName("barrierkey").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:barrierkey");
		bread = new ItemFood(0, 0, false).setUnlocalizedName("gfbread").setCreativeTab(CreativeTabs.tabFood).setTextureName("orespawndzport:bread");
		charcoalstick = new Item().setUnlocalizedName("charcoalstick").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:charcoalstick");
		coingold = new ItemCoin().setUnlocalizedName("coingold").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:coingold");
		coinplatinum = new ItemCoin().setUnlocalizedName("coinplatinum").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:coinplatinum");
		coinsilver = new ItemCoin().setUnlocalizedName("coinsilver").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:coinsilver");
		flag = new ItemFlag().setUnlocalizedName("flag").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("orespawndzport:flag");
		
		eggwhiner = new ItemSpawnEgg(0, 0).setUnlocalizedName("WhinerEgg").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:eggwhiner");
		eggvixen = new ItemSpawnEgg(0, 0).setUnlocalizedName("VixenEgg").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:eggvixen");
		eggsparklemuffin = new ItemSpawnEgg(0, 0).setUnlocalizedName("SparkleMuffinEgg").setCreativeTab(CreativeTabs.tabMisc).setTextureName("orespawndzport:eggsparklemuffin");
		
		registerItems();
	}

	private static void registerItems() {

		GameRegistry.registerItem(shrinkberries, shrinkberries.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(shrinkray, shrinkray.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spam, spam.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pig_guts, pig_guts.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pig_nose, pig_nose.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pig_toes, pig_toes.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pig_tail, pig_tail.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pig_ear, pig_ear.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthstaff, earthstaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(windstaff, windstaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(firestaff, firestaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(waterstaff, waterstaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lightningstaff, lightningstaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(plantstaff, plantstaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(morphstaff, morphstaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(yellowapple, yellowapple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lumpcopper, lumpcopper.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lumptin, lumptin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lumpplatinum, lumpplatinum.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lumpsilver, lumpsilver.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spidersilk, spidersilk.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sunstone, sunstone.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(trophy, trophy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodchips, woodchips.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodpulp, woodpulp.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(moosebone, moosebone.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(moosehead, moosehead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(moosemeat, moosemeat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(moosemeat_cooked, moosemeat_cooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(furball, furball.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bloodstone, bloodstone.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(barrierkey, barrierkey.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bread, bread.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(charcoalstick, charcoalstick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coingold, coingold.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coinplatinum, coinplatinum.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coinsilver, coinsilver.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(flag, flag.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(eggwhiner, eggwhiner.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(eggvixen, eggvixen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(eggsparklemuffin, eggsparklemuffin.getUnlocalizedName().substring(5));
		
		
	}

}
