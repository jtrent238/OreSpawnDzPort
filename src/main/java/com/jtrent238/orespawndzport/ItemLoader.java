package com.jtrent238.orespawndzport;

import com.jtrent238.orespawndzport.items.EarthStaff;
import com.jtrent238.orespawndzport.items.FireStaff;
import com.jtrent238.orespawndzport.items.ItemQuinoa;
import com.jtrent238.orespawndzport.items.ItemShrinkBerry;
import com.jtrent238.orespawndzport.items.ItemSpam;
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
		
		
	}

}
