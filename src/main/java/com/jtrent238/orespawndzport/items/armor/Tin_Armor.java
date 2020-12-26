package com.jtrent238.orespawndzport.items.armor;

import com.jtrent238.orespawndzport.Main;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Tin_Armor extends ItemArmor{

	private String textureName;
	private int armorType;
	

	public Tin_Armor(ArmorMaterial material, int i, int j) {
		super(material, 0, i);
	    //this.textureName = textureName;
	    this.setUnlocalizedName("tin_Armor");
	    this.setTextureName(Main.MODID + ":tin_Armor");
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return Main.MODID + ":textures/armor/tin_Armor_" + (this.armorType == 2 ? "2" : "1") + ".png";
		}
}