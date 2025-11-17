package geniussixtyfour.dev.mods.projectsun.Proxy;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import geniussixtyfour.dev.mods.projectsun.Asteroids.Vulcanoids.worldgen.sky.SkyProviderVulcanoids;
import geniussixtyfour.dev.mods.projectsun.Handler.SkyProviderHandler;
import micdoodle8.mods.galacticraft.core.client.CloudRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.item.EnumRarity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.common.util.EnumHelper;

public class ClientProxy extends CommonProxy
{
	public static EnumRarity solarprojectItem = EnumHelper.addRarity("SolarProjectRarity", EnumChatFormatting.DARK_PURPLE, "SolarProject");
	
  public static Minecraft mc = FMLClientHandler.instance().getClient();
  public static final IRenderHandler CloudRenderer = new CloudRenderer();
  public static final IRenderHandler VulcanoidsSkyProvider = new SkyProviderVulcanoids();
  
  public void preInit(FMLPreInitializationEvent event) {
  }
  
  public void init(FMLInitializationEvent event) {
	  FMLCommonHandler.instance().bus().register(new SkyProviderHandler());
  }

  public void postInit(FMLPostInitializationEvent event) {
  }
  
  private void registerBlocks() {}
   
  @Override
  public void registerRenderers()
  {
  }
  
  public void registerItemRenderers()
  {
  }
  
  public void registerTileEntitySpecialRender() {}

  public static void registerTileEntityRenderers()
  {
  }
}