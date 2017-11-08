package com.jtrent238.orespawndzport.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemFood;

public class ItemSpam
  extends ItemFood
{
  public ItemSpam(int healAmount, float potionEffectProbability, boolean alwaysEdible)
  {
    super(healAmount, potionEffectProbability, alwaysEdible);
    this.maxStackSize = 32;
    //this.eatanytime = true;
  }
  /*
  public void onFoodEaten(Entity e)
  {
    e.heal(5.0F);
    Effects ef = new Effects(5, 0.1F, 200);
    e.addEffect(ef);
    ef = new Effects(3, 1.75F, 300);
    e.addEffect(ef);
    ef = new Effects(1, 1.75F, 250);
    e.addEffect(ef);
  }
  */
}
