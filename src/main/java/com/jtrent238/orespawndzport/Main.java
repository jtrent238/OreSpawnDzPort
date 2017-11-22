package com.jtrent238.orespawndzport;


import com.jtrent238.orespawndzport.common.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

@Mod(modid=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION),dependencies="required-after:OreSpawn")
public class Main
{

	
	@SidedProxy(clientSide="com.jtrent238.orespawndzport.client.ClientProxy", serverSide="com.jtrent238.orespawndzport.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static final String MODID = "orespawndzport";

	@Instance(MODID)
    public static Main instance;


	
	public static final String MODVERSION = "1.0.0.0";
	public static final String MODNAME = "OreSpawn DangerZone BackPort To Minecraft";
	public static final String MODAUTHOR = "TheyCallMeDanger, jtrent238";
	public static final String MC = "1.7.10";
	public static final String ORESPAWNVERSION = "1.7.10.20.3";

	public static int WhinerID = 220;
	public static int SparkleMuffinID = 221;
	
	public static int WhinerEnable = 1;
	public static int SparkleMuffinEnable = 1;
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    String ids = "OreSpawnIDS";
    String mobs = "OreSpawnMOBS";
    String tweaks = "OreSpawnTWEAKS";
    String weapons = "OreSpawnWEAPONS";
    String ores = "OreSpawnORES";
    
    config.load();
    
    getMobs(config, mobs);
    
    //BaseBlockID = config.get(ids, "BaseBlockID", 2700).getInt();
    //BaseItemID = config.get(ids, "BaseItemID", 9000).getInt();
    //BaseBiomeID = config.get(ids, "BaseBiomeID", 120).getInt();
    //BaseDimensionID = config.get(ids, "BaseDimensionID", 80).getInt();
    
    
    config.save();
    
	System.out.println(MODID + " >>> Configuration File Loaded");
	
	
}

	private void getMobs(Configuration config, String mobs)
	{
		WhinerEnable = config.get(mobs, "WhinerEnable", 1).getInt();
		SparkleMuffinEnable = config.get(mobs, "SparkleMuffinEnable", 1).getInt();
	}



@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	proxy.init(event);
	
	
	ItemLoader.LoadItems();
	BlockLoader.loadBlocks();
	Recipes.registerRecpies();
	EntityLoader.LoadEntitys();
	//OreDict.addores();
	//Achievements.loadAchievements();
	//Stats.RegisterStats();
	EasterBunnyEggs.RegisterEggs(null);
}

@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{
		MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
	    Recipes.registerRecpies();

	    
	}
	
	
}


@EventHandler
public void serverStart(FMLServerStartingEvent event)
{
     MinecraftServer server = MinecraftServer.getServer();
     // Get's the current server instance
     
     ICommandManager command = server.getCommandManager();
     ServerCommandManager manager = (ServerCommandManager) command;
     
     //manager.registerCommand(new CommandModInfo());
     //manager.registerCommand(new CommandChangelog());
}

					
}
