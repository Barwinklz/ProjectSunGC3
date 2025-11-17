package geniussixtyfour.dev.mods.cosmichorizons;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import geniussixtyfour.dev.mods.cosmichorizons.Entities.EntityAdrasteaSpider;
import geniussixtyfour.dev.mods.cosmichorizons.Entities.EntityAmaltheaZombie;
import geniussixtyfour.dev.mods.cosmichorizons.Entities.EntityAmaltheaZombieAstronaut;
import geniussixtyfour.dev.mods.cosmichorizons.Entities.EntityDeimosCreeper;
import geniussixtyfour.dev.mods.cosmichorizons.Entities.EntityDragonfly;
import geniussixtyfour.dev.mods.cosmichorizons.Entities.EntityMetisCreeper;
import geniussixtyfour.dev.mods.cosmichorizons.Entities.EntityPhobosCreeper;
import geniussixtyfour.dev.mods.cosmichorizons.Entities.EntityThebeCow;
import geniussixtyfour.dev.mods.cosmichorizons.Entities.EntityThebeSkeleton;
import geniussixtyfour.dev.mods.cosmichorizons.Entities.EntityThebeZombie;
import geniussixtyfour.dev.mods.cosmichorizons.Handler.TeleportTypeCH;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Blocks.BlockAdrastea1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Blocks.BlockAdrastea10;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Blocks.BlockAdrastea11;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Blocks.BlockAdrastea2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Blocks.BlockAdrastea3;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Blocks.BlockAdrastea4;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Blocks.BlockAdrastea5;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Blocks.BlockAdrastea6;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Blocks.BlockAdrastea7;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Blocks.BlockAdrastea8;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Blocks.BlockAdrastea9;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Dimension.WorldProviderAdrastea;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Items.ItemAdrastea1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Adrastea.Items.ItemAdrastea2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea10;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea11;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea12;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea13;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea14;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea16;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea17;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea18;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea19;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea20;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea21;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea22;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea23;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea24;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea25;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea26;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea3;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea4;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea6;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea8;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Blocks.BlockAmalthea9;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Dimension.WorldProviderAmalthea;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Fluids.FluidAmalthea1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Fluids.FluidBlockAmalthea1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Food.FoodAmalthea1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Items.ItemAmalthea1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Items.ItemAmalthea2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Items.ItemAmalthea3;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Items.ItemAmalthea4;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Items.ItemAmalthea5;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Items.ItemAmalthea6;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Amalthea.Items.ItemAmalthea7;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Blocks.BlockDeimos1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Blocks.BlockDeimos10;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Blocks.BlockDeimos2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Blocks.BlockDeimos3;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Blocks.BlockDeimos4;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Blocks.BlockDeimos5;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Blocks.BlockDeimos6;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Blocks.BlockDeimos7;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Blocks.BlockDeimos8;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Blocks.BlockDeimos9;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Dimension.WorldProviderDeimos;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Items.ItemDeimos1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Deimos.Items.ItemDeimos2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis10;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis11;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis12;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis13;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis3;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis4;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis5;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis6;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis7;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis8;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Blocks.BlockMetis9;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Dimension.WorldProviderMetis;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Items.ItemMetis1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Items.ItemMetis2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Items.ItemMetis3;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Metis.Items.ItemMetis4;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos10;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos11;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos12;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos13;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos14;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos3;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos4;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos5;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos6;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos7;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos8;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Blocks.BlockPhobos9;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Dimension.WorldProviderPhobos;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Items.ItemPhobos1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Items.ItemPhobos2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Items.ItemPhobos3;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Phobos.Items.ItemPhobos4;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.SpecialThemis.Blocks.BlockThemis1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.SpecialThemis.Blocks.BlockThemis2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.SpecialThemis.Blocks.BlockThemis3;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.SpecialThemis.Blocks.BlockThemis4;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.SpecialThemis.Blocks.BlockThemis5;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.SpecialThemis.Items.ItemThemis1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.SpecialThemis.Items.ItemThemis2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe10;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe11;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe12;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe13;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe14;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe15;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe3;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe4;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe5;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe6;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe7;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe8;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Blocks.BlockThebe9;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Dimension.WorldProviderThebe;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Food.FoodThebe1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Food.FoodThebe2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Items.ItemThebe1;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Items.ItemThebe2;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Items.ItemThebe3;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Items.ItemThebe4;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Items.ItemThebe5;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Items.ItemThebe6;
import geniussixtyfour.dev.mods.cosmichorizons.Moons.Thebe.Items.ItemThebe7;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Jupiter.Blocks.BlockJupiter1;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Jupiter.Blocks.BlockJupiter2;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Jupiter.Blocks.BlockJupiter3;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Jupiter.Dimension.WorldProviderJupiter;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Neptune.Blocks.BlockNeptune1;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Neptune.Blocks.BlockNeptune2;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Neptune.Blocks.BlockNeptune3;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Neptune.Dimension.WorldProviderNeptune;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Blocks.BlockEarth1;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Blocks.BlockEarth2;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Blocks.BlockEarth3;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Blocks.BlockEarth6;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Blocks.BlockEarth7;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Blocks.BlockEarth8;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Items.ItemEarth1;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Items.ItemEarth2;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Items.ItemEarth3;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Items.ItemEarth6;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Items.ItemEarth7;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Overworld.Items.ItemEarth8;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Saturn.Blocks.BlockSaturn1;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Saturn.Blocks.BlockSaturn2;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Saturn.Blocks.BlockSaturn3;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Saturn.Dimension.WorldProviderSaturn;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Uranus.Blocks.BlockUranus1;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Uranus.Blocks.BlockUranus2;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Uranus.Blocks.BlockUranus3;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Uranus.Dimension.WorldProviderUranus;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta1;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta10;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta11;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta12;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta13;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta14;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta2;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta3;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta4;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta5;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta6;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta7;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta8;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Blocks.BlockVesta9;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Dimension.WorldProviderVesta;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Items.ItemVesta1;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Items.ItemVesta2;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Items.ItemVesta3;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Items.ItemVesta4;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Items.ItemVesta5;
import geniussixtyfour.dev.mods.cosmichorizons.Planets.Vesta.Items.ItemVesta6;
import geniussixtyfour.dev.mods.cosmichorizons.Proxy.CommonProxy;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemAlienSaddle;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemBoosterTier100;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemMaxOxygenTank;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemOxygenTankSchematic;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemOxygenTankSchematicP1;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemOxygenTankSchematicP2;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemOxygenTankSchematicP3;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemOxygenTankSchematicP4;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemPlateTier100;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemPlateTierSP1;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemSchematicTier100;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemSchematicTier100p1;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemSchematicTier100p2;
import geniussixtyfour.dev.mods.cosmichorizons.RC.Items.ItemYtterbiumCanister;
import geniussixtyfour.dev.mods.cosmichorizons.Util.CHItemBlockUtil;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Moon;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.recipe.CompressorRecipes;
import micdoodle8.mods.galacticraft.api.world.IAtmosphericGas;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.items.GCItems;
import micdoodle8.mods.galacticraft.core.util.GCCoreUtil;
import micdoodle8.mods.galacticraft.planets.asteroids.dimension.TeleportTypeAsteroids;
import micdoodle8.mods.galacticraft.planets.mars.MarsModule;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

@Mod(modid = CosmicHorizonsCore.MODID, version = CosmicHorizonsCore.VERSION, name = CosmicHorizonsCore.NAME, dependencies = "required-after:GalacticraftCore; required-after:GalacticraftMars;")
public class CosmicHorizonsCore
{
    public static final String MODID = "cosmichorizons";
    public static final String VERSION = "0.2.0";
    public static final String NAME = "Cosmic Horizons";
 
    @SidedProxy(clientSide = "geniussixtyfour.dev.mods.cosmichorizons.Proxy.ClientProxy", serverSide = "geniussixtyfour.dev.mods.cosmichorizons.Proxy.ClientProxy")
    public static CommonProxy proxy;   

    @Instance("CosmicHorizonsCore")
    public static CosmicHorizonsCore instance;
    
    public static Block Kaliumore;
    public static Block Kaliumblock;
    public static Block Calciumore;
    public static Block Calciumblock;
    public static Block Natriumore;
    public static Block Natriumblock;
    
    public static Block Jupitersurface;
    public static Block Jupitersubsurface;
    public static Block Jupiterstone;
    public static Block Metissurface;
    public static Block Metissubsurface;
    public static Block Metisstone;
    public static Block Metisbrick;
    public static Block Metisglowstone;
    public static Block Saturnsurface;
    public static Block Saturnsubsurface;
    public static Block Saturnstone;
    public static Block Uranussurface;
    public static Block Uranussubsurface;
    public static Block Uranusstone;
    public static Block Neptunesurface;
    public static Block Neptunesubsurface;
    public static Block Neptunestone;
    public static Block Phobossurface;
    public static Block Phobossubsurface;
    public static Block Phobosstone;
    public static Block Phobosbrick;
    public static Block Phobosrockysurface;
    public static Block Deimossurface;
    public static Block Deimossubsurface;
    public static Block Deimosstone;
    public static Block Deimosbrick;
    public static Block Deimosrockysurface;
    public static Block Phobosrutheniumore;
    public static Block Phobosrhodiumore;
    public static Block Rhodiumblock;
    public static Block Rutheniumblock;
    public static Block Rhodiumdualblock;
    public static Block Rutheniumdualblock;
    public static Block Deimoscadmiumore;
    public static Block Cadmiumblock;
    public static Block Cadmiumdualblock;
    public static Block Phobosdeshore;
    public static Block Phobosaluminiumore;
    public static Block Phobossiliconore;
    public static Block Deimosdeshore;
    public static Block Deimosironore;
    public static Block Metisceriumore;
    public static Block Metisdysprosiumore;
    public static Block Metisironore;
    public static Block Metiscopperore;
    public static Block Metisdeshore;
    public static Block Ceriumblock;
    public static Block Dysprosiumblock;
    public static Block Adrasteasurface;
    public static Block Adrasteasubsurface;
    public static Block Adrasteastone;
    public static Block Adrasteaneodymiumore;
    public static Block Adrasteaironore;
    public static Block Adrasteatinore;
    public static Block Adrasteasiliconore;
    public static Block Adrasteabrick;
    public static Block Adrasteaglowstone;
    public static Block NeodymiumBlock;
    public static Block ThemisSurface;
    public static Block ThemisSubsurface;
    public static Block ThemisStone;
    public static Block Themistransparisteelore;
    public static Block TransparisteelBlock;
    public static Block Amaltheasurface;
    public static Block Amaltheasubsurface;
    public static Block Amaltheastone;
    public static Block Amaltheayttriumore;
    public static Block Amaltheaironore;
    public static Block Amaltheacopperore;
    public static Block Amaltheatinore;
    public static Block Amaltheaaluminiumore;
    public static Block Amalthealightsurface;
    public static Block Amalthealightsubsurface;
    public static Block Amalthealightstone;
    public static Block Amaltheasiliconore;
    public static Block Amaltheacoalore;
    public static Block Amaltheascandore;
    public static Block Amaltheaytterbiumore;
    public static Block Amaltheabrick;
    public static Block Amaltheaglowstone;
    public static Block Amaltheageyser;
    public static Block YttriumBlock;
    public static Block ScandBlock;
    public static Block YtterbiumBlock;
    public static Block Thebesurface;
    public static Block Thebesubsurface;
    public static Block Thebestone;
    public static Block Thebebrick;
    public static Block Thebeglowstone;
    public static Block Manganumore;
    public static Block Manganumblock;
    public static Block Strontiumore;
    public static Block Strontiumblock;
    public static Block Thebegalliumore;
    public static Block Galliumblock;
    public static Block Thebealuminiumore;
    public static Block Thebediamondore;
    public static Block Thebegoldore;
    public static Block Vestasurface;
    public static Block Vestasubsurface;
    public static Block Vestastone;
    public static Block Vestalawrenciumore;
    public static Block Vestaunbiquadiumore;
    public static Block Vestaunbiseptiumore;
    public static Block Vestatinore;
    public static Block Vestameteoricironore;
    public static Block Vestameteoricironore2;
    public static Block Vestadarksurface;
    public static Block Vestaunbiseptiumore2;
    public static Block Jupiterdenseice;
    public static Block Lawrenciumblock;
    public static Block Unbiquadiumblock;
    public static Block Unbiseptiumblock;
    public static Block Metistechnicblock;
    public static Block Adrasteatechnicblock;
    public static Block Amaltheatechnicblock;
    public static Block Thebetechnicblock;
    
//    public static BlockAmalthea15 amaltheaalienplant = new BlockAmalthea15();
    
	public static Block amaltheaLiquidIceFluidBlock;
	public static Fluid amaltheaLiquidIceFluid;
    
	public static Item KaliumIngot;
	public static Item KaliumPlate;
	public static Item CalciumIngot;
	public static Item CalciumPlate;
	public static Item NatriumIngot;
	public static Item NatriumPlate;
	
    public static Item CadmiumIngot;
    public static Item RutheniumIngot;
    public static Item RhodiumIngot;
    public static Item RhodiumPlate;
    public static Item RutheniumPlate;
    public static Item CadmiumPlate;
    public static Item CeriumIngot;
    public static Item CeriumPlate;
    public static Item DysprosiumIngot;
    public static Item DysprosiumPlate;
    public static Item NeodymiumIngot;
    public static Item NeodymiumPlate;
    public static Item TranspristeelIngot;
    public static Item TranspristeelPlate;
    public static Item Amaltheaalienfruit;
    public static Item YttriumIngot;
    public static Item YttriumPlate;
    public static Item ScandIngot;
    public static Item ScandPlate;
    public static Item YtterbiumIngot;
    public static Item YtterbiumPlate;
	public static Item ManganumIngot;
	public static Item ManganumPlate;
	public static Item StrontiumIngot;
	public static Item StrontiumPlate;
	public static Item GalliumIngot;
	public static Item GalliumPlate;
	public static Item LawrenciumIngot;
	public static Item LawrenciumPlate;
	public static Item UnbiquadiumIngot;
	public static Item UnbiquadiumPlate;
	public static Item UnbiseptiumIngot;
	public static Item UnbiseptiumPlate;
    public static Item Thebealienmilk;
    public static Item Tupoyegovnotupogogvna = FoodThebe2.thebebeef;
    public static Item Thebeleather;
    public static Item Amalthealiquidicebucket;
    public static Item Aliensaddle;
    public static Item Tier100Plate;
    public static Item Tier100Booster;
    public static Item Tier100Schematic;
    public static Item Tier100Part1;
    public static Item Tier100Part2;
    public static Item O2_Schematic_Part1;
    public static Item O2_Schematic_Part2;
    public static Item O2_Schematic_Part3;
    public static Item O2_Schematic_Part4;
    public static Item O2_Schematic;
	public static Item plateTierSP1;
    public static Item ytterbiumcanister;
    public static Item oxTankMax;
    public static Item chitems;
    public static Item chblocks;
    	
    public static final CreativeTabs cosmichorizonsblockstab = new CreativeTabs("chblockstab") 
    {
		public Item getTabIconItem() 
		{
			return CosmicHorizonsCore.chblocks;
		}
	};
	
	public static final CreativeTabs cosmichorizonsitemstab = new CreativeTabs("chitemstab") 
	{
		public Item getTabIconItem() 
		{
			return CosmicHorizonsCore.chitems;
		}
	};

	//Planets
    public static Planet Mercury;
    public static Planet Venus;
    public static Planet Jupiter = GalacticraftCore.planetJupiter;
    public static Planet Saturn = GalacticraftCore.planetSaturn;
    public static Planet Uranus = GalacticraftCore.planetUranus;
    public static Planet Neptune = GalacticraftCore.planetNeptune;
    public static Planet SolidSol;
    public static Planet Vesta;
    public static Planet Pallas;
    public static Planet Hygiea;
    public static Planet Juno;
    public static Planet Chariklo;
    public static Planet Haumea;
    public static Planet Makemake;
    public static Planet Pluto;

    //Mars Moons
    public static Moon Phobos;
    public static Moon Deimos;
    //Jupiter Moons
    public static Moon jmoonMetis;
    public static Moon jmoonAdrastea;
    public static Moon jmoonAmalthea;
    public static Moon jmoonThebe;
    public static Moon jmoonIo;
    public static Moon jmoonEuropa;
    public static Moon jmoonGanymede;
    public static Moon jmoonCallisto;
    public static Moon jmoonThemisto;
    public static Moon jmoonLeda;
    public static Moon jmoonHimalia;
    public static Moon jmoonErsa;
    public static Moon jmoonPandia;
    public static Moon jmoonLysithea;
    public static Moon jmoonElara;
    public static Moon jmoonDia;
    public static Moon jmoonCarpo;
    public static Moon jmoonValetudo;
    public static Moon jmoonEuporie;
    public static Moon jmoonEupheme;
    public static Moon jmoon22;
    public static Moon jmoon23;
    public static Moon jmoon24;
    public static Moon jmoonThelxinoe;
    public static Moon jmoonEuanthe;
    public static Moon jmoonHelike;
    public static Moon jmoonOrthosie;
    public static Moon jmoon28;
    public static Moon jmoon29;
    public static Moon jmoon30;
    public static Moon jmoonIocaste;
    public static Moon jmoonPraxidike;
    public static Moon jmoonHarpalyke;
    public static Moon jmoonMneme;
    public static Moon jmoonHermippe;
    public static Moon jmoonThyone;
    public static Moon jmoon38;
    public static Moon jmoonAnanke;
    public static Moon jmoonHerse;
    public static Moon jmoonAitne;
    public static Moon jmoon42;
    public static Moon jmoon43;
    public static Moon jmoonKale;
    public static Moon jmoonTaygete;
    public static Moon jmoon46;
    public static Moon jmoonChaldene;
    public static Moon jmoonPhilophrosyne;
    public static Moon jmoonErinome;
    public static Moon jmoonAoede;
    public static Moon jmoonKallichore;
    public static Moon jmoon54;
    public static Moon jmoon55;
    public static Moon jmoonKalyke;
    public static Moon jmoonCarme;
    public static Moon jmoonCallirrhoe;
    public static Moon jmoonEurydome;
    public static Moon jmoon60;
    public static Moon jmoonPasithee;
    public static Moon jmoon62;
    public static Moon jmoonKore;
    public static Moon jmoonCyllene;
    public static Moon jmoon65;
    public static Moon jmoonEukelade;
    public static Moon jmoon67;
    public static Moon jmoonPasiphae;
    public static Moon jmoonHegemone;
    public static Moon jmoonArche;
    public static Moon jmoonIsonoe;
    public static Moon jmoonEirene;
    public static Moon jmoonSinope;
    public static Moon jmoonSponde;
    public static Moon jmoonAutonoe;
    public static Moon jmoonMegaclite;
    //Saturn Moons
    public static Moon smoon1;
    public static Moon smoonMoonlets;
    public static Moon smoonPan;
    public static Moon smoonDaphnis;
    public static Moon smoonAtlas;
    public static Moon smoonPrometheus;
    public static Moon smoonPandora;
    public static Moon smoonEpimetheus;
    public static Moon smoonJanus;
    public static Moon smoonAegaeon;
    public static Moon smoonMimas;
    public static Moon smoonMethone;
    public static Moon smoonAnthe;
    public static Moon smoonPallene;
    public static Moon smoonEnceladus;
    public static Moon smoonTethys;
    public static Moon smoonTelesto;
    public static Moon smoonCalypso;
    public static Moon smoonDione;
    public static Moon smoonHelene;
    public static Moon smoonPolydeuces;
    public static Moon smoonRhea;
    public static Moon smoonTitan;
    public static Moon smoonHyperion;
    public static Moon smoonIapetus;
    public static Moon smoonKiviuq;
    public static Moon smoonIjiraq;
    public static Moon smoonPhoebe;
    public static Moon smoonPaaliaq;
    public static Moon smoonSkathi;
    public static Moon smoonAlbiorix;
    public static Moon smoon31;
    public static Moon smoonBebhionn;
    public static Moon smoonErriapus;
    public static Moon smoonSkoll;
    public static Moon smoonSiarnaq;
    public static Moon smoonTarqeq;
    public static Moon smoon37;
    public static Moon smoonGreip;
    public static Moon smoonHyrrokkin;
    public static Moon smoonJarnsaxa;
    public static Moon smoonTarvos;
    public static Moon smoonMundilfari;
    public static Moon smoon43;
    public static Moon smoon44;
    public static Moon smoonBergelmir;
    public static Moon smoonNarvi;
    public static Moon smoonSuttungr;
    public static Moon smoonHati;
    public static Moon smoon49;
    public static Moon smoonFarbauti;
    public static Moon smoonThrymr;
    public static Moon smoonAegir;
    public static Moon smoon53;
    public static Moon smoonBestla;
    public static Moon smoon55;
    public static Moon smoon56;
    public static Moon smoonFenrir;
    public static Moon smoonSurtur;
    public static Moon smoonKari;
    public static Moon smoonYmir;
    public static Moon smoonLoge;
    public static Moon smoonFornjot;
    //Uranus Moons
    public static Moon umoonCordelia;
    public static Moon umoonOphelia;
    public static Moon umoonBianca;
    public static Moon umoonCressida;
    public static Moon umoonDesdemona;
    public static Moon umoonJuliet;
    public static Moon umoonPortia;
    public static Moon umoonRosalind;
    public static Moon umoonCupid;
    public static Moon umoonBelinda;
    public static Moon umoonPerdita;
    public static Moon umoonPuck;
    public static Moon umoonMab;
    public static Moon umoonMiranda;
    public static Moon umoonAriel;
    public static Moon umoonUmbriel;
    public static Moon umoonTitania;
    public static Moon umoonOberon;
    public static Moon umoonFrancisco;
    public static Moon umoonCaliban;
    public static Moon umoonStephano;
    public static Moon umoonTrinculo;
    public static Moon umoonSycorax;
    public static Moon umoonMargaret;
    public static Moon umoonProspero;
    public static Moon umoonSetebos;
    public static Moon umoonFerdinand;
    //Neptune Moons
    public static Moon nmoonNaiad;
    public static Moon nmoonThalassa;
    public static Moon nmoonDespina;
    public static Moon nmoonGalatea;
    public static Moon nmoonLarissa;
    public static Moon nmoonHippocamp;
    public static Moon nmoonProteus;
    public static Moon nmoonTriton;
    public static Moon nmoonNereid;
    public static Moon nmoonHalimede;
    public static Moon nmoonSao;
    public static Moon nmoonLaomedeia;
    public static Moon nmoonPsamathe;
    public static Moon nmoonNeso;
    //Other Moons
    public static Moon hmoonhiiaka;
    public static Moon hmoonnamaka;
    public static Moon mmoonrorai;
    public static Moon pmooncharon;
    public static Moon pmoonnix;
    public static Moon pmoonhydra;
    public static Moon pmoonkerberos;
    public static Moon pmoonstyx;
    //Rings
    public static Moon charikloringoiapoque;
    public static Moon charikloringchuy;
    //Special
    public static Moon sspecialThemis;

    @EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
    	registerEntity(EntityPhobosCreeper.class, "PhobosEvolvedCreeper", 0x56228B, 0x8A228B);
    	registerEntity(EntityDeimosCreeper.class, "DeimosEvolvedCreeper", 0x56228B, 0x8A228B);
    	registerEntity(EntityMetisCreeper.class, "MetisEvolvedCreeper", 0x56228B, 0x8A228B);
    	registerEntity(EntityAdrasteaSpider.class, "AdrasteaEvolvedSpider", 0x56228B, 0x8A228B);
    	registerEntity(EntityAmaltheaZombie.class, "AmaltheaEvolvedZombie", 0x56228B, 0x8A228B);
    	registerEntity(EntityAmaltheaZombieAstronaut.class, "AmaltheaZombieAstronaut", 0x56228B, 0x8A228B);
    	registerEntity(EntityThebeCow.class, "ThebeAlienCow", 0x56228B, 0x8A228B);
    	registerEntity(EntityThebeZombie.class, "ThebeEvolvedZombie", 0x56228B, 0x8A228B);
    	registerEntity(EntityThebeSkeleton.class, "ThebeEvolvedSkeleton", 0x56228B, 0x8A228B);
		GCCoreUtil.registerGalacticraftNonMobEntity(EntityDragonfly.class, "Dragonfly", 150, 1, false);
    //	registerEntity(EntityPhobosCreeperBoss.class, "PhobosCreeperBoss", 0x56228B, 0x8A228B);
    	proxy.registerRenderers();
    }
    
    public void Load(FMLInitializationEvent event) {
//		getAmaltheaalienplant().load();
    }
    
    public static void registerEntity(Class entityClass, String name, int primaryColor, int secondaryColor)
    {
      int entityID = EntityRegistry.findGlobalUniqueEntityId();
      long seed = name.hashCode();

      EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
      EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
    }

	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		CosmicHorizonsCore.Kaliumore = new BlockEarth1();
		CosmicHorizonsCore.Calciumore = new BlockEarth2();
		CosmicHorizonsCore.Natriumore = new BlockEarth3();
		CosmicHorizonsCore.Kaliumblock = new BlockEarth6();
		CosmicHorizonsCore.Calciumblock = new BlockEarth7();
		CosmicHorizonsCore.Natriumblock = new BlockEarth8();
		CosmicHorizonsCore.Jupitersurface = new BlockJupiter1();
		CosmicHorizonsCore.Jupitersubsurface = new BlockJupiter2();
		CosmicHorizonsCore.Jupiterstone = new BlockJupiter3();
		CosmicHorizonsCore.Saturnsurface = new BlockSaturn1();
		CosmicHorizonsCore.Saturnsubsurface = new BlockSaturn2();
		CosmicHorizonsCore.Saturnstone = new BlockSaturn3();
	    CosmicHorizonsCore.Uranussurface = new BlockUranus1();
	    CosmicHorizonsCore.Uranussubsurface = new BlockUranus2();
	    CosmicHorizonsCore.Uranusstone = new BlockUranus3();
		CosmicHorizonsCore.Neptunesurface = new BlockNeptune1();
		CosmicHorizonsCore.Neptunesubsurface = new BlockNeptune2();
		CosmicHorizonsCore.Neptunestone = new BlockNeptune3();
		CosmicHorizonsCore.Phobossurface = new BlockPhobos1();
		CosmicHorizonsCore.Phobossubsurface = new BlockPhobos2();
		CosmicHorizonsCore.Phobosstone = new BlockPhobos3();
		CosmicHorizonsCore.Phobosbrick = new BlockPhobos4();
		CosmicHorizonsCore.Phobosrutheniumore = new BlockPhobos5();
		CosmicHorizonsCore.Phobosrhodiumore = new BlockPhobos6();
		CosmicHorizonsCore.Phobossiliconore = new BlockPhobos11();
		CosmicHorizonsCore.Phobosdeshore = new BlockPhobos12();
		CosmicHorizonsCore.Phobosaluminiumore = new BlockPhobos13();
		CosmicHorizonsCore.Rutheniumblock = new BlockPhobos7();
		CosmicHorizonsCore.Rutheniumdualblock = new BlockPhobos8();
		CosmicHorizonsCore.Rhodiumblock = new BlockPhobos9();
		CosmicHorizonsCore.Rhodiumdualblock = new BlockPhobos10();
		CosmicHorizonsCore.Deimossurface = new BlockDeimos1();
		CosmicHorizonsCore.Deimossubsurface = new BlockDeimos2();
		CosmicHorizonsCore.Deimosstone = new BlockDeimos3();
		CosmicHorizonsCore.Deimosbrick = new BlockDeimos4();
		CosmicHorizonsCore.Deimoscadmiumore = new BlockDeimos5();
		CosmicHorizonsCore.Deimosdeshore = new BlockDeimos8();
		CosmicHorizonsCore.Cadmiumblock = new BlockDeimos6();
		CosmicHorizonsCore.Cadmiumdualblock = new BlockDeimos7();
		CosmicHorizonsCore.Metissurface = new BlockMetis1();
		CosmicHorizonsCore.Metissubsurface = new BlockMetis2();
		CosmicHorizonsCore.Metisstone = new BlockMetis3();
		CosmicHorizonsCore.Metisbrick = new BlockMetis11();
		CosmicHorizonsCore.Metisglowstone = new BlockMetis12();
		CosmicHorizonsCore.Deimosironore = new BlockDeimos9();
		CosmicHorizonsCore.Deimosrockysurface = new BlockDeimos10();
		CosmicHorizonsCore.Phobosrockysurface = new BlockPhobos14();
		CosmicHorizonsCore.Metisceriumore = new BlockMetis4();
		CosmicHorizonsCore.Metisdysprosiumore = new BlockMetis5();
		CosmicHorizonsCore.Metisironore = new BlockMetis6();
		CosmicHorizonsCore.Metiscopperore = new BlockMetis7();
		CosmicHorizonsCore.Metisdeshore = new BlockMetis8();
		CosmicHorizonsCore.Ceriumblock = new BlockMetis9();
		CosmicHorizonsCore.Dysprosiumblock = new BlockMetis10();
		CosmicHorizonsCore.Adrasteasurface = new BlockAdrastea1();
		CosmicHorizonsCore.Adrasteasubsurface = new BlockAdrastea2();
		CosmicHorizonsCore.Adrasteastone = new BlockAdrastea3();
		CosmicHorizonsCore.Adrasteaneodymiumore = new BlockAdrastea4();
		CosmicHorizonsCore.Adrasteaironore = new BlockAdrastea5();
		CosmicHorizonsCore.Adrasteatinore = new BlockAdrastea6();
		CosmicHorizonsCore.Adrasteasiliconore = new BlockAdrastea7();
		CosmicHorizonsCore.Adrasteabrick = new BlockAdrastea9();
		CosmicHorizonsCore.Adrasteaglowstone = new BlockAdrastea10();
		CosmicHorizonsCore.NeodymiumBlock = new BlockAdrastea8();
		CosmicHorizonsCore.ThemisSurface = new BlockThemis1();
		CosmicHorizonsCore.ThemisSubsurface = new BlockThemis2();
		CosmicHorizonsCore.ThemisStone = new BlockThemis3();
		CosmicHorizonsCore.Themistransparisteelore = new BlockThemis4();
		CosmicHorizonsCore.TransparisteelBlock = new BlockThemis5();
		CosmicHorizonsCore.Amaltheasurface = new BlockAmalthea1();
		CosmicHorizonsCore.Amaltheasubsurface = new BlockAmalthea2();
		CosmicHorizonsCore.Amaltheastone = new BlockAmalthea3();
		CosmicHorizonsCore.Amaltheayttriumore = new BlockAmalthea4();
		CosmicHorizonsCore.Amaltheaironore = new BlockAmalthea8();
		CosmicHorizonsCore.Amaltheacopperore = new BlockAmalthea9();
		CosmicHorizonsCore.Amaltheatinore = new BlockAmalthea10();
		CosmicHorizonsCore.Amaltheaaluminiumore = new BlockAmalthea11();
		CosmicHorizonsCore.Amalthealightsurface = new BlockAmalthea12();
		CosmicHorizonsCore.Amalthealightsubsurface = new BlockAmalthea13();
		CosmicHorizonsCore.Amalthealightstone = new BlockAmalthea14();
		CosmicHorizonsCore.Amaltheascandore = new BlockAmalthea16();
		CosmicHorizonsCore.Amaltheaytterbiumore = new BlockAmalthea17();
		CosmicHorizonsCore.Amaltheasiliconore = new BlockAmalthea18();
		CosmicHorizonsCore.Amaltheacoalore = new BlockAmalthea19();
		CosmicHorizonsCore.Amaltheabrick = new BlockAmalthea22();
		CosmicHorizonsCore.Amaltheaglowstone = new BlockAmalthea23();
		CosmicHorizonsCore.Amaltheageyser = new BlockAmalthea25();
		CosmicHorizonsCore.YttriumBlock = new BlockAmalthea6();
		CosmicHorizonsCore.ScandBlock = new BlockAmalthea20();
		CosmicHorizonsCore.YtterbiumBlock = new BlockAmalthea21();
		CosmicHorizonsCore.Thebesurface = new BlockThebe1();
		CosmicHorizonsCore.Thebesubsurface = new BlockThebe2();
		CosmicHorizonsCore.Thebestone = new BlockThebe3();
		CosmicHorizonsCore.Manganumore = new BlockThebe4();
		CosmicHorizonsCore.Strontiumore = new BlockThebe5();
		CosmicHorizonsCore.Manganumblock = new BlockThebe6();
		CosmicHorizonsCore.Strontiumblock = new BlockThebe7();
		CosmicHorizonsCore.Thebebrick = new BlockThebe13();
		CosmicHorizonsCore.Thebeglowstone = new BlockThebe14();
		CosmicHorizonsCore.Thebealuminiumore = new BlockThebe8();
		CosmicHorizonsCore.Thebediamondore = new BlockThebe9();
		CosmicHorizonsCore.Thebegoldore = new BlockThebe10();
		CosmicHorizonsCore.Thebegalliumore = new BlockThebe11();
		CosmicHorizonsCore.Galliumblock = new BlockThebe12();
		CosmicHorizonsCore.Vestasurface = new BlockVesta1();
		CosmicHorizonsCore.Vestasubsurface = new BlockVesta2();
		CosmicHorizonsCore.Vestastone = new BlockVesta3();
		CosmicHorizonsCore.Vestalawrenciumore = new BlockVesta4();
		CosmicHorizonsCore.Vestaunbiquadiumore = new BlockVesta5();
		CosmicHorizonsCore.Vestaunbiseptiumore = new BlockVesta8();
		CosmicHorizonsCore.Vestatinore = new BlockVesta10();
		CosmicHorizonsCore.Vestameteoricironore = new BlockVesta11();
		CosmicHorizonsCore.Vestameteoricironore2 = new BlockVesta12();
		CosmicHorizonsCore.Vestadarksurface = new BlockVesta13();
		CosmicHorizonsCore.Vestaunbiseptiumore2 = new BlockVesta14();
		CosmicHorizonsCore.Jupiterdenseice = new BlockAmalthea26("RedDenseIce");
		CosmicHorizonsCore.Lawrenciumblock = new BlockVesta6();
		CosmicHorizonsCore.Unbiquadiumblock = new BlockVesta7();
		CosmicHorizonsCore.Unbiseptiumblock = new BlockVesta9();
		CosmicHorizonsCore.Metistechnicblock = new BlockMetis13();
		CosmicHorizonsCore.Adrasteatechnicblock = new BlockAdrastea11();
		CosmicHorizonsCore.Amaltheatechnicblock = new BlockAmalthea24();
		CosmicHorizonsCore.Thebetechnicblock = new BlockThebe15();
		
		CosmicHorizonsCore.KaliumIngot = new ItemEarth1();
		CosmicHorizonsCore.CalciumIngot = new ItemEarth2();
		CosmicHorizonsCore.NatriumIngot = new ItemEarth3();
		CosmicHorizonsCore.KaliumPlate = new ItemEarth6();
		CosmicHorizonsCore.CalciumPlate = new ItemEarth7();
		CosmicHorizonsCore.NatriumPlate = new ItemEarth8();
		CosmicHorizonsCore.CadmiumIngot = new ItemDeimos1();
		CosmicHorizonsCore.RutheniumIngot = new ItemPhobos1();
		CosmicHorizonsCore.RhodiumIngot = new ItemPhobos2();
		CosmicHorizonsCore.RhodiumPlate = new ItemPhobos3();
		CosmicHorizonsCore.RutheniumPlate = new ItemPhobos4();
		CosmicHorizonsCore.CadmiumPlate = new ItemDeimos2();
		CosmicHorizonsCore.Tier100Schematic = new ItemSchematicTier100();
		CosmicHorizonsCore.Tier100Part1 = new ItemSchematicTier100p1();
		CosmicHorizonsCore.Tier100Part2 = new ItemSchematicTier100p2();
		CosmicHorizonsCore.Tier100Plate = new ItemPlateTier100();
		CosmicHorizonsCore.Tier100Booster = new ItemBoosterTier100();
		CosmicHorizonsCore.CeriumIngot = new ItemMetis1();
		CosmicHorizonsCore.DysprosiumIngot = new ItemMetis2();
		CosmicHorizonsCore.CeriumPlate = new ItemMetis3();
		CosmicHorizonsCore.DysprosiumPlate = new ItemMetis4();
		CosmicHorizonsCore.NeodymiumIngot = new ItemAdrastea1();
		CosmicHorizonsCore.NeodymiumPlate = new ItemAdrastea2();
		CosmicHorizonsCore.TranspristeelIngot = new ItemThemis1();
		CosmicHorizonsCore.TranspristeelPlate = new ItemThemis2();
		CosmicHorizonsCore.YttriumIngot = new ItemAmalthea1();
		CosmicHorizonsCore.YttriumPlate = new ItemAmalthea2();
		CosmicHorizonsCore.ScandIngot = new ItemAmalthea3();
		CosmicHorizonsCore.ScandPlate = new ItemAmalthea4();
		CosmicHorizonsCore.YtterbiumIngot = new ItemAmalthea5();
		CosmicHorizonsCore.YtterbiumPlate = new ItemAmalthea6();
		CosmicHorizonsCore.ManganumIngot = new ItemThebe1();
		CosmicHorizonsCore.StrontiumIngot = new ItemThebe2();
		CosmicHorizonsCore.ManganumPlate = new ItemThebe3();
		CosmicHorizonsCore.StrontiumPlate = new ItemThebe4();
		CosmicHorizonsCore.GalliumIngot = new ItemThebe5();
		CosmicHorizonsCore.GalliumPlate = new ItemThebe6();
		CosmicHorizonsCore.LawrenciumIngot = new ItemVesta1();
		CosmicHorizonsCore.LawrenciumPlate = new ItemVesta2();
		CosmicHorizonsCore.UnbiquadiumIngot = new ItemVesta3();
		CosmicHorizonsCore.UnbiquadiumPlate = new ItemVesta4();
		CosmicHorizonsCore.UnbiseptiumIngot = new ItemVesta5();
		CosmicHorizonsCore.UnbiseptiumPlate = new ItemVesta6();
		CosmicHorizonsCore.Thebeleather = new ItemThebe7();
		CosmicHorizonsCore.Amaltheaalienfruit = new FoodAmalthea1();
		CosmicHorizonsCore.Thebealienmilk = new FoodThebe1();
		FoodThebe2.thebebeef = new FoodThebe2();
		CosmicHorizonsCore.Aliensaddle = new ItemAlienSaddle();
		CosmicHorizonsCore.O2_Schematic_Part1 = new ItemOxygenTankSchematicP1();
		CosmicHorizonsCore.O2_Schematic_Part2 = new ItemOxygenTankSchematicP2();
		CosmicHorizonsCore.O2_Schematic_Part3 = new ItemOxygenTankSchematicP3();
		CosmicHorizonsCore.O2_Schematic_Part4 = new ItemOxygenTankSchematicP4();
		CosmicHorizonsCore.O2_Schematic = new ItemOxygenTankSchematic();
		CosmicHorizonsCore.plateTierSP1 = new ItemPlateTierSP1();
		CosmicHorizonsCore.ytterbiumcanister = new ItemYtterbiumCanister();
		CosmicHorizonsCore.oxTankMax = new ItemMaxOxygenTank(0, "maxoxygentank");
		CosmicHorizonsCore.chitems = new CHItems();
		CosmicHorizonsCore.chblocks = new CHBlocks();
		
//		getAmaltheaalienplant().preInit(event);
		
		CosmicHorizonsCore.amaltheaLiquidIceFluid = new FluidAmalthea1("red_LiquidIce_fluid").setBlock(CosmicHorizonsCore.amaltheaLiquidIceFluidBlock);
		FluidRegistry.registerFluid(CosmicHorizonsCore.amaltheaLiquidIceFluid);
		CosmicHorizonsCore.amaltheaLiquidIceFluidBlock = new FluidBlockAmalthea1("red_LiquidIce_fluid", CosmicHorizonsCore.amaltheaLiquidIceFluid, Material.water);
    
		CosmicHorizonsCore.Amalthealiquidicebucket = new ItemAmalthea7("redliquidicebucket");
		CosmicHorizonsCore.registerSpecialItem(Amalthealiquidicebucket);
		FluidContainerRegistry.registerFluidContainer(CosmicHorizonsCore.amaltheaLiquidIceFluid, new ItemStack(CosmicHorizonsCore.Amalthealiquidicebucket), new ItemStack(Items.bucket));    
    }
	
	public static void registerFluidBlock(Block block, Class<? extends ItemBlock> itemBlockClass) {
		GameRegistry.registerBlock(block, itemBlockClass, block.getUnlocalizedName().replace("tile.", ""));
	}
	
	public static void registerSpecialItem(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().replace("item.", ""));
	}
	
	public static void registerSpecialBlock(Block block, Class<? extends ItemBlock> itemBlockClass) {
		GameRegistry.registerBlock(block, itemBlockClass, block.getUnlocalizedName().replace("§5tile.", "§5"));
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event) 
    {
    	
    /*	CosmicHorizonsCore.SolidSol = new Planet("sol");
		CosmicHorizonsCore.SolidSol.setParentSolarSystem(GalacticraftCore.solarSystemSol);
	    CosmicHorizonsCore.SolidSol.setRingColorRGB(0.1F, 0.9F, 0.6F);
	    CosmicHorizonsCore.SolidSol.setPhaseShift(2.0F);
		CosmicHorizonsCore.SolidSol.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.00000001F, 0.00000001F));
		CosmicHorizonsCore.SolidSol.setRelativeOrbitTime(11.861993428258488499452354874041F);
		CosmicHorizonsCore.SolidSol.setBodyIcon(new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "textures/gui/environment/sun.png"));		
		CosmicHorizonsCore.SolidSol.setTierRequired(20);
    	*/
    	
    	//Mercury
    	CosmicHorizonsCore.Mercury = new Planet("mercury").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        CosmicHorizonsCore.Mercury.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(1.49F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.50F, 0.50F)).setRelativeOrbitTime(5.861993428258488499452354874042F);
        CosmicHorizonsCore.Mercury.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/mercury.png"));
        CosmicHorizonsCore.Mercury.setTierRequired(100);
    	
        //Venus
    	CosmicHorizonsCore.Venus = new Planet("venus").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        CosmicHorizonsCore.Venus.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.75F, 0.75F)).setRelativeOrbitTime(8.861993428258488499452354874042F);
        CosmicHorizonsCore.Venus.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/venus.png"));
        CosmicHorizonsCore.Venus.setTierRequired(3);
        
		//Vesta
		CosmicHorizonsCore.Vesta = new Planet("vesta").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        CosmicHorizonsCore.Vesta.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(0.49F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.350001F, 1.350001F)).setRelativeOrbitTime(1.861993428258488499452354874042F);
        CosmicHorizonsCore.Vesta.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/vesta.png"));
		CosmicHorizonsCore.Vesta.setDimensionInfo(56, WorldProviderVesta.class); 
        CosmicHorizonsCore.Vesta.setTierRequired(3);
        
        //Pallas
        CosmicHorizonsCore.Pallas = new Planet("pallas").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        CosmicHorizonsCore.Pallas.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(0.1919F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.350002F, 1.350002F)).setRelativeOrbitTime(2.861993428258488499452354874042F);
        CosmicHorizonsCore.Pallas.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/pallas.png"));
        CosmicHorizonsCore.Pallas.setTierRequired(3);
        
        //Hygiea
        CosmicHorizonsCore.Hygiea = new Planet("hygiea").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        CosmicHorizonsCore.Hygiea.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(0.759F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.350003F, 1.350003F)).setRelativeOrbitTime(18.861993428258488499452354874042F);
        CosmicHorizonsCore.Hygiea.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/hygiea.png"));
        CosmicHorizonsCore.Hygiea.setTierRequired(3);
        
        //Juno
        CosmicHorizonsCore.Juno = new Planet("juno").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        CosmicHorizonsCore.Juno.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(0.259F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.350004F, 1.350004F)).setRelativeOrbitTime(17.861993428258488499452354874042F);
        CosmicHorizonsCore.Juno.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/juno.png"));
        CosmicHorizonsCore.Juno.setTierRequired(3);
        
        //Haumea
        CosmicHorizonsCore.Haumea = new Planet("haumea").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        CosmicHorizonsCore.Haumea.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(2.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(3.35F, 3.50F)).setRelativeOrbitTime(9.861993428258488499452354874042F);
        CosmicHorizonsCore.Haumea.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/haumea.png"));
    /*  CosmicHorizonsCore.Haumea.setDimensionInfo(43, WorldProviderHaumea.class); */
        CosmicHorizonsCore.Haumea.setTierRequired(7);
        
        //Makemake
        CosmicHorizonsCore.Makemake = new Planet("makemake").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        CosmicHorizonsCore.Makemake.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(1.9F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(3.48F, 3.48F)).setRelativeOrbitTime(16.861993428258488499452354874042F);
        CosmicHorizonsCore.Makemake.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/makemake.png"));
   /*   CosmicHorizonsCore.Makemake.setDimensionInfo(42, WorldProviderMakemake.class); */
        CosmicHorizonsCore.Makemake.setTierRequired(8);
        
        //Pluto
        CosmicHorizonsCore.Pluto = new Planet("pluto").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        CosmicHorizonsCore.Pluto.setRingColorRGB(0.1F, 0.7F, 0.6F).setPhaseShift(3.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(2.75F, 2.75F)).setRelativeOrbitTime(31.861993428258488499452354874042F);
        CosmicHorizonsCore.Pluto.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/pluto.png"));
        CosmicHorizonsCore.Pluto.setTierRequired(0);
    	
		CosmicHorizonsCore.Jupiter = new Planet("jupiter");
		CosmicHorizonsCore.Jupiter.setParentSolarSystem(GalacticraftCore.solarSystemSol);
	    CosmicHorizonsCore.Jupiter.setRingColorRGB(0.1F, 0.9F, 0.6F);
	    CosmicHorizonsCore.Jupiter.setPhaseShift(2.0F);
		CosmicHorizonsCore.Jupiter.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.5F, 1.5F));
		CosmicHorizonsCore.Jupiter.setRelativeOrbitTime(11.861993428258488499452354874041F);
		CosmicHorizonsCore.Jupiter.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiter.png"));
	/*	CosmicHorizonsCore.Jupiter.setDimensionInfo(36, WorldProviderJupiter.class); */
		CosmicHorizonsCore.Jupiter.setTierRequired(0);
		CosmicHorizonsCore.Jupiter.atmosphereComponent(IAtmosphericGas.HYDROGEN);
		CosmicHorizonsCore.Jupiter.atmosphereComponent(IAtmosphericGas.HELIUM);
		CosmicHorizonsCore.Jupiter.atmosphereComponent(IAtmosphericGas.METHANE);
		CosmicHorizonsCore.Jupiter.atmosphereComponent(IAtmosphericGas.WATER);
//Saturn
		CosmicHorizonsCore.Saturn = new Planet("saturn");
		CosmicHorizonsCore.Saturn.setParentSolarSystem(GalacticraftCore.solarSystemSol);
	    CosmicHorizonsCore.Saturn.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.75F, 1.75F));
	    CosmicHorizonsCore.Saturn.setRelativeOrbitTime(29.463307776560788608981380065717F);
		CosmicHorizonsCore.Saturn.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/saturn.png"));
		CosmicHorizonsCore.Saturn.setRingColorRGB(0.1F, 0.9F, 0.6F);
		CosmicHorizonsCore.Saturn.setPhaseShift(5.45F);
	/*	CosmicHorizonsCore.Saturn.setDimensionInfo(37, WorldProviderSaturn.class); */
		CosmicHorizonsCore.Saturn.setTierRequired(0);
		CosmicHorizonsCore.Saturn.atmosphereComponent(IAtmosphericGas.HYDROGEN);
		CosmicHorizonsCore.Saturn.atmosphereComponent(IAtmosphericGas.HELIUM);
		CosmicHorizonsCore.Saturn.atmosphereComponent(IAtmosphericGas.METHANE);
        
        //Chariklo
        CosmicHorizonsCore.Chariklo = new Planet("chariklo").setParentSolarSystem(GalacticraftCore.solarSystemSol);
        CosmicHorizonsCore.Chariklo.setRingColorRGB(0.9F, 0.9F, 0.9F).setPhaseShift(0.99F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.95F, 1.95F)).setRelativeOrbitTime(20F);
        CosmicHorizonsCore.Chariklo.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/puck.png"));
        CosmicHorizonsCore.Chariklo.setTierRequired(100);
		
//Uranus
		CosmicHorizonsCore.Uranus = new Planet("uranus");
		CosmicHorizonsCore.Uranus.setParentSolarSystem(GalacticraftCore.solarSystemSol);
		CosmicHorizonsCore.Uranus.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(2.0F, 2.0F));
		CosmicHorizonsCore.Uranus.setRelativeOrbitTime(84.063526834611171960569550930997F);
		CosmicHorizonsCore.Uranus.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/uranus.png"));
		CosmicHorizonsCore.Uranus.setRingColorRGB(0.1F, 0.9F, 0.6F).setPhaseShift(1.38F);
		CosmicHorizonsCore.Uranus.setPhaseShift(1.38F);
	/*  CosmicHorizonsCore.Uranus.setDimensionInfo(38, WorldProviderUranus.class); */
	    CosmicHorizonsCore.Uranus.setTierRequired(0);
	    CosmicHorizonsCore.Uranus.atmosphereComponent(IAtmosphericGas.HYDROGEN);
	    CosmicHorizonsCore.Uranus.atmosphereComponent(IAtmosphericGas.HELIUM);
	    CosmicHorizonsCore.Uranus.atmosphereComponent(IAtmosphericGas.METHANE);
	    CosmicHorizonsCore.Uranus.atmosphereComponent(IAtmosphericGas.WATER);
//Neptune
		CosmicHorizonsCore.Neptune = new Planet("neptune");
		CosmicHorizonsCore.Neptune.setParentSolarSystem(GalacticraftCore.solarSystemSol);
		CosmicHorizonsCore.Neptune.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(2.25F, 2.25F));
		CosmicHorizonsCore.Neptune.setRelativeOrbitTime(164.84118291347207009857612267251F);
		CosmicHorizonsCore.Neptune.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/neptune.png"));
		CosmicHorizonsCore.Neptune.setRingColorRGB(0.1F, 0.9F, 0.6F);
		CosmicHorizonsCore.Neptune.setPhaseShift(1.0F);
	/*	CosmicHorizonsCore.Neptune.setDimensionInfo(39, WorldProviderNeptune.class); */
		CosmicHorizonsCore.Neptune.setTierRequired(0);
		CosmicHorizonsCore.Neptune.atmosphereComponent(IAtmosphericGas.HYDROGEN);
		CosmicHorizonsCore.Neptune.atmosphereComponent(IAtmosphericGas.HELIUM);
		CosmicHorizonsCore.Neptune.atmosphereComponent(IAtmosphericGas.NITROGEN);
		CosmicHorizonsCore.Neptune.atmosphereComponent(IAtmosphericGas.METHANE);
		CosmicHorizonsCore.Neptune.atmosphereComponent(IAtmosphericGas.WATER);
//Moons
		CosmicHorizonsCore.Phobos = (Moon) new Moon("phobos");
		CosmicHorizonsCore.Phobos.setParentPlanet(MarsModule.planetMars);
		CosmicHorizonsCore.Phobos.setRelativeSize(0.2667F);
		CosmicHorizonsCore.Phobos.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9F, 9F));
		CosmicHorizonsCore.Phobos.setRelativeOrbitTime(16F);
		CosmicHorizonsCore.Phobos.setDimensionInfo(33, WorldProviderPhobos.class);
		CosmicHorizonsCore.Phobos.setTierRequired(3);
		CosmicHorizonsCore.Phobos.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/phobos.png"));
		
		CosmicHorizonsCore.Deimos = (Moon) new Moon("deimos");
		CosmicHorizonsCore.Deimos.setParentPlanet(MarsModule.planetMars);
		CosmicHorizonsCore.Deimos.setRelativeSize(0.2667F);
		CosmicHorizonsCore.Deimos.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(23F, 23F));
		CosmicHorizonsCore.Deimos.setRelativeOrbitTime(30F);
		CosmicHorizonsCore.Deimos.setDimensionInfo(34, WorldProviderDeimos.class);
		CosmicHorizonsCore.Deimos.setTierRequired(3);
		CosmicHorizonsCore.Deimos.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/deimos.png"));

		CosmicHorizonsCore.jmoonMetis = (Moon) new Moon("metis");
		CosmicHorizonsCore.jmoonMetis.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonMetis.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonMetis.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(7.75F, 7.75F));
		CosmicHorizonsCore.jmoonMetis.setRelativeOrbitTime(1 / 0.175F);
	   	CosmicHorizonsCore.jmoonMetis.setDimensionInfo(50, WorldProviderMetis.class); 
		CosmicHorizonsCore.jmoonMetis.setTierRequired(3);
		CosmicHorizonsCore.jmoonMetis.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/metis.png"));
		
		CosmicHorizonsCore.jmoonAdrastea = (Moon) new Moon("adrastea");
		CosmicHorizonsCore.jmoonAdrastea.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonAdrastea.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonAdrastea.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8F, 8F));
		CosmicHorizonsCore.jmoonAdrastea.setRelativeOrbitTime(1 / 0.171F);
		CosmicHorizonsCore.jmoonAdrastea.setDimensionInfo(51, WorldProviderAdrastea.class); 
		CosmicHorizonsCore.jmoonAdrastea.setTierRequired(3);
		CosmicHorizonsCore.jmoonAdrastea.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/adrastea.png"));

		CosmicHorizonsCore.jmoonAmalthea = (Moon) new Moon("amalthea");
		CosmicHorizonsCore.jmoonAmalthea.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonAmalthea.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonAmalthea.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.9F, 8.9F));
		CosmicHorizonsCore.jmoonAmalthea.setRelativeOrbitTime(1 / 0.044F);
		CosmicHorizonsCore.jmoonAmalthea.setDimensionInfo(53, WorldProviderAmalthea.class); 
		CosmicHorizonsCore.jmoonAmalthea.setTierRequired(3);
		CosmicHorizonsCore.jmoonAmalthea.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/amalthea.png"));

		CosmicHorizonsCore.jmoonThebe = (Moon) new Moon("thebe");
		CosmicHorizonsCore.jmoonThebe.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonThebe.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonThebe.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9.8F, 9.8F));
		CosmicHorizonsCore.jmoonThebe.setRelativeOrbitTime(1 / 0.029F);
		CosmicHorizonsCore.jmoonThebe.setDimensionInfo(55, WorldProviderThebe.class); 
		CosmicHorizonsCore.jmoonThebe.setTierRequired(3);
		CosmicHorizonsCore.jmoonThebe.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/thebe.png"));

		CosmicHorizonsCore.jmoonIo = (Moon) new Moon("io");
		CosmicHorizonsCore.jmoonIo.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonIo.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonIo.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10.7F, 10.7F));
		CosmicHorizonsCore.jmoonIo.setRelativeOrbitTime(1 / 0.017F);
		if(Loader.isModLoaded("GalaxySpace")? true : false)
	    {
//			CosmicHorizonsCore.jmoonIo.setDimensionInfo(91, WorldProviderIo.class);
	    }
		CosmicHorizonsCore.jmoonIo.setTierRequired(5);
		CosmicHorizonsCore.jmoonIo.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/io.png"));

		CosmicHorizonsCore.jmoonEuropa = (Moon) new Moon("europa");
		CosmicHorizonsCore.jmoonEuropa.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonEuropa.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonEuropa.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(12.2F, 12.2F));
		CosmicHorizonsCore.jmoonEuropa.setRelativeOrbitTime(1 / 0.014F);
		CosmicHorizonsCore.jmoonEuropa.setTierRequired(5);
		CosmicHorizonsCore.jmoonEuropa.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/europa.png"));

		CosmicHorizonsCore.jmoonGanymede = (Moon) new Moon("ganymede");
		CosmicHorizonsCore.jmoonGanymede.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonGanymede.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonGanymede.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(13.7F, 13.7F));
		CosmicHorizonsCore.jmoonGanymede.setRelativeOrbitTime(1 / 0.011F);
		CosmicHorizonsCore.jmoonGanymede.setTierRequired(5);
		CosmicHorizonsCore.jmoonGanymede.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/ganymede.png"));

		CosmicHorizonsCore.jmoonCallisto = (Moon) new Moon("callisto");
		CosmicHorizonsCore.jmoonCallisto.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonCallisto.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonCallisto.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(15.2F, 15.2F));
		CosmicHorizonsCore.jmoonCallisto.setRelativeOrbitTime(1 / 0.008F);
		CosmicHorizonsCore.jmoonCallisto.setTierRequired(5);
		CosmicHorizonsCore.jmoonCallisto.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/callisto.png"));
		
		CosmicHorizonsCore.jmoonThemisto = (Moon) new Moon("themisto");
		CosmicHorizonsCore.jmoonThemisto.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonThemisto.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonThemisto.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(22.5F, 22.5F));
		CosmicHorizonsCore.jmoonThemisto.setRelativeOrbitTime(1 / 0.004F);
		CosmicHorizonsCore.jmoonThemisto.setTierRequired(6);
		CosmicHorizonsCore.jmoonThemisto.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/themisto.png"));

		CosmicHorizonsCore.jmoonLeda = (Moon) new Moon("leda");
		CosmicHorizonsCore.jmoonLeda.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonLeda.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonLeda.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(31.5F, 31.5F));
		CosmicHorizonsCore.jmoonLeda.setRelativeOrbitTime(1 / 0.0034F);
		CosmicHorizonsCore.jmoonLeda.setTierRequired(3);
		CosmicHorizonsCore.jmoonLeda.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/leda.png"));

		CosmicHorizonsCore.jmoonHimalia = (Moon) new Moon("himalia");
		CosmicHorizonsCore.jmoonHimalia.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonHimalia.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonHimalia.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(32.5F, 32.5F));
		CosmicHorizonsCore.jmoonHimalia.setRelativeOrbitTime(1 / 0.0033F);
		CosmicHorizonsCore.jmoonHimalia.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonHimalia.setTierRequired(3);
		CosmicHorizonsCore.jmoonHimalia.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/himalia.png"));

		CosmicHorizonsCore.jmoonErsa = (Moon) new Moon("ersa");
		CosmicHorizonsCore.jmoonErsa.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonErsa.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonErsa.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(18.8F, 18.8F));
		CosmicHorizonsCore.jmoonErsa.setRelativeOrbitTime(1 / 0.0005F);
		CosmicHorizonsCore.jmoonErsa.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonErsa.setTierRequired(6);
		CosmicHorizonsCore.jmoonErsa.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/ersa.png"));

		CosmicHorizonsCore.jmoonPandia = (Moon) new Moon("pandia");
		CosmicHorizonsCore.jmoonPandia.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonPandia.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonPandia.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(19.7F, 19.7F));
		CosmicHorizonsCore.jmoonPandia.setRelativeOrbitTime(1 / 0.0005F);
		CosmicHorizonsCore.jmoonPandia.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonPandia.setTierRequired(6);
		CosmicHorizonsCore.jmoonPandia.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/pandia.png"));

		CosmicHorizonsCore.jmoonLysithea = (Moon) new Moon("lysithea");
		CosmicHorizonsCore.jmoonLysithea.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonLysithea.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonLysithea.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(33.75F, 33.75F));
		CosmicHorizonsCore.jmoonLysithea.setRelativeOrbitTime(1 / 0.00329F);
		CosmicHorizonsCore.jmoonLysithea.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonLysithea.setTierRequired(3);
		CosmicHorizonsCore.jmoonLysithea.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/lysithea.png"));

		CosmicHorizonsCore.jmoonElara = (Moon) new Moon("elara");
		CosmicHorizonsCore.jmoonElara.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonElara.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonElara.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(34F, 34F));
		CosmicHorizonsCore.jmoonElara.setRelativeOrbitTime(1 / 0.00327F);
		CosmicHorizonsCore.jmoonElara.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonElara.setTierRequired(3);
		CosmicHorizonsCore.jmoonElara.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/elara.png"));

		CosmicHorizonsCore.jmoonDia = (Moon) new Moon("dia");
		CosmicHorizonsCore.jmoonDia.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonDia.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonDia.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(22.4F, 22.4F));
		CosmicHorizonsCore.jmoonDia.setRelativeOrbitTime(1 / 0.00052F);
		CosmicHorizonsCore.jmoonDia.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonDia.setTierRequired(6);
		CosmicHorizonsCore.jmoonDia.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/dia.png"));

		CosmicHorizonsCore.jmoonCarpo = (Moon) new Moon("carpo");
		CosmicHorizonsCore.jmoonCarpo.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonCarpo.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonCarpo.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(23.3F, 23.3F));
		CosmicHorizonsCore.jmoonCarpo.setRelativeOrbitTime(1 / 0.00043F);
		CosmicHorizonsCore.jmoonCarpo.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonCarpo.setTierRequired(6);
		CosmicHorizonsCore.jmoonCarpo.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/carpo.png"));

		CosmicHorizonsCore.jmoonValetudo = (Moon) new Moon("valetudo");
		CosmicHorizonsCore.jmoonValetudo.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonValetudo.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonValetudo.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(24.2F, 24.2F));
		CosmicHorizonsCore.jmoonValetudo.setRelativeOrbitTime(1 / 0.00041F);
		CosmicHorizonsCore.jmoonValetudo.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonValetudo.setTierRequired(6);
		CosmicHorizonsCore.jmoonValetudo.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/valetudo.png"));
		
		CosmicHorizonsCore.umoonCordelia = (Moon) new Moon("cordelia");
		CosmicHorizonsCore.umoonCordelia.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonCordelia.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonCordelia.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(7.5F, 7.5F));
		CosmicHorizonsCore.umoonCordelia.setRelativeOrbitTime(1 / 0.09570F);
		CosmicHorizonsCore.umoonCordelia.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonCordelia.setTierRequired(8);
		CosmicHorizonsCore.umoonCordelia.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/cordelia.png"));
		
		CosmicHorizonsCore.umoonOphelia = (Moon) new Moon("ophelia");
		CosmicHorizonsCore.umoonOphelia.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonOphelia.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonOphelia.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(7.75F, 7.75F));
		CosmicHorizonsCore.umoonOphelia.setRelativeOrbitTime(1 / 0.00161F);
		CosmicHorizonsCore.umoonOphelia.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonOphelia.setTierRequired(8);
		CosmicHorizonsCore.umoonOphelia.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/ophelia.png"));
		
		CosmicHorizonsCore.umoonBianca = (Moon) new Moon("bianca");
		CosmicHorizonsCore.umoonBianca.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonBianca.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonBianca.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.15F, 8.15F));
		CosmicHorizonsCore.umoonBianca.setRelativeOrbitTime(1 / 0.00156F);
		CosmicHorizonsCore.umoonBianca.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonBianca.setTierRequired(8);
		CosmicHorizonsCore.umoonBianca.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/bianca.png"));
		
		CosmicHorizonsCore.umoonCressida = (Moon) new Moon("cressida");
		CosmicHorizonsCore.umoonCressida.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonCressida.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonCressida.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.5F, 8.5F));
		CosmicHorizonsCore.umoonCressida.setRelativeOrbitTime(1 / 0.00152F);
		CosmicHorizonsCore.umoonCressida.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonCressida.setTierRequired(8);
		CosmicHorizonsCore.umoonCressida.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/cressida.png"));

		CosmicHorizonsCore.umoonDesdemona = (Moon) new Moon("desdemona");
		CosmicHorizonsCore.umoonDesdemona.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonDesdemona.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonDesdemona.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.85F, 8.85F));
		CosmicHorizonsCore.umoonDesdemona.setRelativeOrbitTime(1 / 0.00147F);
		CosmicHorizonsCore.umoonDesdemona.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonDesdemona.setTierRequired(8);
		CosmicHorizonsCore.umoonDesdemona.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/desdemona.png"));

		CosmicHorizonsCore.umoonJuliet = (Moon) new Moon("juliet");
		CosmicHorizonsCore.umoonJuliet.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonJuliet.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonJuliet.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9.1F, 9.1F));
		CosmicHorizonsCore.umoonJuliet.setRelativeOrbitTime(1 / 0.00139F);
		CosmicHorizonsCore.umoonJuliet.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonJuliet.setTierRequired(8);
		CosmicHorizonsCore.umoonJuliet.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/juliet.png"));

		CosmicHorizonsCore.umoonPortia = (Moon) new Moon("portia");
		CosmicHorizonsCore.umoonPortia.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonPortia.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonPortia.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9.35F, 9.35F));
		CosmicHorizonsCore.umoonPortia.setRelativeOrbitTime(1 / 0.00130F);
		CosmicHorizonsCore.umoonPortia.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonPortia.setTierRequired(8);
		CosmicHorizonsCore.umoonPortia.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/portia.png"));

		CosmicHorizonsCore.umoonRosalind = (Moon) new Moon("rosalind");
		CosmicHorizonsCore.umoonRosalind.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonRosalind.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonRosalind.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9.6F, 9.6F));
		CosmicHorizonsCore.umoonRosalind.setRelativeOrbitTime(1 / 0.00123F);
		CosmicHorizonsCore.umoonRosalind.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonRosalind.setTierRequired(8);
		CosmicHorizonsCore.umoonRosalind.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/rosalind.png"));

		CosmicHorizonsCore.umoonCupid = (Moon) new Moon("cupid");
		CosmicHorizonsCore.umoonCupid.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonCupid.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonCupid.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9.85F, 9.85F));
		CosmicHorizonsCore.umoonCupid.setRelativeOrbitTime(1 / 0.00122F);
		CosmicHorizonsCore.umoonCupid.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonCupid.setTierRequired(8);
		CosmicHorizonsCore.umoonCupid.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/cupid.png"));

		CosmicHorizonsCore.umoonBelinda = (Moon) new Moon("belinda");
		CosmicHorizonsCore.umoonBelinda.setParentPlanet(	CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonBelinda.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonBelinda.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10.1F, 10.1F));
		CosmicHorizonsCore.umoonBelinda.setRelativeOrbitTime(1 / 0.00119F);
		CosmicHorizonsCore.umoonBelinda.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonBelinda.setTierRequired(8);
		CosmicHorizonsCore.umoonBelinda.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/belinda.png"));

		CosmicHorizonsCore.umoonPerdita = (Moon) new Moon("perdita");
		CosmicHorizonsCore.umoonPerdita.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonPerdita.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonPerdita.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10.4F, 10.4F));
		CosmicHorizonsCore.umoonPerdita.setRelativeOrbitTime(1 / 0.00117F);
		CosmicHorizonsCore.umoonPerdita.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonPerdita.setTierRequired(8);
		CosmicHorizonsCore.umoonPerdita.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/perdita.png"));

		CosmicHorizonsCore.umoonPuck = (Moon) new Moon("puck");
		CosmicHorizonsCore.umoonPuck.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonPuck.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonPuck.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(15.5F, 15.5F));
		CosmicHorizonsCore.umoonPuck.setRelativeOrbitTime(1 / 0.00109F);
		CosmicHorizonsCore.umoonPuck.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonPuck.setTierRequired(8);
		CosmicHorizonsCore.umoonPuck.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/puck.png"));

		CosmicHorizonsCore.umoonMab = (Moon) new Moon("mab");
		CosmicHorizonsCore.umoonMab.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonMab.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonMab.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(17F, 17F));
		CosmicHorizonsCore.umoonMab.setRelativeOrbitTime(1 / 0.0098F);
		CosmicHorizonsCore.umoonMab.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonMab.setTierRequired(8);
		CosmicHorizonsCore.umoonMab.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/mab.png"));

		CosmicHorizonsCore.umoonMiranda = (Moon) new Moon("miranda");
		CosmicHorizonsCore.umoonMiranda.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonMiranda.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonMiranda.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(14F, 14F));
		CosmicHorizonsCore.umoonMiranda.setRelativeOrbitTime(1 / 0.0071F);
		CosmicHorizonsCore.umoonMiranda.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonMiranda.setTierRequired(8);
		CosmicHorizonsCore.umoonMiranda.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/miranda.png"));

		CosmicHorizonsCore.umoonAriel = (Moon) new Moon("ariel");
		CosmicHorizonsCore.umoonAriel.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonAriel.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonAriel.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(25F, 25F));
		CosmicHorizonsCore.umoonAriel.setRelativeOrbitTime(1 / 0.0065F);
		CosmicHorizonsCore.umoonAriel.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonAriel.setTierRequired(8);
		CosmicHorizonsCore.umoonAriel.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/ariel.png"));

		CosmicHorizonsCore.umoonUmbriel = (Moon) new Moon("umbriel");
		CosmicHorizonsCore.umoonUmbriel.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonUmbriel.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonUmbriel.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(28F, 28F));
		CosmicHorizonsCore.umoonUmbriel.setRelativeOrbitTime(1 / 0.0064F);
		CosmicHorizonsCore.umoonUmbriel.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonUmbriel.setTierRequired(8);
		CosmicHorizonsCore.umoonUmbriel.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/umbriel.png"));

		CosmicHorizonsCore.umoonTitania = (Moon) new Moon("titania");
		CosmicHorizonsCore.umoonTitania.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonTitania.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonTitania.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(32F, 32F));
		CosmicHorizonsCore.umoonTitania.setRelativeOrbitTime(1 / 0.0062F);
		CosmicHorizonsCore.umoonTitania.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonTitania.setTierRequired(8);
		CosmicHorizonsCore.umoonTitania.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/titania.png"));

		CosmicHorizonsCore.umoonOberon = (Moon) new Moon("oberon");
		CosmicHorizonsCore.umoonOberon.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonOberon.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonOberon.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(36F, 36F));
		CosmicHorizonsCore.umoonOberon.setRelativeOrbitTime(1 / 0.0058F);
		CosmicHorizonsCore.umoonOberon.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonOberon.setTierRequired(8);
		CosmicHorizonsCore.umoonOberon.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/oberon.png"));

		CosmicHorizonsCore.umoonFrancisco = (Moon) new Moon("francisco");
		CosmicHorizonsCore.umoonFrancisco.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonFrancisco.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonFrancisco.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(42.95F, 42.95F));
		CosmicHorizonsCore.umoonFrancisco.setRelativeOrbitTime(1 / 0.00057F);
		CosmicHorizonsCore.umoonFrancisco.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonFrancisco.setTierRequired(8);
		CosmicHorizonsCore.umoonFrancisco.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/francisco.png"));

		CosmicHorizonsCore.umoonCaliban = (Moon) new Moon("caliban");
		CosmicHorizonsCore.umoonCaliban.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonCaliban.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonCaliban.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(45F, 45F));
		CosmicHorizonsCore.umoonCaliban.setRelativeOrbitTime(1 / 0.00052F);
		CosmicHorizonsCore.umoonCaliban.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonCaliban.setTierRequired(8);
		CosmicHorizonsCore.umoonCaliban.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/caliban.png"));

		CosmicHorizonsCore.umoonStephano = (Moon) new Moon("stephano");
		CosmicHorizonsCore.umoonStephano.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonStephano.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonStephano.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(46F, 46F));
		CosmicHorizonsCore.umoonStephano.setRelativeOrbitTime(1 / 0.00049F);
		CosmicHorizonsCore.umoonStephano.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonStephano.setTierRequired(8);
		CosmicHorizonsCore.umoonStephano.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/stephano.png"));

		CosmicHorizonsCore.umoonTrinculo = (Moon) new Moon("trinculo");
		CosmicHorizonsCore.umoonTrinculo.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonTrinculo.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonTrinculo.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(46.65F, 46.65F));
		CosmicHorizonsCore.umoonTrinculo.setRelativeOrbitTime(1 / 0.00047F);
		CosmicHorizonsCore.umoonTrinculo.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonTrinculo.setTierRequired(8);
		CosmicHorizonsCore.umoonTrinculo.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/trinculo.png"));

		CosmicHorizonsCore.umoonSycorax = (Moon) new Moon("sycorax");
		CosmicHorizonsCore.umoonSycorax.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonSycorax.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonSycorax.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(49F, 49F));
		CosmicHorizonsCore.umoonSycorax.setRelativeOrbitTime(1 / 0.00042F);
		CosmicHorizonsCore.umoonSycorax.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonSycorax.setTierRequired(8);
		CosmicHorizonsCore.umoonSycorax.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/sycorax.png"));

		CosmicHorizonsCore.umoonMargaret = (Moon) new Moon("margaret");
		CosmicHorizonsCore.umoonMargaret.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonMargaret.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonMargaret.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(51.25F, 51.25F));
		CosmicHorizonsCore.umoonMargaret.setRelativeOrbitTime(1 / 0.00039F);
		CosmicHorizonsCore.umoonMargaret.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonMargaret.setTierRequired(8);
		CosmicHorizonsCore.umoonMargaret.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/margaret.png"));

		CosmicHorizonsCore.umoonProspero = (Moon) new Moon("prospero");
		CosmicHorizonsCore.umoonProspero.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonProspero.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonProspero.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(53F, 53F));
		CosmicHorizonsCore.umoonProspero.setRelativeOrbitTime(1 / 0.00029F);
		CosmicHorizonsCore.umoonProspero.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonProspero.setTierRequired(8);
		CosmicHorizonsCore.umoonProspero.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/prospero.png"));

		CosmicHorizonsCore.umoonSetebos = (Moon) new Moon("setebos");
		CosmicHorizonsCore.umoonSetebos.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonSetebos.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonSetebos.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(53.85F, 53.85F));
		CosmicHorizonsCore.umoonSetebos.setRelativeOrbitTime(1 / 0.00024F);
		CosmicHorizonsCore.umoonSetebos.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonSetebos.setTierRequired(8);
		CosmicHorizonsCore.umoonSetebos.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/setebos.png"));

		CosmicHorizonsCore.umoonFerdinand = (Moon) new Moon("ferdinand");
		CosmicHorizonsCore.umoonFerdinand.setParentPlanet(CosmicHorizonsCore.Uranus);
		CosmicHorizonsCore.umoonFerdinand.setRelativeSize(0.2667F);
		CosmicHorizonsCore.umoonFerdinand.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(55.5F, 55.5F));
		CosmicHorizonsCore.umoonFerdinand.setRelativeOrbitTime(1 / 0.00022F);
		CosmicHorizonsCore.umoonFerdinand.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.umoonFerdinand.setTierRequired(8);
		CosmicHorizonsCore.umoonFerdinand.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/ferdinand.png"));
		
		CosmicHorizonsCore.jmoonEuporie = (Moon) new Moon("euporie");
		CosmicHorizonsCore.jmoonEuporie.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonEuporie.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonEuporie.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(25.1F, 25.1F));
		CosmicHorizonsCore.jmoonEuporie.setRelativeOrbitTime(1 / 0.00035F);
		CosmicHorizonsCore.jmoonEuporie.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonEuporie.setTierRequired(6);
		CosmicHorizonsCore.jmoonEuporie.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/euporie.png"));
		
		CosmicHorizonsCore.jmoonEupheme = (Moon) new Moon("eupheme");
		CosmicHorizonsCore.jmoonEupheme.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonEupheme.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonEupheme.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(26F, 26F));
		CosmicHorizonsCore.jmoonEupheme.setRelativeOrbitTime(1 / 0.00034F);
		CosmicHorizonsCore.jmoonEupheme.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonEupheme.setTierRequired(6);
		CosmicHorizonsCore.jmoonEupheme.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/eupheme.png"));
		
		CosmicHorizonsCore.jmoon22 = (Moon) new Moon("s2003j18");
		CosmicHorizonsCore.jmoon22.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon22.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon22.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(26.9F, 26.9F));
		CosmicHorizonsCore.jmoon22.setRelativeOrbitTime(1 / 0.00033F);
		CosmicHorizonsCore.jmoon22.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon22.setTierRequired(6);
		CosmicHorizonsCore.jmoon22.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLV.png"));
		
		CosmicHorizonsCore.jmoon23 = (Moon) new Moon("s2010j2");
		CosmicHorizonsCore.jmoon23.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon23.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon23.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(27.8F, 27.8F));
		CosmicHorizonsCore.jmoon23.setRelativeOrbitTime(1 / 0.00032F);
		CosmicHorizonsCore.jmoon23.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon23.setTierRequired(6);
		CosmicHorizonsCore.jmoon23.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLII.png"));
		
		CosmicHorizonsCore.jmoonThelxinoe = (Moon) new Moon("thelxinoe");
		CosmicHorizonsCore.jmoonThelxinoe.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonThelxinoe.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonThelxinoe.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(28.3F, 28.3F));
		CosmicHorizonsCore.jmoonThelxinoe.setRelativeOrbitTime(1 / 0.00031F);
		CosmicHorizonsCore.jmoonThelxinoe.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonThelxinoe.setTierRequired(6);
		CosmicHorizonsCore.jmoonThelxinoe.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/thelxinoe.png"));

		CosmicHorizonsCore.jmoonEuanthe = (Moon) new Moon("euanthe");
		CosmicHorizonsCore.jmoonEuanthe.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonEuanthe.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonEuanthe.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(28.5F, 28.5F));
		CosmicHorizonsCore.jmoonEuanthe.setRelativeOrbitTime(1 / 0.00030F);
		CosmicHorizonsCore.jmoonEuanthe.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonEuanthe.setTierRequired(6);
		CosmicHorizonsCore.jmoonEuanthe.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/euanthe.png"));

		CosmicHorizonsCore.jmoonHelike = (Moon) new Moon("helike");
		CosmicHorizonsCore.jmoonHelike.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonHelike.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonHelike.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(28.7F, 28.7F));
		CosmicHorizonsCore.jmoonHelike.setRelativeOrbitTime(1 / 0.00029F);
		CosmicHorizonsCore.jmoonHelike.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonHelike.setTierRequired(6);
		CosmicHorizonsCore.jmoonHelike.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/helike.png"));
		
		CosmicHorizonsCore.jmoonOrthosie = (Moon) new Moon("orthosie");
		CosmicHorizonsCore.jmoonOrthosie.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonOrthosie.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonOrthosie.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(28.8F, 28.8F));
		CosmicHorizonsCore.jmoonOrthosie.setRelativeOrbitTime(1 / 0.00028F);
		CosmicHorizonsCore.jmoonOrthosie.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonOrthosie.setTierRequired(6);
		CosmicHorizonsCore.jmoonOrthosie.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/orthosie.png"));
		
		CosmicHorizonsCore.jmoon28 = (Moon) new Moon("s2017j7");
		CosmicHorizonsCore.jmoon28.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon28.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon28.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(28.9F, 28.9F));
		CosmicHorizonsCore.jmoon28.setRelativeOrbitTime(1 / 0.00027F);
		CosmicHorizonsCore.jmoon28.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon28.setTierRequired(6);
		CosmicHorizonsCore.jmoon28.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLXVIII.png"));
		
		CosmicHorizonsCore.jmoon29 = (Moon) new Moon("s2016j1");
		CosmicHorizonsCore.jmoon29.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon29.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon29.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(29.1F, 29.1F));
		CosmicHorizonsCore.jmoon29.setRelativeOrbitTime(1 / 0.00026F);
		CosmicHorizonsCore.jmoon29.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon29.setTierRequired(6);
		CosmicHorizonsCore.jmoon29.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLIV.png"));
		
		CosmicHorizonsCore.jmoon30 = (Moon) new Moon("s2017j3");
		CosmicHorizonsCore.jmoon30.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon30.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon30.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(29.5F, 29.5F));
		CosmicHorizonsCore.jmoon30.setRelativeOrbitTime(1 / 0.00025F);
		CosmicHorizonsCore.jmoon30.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon30.setTierRequired(6);
		CosmicHorizonsCore.jmoon30.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLXIV.png"));
		
		CosmicHorizonsCore.jmoonIocaste = (Moon) new Moon("iocaste");
		CosmicHorizonsCore.jmoonIocaste.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonIocaste.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonIocaste.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(30.3F, 30.3F));
		CosmicHorizonsCore.jmoonIocaste.setRelativeOrbitTime(1 / 0.00024F);
		CosmicHorizonsCore.jmoonIocaste.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonIocaste.setTierRequired(6);
		CosmicHorizonsCore.jmoonIocaste.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/iocaste.png"));
		
		CosmicHorizonsCore.jmoonPraxidike = (Moon) new Moon("praxidike");
		CosmicHorizonsCore.jmoonPraxidike.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonPraxidike.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonPraxidike.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(30.9F, 30.9F));
		CosmicHorizonsCore.jmoonPraxidike.setRelativeOrbitTime(1 / 0.00023F);
		CosmicHorizonsCore.jmoonPraxidike.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonPraxidike.setTierRequired(6);
		CosmicHorizonsCore.jmoonPraxidike.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/praxidike.png"));
		
		CosmicHorizonsCore.jmoonHarpalyke = (Moon) new Moon("harpalyke");
		CosmicHorizonsCore.jmoonHarpalyke.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonHarpalyke.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonHarpalyke.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(31.7F, 31.7F));
		CosmicHorizonsCore.jmoonHarpalyke.setRelativeOrbitTime(1 / 0.00022F);
		CosmicHorizonsCore.jmoonHarpalyke.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonHarpalyke.setTierRequired(6);
		CosmicHorizonsCore.jmoonHarpalyke.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/harpalyke.png"));
		
		CosmicHorizonsCore.jmoonMneme = (Moon) new Moon("mneme");
		CosmicHorizonsCore.jmoonMneme.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonMneme.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonMneme.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(32F, 32F));
		CosmicHorizonsCore.jmoonMneme.setRelativeOrbitTime(1 / 0.00021F);
		CosmicHorizonsCore.jmoonMneme.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonMneme.setTierRequired(6);
		CosmicHorizonsCore.jmoonMneme.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/mneme.png"));
		
		CosmicHorizonsCore.jmoonHermippe = (Moon) new Moon("hermippe");
		CosmicHorizonsCore.jmoonHermippe.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonHermippe.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonHermippe.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(32.3F, 32.3F));
		CosmicHorizonsCore.jmoonHermippe.setRelativeOrbitTime(1 / 0.00020F);
		CosmicHorizonsCore.jmoonHermippe.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonHermippe.setTierRequired(6);
		CosmicHorizonsCore.jmoonHermippe.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/hermippe.png"));
		
		CosmicHorizonsCore.jmoonThyone = (Moon) new Moon("thyone");
		CosmicHorizonsCore.jmoonThyone.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonThyone.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonThyone.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(32.8F, 32.8F));
		CosmicHorizonsCore.jmoonThyone.setRelativeOrbitTime(1 / 0.00019F);
		CosmicHorizonsCore.jmoonThyone.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonThyone.setTierRequired(6);
		CosmicHorizonsCore.jmoonThyone.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/thyone.png"));
		
		CosmicHorizonsCore.jmoon38 = (Moon) new Moon("s2017j9");
		CosmicHorizonsCore.jmoon38.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon38.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon38.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(32.9F, 32.9F));
		CosmicHorizonsCore.jmoon38.setRelativeOrbitTime(1 / 0.00018F);
		CosmicHorizonsCore.jmoon38.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon38.setTierRequired(6);
		CosmicHorizonsCore.jmoon38.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLXX.png"));
		
		CosmicHorizonsCore.jmoonAnanke = (Moon) new Moon("ananke");
		CosmicHorizonsCore.jmoonAnanke.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonAnanke.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonAnanke.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(39F, 39F));
		CosmicHorizonsCore.jmoonAnanke.setRelativeOrbitTime(1 / 0.00017F);
		CosmicHorizonsCore.jmoonAnanke.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonAnanke.setTierRequired(3);
		CosmicHorizonsCore.jmoonAnanke.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/ananke.png"));
		
		CosmicHorizonsCore.jmoonHerse = (Moon) new Moon("herse");
		CosmicHorizonsCore.jmoonHerse.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonHerse.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonHerse.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(33.9F, 33.9F));
		CosmicHorizonsCore.jmoonHerse.setRelativeOrbitTime(1 / 0.00016F);
		CosmicHorizonsCore.jmoonHerse.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonHerse.setTierRequired(6);
		CosmicHorizonsCore.jmoonHerse.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/herse.png"));
		
		CosmicHorizonsCore.jmoonAitne = (Moon) new Moon("aitne");
		CosmicHorizonsCore.jmoonAitne.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonAitne.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonAitne.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(34.1F, 34.1F));
		CosmicHorizonsCore.jmoonAitne.setRelativeOrbitTime(1 / 0.00015F);
		CosmicHorizonsCore.jmoonAitne.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonAitne.setTierRequired(6);
		CosmicHorizonsCore.jmoonAitne.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/aitne.png"));
		
		CosmicHorizonsCore.jmoon42 = (Moon) new Moon("s2017j6");
		CosmicHorizonsCore.jmoon42.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon42.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon42.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(34.3F, 34.3F));
		CosmicHorizonsCore.jmoon42.setRelativeOrbitTime(1 / 0.00014F);
		CosmicHorizonsCore.jmoon42.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon42.setTierRequired(6);
		CosmicHorizonsCore.jmoon42.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLXVII.png"));
		
		CosmicHorizonsCore.jmoon43 = (Moon) new Moon("s2011j1");
		CosmicHorizonsCore.jmoon43.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon43.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon43.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(34.4F, 34.4F));
		CosmicHorizonsCore.jmoon43.setRelativeOrbitTime(1 / 0.00013F);
		CosmicHorizonsCore.jmoon43.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon43.setTierRequired(6);
		CosmicHorizonsCore.jmoon43.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLXXII.png"));
		
		CosmicHorizonsCore.jmoonKale = (Moon) new Moon("kale");
		CosmicHorizonsCore.jmoonKale.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonKale.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonKale.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(34.5F, 34.5F));
		CosmicHorizonsCore.jmoonKale.setRelativeOrbitTime(1 / 0.00012F);
		CosmicHorizonsCore.jmoonKale.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonKale.setTierRequired(6);
		CosmicHorizonsCore.jmoonKale.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/kale.png"));
		
		CosmicHorizonsCore.jmoonTaygete = (Moon) new Moon("taygete");
		CosmicHorizonsCore.jmoonTaygete.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonTaygete.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonTaygete.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(34.7F, 34.7F));
		CosmicHorizonsCore.jmoonTaygete.setRelativeOrbitTime(1 / 0.00011F);
		CosmicHorizonsCore.jmoonTaygete.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonTaygete.setTierRequired(6);
		CosmicHorizonsCore.jmoonTaygete.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/taygete.png"));
		
		CosmicHorizonsCore.jmoon46 = (Moon) new Moon("s2003j19");
		CosmicHorizonsCore.jmoon46.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon46.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon46.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(35.3F, 35.3F));
		CosmicHorizonsCore.jmoon46.setRelativeOrbitTime(1 / 0.00010F);
		CosmicHorizonsCore.jmoon46.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon46.setTierRequired(6);
		CosmicHorizonsCore.jmoon46.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLXI.png"));
		
		CosmicHorizonsCore.jmoonChaldene = (Moon) new Moon("chaldene");
		CosmicHorizonsCore.jmoonChaldene.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonChaldene.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonChaldene.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(35.5F, 35.5F));
		CosmicHorizonsCore.jmoonChaldene.setRelativeOrbitTime(1 / 0.00009F);
		CosmicHorizonsCore.jmoonChaldene.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonChaldene.setTierRequired(6);
		CosmicHorizonsCore.jmoonChaldene.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/chaldene.png"));
		
		CosmicHorizonsCore.jmoonPhilophrosyne = (Moon) new Moon("philophrosyne");
		CosmicHorizonsCore.jmoonPhilophrosyne.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonPhilophrosyne.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonPhilophrosyne.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(35.6F, 35.6F));
		CosmicHorizonsCore.jmoonPhilophrosyne.setRelativeOrbitTime(1 / 0.00008F);
		CosmicHorizonsCore.jmoonPhilophrosyne.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonPhilophrosyne.setTierRequired(6);
		CosmicHorizonsCore.jmoonPhilophrosyne.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/philophrosyne.png"));
		
		CosmicHorizonsCore.jmoonErinome = (Moon) new Moon("erinome");
		CosmicHorizonsCore.jmoonErinome.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonErinome.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonErinome.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(36.4F, 36.4F));
		CosmicHorizonsCore.jmoonErinome.setRelativeOrbitTime(1 / 0.00007F);
		CosmicHorizonsCore.jmoonErinome.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonErinome.setTierRequired(6);
		CosmicHorizonsCore.jmoonErinome.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/erinome.png"));
		
		CosmicHorizonsCore.jmoonAoede = (Moon) new Moon("aoede");
		CosmicHorizonsCore.jmoonAoede.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonAoede.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonAoede.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(36.6F, 36.6F));
		CosmicHorizonsCore.jmoonAoede.setRelativeOrbitTime(1 / 0.00006F);
		CosmicHorizonsCore.jmoonAoede.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonAoede.setTierRequired(6);
		CosmicHorizonsCore.jmoonAoede.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/aoede.png"));
		
		CosmicHorizonsCore.jmoonKallichore = (Moon) new Moon("kallichore");
		CosmicHorizonsCore.jmoonKallichore.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonKallichore.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonKallichore.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(36.8F, 36.8F));
		CosmicHorizonsCore.jmoonKallichore.setRelativeOrbitTime(1 / 0.00005F);
		CosmicHorizonsCore.jmoonKallichore.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonKallichore.setTierRequired(6);
		CosmicHorizonsCore.jmoonKallichore.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/kallichore.png"));
		
		CosmicHorizonsCore.jmoon54 = (Moon) new Moon("s2017j5");
		CosmicHorizonsCore.jmoon54.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon54.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon54.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(37F, 37F));
		CosmicHorizonsCore.jmoon54.setRelativeOrbitTime(1 / 0.00004F);
		CosmicHorizonsCore.jmoon54.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon54.setTierRequired(6);
		CosmicHorizonsCore.jmoon54.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLXVI.png"));
		
		CosmicHorizonsCore.jmoon55 = (Moon) new Moon("s2017j8");
		CosmicHorizonsCore.jmoon55.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon55.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon55.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(37.1F, 37.1F));
		CosmicHorizonsCore.jmoon55.setRelativeOrbitTime(1 / 0.00003F);
		CosmicHorizonsCore.jmoon55.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon55.setTierRequired(6);
		CosmicHorizonsCore.jmoon55.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLXIX.png"));

		CosmicHorizonsCore.jmoonKalyke = (Moon) new Moon("kalyke");
		CosmicHorizonsCore.jmoonKalyke.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonKalyke.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonKalyke.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(37.2F, 37.2F));
		CosmicHorizonsCore.jmoonKalyke.setRelativeOrbitTime(1 / 0.00002F);
		CosmicHorizonsCore.jmoonKalyke.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonKalyke.setTierRequired(6);
		CosmicHorizonsCore.jmoonKalyke.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/kalyke.png"));
		
		CosmicHorizonsCore.jmoonCarme = (Moon) new Moon("carme");
		CosmicHorizonsCore.jmoonCarme.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonCarme.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonCarme.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(41.25F, 41.25F));
		CosmicHorizonsCore.jmoonCarme.setRelativeOrbitTime(1 / 0.00001F);
		CosmicHorizonsCore.jmoonCarme.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonCarme.setTierRequired(3);
		CosmicHorizonsCore.jmoonCarme.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/carme.png"));
		
		CosmicHorizonsCore.jmoonCallirrhoe = (Moon) new Moon("callirrhoe");
		CosmicHorizonsCore.jmoonCallirrhoe.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonCallirrhoe.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonCallirrhoe.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(44F, 44F));
		CosmicHorizonsCore.jmoonCallirrhoe.setRelativeOrbitTime(1 / 0.00141F);
		CosmicHorizonsCore.jmoonCallirrhoe.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonCallirrhoe.setTierRequired(3);
		CosmicHorizonsCore.jmoonCallirrhoe.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/callirrhoe.png"));
		
		CosmicHorizonsCore.jmoonEurydome = (Moon) new Moon("eurydome");
		CosmicHorizonsCore.jmoonEurydome.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonEurydome.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonEurydome.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(37.7F, 37.7F));
		CosmicHorizonsCore.jmoonEurydome.setRelativeOrbitTime(1 / 0.00121F);
		CosmicHorizonsCore.jmoonEurydome.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonEurydome.setTierRequired(6);
		CosmicHorizonsCore.jmoonEurydome.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/eurydome.png"));
		
		CosmicHorizonsCore.jmoon60 = (Moon) new Moon("s2017j2");
		CosmicHorizonsCore.jmoon60.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon60.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon60.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(37.8F, 37.8F));
		CosmicHorizonsCore.jmoon60.setRelativeOrbitTime(1 / 0.00151F);
		CosmicHorizonsCore.jmoon60.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon60.setTierRequired(6);
		CosmicHorizonsCore.jmoon60.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLXIII.png"));
		
		CosmicHorizonsCore.jmoonPasithee = (Moon) new Moon("pasithee");
		CosmicHorizonsCore.jmoonPasithee.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonPasithee.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonPasithee.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(38.1F, 38.1F));
		CosmicHorizonsCore.jmoonPasithee.setRelativeOrbitTime(1 / 0.00099F);
		CosmicHorizonsCore.jmoonPasithee.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonPasithee.setTierRequired(6);
		CosmicHorizonsCore.jmoonPasithee.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/pasithee.png"));
		
		CosmicHorizonsCore.jmoon62 = (Moon) new Moon("s2010j1");
		CosmicHorizonsCore.jmoon62.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon62.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon62.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(38.2F, 38.2F));
		CosmicHorizonsCore.jmoon62.setRelativeOrbitTime(1 / 0.00083F);
		CosmicHorizonsCore.jmoon62.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon62.setTierRequired(6);
		CosmicHorizonsCore.jmoon62.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLI.png"));
		
		CosmicHorizonsCore.jmoonKore = (Moon) new Moon("kore");
		CosmicHorizonsCore.jmoonKore.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonKore.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonKore.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(38.4F, 38.4F));
		CosmicHorizonsCore.jmoonKore.setRelativeOrbitTime(1 / 0.00071F);
		CosmicHorizonsCore.jmoonKore.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonKore.setTierRequired(6);
		CosmicHorizonsCore.jmoonKore.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/kore.png"));
		
		CosmicHorizonsCore.jmoonCyllene = (Moon) new Moon("cyllene");
		CosmicHorizonsCore.jmoonCyllene.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonCyllene.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonCyllene.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(38.6F, 38.6F));
		CosmicHorizonsCore.jmoonCyllene.setRelativeOrbitTime(1 / 0.00066F);
		CosmicHorizonsCore.jmoonCyllene.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonCyllene.setTierRequired(6);
		CosmicHorizonsCore.jmoonCyllene.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/cyllene.png"));
		
		CosmicHorizonsCore.jmoon65 = (Moon) new Moon("s2011j2");
		CosmicHorizonsCore.jmoon65.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon65.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon65.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(38.7F, 38.7F));
		CosmicHorizonsCore.jmoon65.setRelativeOrbitTime(1 / 0.00052F);
		CosmicHorizonsCore.jmoon65.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon65.setTierRequired(6);
		CosmicHorizonsCore.jmoon65.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLVI.png"));
		
		CosmicHorizonsCore.jmoonEukelade = (Moon) new Moon("eukelade");
		CosmicHorizonsCore.jmoonEukelade.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonEukelade.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonEukelade.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(39F, 39F));
		CosmicHorizonsCore.jmoonEukelade.setRelativeOrbitTime(1 / 0.00051F);
		CosmicHorizonsCore.jmoonEukelade.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonEukelade.setTierRequired(6);
		CosmicHorizonsCore.jmoonEukelade.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/eukelade.png"));
		
		CosmicHorizonsCore.jmoon67 = (Moon) new Moon("s2017j1");
		CosmicHorizonsCore.jmoon67.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoon67.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoon67.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(39.01F, 39.01F));
		CosmicHorizonsCore.jmoon67.setRelativeOrbitTime(1 / 0.00058F);
		CosmicHorizonsCore.jmoon67.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoon67.setTierRequired(6);
		CosmicHorizonsCore.jmoon67.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jupiterLIX.png"));
		
		CosmicHorizonsCore.jmoonPasiphae = (Moon) new Moon("pasiphae");
		CosmicHorizonsCore.jmoonPasiphae.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonPasiphae.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonPasiphae.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(41.75F, 41.75F));
		CosmicHorizonsCore.jmoonPasiphae.setRelativeOrbitTime(1 / 0.00060F);
		CosmicHorizonsCore.jmoonPasiphae.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonPasiphae.setTierRequired(3);
		CosmicHorizonsCore.jmoonPasiphae.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/pasiphae.png"));
		
		CosmicHorizonsCore.jmoonHegemone = (Moon) new Moon("hegemone");
		CosmicHorizonsCore.jmoonHegemone.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonHegemone.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonHegemone.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(39.9F, 39.9F));
		CosmicHorizonsCore.jmoonHegemone.setRelativeOrbitTime(1 / 0.00063F);
		CosmicHorizonsCore.jmoonHegemone.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonHegemone.setTierRequired(6);
		CosmicHorizonsCore.jmoonHegemone.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/hegemone.png"));
		
		CosmicHorizonsCore.jmoonArche = (Moon) new Moon("arche");
		CosmicHorizonsCore.jmoonArche.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonArche.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonArche.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(40F, 40F));
		CosmicHorizonsCore.jmoonArche.setRelativeOrbitTime(1 / 0.00067F);
		CosmicHorizonsCore.jmoonArche.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonArche.setTierRequired(6);
		CosmicHorizonsCore.jmoonArche.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/arche.png"));
		
		CosmicHorizonsCore.jmoonIsonoe = (Moon) new Moon("isonoe");
		CosmicHorizonsCore.jmoonIsonoe.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonIsonoe.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonIsonoe.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(40.3F, 40.3F));
		CosmicHorizonsCore.jmoonIsonoe.setRelativeOrbitTime(1 / 0.00068F);
		CosmicHorizonsCore.jmoonIsonoe.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonIsonoe.setTierRequired(6);
		CosmicHorizonsCore.jmoonIsonoe.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/isonoe.png"));
		
		CosmicHorizonsCore.jmoonEirene = (Moon) new Moon("eirene");
		CosmicHorizonsCore.jmoonEirene.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonEirene.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonEirene.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(41F, 41F));
		CosmicHorizonsCore.jmoonEirene.setRelativeOrbitTime(1 / 0.00071F);
		CosmicHorizonsCore.jmoonEirene.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonEirene.setTierRequired(6);
		CosmicHorizonsCore.jmoonEirene.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/eirene.png"));
		
		CosmicHorizonsCore.jmoonSinope = (Moon) new Moon("sinope");
		CosmicHorizonsCore.jmoonSinope.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonSinope.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonSinope.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(44.5F, 44.5F));
		CosmicHorizonsCore.jmoonSinope.setRelativeOrbitTime(1 / 0.000712F);
		CosmicHorizonsCore.jmoonSinope.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonSinope.setTierRequired(3);
		CosmicHorizonsCore.jmoonSinope.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/sinope.png"));
		
		CosmicHorizonsCore.jmoonSponde = (Moon) new Moon("sponde");
		CosmicHorizonsCore.jmoonSponde.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonSponde.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonSponde.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(42F, 42F));
		CosmicHorizonsCore.jmoonSponde.setRelativeOrbitTime(1 / 0.00011F);
		CosmicHorizonsCore.jmoonSponde.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonSponde.setTierRequired(6);
		CosmicHorizonsCore.jmoonSponde.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/sponde.png"));
		
		CosmicHorizonsCore.jmoonAutonoe = (Moon) new Moon("autonoe");
		CosmicHorizonsCore.jmoonAutonoe.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonAutonoe.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonAutonoe.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(42.1F, 42.1F));
		CosmicHorizonsCore.jmoonAutonoe.setRelativeOrbitTime(1 / 0.00031F);
		CosmicHorizonsCore.jmoonAutonoe.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonAutonoe.setTierRequired(6);
		CosmicHorizonsCore.jmoonAutonoe.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/autonoe.png"));
		
		CosmicHorizonsCore.jmoonMegaclite = (Moon) new Moon("megaclite");
		CosmicHorizonsCore.jmoonMegaclite.setParentPlanet(CosmicHorizonsCore.Jupiter);
		CosmicHorizonsCore.jmoonMegaclite.setRelativeSize(0.2667F);
		CosmicHorizonsCore.jmoonMegaclite.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(43.5F, 43.5F));
		CosmicHorizonsCore.jmoonMegaclite.setRelativeOrbitTime(1 / 0.0000001F);
		CosmicHorizonsCore.jmoonMegaclite.setPhaseShift((float) (Math.random() * (2 * Math.PI)));
		CosmicHorizonsCore.jmoonMegaclite.setTierRequired(6);
		CosmicHorizonsCore.jmoonMegaclite.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/megaclite.png"));
		
		//Moons of Saturn
		CosmicHorizonsCore.smoon1 = (Moon) new Moon("s2009s1");
		CosmicHorizonsCore.smoon1.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoon1.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoon1.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5F, 5F));
		CosmicHorizonsCore.smoon1.setRelativeOrbitTime(1 / 0.031F);
		CosmicHorizonsCore.smoon1.setTierRequired(7);
		CosmicHorizonsCore.smoon1.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/saturn1.png"));
		
		CosmicHorizonsCore.smoonMoonlets = (Moon) new Moon("moonlets");
		CosmicHorizonsCore.smoonMoonlets.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonMoonlets.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonMoonlets.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.39F, 5.39F));
		CosmicHorizonsCore.smoonMoonlets.setRelativeOrbitTime(1 / 0.031F);
		CosmicHorizonsCore.smoonMoonlets.setTierRequired(7);
		CosmicHorizonsCore.smoonMoonlets.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/moonlets.png"));
		
		CosmicHorizonsCore.smoonPan = (Moon) new Moon("pan");
		CosmicHorizonsCore.smoonPan.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonPan.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonPan.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6.2F, 6.2F));
		CosmicHorizonsCore.smoonPan.setRelativeOrbitTime(1 / 0.032F);
		CosmicHorizonsCore.smoonPan.setTierRequired(7);
		CosmicHorizonsCore.smoonPan.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/pan.png"));
		
		CosmicHorizonsCore.smoonDaphnis = (Moon) new Moon("daphnis");
		CosmicHorizonsCore.smoonDaphnis.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonDaphnis.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonDaphnis.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6.25F, 6.25F));
		CosmicHorizonsCore.smoonDaphnis.setRelativeOrbitTime(1 / 0.035F);
		CosmicHorizonsCore.smoonDaphnis.setTierRequired(7);
		CosmicHorizonsCore.smoonDaphnis.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/daphnis.png"));
		
		CosmicHorizonsCore.smoonAtlas = (Moon) new Moon("atlas");
		CosmicHorizonsCore.smoonAtlas.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonAtlas.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonAtlas.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6.3F, 6.3F));
		CosmicHorizonsCore.smoonAtlas.setRelativeOrbitTime(1 / 0.030F);
		CosmicHorizonsCore.smoonAtlas.setTierRequired(7);
		CosmicHorizonsCore.smoonAtlas.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/atlas.png"));
		
		CosmicHorizonsCore.smoonPrometheus = (Moon) new Moon("prometheus");
		CosmicHorizonsCore.smoonPrometheus.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonPrometheus.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonPrometheus.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6.4F, 6.4F));
		CosmicHorizonsCore.smoonPrometheus.setRelativeOrbitTime(1 / 0.029F);
		CosmicHorizonsCore.smoonPrometheus.setTierRequired(7);
		CosmicHorizonsCore.smoonPrometheus.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/prometheus.png"));
		
		CosmicHorizonsCore.smoonPandora = (Moon) new Moon("pandora");
		CosmicHorizonsCore.smoonPandora.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonPandora.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonPandora.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6.45F, 6.45F));
		CosmicHorizonsCore.smoonPandora.setRelativeOrbitTime(1 / 0.028F);
		CosmicHorizonsCore.smoonPandora.setTierRequired(7);
		CosmicHorizonsCore.smoonPandora.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/pandora.png"));
		
		CosmicHorizonsCore.smoonEpimetheus = (Moon) new Moon("epimetheus");
		CosmicHorizonsCore.smoonEpimetheus.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonEpimetheus.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonEpimetheus.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6.6F, 6.6F));
		CosmicHorizonsCore.smoonEpimetheus.setRelativeOrbitTime(1 / 0.027F);
		CosmicHorizonsCore.smoonEpimetheus.setTierRequired(7);
		CosmicHorizonsCore.smoonEpimetheus.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/epimetheus.png"));
		
		CosmicHorizonsCore.smoonJanus = (Moon) new Moon("janus");
		CosmicHorizonsCore.smoonJanus.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonJanus.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonJanus.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6.6F, 6.6F));
		CosmicHorizonsCore.smoonJanus.setRelativeOrbitTime(1 / 0.026F);
		CosmicHorizonsCore.smoonJanus.setTierRequired(7);
		CosmicHorizonsCore.smoonJanus.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/janus.png"));
		
		CosmicHorizonsCore.smoonAegaeon = (Moon) new Moon("aegaeon");
		CosmicHorizonsCore.smoonAegaeon.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonAegaeon.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonAegaeon.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6.7F, 6.7F));
		CosmicHorizonsCore.smoonAegaeon.setRelativeOrbitTime(1 / 0.025F);
		CosmicHorizonsCore.smoonAegaeon.setTierRequired(7);
		CosmicHorizonsCore.smoonAegaeon.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/aegaeon.png"));
		
		CosmicHorizonsCore.smoonMimas = (Moon) new Moon("mimas");
		CosmicHorizonsCore.smoonMimas.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonMimas.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonMimas.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6.9F, 6.9F));
		CosmicHorizonsCore.smoonMimas.setRelativeOrbitTime(1 / 0.024F);
		CosmicHorizonsCore.smoonMimas.setTierRequired(7);
		CosmicHorizonsCore.smoonMimas.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/mimas.png"));
		
		CosmicHorizonsCore.smoonMethone = (Moon) new Moon("methone");
		CosmicHorizonsCore.smoonMethone.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonMethone.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonMethone.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(7F, 7F));
		CosmicHorizonsCore.smoonMethone.setRelativeOrbitTime(1 / 0.023F);
		CosmicHorizonsCore.smoonMethone.setTierRequired(7);
		CosmicHorizonsCore.smoonMethone.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/methone.png"));
		
		CosmicHorizonsCore.smoonAnthe = (Moon) new Moon("anthe");
		CosmicHorizonsCore.smoonAnthe.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonAnthe.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonAnthe.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(7.5F, 7.5F));
		CosmicHorizonsCore.smoonAnthe.setRelativeOrbitTime(1 / 0.022F);
		CosmicHorizonsCore.smoonAnthe.setTierRequired(7);
		CosmicHorizonsCore.smoonAnthe.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/anthe.png"));
		
		CosmicHorizonsCore.smoonPallene = (Moon) new Moon("pallene");
		CosmicHorizonsCore.smoonPallene.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonPallene.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonPallene.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(7.7F, 7.7F));
		CosmicHorizonsCore.smoonPallene.setRelativeOrbitTime(1 / 0.021F);
		CosmicHorizonsCore.smoonPallene.setTierRequired(7);
		CosmicHorizonsCore.smoonPallene.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/pallene.png"));
		
		CosmicHorizonsCore.smoonEnceladus = (Moon) new Moon("enceladus");
		CosmicHorizonsCore.smoonEnceladus.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonEnceladus.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonEnceladus.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8F, 8F));
		CosmicHorizonsCore.smoonEnceladus.setRelativeOrbitTime(1 / 0.020F);
		CosmicHorizonsCore.smoonEnceladus.setTierRequired(7);
		CosmicHorizonsCore.smoonEnceladus.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/enceladus.png"));
		
		CosmicHorizonsCore.smoonTethys = (Moon) new Moon("tethys");
		CosmicHorizonsCore.smoonTethys.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonTethys.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonTethys.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.3F, 8.3F));
		CosmicHorizonsCore.smoonTethys.setRelativeOrbitTime(1 / 0.019F);
		CosmicHorizonsCore.smoonTethys.setTierRequired(7);
		CosmicHorizonsCore.smoonTethys.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/tethys.png"));
		
		CosmicHorizonsCore.smoonTelesto = (Moon) new Moon("telesto");
		CosmicHorizonsCore.smoonTelesto.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonTelesto.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonTelesto.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.3F, 8.3F));
		CosmicHorizonsCore.smoonTelesto.setRelativeOrbitTime(1 / 0.018F);
		CosmicHorizonsCore.smoonTelesto.setTierRequired(7);
		CosmicHorizonsCore.smoonTelesto.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/telesto.png"));
		
		CosmicHorizonsCore.smoonCalypso = (Moon) new Moon("calypso");
		CosmicHorizonsCore.smoonCalypso.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonCalypso.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonCalypso.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.3F, 8.3F));
		CosmicHorizonsCore.smoonCalypso.setRelativeOrbitTime(1 / 0.017F);
		CosmicHorizonsCore.smoonCalypso.setTierRequired(7);
		CosmicHorizonsCore.smoonCalypso.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/calypso.png"));
		
		CosmicHorizonsCore.smoonDione = (Moon) new Moon("dione");
		CosmicHorizonsCore.smoonDione.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonDione.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonDione.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9F, 9F));
		CosmicHorizonsCore.smoonDione.setRelativeOrbitTime(1 / 0.016F);
		CosmicHorizonsCore.smoonDione.setTierRequired(7);
		CosmicHorizonsCore.smoonDione.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/dione.png"));
		
		CosmicHorizonsCore.smoonHelene = (Moon) new Moon("helene");
		CosmicHorizonsCore.smoonHelene.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonHelene.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonHelene.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9F, 9F));
		CosmicHorizonsCore.smoonHelene.setRelativeOrbitTime(1 / 0.015F);
		CosmicHorizonsCore.smoonHelene.setTierRequired(7);
		CosmicHorizonsCore.smoonHelene.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/helene.png"));
		
		CosmicHorizonsCore.smoonPolydeuces = (Moon) new Moon("polydeuces");
		CosmicHorizonsCore.smoonPolydeuces.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonPolydeuces.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonPolydeuces.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9F, 9F));
		CosmicHorizonsCore.smoonPolydeuces.setRelativeOrbitTime(1 / 0.014F);
		CosmicHorizonsCore.smoonPolydeuces.setTierRequired(7);
		CosmicHorizonsCore.smoonPolydeuces.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/polydeuces.png"));
		
		CosmicHorizonsCore.smoonRhea = (Moon) new Moon("rhea");
		CosmicHorizonsCore.smoonRhea.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonRhea.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonRhea.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10.2F, 10.2F));
		CosmicHorizonsCore.smoonRhea.setRelativeOrbitTime(1 / 0.013F);
		CosmicHorizonsCore.smoonRhea.setTierRequired(7);
		CosmicHorizonsCore.smoonRhea.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/rhea.png"));
		
		CosmicHorizonsCore.smoonTitan = (Moon) new Moon("titan");
		CosmicHorizonsCore.smoonTitan.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonTitan.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonTitan.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(16F, 16F));
		CosmicHorizonsCore.smoonTitan.setRelativeOrbitTime(1 / 0.012F);
		CosmicHorizonsCore.smoonTitan.setTierRequired(7);
		CosmicHorizonsCore.smoonTitan.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/titan.png"));
		
		//////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////
		///////////////////////// SPECIAL //////////////////////////
		///////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////
		CosmicHorizonsCore.sspecialThemis = (Moon) new Moon("themis");
		CosmicHorizonsCore.sspecialThemis.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.sspecialThemis.setRelativeSize(0.2667F);
		CosmicHorizonsCore.sspecialThemis.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(17F, 17F));
		CosmicHorizonsCore.sspecialThemis.setRelativeOrbitTime(1 / 0.0115F);
//     	CosmicHorizonsCore.sspecialThemis.setDimensionInfo(52, WorldProviderThemis.class);
		CosmicHorizonsCore.sspecialThemis.setTierRequired(3);
		CosmicHorizonsCore.sspecialThemis.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/themis.png"));
        //////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////
        ///////////////////////// SPECIAL //////////////////////////
        ///////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////
		
		CosmicHorizonsCore.smoonHyperion = (Moon) new Moon("hyperion");
		CosmicHorizonsCore.smoonHyperion.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonHyperion.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonHyperion.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(17.5F, 17.5F));
		CosmicHorizonsCore.smoonHyperion.setRelativeOrbitTime(1 / 0.011F);
		CosmicHorizonsCore.smoonHyperion.setTierRequired(7);
		CosmicHorizonsCore.smoonHyperion.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/hyperion.png"));
		
		CosmicHorizonsCore.smoonIapetus = (Moon) new Moon("iapetus");
		CosmicHorizonsCore.smoonIapetus.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonIapetus.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonIapetus.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(27F, 27F));
		CosmicHorizonsCore.smoonIapetus.setRelativeOrbitTime(1 / 0.010F);
		CosmicHorizonsCore.smoonIapetus.setTierRequired(7);
		CosmicHorizonsCore.smoonIapetus.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/iapetus.png"));
		
		CosmicHorizonsCore.smoonKiviuq = (Moon) new Moon("kiviuq");
		CosmicHorizonsCore.smoonKiviuq.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonKiviuq.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonKiviuq.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(45F, 45F));
		CosmicHorizonsCore.smoonKiviuq.setRelativeOrbitTime(1 / 0.009F);
		CosmicHorizonsCore.smoonKiviuq.setTierRequired(7);
		CosmicHorizonsCore.smoonKiviuq.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/kiviuq.png"));
		
		CosmicHorizonsCore.smoonIjiraq = (Moon) new Moon("ijiraq");
		CosmicHorizonsCore.smoonIjiraq.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonIjiraq.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonIjiraq.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(48F, 48F));
		CosmicHorizonsCore.smoonIjiraq.setRelativeOrbitTime(1 / 0.008F);
		CosmicHorizonsCore.smoonIjiraq.setTierRequired(7);
		CosmicHorizonsCore.smoonIjiraq.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/ijiraq.png"));
		
		CosmicHorizonsCore.smoonPhoebe = (Moon) new Moon("phoebe");
		CosmicHorizonsCore.smoonPhoebe.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonPhoebe.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonPhoebe.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(51F, 51F));
		CosmicHorizonsCore.smoonPhoebe.setRelativeOrbitTime(1 / 0.007F);
		CosmicHorizonsCore.smoonPhoebe.setTierRequired(7);
		CosmicHorizonsCore.smoonPhoebe.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/phoebe.png"));
		
		CosmicHorizonsCore.smoonPaaliaq = (Moon) new Moon("paaliaq");
		CosmicHorizonsCore.smoonPaaliaq.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonPaaliaq.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonPaaliaq.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(59F, 59F));
		CosmicHorizonsCore.smoonPaaliaq.setRelativeOrbitTime(1 / 0.006F);
		CosmicHorizonsCore.smoonPaaliaq.setTierRequired(7);
		CosmicHorizonsCore.smoonPaaliaq.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/paaliaq.png"));
		
		CosmicHorizonsCore.smoonSkathi = (Moon) new Moon("skathi");
		CosmicHorizonsCore.smoonSkathi.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonSkathi.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonSkathi.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(61F, 1F));
		CosmicHorizonsCore.smoonSkathi.setRelativeOrbitTime(1 / 0.005F);
		CosmicHorizonsCore.smoonSkathi.setTierRequired(7);
		CosmicHorizonsCore.smoonSkathi.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/skathi.png"));
		
		CosmicHorizonsCore.smoonAlbiorix = (Moon) new Moon("albiorix");
		CosmicHorizonsCore.smoonAlbiorix.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonAlbiorix.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonAlbiorix.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(63.5F, 63.5F));
		CosmicHorizonsCore.smoonAlbiorix.setRelativeOrbitTime(1 / 0.004F);
		CosmicHorizonsCore.smoonAlbiorix.setTierRequired(7);
		CosmicHorizonsCore.smoonAlbiorix.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/albiorix.png"));
				
		CosmicHorizonsCore.smoonBebhionn = (Moon) new Moon("bebhionn");
		CosmicHorizonsCore.smoonBebhionn.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonBebhionn.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonBebhionn.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(68.5F, 68.5F));
		CosmicHorizonsCore.smoonBebhionn.setRelativeOrbitTime(1 / 0.002F);
		CosmicHorizonsCore.smoonBebhionn.setTierRequired(7);
		CosmicHorizonsCore.smoonBebhionn.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/bebhionn.png"));
		
		CosmicHorizonsCore.smoonErriapus = (Moon) new Moon("erriapus");
		CosmicHorizonsCore.smoonErriapus.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonErriapus.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonErriapus.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(65.8F, 65.8F));
		CosmicHorizonsCore.smoonErriapus.setRelativeOrbitTime(1 / 0.001F);
		CosmicHorizonsCore.smoonErriapus.setTierRequired(7);
		CosmicHorizonsCore.smoonErriapus.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/erriapus.png"));
		
		CosmicHorizonsCore.smoonSkoll = (Moon) new Moon("skoll");
		CosmicHorizonsCore.smoonSkoll.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonSkoll.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonSkoll.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(67.2F, 67.2F));
		CosmicHorizonsCore.smoonSkoll.setRelativeOrbitTime(1 / 0.0009F);
		CosmicHorizonsCore.smoonSkoll.setTierRequired(7);
		CosmicHorizonsCore.smoonSkoll.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/skoll.png"));
		
		CosmicHorizonsCore.smoonSiarnaq = (Moon) new Moon("siarnaq");
		CosmicHorizonsCore.smoonSiarnaq.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonSiarnaq.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonSiarnaq.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(69.4F, 69.4F));
		CosmicHorizonsCore.smoonSiarnaq.setRelativeOrbitTime(1 / 0.0008F);
		CosmicHorizonsCore.smoonSiarnaq.setTierRequired(7);
		CosmicHorizonsCore.smoonSiarnaq.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/siarnaq.png"));
		
		CosmicHorizonsCore.smoonTarqeq = (Moon) new Moon("tarqeq");
		CosmicHorizonsCore.smoonTarqeq.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonTarqeq.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonTarqeq.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(71F, 71F));
		CosmicHorizonsCore.smoonTarqeq.setRelativeOrbitTime(1 / 0.0007F);
		CosmicHorizonsCore.smoonTarqeq.setTierRequired(7);
		CosmicHorizonsCore.smoonTarqeq.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/tarqeq.png"));
		
		CosmicHorizonsCore.smoonGreip = (Moon) new Moon("greip");
		CosmicHorizonsCore.smoonGreip.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonGreip.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonGreip.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(73.6F, 73.6F));
		CosmicHorizonsCore.smoonGreip.setRelativeOrbitTime(1 / 0.0005F);
		CosmicHorizonsCore.smoonGreip.setTierRequired(7);
		CosmicHorizonsCore.smoonGreip.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/greip.png"));
		
		CosmicHorizonsCore.smoonHyrrokkin = (Moon) new Moon("hyrrokkin");
		CosmicHorizonsCore.smoonHyrrokkin.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonHyrrokkin.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonHyrrokkin.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(74F, 74F));
		CosmicHorizonsCore.smoonHyrrokkin.setRelativeOrbitTime(1 / 0.0004F);
		CosmicHorizonsCore.smoonHyrrokkin.setTierRequired(7);
		CosmicHorizonsCore.smoonHyrrokkin.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/hyrrokkin.png"));
		
		CosmicHorizonsCore.smoonJarnsaxa = (Moon) new Moon("jarnsaxa");
		CosmicHorizonsCore.smoonJarnsaxa.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonJarnsaxa.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonJarnsaxa.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(76.1F, 76.1F));
		CosmicHorizonsCore.smoonJarnsaxa.setRelativeOrbitTime(1 / 0.0003F);
		CosmicHorizonsCore.smoonJarnsaxa.setTierRequired(7);
		CosmicHorizonsCore.smoonJarnsaxa.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/jarnsaxa.png"));
		
		CosmicHorizonsCore.smoonTarvos = (Moon) new Moon("tarvos");
		CosmicHorizonsCore.smoonTarvos.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonTarvos.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonTarvos.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(76.2F, 76.2F));
		CosmicHorizonsCore.smoonTarvos.setRelativeOrbitTime(1 / 0.0002F);
		CosmicHorizonsCore.smoonTarvos.setTierRequired(7);
		CosmicHorizonsCore.smoonTarvos.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/tarvos.png"));
		
		CosmicHorizonsCore.smoonMundilfari = (Moon) new Moon("mundilfari");
		CosmicHorizonsCore.smoonMundilfari.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonMundilfari.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonMundilfari.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(76.5F, 76.5F));
		CosmicHorizonsCore.smoonMundilfari.setRelativeOrbitTime(1 / 0.0001F);
		CosmicHorizonsCore.smoonMundilfari.setTierRequired(7);
		CosmicHorizonsCore.smoonMundilfari.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/mundilfari.png"));
	
		CosmicHorizonsCore.smoonBergelmir = (Moon) new Moon("bergelmir");
		CosmicHorizonsCore.smoonBergelmir.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonBergelmir.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonBergelmir.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(78F, 78F));
		CosmicHorizonsCore.smoonBergelmir.setRelativeOrbitTime(1 / 0.00007F);
		CosmicHorizonsCore.smoonBergelmir.setTierRequired(7);
		CosmicHorizonsCore.smoonBergelmir.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/bergelmir.png"));
		
		CosmicHorizonsCore.smoonNarvi = (Moon) new Moon("narvi");
		CosmicHorizonsCore.smoonNarvi.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonNarvi.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonNarvi.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(79.5F, 79.5F));
		CosmicHorizonsCore.smoonNarvi.setRelativeOrbitTime(1 / 0.00006F);
		CosmicHorizonsCore.smoonNarvi.setTierRequired(7);
		CosmicHorizonsCore.smoonNarvi.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/narvi.png"));
		
		CosmicHorizonsCore.smoonSuttungr = (Moon) new Moon("suttungr");
		CosmicHorizonsCore.smoonSuttungr.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonSuttungr.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonSuttungr.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(80.9F, 80.9F));
		CosmicHorizonsCore.smoonSuttungr.setRelativeOrbitTime(1 / 0.00005F);
		CosmicHorizonsCore.smoonSuttungr.setTierRequired(7);
		CosmicHorizonsCore.smoonSuttungr.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/suttungr.png"));
		
		CosmicHorizonsCore.smoonHati = (Moon) new Moon("hati");
		CosmicHorizonsCore.smoonHati.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonHati.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonHati.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(81.7F, 81.7F));
		CosmicHorizonsCore.smoonHati.setRelativeOrbitTime(1 / 0.00004F);
		CosmicHorizonsCore.smoonHati.setTierRequired(7);
		CosmicHorizonsCore.smoonHati.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/hati.png"));
		
		CosmicHorizonsCore.smoonFarbauti = (Moon) new Moon("farbauti");
		CosmicHorizonsCore.smoonFarbauti.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonFarbauti.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonFarbauti.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(89F, 89F));
		CosmicHorizonsCore.smoonFarbauti.setRelativeOrbitTime(1 / 0.00002F);
		CosmicHorizonsCore.smoonFarbauti.setTierRequired(7);
		CosmicHorizonsCore.smoonFarbauti.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/farbauti.png"));
		
		CosmicHorizonsCore.smoonThrymr = (Moon) new Moon("thrymr");
		CosmicHorizonsCore.smoonThrymr.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonThrymr.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonThrymr.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(89.3F, 89.3F));
		CosmicHorizonsCore.smoonThrymr.setRelativeOrbitTime(1 / 0.00001F);
		CosmicHorizonsCore.smoonThrymr.setTierRequired(7);
		CosmicHorizonsCore.smoonThrymr.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/thrymr.png"));
		
		CosmicHorizonsCore.smoonAegir = (Moon) new Moon("aegir");
		CosmicHorizonsCore.smoonAegir.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonAegir.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonAegir.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(90F, 90F));
		CosmicHorizonsCore.smoonAegir.setRelativeOrbitTime(1 / 0.000009F);
		CosmicHorizonsCore.smoonAegir.setTierRequired(7);
		CosmicHorizonsCore.smoonAegir.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/aegir.png"));
			
		CosmicHorizonsCore.smoonBestla = (Moon) new Moon("bestla");
		CosmicHorizonsCore.smoonBestla.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonBestla.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonBestla.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(90.35F, 90.35F));
		CosmicHorizonsCore.smoonBestla.setRelativeOrbitTime(1 / 0.032F);
		CosmicHorizonsCore.smoonBestla.setTierRequired(7);
		CosmicHorizonsCore.smoonBestla.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/bestla.png"));
		
		CosmicHorizonsCore.smoonFenrir = (Moon) new Moon("fenrir");
		CosmicHorizonsCore.smoonFenrir.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonFenrir.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonFenrir.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(92F, 92F));
		CosmicHorizonsCore.smoonFenrir.setRelativeOrbitTime(1 / 0.032F);
		CosmicHorizonsCore.smoonFenrir.setTierRequired(7);
		CosmicHorizonsCore.smoonFenrir.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/fenrir.png"));
		
		CosmicHorizonsCore.smoonSurtur = (Moon) new Moon("surtur");
		CosmicHorizonsCore.smoonSurtur.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonSurtur.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonSurtur.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(93.1F, 93.1F));
		CosmicHorizonsCore.smoonSurtur.setRelativeOrbitTime(1 / 0.032F);
		CosmicHorizonsCore.smoonSurtur.setTierRequired(7);
		CosmicHorizonsCore.smoonSurtur.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/surtur.png"));
		
		CosmicHorizonsCore.smoonKari = (Moon) new Moon("kari");
		CosmicHorizonsCore.smoonKari.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonKari.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonKari.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(93.3F, 93.5F));
		CosmicHorizonsCore.smoonKari.setRelativeOrbitTime(1 / 0.032F);
		CosmicHorizonsCore.smoonKari.setTierRequired(7);
		CosmicHorizonsCore.smoonKari.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/kari.png"));
		
		CosmicHorizonsCore.smoonYmir = (Moon) new Moon("ymir");
		CosmicHorizonsCore.smoonYmir.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonYmir.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonYmir.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(93.7F, 93.7F));
		CosmicHorizonsCore.smoonYmir.setRelativeOrbitTime(1 / 0.032F);
		CosmicHorizonsCore.smoonYmir.setTierRequired(7);
		CosmicHorizonsCore.smoonYmir.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/ymir.png"));
		
		CosmicHorizonsCore.smoonLoge = (Moon) new Moon("loge");
		CosmicHorizonsCore.smoonLoge.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonLoge.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonLoge.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(95F, 95F));
		CosmicHorizonsCore.smoonLoge.setRelativeOrbitTime(1 / 0.032F);
		CosmicHorizonsCore.smoonLoge.setTierRequired(7);
		CosmicHorizonsCore.smoonLoge.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/loge.png"));
		
		CosmicHorizonsCore.smoonFornjot = (Moon) new Moon("fornjot");
		CosmicHorizonsCore.smoonFornjot.setParentPlanet(CosmicHorizonsCore.Saturn);
		CosmicHorizonsCore.smoonFornjot.setRelativeSize(0.2667F);
		CosmicHorizonsCore.smoonFornjot.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(97.8F, 97.8F));
		CosmicHorizonsCore.smoonFornjot.setRelativeOrbitTime(1 / 0.032F);
		CosmicHorizonsCore.smoonFornjot.setTierRequired(7);
		CosmicHorizonsCore.smoonFornjot.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/fornjot.png"));
		
		        //Moons of Neptune
				CosmicHorizonsCore.nmoonNaiad = (Moon) new Moon("naiad");
				CosmicHorizonsCore.nmoonNaiad.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonNaiad.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonNaiad.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8F, 8F));
				CosmicHorizonsCore.nmoonNaiad.setRelativeOrbitTime(1 / 0.0525F);
				CosmicHorizonsCore.nmoonNaiad.setTierRequired(6);
				CosmicHorizonsCore.nmoonNaiad.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/naiad.png"));
				
				CosmicHorizonsCore.nmoonThalassa = (Moon) new Moon("thalassa");
				CosmicHorizonsCore.nmoonThalassa.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonThalassa.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonThalassa.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.3F, 8.3F));
				CosmicHorizonsCore.nmoonThalassa.setRelativeOrbitTime(1 / 0.050F);
				CosmicHorizonsCore.nmoonThalassa.setTierRequired(6);
				CosmicHorizonsCore.nmoonThalassa.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/thalassa.png"));
				
				CosmicHorizonsCore.nmoonDespina = (Moon) new Moon("despina");
				CosmicHorizonsCore.nmoonDespina.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonDespina.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonDespina.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(8.6F, 8.6F));
				CosmicHorizonsCore.nmoonDespina.setRelativeOrbitTime(1 / 0.045F);
				CosmicHorizonsCore.nmoonDespina.setTierRequired(6);
				CosmicHorizonsCore.nmoonDespina.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/despina.png"));
				
				CosmicHorizonsCore.nmoonGalatea = (Moon) new Moon("galatea");
				CosmicHorizonsCore.nmoonGalatea.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonGalatea.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonGalatea.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(9.9F, 9.9F));
				CosmicHorizonsCore.nmoonGalatea.setRelativeOrbitTime(1 / 0.040F);
				CosmicHorizonsCore.nmoonGalatea.setTierRequired(6);
				CosmicHorizonsCore.nmoonGalatea.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/galatea.png"));
				
				CosmicHorizonsCore.nmoonLarissa = (Moon) new Moon("larissa");
				CosmicHorizonsCore.nmoonLarissa.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonLarissa.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonLarissa.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(11F, 11F));
				CosmicHorizonsCore.nmoonLarissa.setRelativeOrbitTime(1 / 0.0315F);
				CosmicHorizonsCore.nmoonLarissa.setTierRequired(6);
				CosmicHorizonsCore.nmoonLarissa.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/larissa.png"));
				
				CosmicHorizonsCore.nmoonHippocamp = (Moon) new Moon("hippocamp");
				CosmicHorizonsCore.nmoonHippocamp.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonHippocamp.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonHippocamp.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(12F, 12F));
				CosmicHorizonsCore.nmoonHippocamp.setRelativeOrbitTime(1 / 0.032F);
				CosmicHorizonsCore.nmoonHippocamp.setTierRequired(6);
				CosmicHorizonsCore.nmoonHippocamp.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/hippocamp.png"));
				
				CosmicHorizonsCore.nmoonProteus = (Moon) new Moon("proteus");
				CosmicHorizonsCore.nmoonProteus.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonProteus.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonProteus.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(13F, 13F));
				CosmicHorizonsCore.nmoonProteus.setRelativeOrbitTime(1 / 0.039F);
				CosmicHorizonsCore.nmoonProteus.setTierRequired(6);
				CosmicHorizonsCore.nmoonProteus.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/proteus.png"));
				
				CosmicHorizonsCore.nmoonTriton = (Moon) new Moon("triton");
				CosmicHorizonsCore.nmoonTriton.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonTriton.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonTriton.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(15F, 15F));
				CosmicHorizonsCore.nmoonTriton.setRelativeOrbitTime(1 / 0.038F);
				CosmicHorizonsCore.nmoonTriton.setTierRequired(6);
				CosmicHorizonsCore.nmoonTriton.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/triton.png"));
				
				CosmicHorizonsCore.nmoonNereid = (Moon) new Moon("nereid");
				CosmicHorizonsCore.nmoonNereid.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonNereid.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonNereid.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(16F, 16F));
				CosmicHorizonsCore.nmoonNereid.setRelativeOrbitTime(1 / 0.037F);
				CosmicHorizonsCore.nmoonNereid.setTierRequired(6);
				CosmicHorizonsCore.nmoonNereid.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/nereid.png"));
				
				CosmicHorizonsCore.nmoonHalimede = (Moon) new Moon("halimede");
				CosmicHorizonsCore.nmoonHalimede.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonHalimede.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonHalimede.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(20F, 20F));
				CosmicHorizonsCore.nmoonHalimede.setRelativeOrbitTime(1 / 0.035F);
				CosmicHorizonsCore.nmoonHalimede.setTierRequired(6);
				CosmicHorizonsCore.nmoonHalimede.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/halimede.png"));
				
				CosmicHorizonsCore.nmoonSao = (Moon) new Moon("sao");
				CosmicHorizonsCore.nmoonSao.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonSao.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonSao.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(26F, 26F));
				CosmicHorizonsCore.nmoonSao.setRelativeOrbitTime(1 / 0.028F);
				CosmicHorizonsCore.nmoonSao.setTierRequired(6);
				CosmicHorizonsCore.nmoonSao.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/sao.png"));
				
				CosmicHorizonsCore.nmoonLaomedeia = (Moon) new Moon("laomedeia");
				CosmicHorizonsCore.nmoonLaomedeia.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonLaomedeia.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonLaomedeia.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(28F, 28F));
				CosmicHorizonsCore.nmoonLaomedeia.setRelativeOrbitTime(1 / 0.029F);
				CosmicHorizonsCore.nmoonLaomedeia.setTierRequired(6);
				CosmicHorizonsCore.nmoonLaomedeia.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/laomedeia.png"));
				
				CosmicHorizonsCore.nmoonPsamathe = (Moon) new Moon("psamathe");
				CosmicHorizonsCore.nmoonPsamathe.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonPsamathe.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonPsamathe.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(38F, 38F));
				CosmicHorizonsCore.nmoonPsamathe.setRelativeOrbitTime(1 / 0.030F);
				CosmicHorizonsCore.nmoonPsamathe.setTierRequired(6);
				CosmicHorizonsCore.nmoonPsamathe.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/psamathe.png"));
				
				CosmicHorizonsCore.nmoonNeso = (Moon) new Moon("neso");
				CosmicHorizonsCore.nmoonNeso.setParentPlanet(CosmicHorizonsCore.Neptune);
				CosmicHorizonsCore.nmoonNeso.setRelativeSize(0.2667F);
				CosmicHorizonsCore.nmoonNeso.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(40F, 40F));
				CosmicHorizonsCore.nmoonNeso.setRelativeOrbitTime(1 / 0.031F);
				CosmicHorizonsCore.nmoonNeso.setTierRequired(6);
				CosmicHorizonsCore.nmoonNeso.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/neso.png"));
				
				//Other Moons
				CosmicHorizonsCore.hmoonhiiaka = (Moon) new Moon("hiiaka");
				CosmicHorizonsCore.hmoonhiiaka.setParentPlanet(CosmicHorizonsCore.Haumea).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10F, 10F)).setRelativeOrbitTime(34F).setTierRequired(0);
				CosmicHorizonsCore.hmoonhiiaka.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/hiiaka.png"));
		        
				CosmicHorizonsCore.hmoonnamaka = (Moon) new Moon("namaka");
				CosmicHorizonsCore.hmoonnamaka.setParentPlanet(CosmicHorizonsCore.Haumea).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(15F, 15F)).setRelativeOrbitTime(23F).setTierRequired(0);
				CosmicHorizonsCore.hmoonnamaka.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/namaka.png"));
		        
				CosmicHorizonsCore.mmoonrorai = (Moon) new Moon("rorai");
				CosmicHorizonsCore.mmoonrorai.setParentPlanet(CosmicHorizonsCore.Makemake).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10F, 10F)).setRelativeOrbitTime(64F).setTierRequired(0);
				CosmicHorizonsCore.mmoonrorai.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/rorai.png"));
				
				CosmicHorizonsCore.pmooncharon = (Moon) new Moon("charon");
				CosmicHorizonsCore.pmooncharon.setParentPlanet(CosmicHorizonsCore.Pluto).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(10F, 10F)).setRelativeOrbitTime(87F).setTierRequired(0);
				CosmicHorizonsCore.pmooncharon.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/charon.png"));
				
				CosmicHorizonsCore.pmoonnix = (Moon) new Moon("nix");
				CosmicHorizonsCore.pmoonnix.setParentPlanet(CosmicHorizonsCore.Pluto).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(15F, 15F)).setRelativeOrbitTime(64F).setTierRequired(0);
				CosmicHorizonsCore.pmoonnix.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/nix.png"));
				
				CosmicHorizonsCore.pmoonhydra = (Moon) new Moon("hydra");
				CosmicHorizonsCore.pmoonhydra.setParentPlanet(CosmicHorizonsCore.Pluto).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(25F, 25F)).setRelativeOrbitTime(50F).setTierRequired(0);
				CosmicHorizonsCore.pmoonhydra.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/hydra.png"));
				
				CosmicHorizonsCore.pmoonkerberos = (Moon) new Moon("kerberos");
				CosmicHorizonsCore.pmoonkerberos.setParentPlanet(CosmicHorizonsCore.Pluto).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(37F, 37F)).setRelativeOrbitTime(21F).setTierRequired(0);
				CosmicHorizonsCore.pmoonkerberos.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/kerberos.png"));
				
				CosmicHorizonsCore.pmoonstyx = (Moon) new Moon("styx");
				CosmicHorizonsCore.pmoonstyx.setParentPlanet(CosmicHorizonsCore.Pluto).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(40F, 40F)).setRelativeOrbitTime(15F).setTierRequired(0);
				CosmicHorizonsCore.pmoonstyx.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/styx.png"));
				
				CosmicHorizonsCore.charikloringoiapoque = (Moon) new Moon("oiapoque");
				CosmicHorizonsCore.charikloringoiapoque.setParentPlanet(CosmicHorizonsCore.Chariklo).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(20F, 20F)).setRelativeOrbitTime(35F).setTierRequired(0).setRingColorRGB(0.3F, 1.0F, 0.3F);
				CosmicHorizonsCore.charikloringoiapoque.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/mab.png"));
				
				CosmicHorizonsCore.charikloringchuy = (Moon) new Moon("chuy");
				CosmicHorizonsCore.charikloringchuy.setParentPlanet(CosmicHorizonsCore.Chariklo).setRelativeSize(0.2667F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(20F, 20F)).setRelativeOrbitTime(15F).setTierRequired(0).setRingColorRGB(0.3F, 1.0F, 0.3F);
				CosmicHorizonsCore.charikloringchuy.setBodyIcon(new ResourceLocation("cosmichorizons", "textures/gui/celestialbodies/mab.png"));
				
		GalacticraftRegistry.registerTeleportType(WorldProviderJupiter.class, new TeleportTypeAsteroids());
		GalacticraftRegistry.registerTeleportType(WorldProviderSaturn.class, new TeleportTypeAsteroids());
		GalacticraftRegistry.registerTeleportType(WorldProviderUranus.class, new TeleportTypeAsteroids());
		GalacticraftRegistry.registerTeleportType(WorldProviderNeptune.class, new TeleportTypeAsteroids());
		GalacticraftRegistry.registerTeleportType(WorldProviderMetis.class, new TeleportTypeCH());
		GalacticraftRegistry.registerTeleportType(WorldProviderAdrastea.class, new TeleportTypeCH());
		GalacticraftRegistry.registerTeleportType(WorldProviderAmalthea.class, new TeleportTypeCH());
		GalacticraftRegistry.registerTeleportType(WorldProviderThebe.class, new TeleportTypeCH());
		GalacticraftRegistry.registerTeleportType(WorldProviderPhobos.class, new TeleportTypeCH());
		GalacticraftRegistry.registerTeleportType(WorldProviderDeimos.class, new TeleportTypeCH());
		GalacticraftRegistry.registerTeleportType(WorldProviderVesta.class, new TeleportTypeCH());
        ///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////
/*		GalacticraftRegistry.registerTeleportType(WorldProviderThemis.class, new TeleportTypeAsteroids());
		GalacticraftRegistry.registerRocketGui(WorldProviderThemis.class, new ResourceLocation("cosmichorizons", "textures/gui/rocketgui/themisgui.png")); */
		///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////
		GalacticraftRegistry.registerRocketGui(WorldProviderPhobos.class, new ResourceLocation("cosmichorizons", "textures/gui/rocketgui/phobosgui.png"));
		GalacticraftRegistry.registerRocketGui(WorldProviderDeimos.class, new ResourceLocation("cosmichorizons", "textures/gui/rocketgui/deimosgui.png"));
		GalacticraftRegistry.registerRocketGui(WorldProviderMetis.class, new ResourceLocation("cosmichorizons", "textures/gui/rocketgui/metisgui.png"));
		GalacticraftRegistry.registerRocketGui(WorldProviderAdrastea.class, new ResourceLocation("cosmichorizons", "textures/gui/rocketgui/adrasteagui.png"));
		GalacticraftRegistry.registerRocketGui(WorldProviderAmalthea.class, new ResourceLocation("cosmichorizons", "textures/gui/rocketgui/amaltheagui.png"));
		GalacticraftRegistry.registerRocketGui(WorldProviderThebe.class, new ResourceLocation("cosmichorizons", "textures/gui/rocketgui/thebegui.png"));
	
/*		GameRegistry.registerBlock(CosmicHorizonsCore.Jupitersurface, "JupiterSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Jupitersubsurface, "JupiterSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Jupiterstone, "JupiterStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Saturnsurface, "SaturnSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Saturnsubsurface, "SaturnSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Saturnstone, "SaturnStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Uranussurface, "UranusSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Uranussubsurface, "UranusSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Uranusstone, "UranusStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Neptunesurface, "NeptuneSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Neptunesubsurface, "NeptuneSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Neptunestone, "NeptuneStone");
	*/
		
		GameRegistry.registerBlock(CosmicHorizonsCore.Phobossurface, "PhobosSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Phobossubsurface, "PhobosSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Phobosstone, "PhobosStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Phobosrhodiumore, "PhobosRhodiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Phobosrutheniumore, "PhobosRutheniumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Phobosdeshore, "PhobosDeshOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Phobosaluminiumore, "PhobosAluminiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Phobossiliconore, "PhobosSiliconOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Rutheniumblock, "Rutheniumblock");
//		GameRegistry.registerBlock(CosmicHorizonsCore.Rutheniumdualblock, "Rutheniumdualblock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Rhodiumblock, "Rhodiumblock");
//		GameRegistry.registerBlock(CosmicHorizonsCore.Rhodiumdualblock, "Rhodiumdualblock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Phobosbrick, "PhobosDungeonBrick");
		GameRegistry.registerBlock(CosmicHorizonsCore.Deimossurface, "DeimosSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Deimossubsurface, "DeimosSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Deimosstone, "DeimosStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Deimosbrick, "DeimosDungeonBrick");
		GameRegistry.registerBlock(CosmicHorizonsCore.Deimoscadmiumore, "DeimosCadmiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Deimosdeshore, "DeimosDeshOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Deimosironore, "DeimosIronOre");
//		GameRegistry.registerBlock(CosmicHorizonsCore.Cadmiumdualblock, "CadmiumDualBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Cadmiumblock, "CadmiumBlock");
     	GameRegistry.registerBlock(CosmicHorizonsCore.Phobosrockysurface, "PhobosRockySurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Deimosrockysurface, "DeimosRockySurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Metissurface, "MetisSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Metissubsurface, "MetisSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Metisstone, "MetisStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Metisbrick, "MetisDungeonBrick");
		GameRegistry.registerBlock(CosmicHorizonsCore.Metisglowstone, "MetisGlowstone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Metisceriumore, "MetisCeriumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Metisdysprosiumore, "MetisDysprosiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Metisironore, "MetisIronOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Metiscopperore, "MetisCopperOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Metisdeshore, "MetisDeshOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Ceriumblock, "CeriumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Dysprosiumblock, "DysprosiumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Adrasteasurface, "AdrasteaSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Adrasteasubsurface, "AdrasteaSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Adrasteastone, "AdrasteaStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Adrasteaneodymiumore, "AdrasteaNeodymiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Adrasteaironore, "AdrasteaIronOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Adrasteatinore, "AdrasteaTinOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Adrasteasiliconore, "AdrasteaSiliconOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Adrasteabrick, "AdrasteaDungeonBrick");
		GameRegistry.registerBlock(CosmicHorizonsCore.Adrasteaglowstone, "AdrasteaGlowstone");
		GameRegistry.registerBlock(CosmicHorizonsCore.NeodymiumBlock, "NeodymiumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheasurface, "AmaltheaSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheasubsurface, "AmaltheaSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheastone, "AmaltheaStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheayttriumore, "AmaltheaYttriumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheaironore, "AmaltheaIronOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheacopperore, "AmaltheaCopperOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheatinore, "AmaltheaTinOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheaaluminiumore, "AmaltheaAluminiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amalthealightsurface, "AmaltheaLightSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amalthealightsubsurface, "AmaltheaLightSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amalthealightstone, "AmaltheaLightStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheaytterbiumore, "AmaltheaYtterbiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheascandore, "AmaltheaScandiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheasiliconore, "AmaltheaSiliconOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheacoalore, "AmaltheaCoalOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheabrick, "AmaltheaDungeonBrick");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheaglowstone, "AmaltheaGlowstone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheageyser, "AmaltheaGeyser");
		GameRegistry.registerBlock(CosmicHorizonsCore.YttriumBlock, "YttriumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.ScandBlock, "ScandiumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.YtterbiumBlock, "YtterbiumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Thebesurface, "ThebeSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Thebesubsurface, "ThebeSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Thebestone, "ThebeStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Thebebrick, "ThebeDungeonBrick");
		GameRegistry.registerBlock(CosmicHorizonsCore.Thebeglowstone, "ThebeGlowstone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Manganumore, "ThebeManganumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Strontiumore, "ThebeStrontiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Manganumblock, "ManganumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Strontiumblock, "StrontiumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Thebealuminiumore, "ThebeAluminiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Thebediamondore, "ThebeDiamondOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Thebegoldore, "ThebeGoldOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Thebegalliumore, "ThebeGalliumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Galliumblock, "GalliumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Vestasurface, "VestaSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Vestasubsurface, "VestaSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Vestastone, "VestaStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Kaliumore, "VestaKaliumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Calciumore, "VestaCalciumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Natriumore, "VestaNatriumOre"); 
    	GameRegistry.registerBlock(CosmicHorizonsCore.Kaliumblock, "KaliumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Calciumblock, "CalciumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Natriumblock, "NatriumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Vestalawrenciumore, "VestaLawrenciumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Vestaunbiquadiumore, "VestaUnbiquadiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Vestaunbiseptiumore, "VestaUnbiseptiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Vestatinore, "VestaTinOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Vestameteoricironore, "VestaMeteoricIronOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Vestameteoricironore2, "VestaSurfaceMeteoricIronOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Vestadarksurface, "VestaDarkSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.Vestaunbiseptiumore2, "VestaDarkSurfaceUnbiseptiumOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.Jupiterdenseice, "JupiterDenseIce");
		GameRegistry.registerBlock(CosmicHorizonsCore.Lawrenciumblock, "LawrenciumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Unbiquadiumblock, "UnbiquadiumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Unbiseptiumblock, "UnbiseptiumBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Metistechnicblock, "MetisTechnicBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Adrasteatechnicblock, "AdrasteaTechnicBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Amaltheatechnicblock, "AmaltheaTechnicBlock");
		GameRegistry.registerBlock(CosmicHorizonsCore.Thebetechnicblock, "ThebeTechnicBlock");
		CosmicHorizonsCore.registerFluidBlock(CosmicHorizonsCore.amaltheaLiquidIceFluidBlock, CHItemBlockUtil.class);
        /////////////////////////////////////////////////////////////// 
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////
/*		GameRegistry.registerBlock(CosmicHorizonsCore.ThemisSurface, "ThemisSurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.ThemisSubsurface, "ThemisSubsurface");
		GameRegistry.registerBlock(CosmicHorizonsCore.ThemisStone, "ThemisStone");
		GameRegistry.registerBlock(CosmicHorizonsCore.Themistransparisteelore, "ThemisTransparisteelOre");
		GameRegistry.registerBlock(CosmicHorizonsCore.TransparisteelBlock, "TransparisteelBlock"); */
        ///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////
		
		GameRegistry.registerItem(CadmiumIngot, "CadmiumIngot");
		GameRegistry.registerItem(RutheniumIngot, "RutheniumIngot");
		GameRegistry.registerItem(RhodiumIngot, "RhodiumIngot");
		GameRegistry.registerItem(RhodiumPlate, "RhodiumPlate");
		GameRegistry.registerItem(RutheniumPlate, "RutheniumPlate");
		GameRegistry.registerItem(CadmiumPlate, "CadmiumPlate");
/*		GameRegistry.registerItem(Tier100Schematic, "T100s");
		GameRegistry.registerItem(Tier100Part1, "T100sp1");
		GameRegistry.registerItem(Tier100Part2, "T100sp2");
		GameRegistry.registerItem(Tier100Booster, "T100b");
		GameRegistry.registerItem(Tier100Plate, "T100p"); */
		GameRegistry.registerItem(CeriumIngot, "CeriumIngot");
		GameRegistry.registerItem(DysprosiumIngot, "DysprosiumIngot");
		GameRegistry.registerItem(CeriumPlate, "CeriumPlate");
		GameRegistry.registerItem(DysprosiumPlate, "DysprosiumPlate");
		GameRegistry.registerItem(NeodymiumIngot, "NeodymiumIngot");
		GameRegistry.registerItem(NeodymiumPlate, "NeodymiumPlate");
		GameRegistry.registerItem(YttriumIngot, "YttriumIngot");
		GameRegistry.registerItem(YttriumPlate, "YttriumPlate");
		GameRegistry.registerItem(ScandIngot, "ScandiumIngot");
		GameRegistry.registerItem(ScandPlate, "ScandiumPlate");
		GameRegistry.registerItem(YtterbiumIngot, "YtterbiumIngot");
		GameRegistry.registerItem(YtterbiumPlate, "YtterbiumPlate");
		GameRegistry.registerItem(ManganumIngot, "ManganumIngot");
		GameRegistry.registerItem(ManganumPlate, "ManganumPlate");
		GameRegistry.registerItem(StrontiumIngot, "StrontiumIngot");
		GameRegistry.registerItem(StrontiumPlate, "StrontiumPlate");
		GameRegistry.registerItem(GalliumIngot, "GalliumIngot");
		GameRegistry.registerItem(GalliumPlate, "GalliumPlate");
		GameRegistry.registerItem(KaliumIngot, "KaliumIngot");
		GameRegistry.registerItem(CalciumIngot, "CalciumIngot");
		GameRegistry.registerItem(NatriumIngot, "NatriumIngot"); 
		GameRegistry.registerItem(KaliumPlate, "KaliumPlate");
		GameRegistry.registerItem(CalciumPlate, "CalciumPlate");
		GameRegistry.registerItem(NatriumPlate, "NatriumPlate"); 
		GameRegistry.registerItem(LawrenciumIngot, "LawrenciumIngot");
		GameRegistry.registerItem(UnbiquadiumIngot, "UnbiquadiumIngot");
		GameRegistry.registerItem(UnbiseptiumIngot, "UnbiseptiumIngot"); 
		GameRegistry.registerItem(LawrenciumPlate, "LawrenciumPlate"); 
		GameRegistry.registerItem(UnbiquadiumPlate, "UnbiquadiumPlate"); 
		GameRegistry.registerItem(UnbiseptiumPlate, "UnbiseptiumPlate"); 
		GameRegistry.registerItem(Thebeleather, "ThebeLeather");
		GameRegistry.registerItem(Amaltheaalienfruit, "Amaltheaalienfruit");
		GameRegistry.registerItem(FoodThebe1.thebealienmilk, "ThebeAlienMilk");
		GameRegistry.registerItem(FoodThebe2.thebebeef, "ThebeBeef");
		GameRegistry.registerItem(Aliensaddle, "AlienSaddle");
		GameRegistry.registerItem(O2_Schematic_Part1, "o2schemp1");
		GameRegistry.registerItem(O2_Schematic_Part2, "o2schemp2");
		GameRegistry.registerItem(O2_Schematic_Part3, "o2schemp3");
		GameRegistry.registerItem(O2_Schematic_Part4, "o2schemp4");
		GameRegistry.registerItem(O2_Schematic, "o2schem");
		GameRegistry.registerItem(plateTierSP1, "plate-gsmysyndc-1");
		GameRegistry.registerItem(ytterbiumcanister, "ytterbiumcanister");
        GCCoreUtil.registerGalacticraftItem("oxygenTankMaxFull", CosmicHorizonsCore.oxTankMax);
        GCCoreUtil.registerGalacticraftItem("oxygenTankMaxEmpty", CosmicHorizonsCore.oxTankMax, 9900);
        GCItems.registerItem(CosmicHorizonsCore.oxTankMax);
		GameRegistry.registerItem(chblocks, "CHBLOCKS");
		GameRegistry.registerItem(chitems, "CHITEMS");
        ///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////
/*		GameRegistry.registerItem(TranspristeelIngot, "TranspristeelIngot");
		GameRegistry.registerItem(TranspristeelPlate, "TranspristeelPlate"); */
        ///////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////
		
		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Jupiter);
		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Saturn);
		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Uranus);
		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Neptune);
		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Hygiea);
		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Juno);
//		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Chariklo);
		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Vesta);
		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Pallas);
		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Pluto);
		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Haumea);
		GalaxyRegistry.registerPlanet(CosmicHorizonsCore.Makemake);

		GalaxyRegistry.registerMoon(CosmicHorizonsCore.Phobos);
        GalaxyRegistry.registerMoon(CosmicHorizonsCore.Deimos);
        GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonMetis);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonAdrastea);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonAmalthea);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonThebe);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonLeda);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonHimalia);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonLysithea);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonElara);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonAnanke);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonCarme);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonPasiphae);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonCallirrhoe);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonSinope);
		
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonNaiad);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonThalassa);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonDespina);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonGalatea);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonLarissa);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonHippocamp);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonProteus);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonNereid);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonHalimede);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonSao);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonNeso);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonLaomedeia);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonPsamathe);
		
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonCordelia);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonOphelia);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonBianca);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonCressida);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonDesdemona);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonJuliet);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonPortia);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonRosalind);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonCupid);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonBelinda);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonPerdita);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonPuck);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonMab);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonAriel);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonUmbriel);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonTitania);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonOberon);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonFrancisco);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonCaliban);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonStephano);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonTrinculo);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonSycorax);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonMargaret);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonProspero);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonSetebos);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonFerdinand);
		
/*	    GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonIo);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonEuropa);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonGanymede);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonCallisto);
			
        GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonThemisto);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonLeda);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonHimalia);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonErsa);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonPandia);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonLysithea);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonElara);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonDia);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonCarpo);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonValetudo);
		
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.Phobos);
        GalaxyRegistry.registerMoon(CosmicHorizonsCore.Deimos);
        GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonMetis);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonAdrastea);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonAmalthea);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonThebe);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonIo);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonEuropa);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonGanymede);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonCallisto);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonThemisto);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonHimalia);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonErsa);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonPandia);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonDia);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonCarpo);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonValetudo);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonEuporie);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonEupheme);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon22);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon23);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonThelxinoe);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonEuanthe);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonHelike);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonOrthosie);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon28);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon29);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon30);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonIocaste);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonPraxidike);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonHarpalyke);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonMneme);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonHermippe);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonThyone);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon38);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonHerse);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonAitne);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon42);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon43);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonKale);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonTaygete);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon46);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonChaldene);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonPhilophrosyne);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonErinome);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonAoede);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonKallichore);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon54);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon55);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonKalyke);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonEurydome);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon60);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonPasithee);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon62);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonKore);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonCyllene);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon65);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonEukelade);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoon67);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonHegemone);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonArche);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonIsonoe);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonEirene);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonSponde);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonAutonoe);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.jmoonMegaclite);
		
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoon1);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonMoonlets);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonPan);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonDaphnis);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonAtlas);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonPrometheus);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonPandora);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonEpimetheus);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonJanus);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonAegaeon);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonMimas);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonMethone);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonAnthe);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonPallene);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonEnceladus);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonTethys);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonTelesto);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonCalypso);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonDione);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonHelene);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonRhea);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonTitan);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonHyperion);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonIapetus);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonKiviuq);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonIjiraq);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonPhoebe);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonPaaliaq);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonSkathi);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonAlbiorix);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonBebhionn);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonErriapus);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonSkoll);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonSiarnaq);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonTarqeq);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonGreip);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonHyrrokkin);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonJarnsaxa);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonTarvos);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonMundilfari);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonBergelmir);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonNarvi);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonSuttungr);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonHati);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonFarbauti);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonThrymr);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonAegir);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonBestla);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonFenrir);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonSurtur);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonKari);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonYmir);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonLoge);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.smoonFornjot);
		
        GalaxyRegistry.registerMoon(CosmicHorizonsCore.umoonMiranda);
        
        GalaxyRegistry.registerMoon(CosmicHorizonsCore.nmoonTriton);
		*/
		
     	GalaxyRegistry.registerMoon(CosmicHorizonsCore.hmoonhiiaka); 
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.hmoonnamaka);
		
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.mmoonrorai);

		GalaxyRegistry.registerMoon(CosmicHorizonsCore.pmooncharon);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.pmoonhydra);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.pmoonkerberos);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.pmoonnix);
		GalaxyRegistry.registerMoon(CosmicHorizonsCore.pmoonstyx);
		
//		GalaxyRegistry.registerMoon(CosmicHorizonsCore.charikloringoiapoque);
//		GalaxyRegistry.registerMoon(CosmicHorizonsCore.charikloringchuy);
		
        ///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////
//		GalaxyRegistry.registerMoon(CosmicHorizonsCore.sspecialThemis);
        ///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
		//////////////////////////////////////////////////////////////
		
	/*	GalaxyRegistry.registerPlanet(CosmicHorizonsCore.SolidSol); */
		
		GameRegistry.addSmelting(CosmicHorizonsCore.Phobosrutheniumore, new ItemStack(CosmicHorizonsCore.RutheniumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Phobosrhodiumore, new ItemStack(CosmicHorizonsCore.RhodiumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Phobosaluminiumore, new ItemStack(GCItems.basicItem, 1, 5), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Phobossiliconore, new ItemStack(GCItems.basicItem, 1, 2), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Deimoscadmiumore, new ItemStack(CosmicHorizonsCore.CadmiumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Deimosironore, new ItemStack(Items.iron_ingot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Metisceriumore, new ItemStack(CosmicHorizonsCore.CeriumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Metisdysprosiumore, new ItemStack(CosmicHorizonsCore.DysprosiumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Metisironore, new ItemStack(Items.iron_ingot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Metiscopperore, new ItemStack(GCItems.basicItem, 1, 3), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Adrasteaneodymiumore, new ItemStack(CosmicHorizonsCore.NeodymiumIngot), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Adrasteaironore, new ItemStack(Items.iron_ingot), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Adrasteatinore, new ItemStack(GCItems.basicItem, 1, 4), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Adrasteasiliconore, new ItemStack(GCItems.basicItem, 1, 2), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Adrasteaneodymiumore, new ItemStack(CosmicHorizonsCore.NeodymiumIngot), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Amaltheayttriumore, new ItemStack(CosmicHorizonsCore.YttriumIngot), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Amaltheaironore, new ItemStack(Items.iron_ingot), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Amaltheacopperore, new ItemStack(GCItems.basicItem, 3), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Amaltheatinore, new ItemStack(GCItems.basicItem, 1, 4), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Amaltheaaluminiumore, new ItemStack(GCItems.basicItem, 5), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Amaltheaytterbiumore, new ItemStack(CosmicHorizonsCore.YtterbiumIngot), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Amaltheascandore, new ItemStack(CosmicHorizonsCore.ScandIngot), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Amaltheasiliconore, new ItemStack(GCItems.basicItem, 1, 2), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Manganumore, new ItemStack(CosmicHorizonsCore.ManganumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Strontiumore, new ItemStack(CosmicHorizonsCore.StrontiumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Kaliumore, new ItemStack(CosmicHorizonsCore.KaliumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Calciumore, new ItemStack(CosmicHorizonsCore.CalciumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Natriumore, new ItemStack(CosmicHorizonsCore.NatriumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Thebealuminiumore, new ItemStack(GCItems.basicItem, 1, 5), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Thebegoldore, new ItemStack(Items.gold_ingot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Thebegalliumore, new ItemStack(CosmicHorizonsCore.GalliumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Vestalawrenciumore, new ItemStack(CosmicHorizonsCore.LawrenciumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Vestaunbiquadiumore, new ItemStack(CosmicHorizonsCore.UnbiquadiumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Vestaunbiseptiumore, new ItemStack(CosmicHorizonsCore.UnbiseptiumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Vestaunbiseptiumore2, new ItemStack(CosmicHorizonsCore.UnbiseptiumIngot, 1), 3.0F);
		GameRegistry.addSmelting(CosmicHorizonsCore.Vestatinore, new ItemStack(GCItems.basicItem, 1, 4), 3.0F);
		///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////
//		GameRegistry.addSmelting(CosmicHorizonsCore.Themistransparisteelore, new ItemStack(CosmicHorizonsCore.TranspristeelIngot), 3.0F);
        ///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////
		
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Cadmiumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), CosmicHorizonsCore.CadmiumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Cadmiumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), CosmicHorizonsCore.Cadmiumblock});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Rhodiumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), CosmicHorizonsCore.RhodiumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Rhodiumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), CosmicHorizonsCore.Rhodiumblock});
/*		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.RhodiumPlate, 5),
    			new Object[]{ "yxx", "xxx", "xxx",
    					('y'), CosmicHorizonsCore.Rhodiumblock});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.RhodiumPlate, 50),
    			new Object[]{ "yxx", "xxx", "xxx",
    					('y'), CosmicHorizonsCore.Rhodiumdualblock}); */
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Rutheniumblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), CosmicHorizonsCore.RutheniumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Rutheniumdualblock, 1),
    			new Object[]{ "xxx", "xxx", "xxx",
    					('x'), CosmicHorizonsCore.Rutheniumblock});
/*		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.RutheniumPlate, 5),
    			new Object[]{ "yxx", "xxx", "xxx",
    					('x'), CosmicHorizonsCore.Rutheniumblock});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.RutheniumPlate, 50),
    			new Object[]{ "yxx", "xxx", "xxx",
    					('x'), CosmicHorizonsCore.Rutheniumdualblock});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.CadmiumPlate, 5),
    			new Object[]{ "yxx", "xxx", "xxx",
    					('y'), CosmicHorizonsCore.Cadmiumblock});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.CadmiumPlate, 50),
    			new Object[]{ "yxx", "xxx", "xxx",
    					('y'), CosmicHorizonsCore.Cadmiumdualblock}); */
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Tier100Plate, 1),
    			new Object[]{ "yza", "xxx", "xxx",
    					('y'), CosmicHorizonsCore.RhodiumPlate, ('z'), CosmicHorizonsCore.RutheniumPlate,('a'), CosmicHorizonsCore.CadmiumPlate});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Tier100Plate, 1),
    			new Object[]{ "yza", "xxx", "xxx",
    					('y'), CosmicHorizonsCore.RhodiumPlate, ('z'), CosmicHorizonsCore.RutheniumPlate,('a'), CosmicHorizonsCore.CadmiumPlate});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Tier100Booster, 1),
    			new Object[]{ "yzy", "yxy", "yyy",
    					('y'), CosmicHorizonsCore.Tier100Plate, ('z'), Blocks.lapis_block, ('x'), GCItems.canister});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Tier100Schematic, 1),
    			new Object[]{ "abx", "xxx", "xxx",
    					('a'), CosmicHorizonsCore.Tier100Part1, ('b'), CosmicHorizonsCore.Tier100Part2});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Ceriumblock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.CeriumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Dysprosiumblock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.DysprosiumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.NeodymiumBlock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.NeodymiumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.YttriumBlock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.YttriumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.ScandBlock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.ScandIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.YtterbiumBlock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.YtterbiumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Kaliumblock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.KaliumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Manganumblock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.ManganumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Strontiumblock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.StrontiumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Calciumblock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.CalciumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Natriumblock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.NatriumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.ytterbiumcanister, 1),
    			new Object[]{ "bab", "bcb", "bbb",
    					('b'), CosmicHorizonsCore.YtterbiumPlate, ('c'), GCItems.canister});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Galliumblock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.GalliumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Lawrenciumblock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.LawrenciumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Unbiquadiumblock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.UnbiquadiumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Unbiseptiumblock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.UnbiseptiumIngot});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.Aliensaddle, 1),
    			new Object[]{ "aba", "bcb", "aba",
    					('a'), CosmicHorizonsCore.LawrenciumPlate, ('b'), CosmicHorizonsCore.Thebeleather, ('c'), Items.saddle});
        ///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////
/*		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.TransparisteelBlock, 1),
    			new Object[]{ "aaa", "aaa", "aaa",
    					('a'), CosmicHorizonsCore.TranspristeelIngot});  */
        ///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////

		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.O2_Schematic, 1),
    			new Object[]{ "xya", "zva", "aaa",
    					('x'), CosmicHorizonsCore.O2_Schematic_Part1, ('y'), CosmicHorizonsCore.O2_Schematic_Part2, ('z'), CosmicHorizonsCore.O2_Schematic_Part3, ('v'), CosmicHorizonsCore.O2_Schematic_Part4});
		GameRegistry.addRecipe(new ItemStack(CosmicHorizonsCore.oxTankMax, 1, 99000),
    			new Object[]{ "xzx", "xax", "xyx",
    					('x'), CosmicHorizonsCore.plateTierSP1, ('y'), CosmicHorizonsCore.O2_Schematic, ('z'), Blocks.wool, ('a'), CosmicHorizonsCore.ytterbiumcanister});
		
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.RhodiumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.RhodiumIngot, 1), new ItemStack(CosmicHorizonsCore.RhodiumIngot, 1), new ItemStack(CosmicHorizonsCore.RhodiumIngot, 1), new ItemStack(CosmicHorizonsCore.RhodiumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.RutheniumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.RutheniumIngot, 1), new ItemStack(CosmicHorizonsCore.RutheniumIngot, 1), new ItemStack(CosmicHorizonsCore.RutheniumIngot, 1), new ItemStack(CosmicHorizonsCore.RutheniumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.CadmiumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.CadmiumIngot, 1), new ItemStack(CosmicHorizonsCore.CadmiumIngot, 1), new ItemStack(CosmicHorizonsCore.CadmiumIngot, 1), new ItemStack(CosmicHorizonsCore.CadmiumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.CeriumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.CeriumIngot, 1), new ItemStack(CosmicHorizonsCore.CeriumIngot, 1), new ItemStack(CosmicHorizonsCore.CeriumIngot, 1), new ItemStack(CosmicHorizonsCore.CeriumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.DysprosiumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.DysprosiumIngot, 1), new ItemStack(CosmicHorizonsCore.DysprosiumIngot, 1), new ItemStack(CosmicHorizonsCore.DysprosiumIngot, 1), new ItemStack(CosmicHorizonsCore.DysprosiumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.NeodymiumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.NeodymiumIngot, 1), new ItemStack(CosmicHorizonsCore.NeodymiumIngot, 1), new ItemStack(CosmicHorizonsCore.NeodymiumIngot, 1), new ItemStack(CosmicHorizonsCore.NeodymiumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.YttriumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.YttriumIngot, 1), new ItemStack(CosmicHorizonsCore.YttriumIngot, 1), new ItemStack(CosmicHorizonsCore.YttriumIngot, 1), new ItemStack(CosmicHorizonsCore.YttriumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.ScandPlate), new Object[] { new ItemStack(CosmicHorizonsCore.ScandIngot, 1), new ItemStack(CosmicHorizonsCore.ScandIngot, 1), new ItemStack(CosmicHorizonsCore.ScandIngot, 1), new ItemStack(CosmicHorizonsCore.ScandIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.YtterbiumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.YtterbiumIngot, 1), new ItemStack(CosmicHorizonsCore.YtterbiumIngot, 1), new ItemStack(CosmicHorizonsCore.YtterbiumIngot, 1), new ItemStack(CosmicHorizonsCore.YtterbiumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.ManganumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.ManganumIngot, 1), new ItemStack(CosmicHorizonsCore.ManganumIngot, 1), new ItemStack(CosmicHorizonsCore.ManganumIngot, 1), new ItemStack(CosmicHorizonsCore.ManganumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.StrontiumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.StrontiumIngot, 1), new ItemStack(CosmicHorizonsCore.StrontiumIngot, 1), new ItemStack(CosmicHorizonsCore.StrontiumIngot, 1), new ItemStack(CosmicHorizonsCore.StrontiumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.KaliumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.KaliumIngot, 1), new ItemStack(CosmicHorizonsCore.KaliumIngot, 1), new ItemStack(CosmicHorizonsCore.KaliumIngot, 1), new ItemStack(CosmicHorizonsCore.KaliumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.CalciumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.CalciumIngot, 1), new ItemStack(CosmicHorizonsCore.CalciumIngot, 1), new ItemStack(CosmicHorizonsCore.CalciumIngot, 1), new ItemStack(CosmicHorizonsCore.CalciumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.NatriumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.NatriumIngot, 1), new ItemStack(CosmicHorizonsCore.NatriumIngot, 1), new ItemStack(CosmicHorizonsCore.NatriumIngot, 1), new ItemStack(CosmicHorizonsCore.NatriumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.GalliumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.GalliumIngot, 1), new ItemStack(CosmicHorizonsCore.GalliumIngot, 1), new ItemStack(CosmicHorizonsCore.GalliumIngot, 1), new ItemStack(CosmicHorizonsCore.GalliumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.LawrenciumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.LawrenciumIngot, 1), new ItemStack(CosmicHorizonsCore.LawrenciumIngot, 1), new ItemStack(CosmicHorizonsCore.LawrenciumIngot, 1), new ItemStack(CosmicHorizonsCore.LawrenciumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.UnbiquadiumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.UnbiquadiumIngot, 1), new ItemStack(CosmicHorizonsCore.UnbiquadiumIngot, 1), new ItemStack(CosmicHorizonsCore.UnbiquadiumIngot, 1), new ItemStack(CosmicHorizonsCore.UnbiquadiumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.UnbiseptiumPlate), new Object[] { new ItemStack(CosmicHorizonsCore.UnbiseptiumIngot, 1), new ItemStack(CosmicHorizonsCore.UnbiseptiumIngot, 1), new ItemStack(CosmicHorizonsCore.UnbiseptiumIngot, 1), new ItemStack(CosmicHorizonsCore.UnbiseptiumIngot, 1) });
		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.plateTierSP1), new Object[] { new ItemStack(CosmicHorizonsCore.CeriumPlate, 1), new ItemStack(CosmicHorizonsCore.DysprosiumPlate, 1), new ItemStack(CosmicHorizonsCore.NeodymiumPlate, 1), new ItemStack(CosmicHorizonsCore.YttriumPlate, 1), new ItemStack(CosmicHorizonsCore.ScandPlate, 1), new ItemStack(CosmicHorizonsCore.YtterbiumPlate, 1), new ItemStack(CosmicHorizonsCore.ManganumPlate, 1), new ItemStack(CosmicHorizonsCore.StrontiumPlate, 1), new ItemStack(CosmicHorizonsCore.GalliumPlate, 1) });
		///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////
//		CompressorRecipes.addShapelessRecipe(new ItemStack(CosmicHorizonsCore.TranspristeelPlate), new Object[] { new ItemStack(CosmicHorizonsCore.TranspristeelIngot, 1), new ItemStack(CosmicHorizonsCore.TranspristeelIngot, 1), new ItemStack(CosmicHorizonsCore.TranspristeelIngot, 1), new ItemStack(CosmicHorizonsCore.TranspristeelIngot, 1) });
        ///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////// 
        //////////////////////////////////////////////////////////////
	    }
 
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) 
        {
        }

/*		public BlockAmalthea15 getAmaltheaalienplant() {
			return amaltheaalienplant;
		}

		public void setAmaltheaalienplant(BlockAmalthea15 amaltheaalienplant) {
			this.amaltheaalienplant = amaltheaalienplant;
		}
        */
    }