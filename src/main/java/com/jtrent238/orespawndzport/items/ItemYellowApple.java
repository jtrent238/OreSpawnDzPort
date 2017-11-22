package com.jtrent238.orespawndzport.items;

import net.minecraft.item.ItemFood;

public class ItemYellowApple
  extends ItemFood
{
  public ItemYellowApple(int healAmount, float potionEffectProbability, boolean alwaysEdible)
  {
    super(healAmount, potionEffectProbability, alwaysEdible);
    this.maxStackSize = 16;
    //this.eatanytime = true;
  }
  /*
  public void onFoodEaten(Entity e)
  {
    e.heal(5.0F);
    Effects ef = new Effects(5, 0.1F, 100);
    e.addEffect(ef);
    ef = new Effects(3, 1.75F, 300);
    e.addEffect(ef);
  }
  */
}
