package com.jtrent238.orespawndzport.items;

import java.util.Random;

import net.minecraft.item.Item;

public class PlantStaff
  extends Item
{
  public PlantStaff()
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
    if (clickedon != null) {
      return false;
    }
    if (holder == null) {
      return false;
    }
    if (holder.world.isServer)
    {
      ThrownBlock e = (ThrownBlock)holder.world.createEntityByName("OreSpawn:ThrownBlock", 
        holder.dimension, 
        holder.posx + (float)Math.sin(Math.toRadians(holder.rotation_yaw_head)) * (holder.getWidth() + 1.0F) * (float)Math.cos(Math.toRadians(holder.rotation_pitch_head)), 
        holder.posy + holder.getHeight() * 9.0F / 10.0F - (float)Math.sin(Math.toRadians(holder.rotation_pitch_head)) * (holder.getWidth() + 1.0F), 
        holder.posz + (float)Math.cos(Math.toRadians(holder.rotation_yaw_head)) * (holder.getWidth() + 1.0F) * (float)Math.cos(Math.toRadians(holder.rotation_pitch_head)));
      if (e != null)
      {
        e.init();
        e.setBID(OreSpawnMain.toxicleaves.blockID);
        e.setIID(0);
        e.setAttackDamage(30.0F);
        e.thrower = holder;
        e.setDirectionAndVelocity(
          (float)Math.sin(Math.toRadians(holder.rotation_yaw_head)) * (float)Math.cos(Math.toRadians(holder.rotation_pitch_head)), 
          -(float)Math.sin(Math.toRadians(holder.rotation_pitch_head)), 
          (float)Math.cos(Math.toRadians(holder.rotation_yaw_head)) * (float)Math.cos(Math.toRadians(holder.rotation_pitch_head)), 
          11.0F, 0.02F);
        
        holder.world.spawnEntityInWorld(e);
      }
      holder.world.playSound("DangerZone:bow", holder.dimension, holder.posx, holder.posy + holder.getHeight(), holder.posz, 0.5F, 1.0F + (holder.world.rand.nextFloat() - holder.world.rand.nextFloat()) * 0.3F);
      return true;
    }
    return false;
  }
  */
}
