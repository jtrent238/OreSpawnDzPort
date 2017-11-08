package com.jtrent238.orespawndzport.items;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;

public class ShrinkRay
  extends Item
{
  public ShrinkRay(String n, String txt)
  {
    super();
    this.maxStackSize = 1;
    this.setMaxDamage(500);
    //this.attackstrength = 5;
    //this.menu = InventoryMenus.HARDWARE;
    //this.flipped = true;
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
      ThrownBlockItem e = (ThrownBlockItem)holder.world.createEntityByName("OreSpawn:ThrownShrinkRay", 
        holder.dimension, 
        holder.posx + (float)Math.sin(Math.toRadians(holder.rotation_yaw_head - 20.0F)) * (holder.getWidth() + 1.0F) * (float)Math.cos(Math.toRadians(holder.rotation_pitch_head)), 
        holder.posy + holder.getHeight() * 7.0F / 10.0F - (float)Math.sin(Math.toRadians(holder.rotation_pitch_head)) * (holder.getWidth() + 1.0F), 
        holder.posz + (float)Math.cos(Math.toRadians(holder.rotation_yaw_head - 20.0F)) * (holder.getWidth() + 1.0F) * (float)Math.cos(Math.toRadians(holder.rotation_pitch_head)));
      if (e != null)
      {
        e.init();
        e.setBID(0);
        e.setIID(0);
        e.thrower = holder;
        e.setDirectionAndVelocity(
          (float)Math.sin(Math.toRadians(holder.rotation_yaw_head)) * (float)Math.cos(Math.toRadians(holder.rotation_pitch_head)), 
          -(float)Math.sin(Math.toRadians(holder.rotation_pitch_head)), 
          (float)Math.cos(Math.toRadians(holder.rotation_yaw_head)) * (float)Math.cos(Math.toRadians(holder.rotation_pitch_head)), 
          25.0F, 0.01F);
        
        holder.world.spawnEntityInWorld(e);
      }
      int which = holder.world.rand.nextInt(6);
      String s = null;
      if (which == 0) {
        s = "OreSpawn:laser1";
      }
      if (which == 1) {
        s = "OreSpawn:laser2";
      }
      if (which == 2) {
        s = "OreSpawn:laser3";
      }
      if (which == 3) {
        s = "OreSpawn:laser4";
      }
      if (which == 4) {
        s = "OreSpawn:laser5";
      }
      if (which == 5) {
        s = "OreSpawn:laser6";
      }
      holder.world.playSound(s, holder.dimension, holder.posx, holder.posy + holder.getHeight(), holder.posz, 0.5F, 1.0F + (holder.world.rand.nextFloat() - holder.world.rand.nextFloat()) * 0.3F);
      holder.addKnockback(e, 1.5F, 0.25F);
      return true;
    }
    return false;
  }
  */
}
