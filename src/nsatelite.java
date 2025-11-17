package galaxygenius.nsatelite;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import galaxygenius.nsatelite.Alloys.Blocks.BlockALLOY1;
import galaxygenius.nsatelite.Alloys.Blocks.BlockALLOY2;
import galaxygenius.nsatelite.Alloys.Items.ItemALLOY1;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX1;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX10;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX11;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX12;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX13;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX14;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX2;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX3;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX4;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX5;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX6;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX7;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX8;
import galaxygenius.nsatelite.Moons.Styx.Blocks.BlockSX9;
import galaxygenius.nsatelite.Moons.Styx.Dimension.WorldProviderStyx;
import galaxygenius.nsatelite.Moons.Styx.Items.ItemSX1;
import galaxygenius.nsatelite.Moons.Styx.Items.ItemSX2;
import galaxygenius.nsatelite.Moons.Styx.Items.ItemSX3;
import galaxygenius.nsatelite.Moons.Styx.Items.ItemSX4;
import galaxygenius.nsatelite.Planets.Haumea.Blocks.BlockH1;
import galaxygenius.nsatelite.Planets.Haumea.Blocks.BlockH2;
import galaxygenius.nsatelite.Planets.Haumea.Blocks.BlockH3;
import galaxygenius.nsatelite.Planets.Haumea.Blocks.BlockH4;
import galaxygenius.nsatelite.Planets.Haumea.Blocks.BlockH5;
import galaxygenius.nsatelite.Planets.Haumea.Blocks.BlockH6;
import galaxygenius.nsatelite.Planets.Haumea.Dimension.WorldProviderHaumea;
import galaxygenius.nsatelite.Planets.Haumea.Items.ItemH1;
import galaxygenius.nsatelite.Planets.Makemake.Blocks.BlockM1;
import galaxygenius.nsatelite.Planets.Makemake.Blocks.BlockM2;
import galaxygenius.nsatelite.Planets.Makemake.Blocks.BlockM3;
import galaxygenius.nsatelite.Planets.Makemake.Blocks.BlockM4;
import galaxygenius.nsatelite.Planets.Makemake.Blocks.BlockM5;
import galaxygenius.nsatelite.Planets.Makemake.Blocks.BlockM6;
import galaxygenius.nsatelite.Planets.Makemake.Dimension.WorldProviderMakemake;
import galaxygenius.nsatelite.Planets.Makemake.Items.ItemM1;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS1;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS10;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS11;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS12;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS13;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS14;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS15;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS16;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS2;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS3;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS4;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS5;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS6;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS7;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS8;
import galaxygenius.nsatelite.Planets.Sedna.Blocks.BlockS9;
import galaxygenius.nsatelite.Planets.Sedna.Dimension.WorldProviderSedna;
import galaxygenius.nsatelite.Planets.Sedna.Items.ItemS1;
import galaxygenius.nsatelite.Planets.Sedna.Items.ItemS2;
import galaxygenius.nsatelite.Planets.Sedna.Items.ItemS3;
import galaxygenius.nsatelite.Planets.Sedna.Items.ItemS4;
import galaxygenius.nsatelite.Planets.Sedna.Rocket.BoosterTier11;
import galaxygenius.nsatelite.Planets.Sedna.Rocket.PlateTier11;
import galaxygenius.nsatelite.Planets.Sedna.Rocket.RocketTier11;
import galaxygenius.nsatelite.Planets.Sedna.Rocket.SchematicTier11;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Moon;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IAtmosphericGas;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.dimension.TeleportTypeMoon;
import micdoodle8.mods.galacticraft.core.items.GCItems;
import micdoodle8.mods.galacticraft.planets.mars.dimension.TeleportTypeMars;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@Mod(modid = nsatelite.MODID, version = nsatelite.VERSION, name = nsatelite.NAME, dependencies = "required-after:GalacticraftCore; required-after:GalacticraftMars;")
public class nsatelite

{
    public static final String MODID = "nsatelite";
    public static final String VERSION = "0.1";
    public static final String NAME = "NSatellite";
    
    public static SolarSystem solarSystemLick;
    public static SolarSystem solarSystemSol2;
    
    public static Block sednasurface;
    public static Block sednasubsurface;
    public static Block sednastone;
    public static Block sednabrick;
    public static Block sednarubidiumore;
    public static Block sednabismuthore;
    public static Block sednacalciumore;
    public static Block sednamolybdaenumore;
    public static Block rubidiumblock;
    public static Block rubidiumdualblock;
    public static Block bismuthblock;
    public static Block bismuthdualblock;
    public static Block calciumblock;
    public static Block calciumdualblock;
    public static Block molybdaenumblock;
    public static Block molybdaenumdualblock;
    public static Block haumeasurface;
    public static Block haumeasubsurface;
    public static Block haumeastone;
    public static Block makemakesurface;
    public static Block makemakesubsurface;
    public static Block makemakestone;
    public static Block styxsurface;
    public static Block styxsubsurface;
    public static Block haumeablackiumore;
    public static Block makemakewhitiumore;
    public static Block styxbariumore;
    public static Block styxfranciumore;
    public static Block styxcesiumore;
    public static Block styxkaliumore;
    public static Block blackiumblock;
    public static Block blackiumdualblock;
    public static Block whitiumblock;
    public static Block whitiumdualblock;
    public static Block franciumblock;
    public static Block franciumdualblock;
    public static Block bariumblock;
    public static Block bariumdualblock;
    public static Block cesiumblock;
    public static Block cesiumdualblock;
    public static Block kaliumblock;
    public static Block kaliumdualblock;
    public static Block blackwhitiumblock;
    public static Block blackwhitiumdualblock;
    
    public static Item rubidiumingot;
    public static Item bismuthingot;
    public static Item calciumingot;
    public static Item molybdaenumingot;
    public static Item bariumingot;
    public static Item franciumingot;
    public static Item cesiumingot;
    public static Item kaliumingot;
    public static Item blackiumingot;
    public static Item whitiumingot;
    public static Item blackwhitiumingot;
    public static Item boosterT11;
    public static Item plateT11;
    
    public static Item schematictier11;
    
    public static Item rockettier11;
    
    public static final CreativeTabs nsateliteblockstab = new CreativeTabs("nsateliteblockstab") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(nsatelite.rubidiumdualblock);
		}
	};
	
	public static final CreativeTabs nsateliteitemstab = new CreativeTabs("nsatelititemstab") {
		public Item getTabIconItem() {
			return nsatelite.rubidiumingot;
		}
	};
	
	public static final CreativeTabs nsateliterocketstab = new CreativeTabs("nsateliterocketstab") {
		public Item getTabIconItem() {
			return nsatelite.schematictier11;
		}
	};
    
    public static Planet sedna;
    public static Planet haumea;
    public static Planet makemake;
    public static Planet charon;
    public static Planet quaoar;
    public static Planet orcus;
    public static Planet varuna;
    public static Planet varda;
    public static Planet salacia;
    public static Planet gonggong;
    public static Planet numberplanetone;
    public static Planet ixion;
    public static Planet hygiea;
    public static Planet numberplanettwo;
    public static Planet vesta;
    public static Planet pallas;
    public static Planet farout;
    public static Planet farfarout;
    public static Planet draugr;
    public static Planet poltergeist;
    public static Planet phobetor;
    public static Moon ilmare;
    public static Moon actaea;
    public static Moon numbermoonone;
    public static Moon weywot;
    public static Moon nix;
    public static Moon styx;
    public static Moon kerberos;
    public static Moon hydra;
    public static Moon rorai;
    public static Moon hiiaka;
    public static Moon namaka;
    public static Moon duende;
    public static Moon cruithne;
    public static Moon xiangliu;
    public static Moon vanth;
	public static Star Lick;
	public static Star Sol2;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	sednasurface = new BlockS1();
    	sednasubsurface = new BlockS2();
    	sednastone = new BlockS3();
    	sednabrick = new BlockS4();
    	sednarubidiumore = new BlockS5();
    	sednabismuthore = new BlockS6();
    	sednacalciumore = new BlockS7();
    	sednamolybdaenumore = new BlockS16();
    	rubidiumblock = new BlockS8();
    	rubidiumdualblock = new BlockS9();
    	bismuthblock = new BlockS10();
    	bismuthdualblock = new BlockS11();
    	calciumblock = new BlockS12();
    	calciumdualblock = new BlockS13();
    	molybdaenumblock = new BlockS14();
    	molybdaenumdualblock = new BlockS15();
    	haumeasurface = new BlockH1();
    	haumeasubsurface = new BlockH2();
    	haumeastone = new BlockH3();
    	haumeablackiumore = new BlockH4();
    	blackiumblock = new BlockH5();
    	blackiumdualblock = new BlockH6();
    	makemakesurface = new BlockM1();
    	makemakesubsurface = new BlockM2();
    	makemakestone = new BlockM3();
    	makemakewhitiumore = new BlockM4();
    	whitiumblock = new BlockM5();
    	whitiumdualblock = new BlockM6();
    	styxsurface = new BlockSX1();
    	styxsubsurface = new BlockSX2();
    	styxbariumore = new BlockSX3();
    	styxfranciumore = new BlockSX4();
    	styxcesiumore = new BlockSX5();
    	styxkaliumore = new BlockSX6();
    	bariumblock = new BlockSX7();
    	bariumdualblock = new BlockSX8();
    	franciumblock = new BlockSX9();
    	franciumdualblock = new BlockSX10();
    	cesiumblock = new BlockSX11();
    	cesiumdualblock = new BlockSX12();
    	kaliumblock = new BlockSX13();
    	kaliumdualblock = new BlockSX14();
    	blackwhitiumblock = new BlockALLOY1();
    	blackwhitiumdualblock = new BlockALLOY2();
    	
    	nsatelite.rubidiumingot = new ItemS1();
    	nsatelite.bismuthingot = new ItemS2();
    	nsatelite.calciumingot = new ItemS3();
    	nsatelite.molybdaenumingot = new ItemS4();
    	nsatelite.bariumingot = new ItemSX1();
    	nsatelite.franciumingot = new ItemSX2();
    	nsatelite.cesiumingot = new ItemSX3();
    	nsatelite.kaliumingot = new ItemSX4();
    	nsatelite.blackiumingot = new ItemH1();
    	nsatelite.whitiumingot = new ItemM1();
    	nsatelite.blackwhitiumingot = new ItemALLOY1();
    	
    	boosterT11 = new BoosterTier11();
        plateT11 = new PlateTier11();
    	schematictier11 = new SchematicTier11();
    	
    	rockettier11 = new RocketTier11("Tier11Rocket");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	solarSystemLick = new SolarSystem("Lick", "Milky Way");
    	Vector3 pos = new Vector3();
    	pos.x = 0.7D;
    	pos.y = 1.5D;
    	solarSystemLick.setMapPosition(pos);
    	
    	Star starSol = (Star) new Star("LickPulsar").setParentSolarSystem(solarSystemLick).setTierRequired(-1);
    	starSol.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/Lick.png"));
    	solarSystemLick.setMainStar(starSol);
    	
    	//Sedna
        sedna = new Planet("Sedna").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        sedna.setRingColorRGB(0.1F, 0.9F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6.0F, 6.0F)).setRelativeOrbitTime(11.861993428258488499452354874042F);
        sedna.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/sedna.png"));
        sedna.setDimensionInfo(44, WorldProviderSedna.class);  
        sedna.setTierRequired(10);
        sedna.atmosphereComponent(IAtmosphericGas.ARGON).atmosphereComponent(IAtmosphericGas.METHANE).atmosphereComponent(IAtmosphericGas.HELIUM);
        
        //Quaoar
        quaoar = new Planet("Quaoar").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        quaoar.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6.40F, 6.40F)).setRelativeOrbitTime(19.861993428258488499452354874042F);
        quaoar.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/quaoar.png"));
        quaoar.setTierRequired(0);
        
        //Haumea
        haumea = new Planet("Haumea").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        haumea.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(3.50F, 3.50F)).setRelativeOrbitTime(18.861993428258488499452354874042F);
        haumea.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/haumea.png"));
        haumea.setDimensionInfo(43, WorldProviderHaumea.class);
        haumea.setTierRequired(7);
        sedna.atmosphereComponent(IAtmosphericGas.ARGON);
        
        //Makemake
        makemake = new Planet("Makemake").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        makemake.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(4.50F, 4.50F)).setRelativeOrbitTime(16.861993428258488499452354874042F);
        makemake.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/makemake.png"));
        makemake.setDimensionInfo(42, WorldProviderMakemake.class);
        makemake.setTierRequired(8);
        makemake.atmosphereComponent(IAtmosphericGas.METHANE);
        
        //Charon
        charon = new Planet("Charon").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        charon.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(2.75F, 2.75F)).setRelativeOrbitTime(15.861993428258488499452354874042F);
        charon.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/charon.png"));
        charon.setTierRequired(0);
        
        //2002MS4
        numberplanetone = new Planet("2002MS4").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        numberplanetone.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.25F, 8.25F)).setRelativeOrbitTime(14.861993428258488499452354874042F);
        numberplanetone.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/2002ms4.png"));
        numberplanetone.setTierRequired(0);
        
        //2002UX25
        numberplanettwo = new Planet("2002UX25").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        numberplanettwo.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.50F, 8.50F)).setRelativeOrbitTime(13.861993428258488499452354874042F);
        numberplanettwo.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/2002ux25.png"));
        numberplanettwo.setTierRequired(0);
        
        //Gonggong
        gonggong = new Planet("Gonggong").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        gonggong.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(7.75F, 7.75F)).setRelativeOrbitTime(12.861993428258488499452354874042F);
        gonggong.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/gonggong.png"));
        gonggong.setTierRequired(0);
        
        //Orcus
        orcus = new Planet("Orcus").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        orcus.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(7.0F, 7.0F)).setRelativeOrbitTime(11.861993428258488499452354874042F);
        orcus.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/orcus.png"));
        orcus.setTierRequired(0);
        
        //Varda
        varda = new Planet("Varda").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        varda.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(7.50F, 7.50F)).setRelativeOrbitTime(9.861993428258488499452354874042F);
        varda.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/varda.png"));
        varda.setTierRequired(0);
        
        //Varuna
        varuna = new Planet("Varuna").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        varuna.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(7.25F, 7.25F)).setRelativeOrbitTime(8.861993428258488499452354874042F);
        varuna.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/varuna.png"));
        varuna.setTierRequired(0);
        
        //Salacia
        salacia = new Planet("Salacia").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        salacia.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.0F, 8.0F)).setRelativeOrbitTime(7.861993428258488499452354874042F);
        salacia.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/salacia.png"));
        salacia.setTierRequired(0);
        
        //Ixion
        ixion = new Planet("Ixion").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        ixion.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9.0F, 9.0F)).setRelativeOrbitTime(6.861993428258488499452354874042F);
        ixion.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/ixion.png"));
        ixion.setTierRequired(0);
        
        //Vesta
        vesta = new Planet("Vesta").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        vesta.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.35F, 1.35F)).setRelativeOrbitTime(5.861993428258488499452354874042F);
        vesta.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/vesta.png"));
        vesta.setTierRequired(0);
        
        //Pallas
        pallas = new Planet("Pallas").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        pallas.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.35F, 1.35F)).setRelativeOrbitTime(4.861993428258488499452354874042F);
        pallas.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/pallas.png"));
        pallas.setTierRequired(0);
        
        //Hygiea
        hygiea = new Planet("Hygiea").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        hygiea.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.35F, 1.35F)).setRelativeOrbitTime(3.861993428258488499452354874042F);
        hygiea.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/hygiea.png"));
        hygiea.setTierRequired(0);
        
        //Farout
        farout = new Planet("FarOut").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        farout.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9.50F, 9.50F)).setRelativeOrbitTime(2.861993428258488499452354874042F);
        farout.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/farout.png"));
        farout.setTierRequired(0);
        
        //Farfarout
        farfarout = new Planet("FarFarOut").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        farfarout.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9.75F, 9.75F)).setRelativeOrbitTime(1.861993428258488499452354874042F);
        farfarout.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/farfarout.png"));
        farfarout.setTierRequired(0);
        
        //Draugr
        draugr = new Planet("Draugr").setParentSolarSystem(solarSystemLick);
        draugr.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.35F, 0.35F)).setRelativeOrbitTime(17.861993428258488499452354874042F);
        draugr.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/draugr.png"));
        draugr.setTierRequired(0);
        
        //Poltergeist
        poltergeist = new Planet("Poltergeist").setParentSolarSystem(solarSystemLick);
        poltergeist.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.80F, 0.80F)).setRelativeOrbitTime(17.861993428258488499452354874042F);
        poltergeist.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/poltergeist.png"));
        poltergeist.setTierRequired(0);
        
        //Phobetor
        phobetor = new Planet("Phobetor").setParentSolarSystem(solarSystemLick);
        phobetor.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.0F, 1.0F)).setRelativeOrbitTime(17.861993428258488499452354874042F);
        phobetor.setBodyIcon(new ResourceLocation("minecraft", "textures/planets/phobetor.png"));
        phobetor.setTierRequired(0);
        
        //Moons
        weywot = (Moon) new Moon("Weywot");
        weywot.setParentPlanet(nsatelite.quaoar).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10F, 10F)).setRelativeOrbitTime(64F).setTierRequired(0);
        weywot.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/weiwot.png"));
        
        hiiaka = (Moon) new Moon("Hiiaka");
        hiiaka.setParentPlanet(nsatelite.haumea).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10F, 10F)).setRelativeOrbitTime(64F).setTierRequired(0);
        hiiaka.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/hiiaka.png"));
        
        namaka = (Moon) new Moon("Namaka");
        namaka.setParentPlanet(nsatelite.haumea).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(15F, 15F)).setRelativeOrbitTime(64F).setTierRequired(0);
        namaka.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/namaka.png"));
        
        rorai = (Moon) new Moon("Rorai");
        rorai.setParentPlanet(nsatelite.makemake).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10F, 10F)).setRelativeOrbitTime(64F).setTierRequired(0);
        rorai.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/rorai.png"));
        
        ilmare = (Moon) new Moon("Ilmare");
        ilmare.setParentPlanet(nsatelite.varda).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10F, 10F)).setRelativeOrbitTime(64F).setTierRequired(0);
        ilmare.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/ilmare.png"));
        
        actaea = (Moon) new Moon("Actaea");
        actaea.setParentPlanet(nsatelite.salacia).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10F, 10F)).setRelativeOrbitTime(64F).setTierRequired(0);
        actaea.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/actaea.png"));
        
        vanth = (Moon) new Moon("Vanth");
        vanth.setParentPlanet(nsatelite.orcus).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10F, 10F)).setRelativeOrbitTime(64F).setTierRequired(0);
        vanth.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/vanth.png"));
        
        xiangliu = (Moon) new Moon("Xiangliu");
        xiangliu.setParentPlanet(nsatelite.gonggong).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10F, 10F)).setRelativeOrbitTime(64F).setTierRequired(0);
        xiangliu.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/xiangliu.png"));
        
        numbermoonone = (Moon) new Moon("2002UX25 s1");
        numbermoonone.setParentPlanet(nsatelite.numberplanettwo).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10F, 10F)).setRelativeOrbitTime(64F).setTierRequired(0);
        numbermoonone.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/2002ux25s1.png"));
        
        nix = (Moon) new Moon("Nix");
        nix.setParentPlanet(nsatelite.charon).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(15F, 15F)).setRelativeOrbitTime(64F).setTierRequired(0);
        nix.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/nix.png"));
        
        hydra = (Moon) new Moon("Hydra");
        hydra.setParentPlanet(nsatelite.charon).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(20F, 20F)).setRelativeOrbitTime(64F).setTierRequired(0);
        hydra.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/hydra.png"));
        
        kerberos = (Moon) new Moon("Kerberos");
        kerberos.setParentPlanet(nsatelite.charon).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(25F, 25F)).setRelativeOrbitTime(64F).setTierRequired(0);
        kerberos.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/kerberos.png"));
        
        styx = (Moon) new Moon("Styx");
        styx.setParentPlanet(nsatelite.charon).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(30F, 30F)).setRelativeOrbitTime(64F).setTierRequired(0);
        styx.setBodyIcon(new ResourceLocation("minecraft", "textures/moons/styx.png"));
        styx.setTierRequired(10);
        styx.setDimensionInfo(41, WorldProviderStyx.class);
        
        GalacticraftRegistry.registerTeleportType(WorldProviderSedna.class, new TeleportTypeMars());
		GalacticraftRegistry.registerRocketGui(WorldProviderSedna.class, new ResourceLocation("minecraft", "textures/rocketgui/sednagui.png"));
		GalacticraftRegistry.registerTeleportType(WorldProviderHaumea.class, new TeleportTypeMoon());
		GalacticraftRegistry.registerRocketGui(WorldProviderHaumea.class, new ResourceLocation("minecraft", "textures/rocketgui/haumeagui.png"));
		GalacticraftRegistry.registerTeleportType(WorldProviderMakemake.class, new TeleportTypeMoon());
		GalacticraftRegistry.registerRocketGui(WorldProviderMakemake.class, new ResourceLocation("minecraft", "textures/rocketgui/makemakegui.png"));
		GalacticraftRegistry.registerTeleportType(WorldProviderStyx.class, new TeleportTypeMars());
		GalacticraftRegistry.registerRocketGui(WorldProviderStyx.class, new ResourceLocation("minecraft", "textures/rocketgui/styxgui.png"));
		
		GameRegistry.registerBlock(sednasurface, "SednaSurface");
    	GameRegistry.registerBlock(sednasubsurface, "SednaSubsurface");
    	GameRegistry.registerBlock(sednastone, "SednaStone");
    	GameRegistry.registerBlock(sednabrick, "SednaBrick");
    	GameRegistry.registerBlock(sednarubidiumore, "SednaRubidiumOre");
    	GameRegistry.registerBlock(sednabismuthore, "SednaBismuthOre");
    	GameRegistry.registerBlock(sednacalciumore, "SednaCalciumOre");
    	GameRegistry.registerBlock(sednamolybdaenumore, "SednaMolybdaenumOre");
    	GameRegistry.registerBlock(rubidiumblock, "RubidiumBlock");
    	GameRegistry.registerBlock(rubidiumdualblock, "RubidiumDuaBlock");
    	GameRegistry.registerBlock(bismuthblock, "BismuthBlock");
    	GameRegistry.registerBlock(bismuthdualblock, "BismuthDualBlock");
    	GameRegistry.registerBlock(calciumblock, "CalciumBock");
    	GameRegistry.registerBlock(calciumdualblock, "CalciumDualBlock");
    	GameRegistry.registerBlock(molybdaenumblock, "MolybdaenumBlock");
    	GameRegistry.registerBlock(molybdaenumdualblock, "MolybdaenumDualBlock");
    	GameRegistry.registerBlock(haumeasurface, "HaumeaSurface");
    	GameRegistry.registerBlock(haumeasubsurface, "HaumeaSubsurface");
    	GameRegistry.registerBlock(haumeastone, "HaumeaStone");
    	GameRegistry.registerBlock(makemakesurface, "MakemakeSurface");
    	GameRegistry.registerBlock(makemakesubsurface, "MakemakeSubsurface");
    	GameRegistry.registerBlock(makemakestone, "MakemakeStone");
    	GameRegistry.registerBlock(styxsurface, "StyxSurface");
    	GameRegistry.registerBlock(styxsubsurface, "StyxSubsurface");
    	GameRegistry.registerBlock(haumeablackiumore, "HaumeaBlackiumOre");
    	GameRegistry.registerBlock(makemakewhitiumore, "MakemakeWhitiumOre");
    	GameRegistry.registerBlock(blackiumblock, "BlackiumBlock");
    	GameRegistry.registerBlock(whitiumblock, "WhtiumBlock");
    	GameRegistry.registerBlock(blackiumdualblock, "BlackiumDualBlock");
    	GameRegistry.registerBlock(whitiumdualblock, "WhitiumDualBlock");
    	GameRegistry.registerBlock(styxfranciumore, "StyxFranciumOre");
    	GameRegistry.registerBlock(styxbariumore, "StyxBariumOre");
    	GameRegistry.registerBlock(styxcesiumore, "StyxCesiumOre");
    	GameRegistry.registerBlock(styxkaliumore, "StyxKaliumOre");
    	GameRegistry.registerBlock(kaliumblock, "KaliumBlock");
    	GameRegistry.registerBlock(kaliumdualblock, "KaliumDualBlock");
    	GameRegistry.registerBlock(cesiumblock, "CesiumBlock");
    	GameRegistry.registerBlock(cesiumdualblock, "CesiumDualBlock");
    	GameRegistry.registerBlock(franciumblock, "FranciumBlock");
    	GameRegistry.registerBlock(franciumdualblock, "FranciumDualBlock");
    	GameRegistry.registerBlock(bariumblock, "BariumBlock");
    	GameRegistry.registerBlock(bariumdualblock, "BariumDualBlock");
    	GameRegistry.registerBlock(blackwhitiumblock, "BlackwhitiumBlock");
    	GameRegistry.registerBlock(blackwhitiumdualblock, "BlackwhitiumDualBlock");
    	GameRegistry.registerItem(rubidiumingot, "RubidiumIngot");
    	GameRegistry.registerItem(bismuthingot, "BismuthIngot");
    	GameRegistry.registerItem(calciumingot, "CalciumIngot");
    	GameRegistry.registerItem(molybdaenumingot, "MolybdaenumIngot");
    	GameRegistry.registerItem(bariumingot, "BariumIngot");
    	GameRegistry.registerItem(franciumingot, "FranciumIngot");
    	GameRegistry.registerItem(cesiumingot, "CesiumIngot");
    	GameRegistry.registerItem(kaliumingot, "KaliumIngot");
    	GameRegistry.registerItem(blackiumingot, "BlackiumIngot");
    	GameRegistry.registerItem(whitiumingot, "WhitiumIngot");
    	GameRegistry.registerItem(blackwhitiumingot, "BlackwhitiumIngot");
    	GameRegistry.registerItem(boosterT11, "BoosterT11");
    	GameRegistry.registerItem(plateT11, "PlateT11");
    	
    	GameRegistry.registerItem(schematictier11, "Tier11Schematic");
    	
    	GameRegistry.registerItem(rockettier11, "Tier11Rocket");
    	
    	GalaxyRegistry.registerSolarSystem(solarSystemLick);
        GalaxyRegistry.registerPlanet(sedna);
        GalaxyRegistry.registerPlanet(quaoar);
        GalaxyRegistry.registerPlanet(haumea);
        GalaxyRegistry.registerPlanet(makemake);
        GalaxyRegistry.registerPlanet(charon);
        GalaxyRegistry.registerPlanet(orcus);
        GalaxyRegistry.registerPlanet(varuna);
        GalaxyRegistry.registerPlanet(varda);
        GalaxyRegistry.registerPlanet(salacia);
        GalaxyRegistry.registerPlanet(gonggong);
        GalaxyRegistry.registerPlanet(numberplanetone);
        GalaxyRegistry.registerPlanet(numberplanettwo);
        GalaxyRegistry.registerPlanet(vesta);
        GalaxyRegistry.registerPlanet(pallas);
        GalaxyRegistry.registerPlanet(hygiea);
        GalaxyRegistry.registerPlanet(ixion);
        GalaxyRegistry.registerPlanet(farout);
        GalaxyRegistry.registerPlanet(farfarout);
        GalaxyRegistry.registerPlanet(draugr);
        GalaxyRegistry.registerPlanet(poltergeist);
        GalaxyRegistry.registerPlanet(phobetor);
        GalaxyRegistry.registerMoon(weywot);
        GalaxyRegistry.registerMoon(hiiaka);
        GalaxyRegistry.registerMoon(namaka);
        GalaxyRegistry.registerMoon(rorai);
        GalaxyRegistry.registerMoon(ilmare);
        GalaxyRegistry.registerMoon(actaea);
        GalaxyRegistry.registerMoon(nix);
        GalaxyRegistry.registerMoon(hydra);
        GalaxyRegistry.registerMoon(styx);
        GalaxyRegistry.registerMoon(kerberos);
        GalaxyRegistry.registerMoon(numbermoonone);
        GalaxyRegistry.registerMoon(xiangliu);
        GalaxyRegistry.registerMoon(vanth);
      
    }
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
  	
    	GameRegistry.addRecipe(new ItemStack(nsatelite.rubidiumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.rubidiumingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.rubidiumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.rubidiumblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.bismuthblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.bismuthingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.bismuthdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.bismuthblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.calciumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.calciumingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.calciumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.calciumblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.molybdaenumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.molybdaenumingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.molybdaenumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.molybdaenumblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.bariumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.bariumingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.bariumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.bariumblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.franciumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.franciumingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.franciumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.franciumblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.cesiumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.cesiumingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.cesiumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.cesiumblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.kaliumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.kaliumingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.kaliumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.kaliumblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.blackiumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.blackiumingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.blackiumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.blackiumblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.whitiumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.whitiumingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.whitiumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.whitiumblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.blackwhitiumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.blackwhitiumingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.blackwhitiumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), nsatelite.blackwhitiumblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.blackwhitiumingot, 1),
    			new Object[]{ "xyz", "zzz", "zzz",
    					('x'), nsatelite.blackiumingot, ('y'), nsatelite.whitiumingot});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.plateT11, 1),
    			new Object[]{ "abc", "def", "xyz",
    					('a'), nsatelite.rubidiumdualblock, ('b'), nsatelite.bismuthdualblock, ('c'), nsatelite.calciumdualblock, ('d'), nsatelite.molybdaenumdualblock, ('e'), micdoodle8.mods.galacticraft.core.items.GCItems.heavyPlatingTier1, ('f'), nsatelite.bariumdualblock, ('x'), nsatelite.franciumdualblock, ('y'), nsatelite.cesiumdualblock, ('z'), nsatelite.kaliumdualblock});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.boosterT11, 1),
    			new Object[]{ "xyx", "xzx", "xxx",
    					('x'), nsatelite.blackwhitiumdualblock, ('y'), Blocks.wool, ('z'), nsatelite.plateT11});
    	GameRegistry.addRecipe(new ItemStack(nsatelite.rockettier11, 1),
    			new Object[]{ "xxx", "xyx", "zaz",
    					('x'), nsatelite.plateT11, ('y'), GCItems.rocketTier1, ('z'), nsatelite.boosterT11, ('a'), nsatelite.schematictier11});
    	
    	GameRegistry.addSmelting(nsatelite.sednarubidiumore, new ItemStack(nsatelite.rubidiumingot, 1), 3.0F);
    	GameRegistry.addSmelting(nsatelite.sednabismuthore, new ItemStack(nsatelite.bismuthingot, 1), 3.0F);
    	GameRegistry.addSmelting(nsatelite.sednacalciumore, new ItemStack(nsatelite.calciumingot, 1), 3.0F);
    	GameRegistry.addSmelting(nsatelite.sednamolybdaenumore, new ItemStack(nsatelite.molybdaenumingot, 1), 3.5F);
    	GameRegistry.addSmelting(nsatelite.haumeablackiumore, new ItemStack(nsatelite.blackiumingot, 1), 3.0F);
    	GameRegistry.addSmelting(nsatelite.makemakewhitiumore, new ItemStack(nsatelite.whitiumingot, 1), 3.0F);
    	GameRegistry.addSmelting(nsatelite.styxbariumore, new ItemStack(nsatelite.bariumingot, 1), 3.0F);
    	GameRegistry.addSmelting(nsatelite.styxfranciumore, new ItemStack(nsatelite.franciumingot, 1), 3.0F);
    	GameRegistry.addSmelting(nsatelite.styxcesiumore, new ItemStack(nsatelite.cesiumingot, 1), 3.0F);
    	GameRegistry.addSmelting(nsatelite.styxkaliumore, new ItemStack(nsatelite.kaliumingot, 1), 3.0F);
    	
    	GalacticraftRegistry.addDungeonLoot(11, new ItemStack(nsatelite.schematictier11, 1, 1));
        }
    }