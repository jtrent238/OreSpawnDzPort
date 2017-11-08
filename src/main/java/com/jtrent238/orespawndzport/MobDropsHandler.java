package com.jtrent238.orespawndzport;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class MobDropsHandler
{
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event)
    {
    	//Pigs Drop Pig Parts
        if (event.entity instanceof EntityPig)
        {
 
            ItemStack pig_ear = new ItemStack(ItemLoader.pig_ear);
            EntityItem drop_pig_ear = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, pig_ear);
            ItemStack pig_guts = new ItemStack(ItemLoader.pig_guts);
            EntityItem drop_pig_guts = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, pig_guts);
            ItemStack pig_nose = new ItemStack(ItemLoader.pig_nose);
            EntityItem drop_pig_nose = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, pig_nose);
            ItemStack pig_tail = new ItemStack(ItemLoader.pig_tail);
            EntityItem drop_pig_tail = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, pig_tail);
            ItemStack pig_toes = new ItemStack(ItemLoader.pig_toes);
            EntityItem drop_pig_toes = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, pig_toes);
 
            event.drops.add(drop_pig_ear);
            event.drops.add(drop_pig_guts);
            event.drops.add(drop_pig_nose);
            event.drops.add(drop_pig_tail);
            event.drops.add(drop_pig_toes);
            
        }
    }
}