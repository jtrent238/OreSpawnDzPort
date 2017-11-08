package com.jtrent238.orespawndzport.items;

import net.minecraft.item.ItemFood;

public class ItemYucky
  extends ItemFood
{
  public ItemYucky(int healAmount, float potionEffectProbability, boolean alwaysEdible)
  {
    super(healAmount, potionEffectProbability, alwaysEdible);
    this.maxStackSize = 16;
    //this.eatanytime = true;
  }
  /*
  public void onFoodEaten(Entity e)
  {
    e.heal(5.0F);
    Effects ef = new Effects(4, 1.5F, 200);
    e.addEffect(ef);
    ef = new Effects(6, 0.02F, 100);
    e.addEffect(ef);
  }
  */
}
