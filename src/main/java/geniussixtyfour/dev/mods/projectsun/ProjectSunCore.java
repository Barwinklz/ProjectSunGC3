package geniussixtyfour.dev.mods.projectsun;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import geniussixtyfour.dev.mods.projectsun.Asteroids.Vulcanoids.WorldProviderVulcanoids;
import geniussixtyfour.dev.mods.projectsun.Proxy.CommonProxy;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.planets.asteroids.dimension.TeleportTypeAsteroids;
import micdoodle8.mods.galacticraft.planets.asteroids.dimension.WorldProviderAsteroids;
import net.minecraft.util.ResourceLocation;

@Mod(modid = ProjectSunCore.MODID, version = ProjectSunCore.VERSION, name = ProjectSunCore.NAME, dependencies = "required-after:GalacticraftCore; required-after:GalacticraftMars;")
public class ProjectSunCore
{
    public static final String MODID = "projectsun";
    public static final String VERSION = "1.0";
    public static final String NAME = "Project.Sun";
 
    @SidedProxy(clientSide = "geniussixtyfour.dev.mods.projectsun.Proxy.ClientProxy", serverSide = "geniussixtyfour.dev.mods.projectsun.Proxy.ClientProxy")
    public static CommonProxy proxy;   

    @Instance("CosmicHorizonsCore")
    public static ProjectSunCore instance;
    
    public static Planet Vulcanoids;
    
    public static SolarSystem solarSystemSolStar;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	solarSystemSolStar = new SolarSystem("SolStar", "Milky Way");
    	Vector3 pos = new Vector3();
    	pos.x = 0.0D;
    	pos.y = 0.0D;
    	solarSystemSolStar.setMapPosition(pos);
    	
    	Star starSoll = (Star) new Star("Soll").setParentSolarSystem(solarSystemSolStar).setTierRequired(1).setDimensionInfo(71, WorldProviderVulcanoids.class);
    	starSoll.setBodyIcon(new ResourceLocation("projectsun", "textures/celestialbodies/sun.png"));

        ProjectSunCore.Vulcanoids = new Planet("vulcanoids").setParentSolarSystem(ProjectSunCore.solarSystemSolStar);
        ProjectSunCore.Vulcanoids.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.1900000F, 0.1900000F)).setRelativeOrbitTime(45.0F).setPhaseShift((float) (Math.random() * (2 * Math.PI)));
        ProjectSunCore.Vulcanoids.setBodyIcon(new ResourceLocation("projectsun", "textures/celestialbodies/vulcanoids.png"));
    	
    	GalaxyRegistry.registerSolarSystem(solarSystemSolStar);
    	GalaxyRegistry.registerPlanet(Vulcanoids);
    	
        GalacticraftRegistry.registerTeleportType(WorldProviderVulcanoids.class, new TeleportTypeAsteroids());

    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
    }
}