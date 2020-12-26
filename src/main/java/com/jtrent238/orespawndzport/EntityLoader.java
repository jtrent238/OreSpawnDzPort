package com.jtrent238.orespawndzport;

import com.jtrent238.orespawndzport.entity.EntitySparkleMuffin;
import com.jtrent238.orespawndzport.entity.EntityWhiner;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityLoader {

	private static int WhinerID = Main.WhinerID;
	private static int SparkleMuffinID = Main.SparkleMuffinID;

	public static void LoadEntitys() {

		EntityRegistry.registerGlobalEntityID(EntityWhiner.class, "EntityWhiner", EntityRegistry.findGlobalUniqueEntityId() , 0xff0088, 0xffffff);
		EntityRegistry.addSpawn(EntityWhiner.class, 8, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		//EntityRegistry.instance();EntityRegistry.registerModEntity(EntityWhiner.class, "EntityWhiner", WhinerID, 64, 1, 2, false);
	    
		EntityRegistry.registerGlobalEntityID(EntitySparkleMuffin.class, "EntitySparkleMuffin", EntityRegistry.findGlobalUniqueEntityId() , 0xff0088, 0xffffff);
		EntityRegistry.addSpawn(EntitySparkleMuffin.class, 8, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		//EntityRegistry.instance();EntityRegistry.registerModEntity(EntityWhiner.class, "EntityWhiner", WhinerID, 64, 1, 2, false);
	    
	}

}
