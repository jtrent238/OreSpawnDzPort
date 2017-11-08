package com.jtrent238.orespawndzport.client;

import com.jtrent238.orespawndzport.common.CommonProxy;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {
  
    
	public void init(FMLInitializationEvent e) {
    super.init (e);

    //RenderingRegistry.registerEntityRenderingHandler(EntityBeetle.class, new RenderLiving(new ModelBeetle(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("orespawndzport:EntityBeetle.png");}});
    
	}

  public void postInit(FMLPostInitializationEvent e) {
	 
	  
  }
  
  
  
}
