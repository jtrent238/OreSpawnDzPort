package com.jtrent238.orespawndzport.items;

import java.util.Random;

import ibxm.Player;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemQuinoa
  extends ItemFood
{
  public ItemQuinoa(int healAmount, float potionEffectProbability, boolean alwaysEdible)
  {
    super(healAmount, potionEffectProbability, alwaysEdible);
    this.setUnlocalizedName("Quinoa");
    this.setTextureName("orespawndzport:quinoa.png");
    this.setCreativeTab(CreativeTabs.tabFood);
    this.maxStackSize = 64;
    //this.burntime = 55;
  }
  /*
  public boolean rightClickOnBlock(Player p, int dimension, int x, int y, int z, int side)
  {
    if ((p != null) && (p.world.isServer) && (side == 0))
    {
      int bid = p.world.getblock(dimension, x, y, z);
      if ((bid == Blocks.dirt.blockID) && 
        (p.world.getblock(dimension, x, y + 1, z) == 0))
      {
        p.world.setblockandmetaWithPerm(p, dimension, x, y + 1, z, OreSpawnMain.quinoa_plant.blockID, p.world.rand.nextInt(3) + 2);
        return true;
      }
    }
    return false;
  }
  */
}
