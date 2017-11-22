package com.jtrent238.orespawndzport.client;

import com.jtrent238.orespawndzport.common.CommonProxy;
import com.jtrent238.orespawndzport.entity.EntitySparkleMuffin;
import com.jtrent238.orespawndzport.entity.EntityWhiner;
import com.jtrent238.orespawndzport.model.ModelFuzzButt;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {
  
    
	public void init(FMLInitializationEvent e) {
    super.init (e);

    RenderingRegistry.registerEntityRenderingHandler(EntityWhiner.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("orespawndzport:EntityWhiner.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntitySparkleMuffin.class, new RenderLiving(new ModelFuzzButt(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("orespawndzport:Sparklemuffintexture.png");}});
    
	}

  public void postInit(FMLPostInitializationEvent e) {
	 
	  
  }
  
  
  
}
