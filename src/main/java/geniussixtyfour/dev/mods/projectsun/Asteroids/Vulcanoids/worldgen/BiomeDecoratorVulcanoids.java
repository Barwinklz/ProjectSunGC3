package geniussixtyfour.dev.mods.projectsun.Asteroids.Vulcanoids.worldgen;

import java.util.Random;

import micdoodle8.mods.galacticraft.api.event.wgen.GCCoreEventPopulate;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.core.world.gen.WorldGenMinableMeta;
import micdoodle8.mods.galacticraft.planets.asteroids.blocks.AsteroidBlocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;

public class BiomeDecoratorVulcanoids extends BiomeDecoratorSpace {
	
	private World currentWorld;

	private World worldObj;
	private Random randomGenerator;
	
	private int chunkX;
	private int chunkZ;
	
	public BiomeDecoratorVulcanoids() {
    }

	@Override
	protected void setCurrentWorld(World world) {
		this.currentWorld = world;
	}

	@Override
	protected World getCurrentWorld() {
		return this.currentWorld;
	}

	public void decorate(World worldObj, Random rand, int chunkX, int chunkZ) {
		if (this.worldObj != null) {
			System.out.println("Already decorating!");
		}else{
			this.worldObj = worldObj;
			this.randomGenerator = rand;
			this.chunkX = chunkX;
			this.chunkZ = chunkZ;
			this.generateVulcanoids();
			this.worldObj = null;
			this.randomGenerator = null;
		}
		}
		
		void genStandardOre1(int amountPerChunk, WorldGenerator worldgenerator, int minY, int maxY) {
			for(int a = 0; a < amountPerChunk; a++) {
				final int var6 = this.chunkX + this.randomGenerator.nextInt(16);
				final int var7 = this.randomGenerator.nextInt(minY + (maxY-minY)); 
				final int var8 = this.chunkZ + this.randomGenerator.nextInt(16);
				worldgenerator.generate(this.worldObj, this.randomGenerator, var6, var7, var8);
			}
		}
		
		void generateVulcanoids() {
			MinecraftForge.EVENT_BUS.post(new GCCoreEventPopulate.Pre(this.worldObj, this.randomGenerator, this.chunkX, this.chunkZ));
			MinecraftForge.EVENT_BUS.post(new GCCoreEventPopulate.Post(this.worldObj, this.randomGenerator, this.chunkX, this.chunkZ));
	}

		@Override
		protected void decorate() {
		}
}
