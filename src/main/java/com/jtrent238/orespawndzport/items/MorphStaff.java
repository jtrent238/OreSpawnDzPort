package com.jtrent238.orespawndzport.items;

import net.minecraft.item.Item;

public class MorphStaff
  extends Item
{
  public MorphStaff()
  {
	    super();
	    this.maxStackSize = 1;
	    //this.attackstrength = 25;
	    this.setMaxDamage(100);
	    //this.menu = InventoryMenus.HARDWARE;
  }
  /*
  public boolean onRightClick(Entity holder, Entity clickedon, InventoryContainer ic)
  {
    if (holder == null) {
      return false;
    }
    if (!(holder instanceof Player)) {
      return false;
    }
    Player pl = (Player)holder;
    if (holder.world.isServer) {
      if (clickedon == null) {
        pl.setMorphName(null);
      } else {
        pl.setMorphName(clickedon.uniquename);
      }
    }
    return true;
  }
  */
}
