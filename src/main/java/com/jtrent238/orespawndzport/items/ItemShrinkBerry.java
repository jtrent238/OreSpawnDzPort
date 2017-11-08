package com.jtrent238.orespawndzport.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemFood;

public class ItemShrinkBerry
  extends ItemFood
{
  public ItemShrinkBerry(int healAmount, float potionEffectProbability, boolean alwaysEdible)
  {
    super(healAmount, potionEffectProbability, alwaysEdible);
    this.maxStackSize = 64;
    //this.burntime = 15;
    //this.eatanytime = true;
  }
  
  /*public void onFoodEaten(Entity p)
  {
    if (p.world.isServer) {
      if (p.isBaby()) {
        p.setBaby(false);
      } else {
        p.setBaby(true);
      }
    }
  }*/
  /*
  public boolean rightClickOnBlock(Player p, int dimension, int x, int y, int z, int side)
  {
    if ((p != null) && (p.world.isServer) && (side == 0))
    {
      int bid = p.world.getblock(dimension, x, y, z);
      if ((bid == Blocks.dirt.blockID) && 
        (p.world.getblock(dimension, x, y + 1, z) == 0))
      {
        p.world.setblockandmetaWithPerm(p, dimension, x, y + 1, z, OreSpawnMain.shrinkberry_plant.blockID, 0);
        return true;
      }
    }
    return false;
  }
  */
}
