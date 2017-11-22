package com.jtrent238.orespawndzport.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFuzzButt
  extends ModelBase
{
  ModelRenderer head;
  ModelRenderer abd;
  ModelRenderer butt;
  ModelRenderer eye1;
  ModelRenderer eye2;
  ModelRenderer eye3;
  ModelRenderer eye4;
  ModelRenderer eye5;
  ModelRenderer eye6;
  ModelRenderer fuzz1;
  ModelRenderer fuzz2;
  ModelRenderer fuzz3;
  ModelRenderer fuzz4;
  ModelRenderer fuzz5;
  ModelRenderer leg1a;
  ModelRenderer leg2a;
  ModelRenderer leg3a;
  ModelRenderer leg4a;
  ModelRenderer leg1b;
  ModelRenderer leg2b;
  ModelRenderer leg3b;
  ModelRenderer leg4b;
  ModelRenderer leg5a;
  ModelRenderer leg6a;
  ModelRenderer leg7a;
  ModelRenderer leg8a;
  ModelRenderer leg5b;
  ModelRenderer leg6b;
  ModelRenderer leg7b;
  ModelRenderer leg8b;
  
  public ModelFuzzButt()
  {
    this.head = new ModelRenderer(this, 0, 79);
    this.head.addBox(-4.0F, 0.0F, 0.0F, 10, 6, 10);
    this.head.setRotationPoint(-1.0F, 16.0F, -11.0F);
    this.head.setTextureSize(64, 128);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.abd = new ModelRenderer(this, 0, 96);
    this.abd.addBox(0.0F, 0.0F, 0.0F, 4, 2, 6);
    this.abd.setRotationPoint(-2.0F, 19.0F, -1.0F);
    this.abd.setTextureSize(64, 128);
    this.abd.mirror = true;
    setRotation(this.abd, 0.0F, 0.0F, 0.0F);
    this.butt = new ModelRenderer(this, 0, 105);
    this.butt.addBox(-6.0F, -3.0F, -1.0F, 12, 3, 18);
    this.butt.setRotationPoint(0.0F, 21.0F, 4.0F);
    this.butt.setTextureSize(64, 128);
    this.butt.mirror = true;
    setRotation(this.butt, 0.0F, 0.0F, 0.0F);
    this.eye1 = new ModelRenderer(this, 31, 0);
    this.eye1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
    this.eye1.setRotationPoint(1.0F, 17.0F, -12.0F);
    this.eye1.setTextureSize(64, 128);
    this.eye1.mirror = true;
    setRotation(this.eye1, 0.0F, 0.0F, 0.0F);
    this.eye2 = new ModelRenderer(this, 31, 4);
    this.eye2.addBox(0.0F, 0.0F, -1.0F, 2, 2, 1);
    this.eye2.setRotationPoint(-3.0F, 17.0F, -11.0F);
    this.eye2.setTextureSize(64, 128);
    this.eye2.mirror = true;
    setRotation(this.eye2, 0.0F, 0.0F, 0.0F);
    this.eye3 = new ModelRenderer(this, 31, 8);
    this.eye3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
    this.eye3.setRotationPoint(5.0F, 17.0F, -10.0F);
    this.eye3.setTextureSize(64, 128);
    this.eye3.mirror = true;
    setRotation(this.eye3, 0.0F, 0.0F, 0.0F);
    this.eye4 = new ModelRenderer(this, 31, 12);
    this.eye4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.eye4.setRotationPoint(5.0F, 17.0F, -7.0F);
    this.eye4.setTextureSize(64, 128);
    this.eye4.mirror = true;
    setRotation(this.eye4, 0.0F, 0.0F, 0.0F);
    this.eye5 = new ModelRenderer(this, 31, 15);
    this.eye5.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
    this.eye5.setRotationPoint(-6.0F, 17.0F, -10.0F);
    this.eye5.setTextureSize(64, 128);
    this.eye5.mirror = true;
    setRotation(this.eye5, 0.0F, 0.0F, 0.0F);
    this.eye6 = new ModelRenderer(this, 31, 19);
    this.eye6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.eye6.setRotationPoint(-6.0F, 17.0F, -7.0F);
    this.eye6.setTextureSize(64, 128);
    this.eye6.mirror = true;
    setRotation(this.eye6, 0.0F, 0.0F, 0.0F);
    this.fuzz1 = new ModelRenderer(this, 0, 69);
    this.fuzz1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8);
    this.fuzz1.setRotationPoint(0.0F, 19.0F, 21.0F);
    this.fuzz1.setTextureSize(64, 128);
    this.fuzz1.mirror = true;
    setRotation(this.fuzz1, 0.0F, 0.0F, 0.0F);
    this.fuzz2 = new ModelRenderer(this, 0, 59);
    this.fuzz2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8);
    this.fuzz2.setRotationPoint(0.0F, 19.0F, 21.0F);
    this.fuzz2.setTextureSize(64, 128);
    this.fuzz2.mirror = true;
    setRotation(this.fuzz2, -0.5759587F, 0.0F, 0.0F);
    this.fuzz3 = new ModelRenderer(this, 0, 49);
    this.fuzz3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8);
    this.fuzz3.setRotationPoint(0.0F, 19.0F, 21.0F);
    this.fuzz3.setTextureSize(64, 128);
    this.fuzz3.mirror = true;
    setRotation(this.fuzz3, 0.5585054F, 0.0F, 0.0F);
    this.fuzz4 = new ModelRenderer(this, 0, 39);
    this.fuzz4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8);
    this.fuzz4.setRotationPoint(0.0F, 19.0F, 21.0F);
    this.fuzz4.setTextureSize(64, 128);
    this.fuzz4.mirror = true;
    setRotation(this.fuzz4, 0.0F, -0.6806784F, 0.0F);
    this.fuzz5 = new ModelRenderer(this, 0, 29);
    this.fuzz5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8);
    this.fuzz5.setRotationPoint(0.0F, 19.0F, 21.0F);
    this.fuzz5.setTextureSize(64, 128);
    this.fuzz5.mirror = true;
    setRotation(this.fuzz5, 0.0F, 0.6457718F, 0.0F);
    this.leg1a = new ModelRenderer(this, 8, 0);
    this.leg1a.addBox(0.0F, -12.0F, 0.0F, 1, 12, 1);
    this.leg1a.setRotationPoint(4.0F, 21.0F, -8.0F);
    this.leg1a.setTextureSize(64, 128);
    this.leg1a.mirror = true;
    setRotation(this.leg1a, 0.0F, 0.0F, 0.8726646F);
    this.leg2a = new ModelRenderer(this, 8, 0);
    this.leg2a.addBox(0.0F, -12.0F, 0.0F, 1, 12, 1);
    this.leg2a.setRotationPoint(4.0F, 21.0F, -6.0F);
    this.leg2a.setTextureSize(64, 128);
    this.leg2a.mirror = true;
    setRotation(this.leg2a, 0.0F, 0.0F, 0.8726646F);
    this.leg3a = new ModelRenderer(this, 8, 0);
    this.leg3a.addBox(0.0F, -12.0F, 0.0F, 1, 12, 1);
    this.leg3a.setRotationPoint(4.0F, 21.0F, -4.0F);
    this.leg3a.setTextureSize(64, 128);
    this.leg3a.mirror = true;
    setRotation(this.leg3a, 0.0F, 0.0F, 0.8726646F);
    this.leg4a = new ModelRenderer(this, 8, 0);
    this.leg4a.addBox(0.0F, -12.0F, 0.0F, 1, 12, 1);
    this.leg4a.setRotationPoint(4.0F, 21.0F, -2.0F);
    this.leg4a.setTextureSize(64, 128);
    this.leg4a.mirror = true;
    setRotation(this.leg4a, 0.0F, 0.0F, 0.8726646F);
    this.leg1b = new ModelRenderer(this, 14, 0);
    this.leg1b.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg1b.setRotationPoint(13.0F, 14.0F, -8.0F);
    this.leg1b.setTextureSize(64, 128);
    this.leg1b.mirror = true;
    setRotation(this.leg1b, 0.0F, 0.0F, -0.5235988F);
    this.leg2b = new ModelRenderer(this, 14, 0);
    this.leg2b.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg2b.setRotationPoint(13.0F, 14.0F, -6.0F);
    this.leg2b.setTextureSize(64, 128);
    this.leg2b.mirror = true;
    setRotation(this.leg2b, 0.0F, 0.0F, -0.5235988F);
    this.leg3b = new ModelRenderer(this, 14, 0);
    this.leg3b.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg3b.setRotationPoint(13.0F, 14.0F, -4.0F);
    this.leg3b.setTextureSize(64, 128);
    this.leg3b.mirror = true;
    setRotation(this.leg3b, 0.0F, 0.0F, -0.5235988F);
    this.leg4b = new ModelRenderer(this, 14, 0);
    this.leg4b.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg4b.setRotationPoint(13.0F, 14.0F, -2.0F);
    this.leg4b.setTextureSize(64, 128);
    this.leg4b.mirror = true;
    setRotation(this.leg4b, 0.0F, 0.0F, -0.5235988F);
    this.leg5a = new ModelRenderer(this, 0, 14);
    this.leg5a.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg5a.setRotationPoint(-4.0F, 21.0F, -8.0F);
    this.leg5a.setTextureSize(64, 128);
    this.leg5a.mirror = true;
    setRotation(this.leg5a, 0.0F, 0.0F, 2.268928F);
    this.leg6a = new ModelRenderer(this, 0, 14);
    this.leg6a.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg6a.setRotationPoint(-4.0F, 21.0F, -6.0F);
    this.leg6a.setTextureSize(64, 128);
    this.leg6a.mirror = true;
    setRotation(this.leg6a, 0.0F, 0.0F, 2.268928F);
    this.leg7a = new ModelRenderer(this, 0, 14);
    this.leg7a.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg7a.setRotationPoint(-4.0F, 21.0F, -4.0F);
    this.leg7a.setTextureSize(64, 128);
    this.leg7a.mirror = true;
    setRotation(this.leg7a, 0.0F, 0.0F, 2.268928F);
    this.leg8a = new ModelRenderer(this, 0, 14);
    this.leg8a.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg8a.setRotationPoint(-4.0F, 21.0F, -2.0F);
    this.leg8a.setTextureSize(64, 128);
    this.leg8a.mirror = true;
    setRotation(this.leg8a, 0.0F, 0.0F, 2.268928F);
    this.leg5b = new ModelRenderer(this, 0, 0);
    this.leg5b.addBox(-1.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg5b.setRotationPoint(-13.0F, 14.0F, -8.0F);
    this.leg5b.setTextureSize(64, 128);
    this.leg5b.mirror = true;
    setRotation(this.leg5b, 0.0F, 0.0F, 0.5235988F);
    this.leg6b = new ModelRenderer(this, 0, 0);
    this.leg6b.addBox(-1.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg6b.setRotationPoint(-13.0F, 14.0F, -6.0F);
    this.leg6b.setTextureSize(64, 128);
    this.leg6b.mirror = true;
    setRotation(this.leg6b, 0.0F, 0.0F, 0.5235988F);
    this.leg7b = new ModelRenderer(this, 0, 0);
    this.leg7b.addBox(-1.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg7b.setRotationPoint(-13.0F, 14.0F, -4.0F);
    this.leg7b.setTextureSize(64, 128);
    this.leg7b.mirror = true;
    setRotation(this.leg7b, 0.0F, 0.0F, 0.5235988F);
    this.leg8b = new ModelRenderer(this, 0, 0);
    this.leg8b.addBox(-1.0F, 0.0F, 0.0F, 1, 12, 1);
    this.leg8b.setRotationPoint(-13.0F, 14.0F, -2.0F);
    this.leg8b.setTextureSize(64, 128);
    this.leg8b.mirror = true;
    setRotation(this.leg8b, 0.0F, 0.0F, 0.5235988F);
  }
  
  private void setRotation(ModelRenderer head2, float f, float g, float h) {
	
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float deathfactor)
  {
    float newangle = 0.0F;
    if (f1 > 0.01D)
    {
      if (f1 > 1.0F) {
        f1 = 1.0F;
      }
      newangle = (float)(Math.cos(Math.toRadians(f * 17.6F)) * 3.1415927410125732D * 0.15000000596046448D * f1);
    }
    else
    {
      newangle = 0.0F;
    }
    this.leg1a.rotateAngleX = (0.524F + newangle);
    this.leg2a.rotateAngleX = (0.175F - newangle);
    this.leg3a.rotateAngleX = (-0.175F + newangle);
    this.leg4a.rotateAngleX = (-0.524F - newangle);
    
    this.leg5a.rotateAngleX = (-0.524F + newangle);
    this.leg6a.rotateAngleX = (-0.175F - newangle);
    this.leg7a.rotateAngleX = (0.175F + newangle);
    this.leg8a.rotateAngleX = (0.524F - newangle);
    
    float distx = (float)(Math.cos(this.leg1a.rotateAngleZ) * this.leg1a.offsetY * 1.5499999523162842D);
    this.leg1b.rotationPointZ = ((float)(this.leg1a.rotationPointZ - distx * Math.sin(this.leg1a.rotateAngleX)));
    this.leg1b.rotationPointX = ((float)(this.leg1a.rotationPointX + distx * Math.cos(this.leg1a.rotateAngleX) * 0.75D));
    distx = (float)(Math.cos(this.leg2a.rotateAngleZ) * this.leg2a.offsetY * 1.5499999523162842D);
    this.leg2b.rotationPointZ = ((float)(this.leg2a.rotationPointZ - distx * Math.sin(this.leg2a.rotateAngleX)));
    this.leg2b.rotationPointX = ((float)(this.leg2a.rotationPointX + distx * Math.cos(this.leg2a.rotateAngleX) * 0.75D));
    distx = (float)(Math.cos(this.leg3a.rotateAngleZ) * this.leg3a.offsetY * 1.5499999523162842D);
    this.leg3b.rotationPointZ = ((float)(this.leg3a.rotationPointZ - distx * Math.sin(this.leg3a.rotateAngleX)));
    this.leg3b.rotationPointX = ((float)(this.leg3a.rotationPointX + distx * Math.cos(this.leg3a.rotateAngleX) * 0.75D));
    distx = (float)(Math.cos(this.leg4a.rotateAngleZ) * this.leg4a.offsetY * 1.5499999523162842D);
    this.leg4b.rotationPointZ = ((float)(this.leg4a.rotationPointZ - distx * Math.sin(this.leg4a.rotateAngleX)));
    this.leg4b.rotationPointX = ((float)(this.leg4a.rotationPointX + distx * Math.cos(this.leg4a.rotateAngleX) * 0.75D));
    
    distx = (float)(Math.cos(this.leg5a.rotateAngleZ) * this.leg5a.offsetY * 1.5499999523162842D);
    this.leg5b.rotationPointZ = ((float)(this.leg5a.rotationPointZ - distx * Math.sin(this.leg5a.rotateAngleX)));
    this.leg5b.rotationPointX = ((float)(this.leg5a.rotationPointX + distx * Math.cos(this.leg5a.rotateAngleX) * 0.75D));
    distx = (float)(Math.cos(this.leg6a.rotateAngleZ) * this.leg6a.offsetY * 1.5499999523162842D);
    this.leg6b.rotationPointZ = ((float)(this.leg6a.rotationPointZ - distx * Math.sin(this.leg6a.rotateAngleX)));
    this.leg6b.rotationPointX = ((float)(this.leg6a.rotationPointX + distx * Math.cos(this.leg6a.rotateAngleX) * 0.75D));
    distx = (float)(Math.cos(this.leg7a.rotateAngleZ) * this.leg7a.offsetY * 1.5499999523162842D);
    this.leg7b.rotationPointZ = ((float)(this.leg7a.rotationPointZ - distx * Math.sin(this.leg7a.rotateAngleX)));
    this.leg7b.rotationPointX = ((float)(this.leg7a.rotationPointX + distx * Math.cos(this.leg7a.rotateAngleX) * 0.75D));
    distx = (float)(Math.cos(this.leg8a.rotateAngleZ) * this.leg8a.offsetY * 1.5499999523162842D);
    this.leg8b.rotationPointZ = ((float)(this.leg8a.rotationPointZ - distx * Math.sin(this.leg8a.rotateAngleX)));
    this.leg8b.rotationPointX = ((float)(this.leg8a.rotationPointX + distx * Math.cos(this.leg8a.rotateAngleX) * 0.75D));
    if (this.getAttacking())
    {
      this.leg3b.rotateAngleZ = -2.268F;
      this.leg7b.rotateAngleZ = 2.268F;
      this.butt.rotateAngleX = 0.942F;
      this.fuzz3.rotateAngleX = (0.558F + this.butt.rotateAngleX + (float)(Math.cos(Math.toRadians(f * 12.6F)) * 3.1415927410125732D * 0.18000000715255737D));
      this.fuzz2.rotateAngleX = (-0.558F + this.butt.rotateAngleX - (float)(Math.cos(Math.toRadians(f * 12.6F)) * 3.1415927410125732D * 0.18000000715255737D));
      this.fuzz5.rotateAngleX = this.butt.rotateAngleX;
      this.fuzz4.rotateAngleX = this.butt.rotateAngleX;
      this.fuzz5.rotateAngleY = (0.558F + (float)(Math.cos(Math.toRadians(f * 21.6F)) * 3.1415927410125732D * 0.18000000715255737D));
      this.fuzz4.rotateAngleY = (-0.558F - (float)(Math.cos(Math.toRadians(f * 21.6F)) * 3.1415927410125732D * 0.18000000715255737D));
      this.fuzz1.rotateAngleX = this.butt.rotateAngleX;
      this.fuzz1.rotateAngleZ = ((float)Math.cos(Math.toRadians(f * 5.6F)));
    }
    else
    {
      this.fuzz1.rotateAngleX = 0.0F;
      this.fuzz2.rotateAngleX = 0.558F;
      this.fuzz3.rotateAngleX = -0.558F;
      this.fuzz4.rotateAngleX = 0.0F;
      this.fuzz5.rotateAngleX = -0.0F;
      this.fuzz4.rotateAngleY = 0.558F;
      this.fuzz5.rotateAngleY = -0.558F;
      this.butt.rotateAngleX = 0.0F;
      this.leg3b.rotateAngleZ = -0.524F;
      this.leg7b.rotateAngleZ = 0.524F;
      this.fuzz1.rotateAngleZ = 0.0F;
    }
    this.fuzz1.rotationPointY = ((float)(this.butt.rotationPointY - Math.sin(this.butt.rotateAngleX) * 17.0D) - 2.0F);
    this.fuzz2.rotationPointY = (this.fuzz3.rotationPointY = this.fuzz4.rotationPointY = this.fuzz5.rotationPointY = this.fuzz1.rotationPointY);
    this.fuzz1.rotationPointZ = ((float)(this.butt.rotationPointZ + Math.cos(this.butt.rotateAngleX) * 17.0D) - 2.0F);
    this.fuzz2.rotationPointZ = (this.fuzz3.rotationPointZ = this.fuzz4.rotationPointZ = this.fuzz5.rotationPointZ = this.fuzz1.rotationPointZ);
    
    this.head.render(deathfactor);
    this.abd.render(deathfactor);
    this.butt.render(deathfactor);
    this.eye1.render(deathfactor);
    this.eye2.render(deathfactor);
    this.eye3.render(deathfactor);
    this.eye4.render(deathfactor);
    this.eye5.render(deathfactor);
    this.eye6.render(deathfactor);
    this.fuzz1.render(deathfactor);
    this.fuzz2.render(deathfactor);
    this.fuzz3.render(deathfactor);
    this.fuzz4.render(deathfactor);
    this.fuzz5.render(deathfactor);
    this.leg1a.render(deathfactor);
    this.leg2a.render(deathfactor);
    this.leg3a.render(deathfactor);
    this.leg4a.render(deathfactor);
    this.leg1b.render(deathfactor);
    this.leg2b.render(deathfactor);
    this.leg3b.render(deathfactor);
    this.leg4b.render(deathfactor);
    this.leg5a.render(deathfactor);
    this.leg6a.render(deathfactor);
    this.leg7a.render(deathfactor);
    this.leg8a.render(deathfactor);
    this.leg5b.render(deathfactor);
    this.leg6b.render(deathfactor);
    this.leg7b.render(deathfactor);
    this.leg8b.render(deathfactor);
  }

private boolean getAttacking() {
	return false;
}
}
