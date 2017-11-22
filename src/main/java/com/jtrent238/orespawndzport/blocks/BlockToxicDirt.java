package com.jtrent238.orespawndzport.blocks;

import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import net.minecraft.block.BlockDirt;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockToxicDirt
  extends BlockDirt
{
  private boolean randomtick;

public BlockToxicDirt(String n, String txt)
  {
    super();
    this.randomtick = true;
  }
  /*
  public void tickMe(World w, int d, int x, int y, int z)
  {
    if (w.rand.nextInt(8) == 1)
    {
      if (!BreakChecks.canChangeBlock(w, d, x, y, z, d, x, y, z, 0, 0)) {
        return;
      }
      w.setblock(d, x, y, z, 0);
      return;
    }
    findSomethingToAttack(d, x, y, z);
  }
  */
/*
  public Entity findSomethingToAttack(int dimension, float posx, float posy, float posz)
  {
    List<Entity> nearby_list = null;
    
    nearby_list = DangerZone.server.entityManager.findEntitiesInRange(10.0F, dimension, posx + 0.5F, posy + 0.5F, posz + 0.5F);
    if ((nearby_list != null) && 
      (!nearby_list.isEmpty()))
    {
      Entity e = null;
      
      ListIterator<Entity> li = nearby_list.listIterator();
      while (li.hasNext())
      {
        e = (Entity)li.next();
        double dist = e.getDistanceFromEntityCenter(posx + 0.5F, posy + 0.5F, posz + 0.5F);
        dist -= e.getWidth();
        if ((dist < 2.0D) && (isSuitableTarget(e))) {
          e.doAttackFrom(null, 3, 5.0F);
        }
      }
    }
    return null;
  }*/
  /*
  public boolean isSuitableTarget(Entity e)
  {
    if (isIgnorable(e)) {
      return false;
    }
    if ((e instanceof ElementDragon)) {
      return false;
    }
    return true;
  }
  */
  public boolean isIgnorable(EntityPlayer e)
  {
    if (danger.orespawn.OreSpawnMain.PlayNicely == 1) {
      return true;
    }
    if (!(e instanceof EntityPlayer)) {
      return true;
    }
    if (e.isCollided) {
      return true;
    }
    /*if (((e instanceof EntityPlayer)) && (e.getGameMode() != 0)) {
      return true;
    }*/
    return false;
  }
}
