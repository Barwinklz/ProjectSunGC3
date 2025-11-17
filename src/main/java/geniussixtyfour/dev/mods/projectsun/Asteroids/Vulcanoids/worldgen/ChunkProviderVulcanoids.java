package geniussixtyfour.dev.mods.projectsun.Asteroids.Vulcanoids.worldgen;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.ChunkProviderSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.MapGenBaseMeta;
import micdoodle8.mods.galacticraft.core.blocks.GCBlocks;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedCreeper;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSpider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockFalling;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;

public class ChunkProviderVulcanoids extends ChunkProviderSpace {

    private ArrayList<AsteroidData> largeAsteroids = new ArrayList<AsteroidData>();
	
	private final BiomeDecoratorVulcanoids biomeDecorator = new BiomeDecoratorVulcanoids();

	public ChunkProviderVulcanoids(World par1World, long seed, boolean mapFeaturesEnabled) {
		super(par1World, seed, mapFeaturesEnabled);
	}
	  
	@Override
	protected BiomeDecoratorSpace getBiomeGenerator() {
		return this.biomeDecorator;
	}

	@Override
	protected BiomeGenBase[] getBiomesForGeneration() {
		return new BiomeGenBase[] { VulcanoidsBiomes.vulcanoids };
	}

	@Override
	protected int getSeaLevel() {
		return 0;
	}

	@Override
	protected List<MapGenBaseMeta> getWorldGenerators() {
		List<MapGenBaseMeta> generators = Lists.newArrayList();
		return generators;
	}

	@Override
	protected SpawnListEntry[] getMonsters() {
		List<BiomeGenBase.SpawnListEntry> monsters = new ArrayList<BiomeGenBase.SpawnListEntry>();
		monsters.add(new BiomeGenBase.SpawnListEntry(EntityEvolvedSpider.class, 8, 2, 3));
     	monsters.add(new BiomeGenBase.SpawnListEntry(EntityEvolvedCreeper.class, 8, 2, 3));
		return monsters.toArray(new BiomeGenBase.SpawnListEntry[monsters.size()]);
	}

	@Override
	protected SpawnListEntry[] getCreatures() {
		return new BiomeGenBase.SpawnListEntry[0];
	}

	@Override
	protected BlockMetaPair getGrassBlock() {
		return new BlockMetaPair(Blocks.air, (byte) 0);
	}

	@Override
	protected BlockMetaPair getDirtBlock() {
		return new BlockMetaPair(Blocks.air, (byte) 0);
	}

	@Override
	protected BlockMetaPair getStoneBlock() {
		return new BlockMetaPair(Blocks.air, (byte) 0);
	}

	@Override
	public double getHeightModifier() {
		return 235;
	}

	@Override
	public double getSmallFeatureHeightModifier() {
		return 235;
	}

	@Override
	public double getMountainHeightModifier() {
		return 235;
	}

	@Override
	public double getValleyHeightModifier() {
		return 235;
	}

	@Override
	public int getCraterProbability() {
		return 7555;
	}

	@Override
	public void onChunkProvide(int cX, int cZ, Block[] blocks, byte[] metadata) {
	}

	 @Override
	    public void populate(IChunkProvider par1IChunkProvider, int par2, int par3)
	    {
	        BlockFalling.fallInstantly = true;
	        final int var4 = par2 * 16;
	        final int var5 = par3 * 16;
	        this.worldObj.getBiomeGenForCoords(var4 + 16, var5 + 16);
	        this.rand.setSeed(this.worldObj.getSeed());
	        final long var7 = this.rand.nextLong() / 2L * 2L + 1L;
	        final long var9 = this.rand.nextLong() / 2L * 2L + 1L;
	        this.rand.setSeed(par2 * var7 + par3 * var9 ^ this.worldObj.getSeed());
	       
	        this.decoratePlanet(this.worldObj, this.rand, var4, var5);
	        BlockFalling.fallInstantly = false;
	    }
	 
	@Override
	public void recreateStructures(int par1, int par2) {
	}

	@Override
	public void onPopulate(IChunkProvider provider, int cX, int cZ) {
	}

	  public void generateSkylightMap(Chunk chunk, int cx, int cz)
	    {
	    	World w = chunk.worldObj;
	    	boolean flagXChunk = w.getChunkProvider().chunkExists(cx - 1, cz);
	    	boolean flagZUChunk = w.getChunkProvider().chunkExists(cx, cz + 1);
	    	boolean flagZDChunk = w.getChunkProvider().chunkExists(cx, cz - 1);
	       	boolean flagXZUChunk = w.getChunkProvider().chunkExists(cx - 1, cz + 1);
	    	boolean flagXZDChunk = w.getChunkProvider().chunkExists(cx - 1, cz - 1);

	    	for (int j = 0; j < 16; j++)
	    	{
	    		if (chunk.getBlockStorageArray()[j] == null) chunk.getBlockStorageArray()[j] = new ExtendedBlockStorage(j << 4, false);
	    	}

	    	int i = chunk.getTopFilledSegment();
	    	chunk.heightMapMinimum = Integer.MAX_VALUE;

	    	for (int j = 0; j < 16; ++j)
	    	{
	    		int k = 0;

	    		while (k < 16)
	    		{
	    			chunk.precipitationHeightMap[j + (k << 4)] = -999;
	    			int y = i + 15;

	    			while (true)
	    			{
	    				if (y > 0)
	    				{
	    					if (chunk.func_150808_b(j, y - 1, k) == 0)
	    					{
	    						--y;
	    						continue;
	    					}

	    					chunk.heightMap[k << 4 | j] = y;

	    					if (y < chunk.heightMapMinimum)
	    					{
	    						chunk.heightMapMinimum = y;
	    					}
	    				}

	    				++k;
	    				break;
	    			}
	    		}
	    	}
	      	
	     	for (AsteroidData a : this.largeAsteroids)
	    	{
	    		int yMin = a.asteroidYArray - a.asteroidSizeArray;
	    		int yMax = a.asteroidYArray + a.asteroidSizeArray;
	    		int xMin = a.xMinArray;
	    		if (yMin < 0) yMin = 0;
	    		if (yMax > 255) yMax = 255;
	    		if (xMin == 0) xMin = 1;
	    		for (int x = a.xMax - 1; x >= xMin; x--)
	    		{
	    			for (int z = a.zMinArray; z < a.zMax; z++)
	    			{
	    				for (int y = yMin; y < yMax; y++)
	    				{
	    					if (chunk.getBlock(x - 1, y, z) instanceof BlockAir && !(chunk.getBlock(x, y, z) instanceof BlockAir))
	    					{
	    						int count = 2;
	    						 
	    						if (x > 1)
	    						{
	    							if ((chunk.getBlock(x - 2, y, z) instanceof BlockAir)) count+=2;
	    						}
	    						if (x > 2)
	    						{
	    							if ((chunk.getBlock(x - 3, y, z) instanceof BlockAir)) count+=2;
	    							if ((chunk.getBlock(x - 3, y + 1, z) instanceof BlockAir)) count++;
	    							if ((chunk.getBlock(x - 3, y + 1, z) instanceof BlockAir)) count++;
	    							if ((z > 0 /*|| ((xPos & 15) > 2 ? flagZDChunk : flagXZDChunk)*/) && (chunk.getBlock(x - 3, y, z - 1) instanceof BlockAir)) count++;
	    							if ((z < 15/* || ((xPos & 15) > 2 ? flagZUChunk : flagXZUChunk)*/) && (chunk.getBlock(x - 3, y, z + 1) instanceof BlockAir)) count++;
	    						}
	    						if (/*flagXChunk || */x > 3)
	    						{
	    							if ((chunk.getBlock(x - 4, y, z) instanceof BlockAir)) count+=2;
	    							if ((chunk.getBlock(x - 4, y + 1, z) instanceof BlockAir)) count++;
	    							if ((chunk.getBlock(x - 4, y + 1, z) instanceof BlockAir)) count++;
	    							if ((z > 0/* || ((xPos & 15) > 3 ? flagZDChunk : flagXZDChunk)*/) && !(chunk.getBlock(x - 4, y, z - 1) instanceof BlockAir)) count++;
	    							if ((z < 15/* || ((xPos & 15) > 3 ? flagZUChunk : flagXZUChunk)*/) && !(chunk.getBlock(x - 4, y, z + 1) instanceof BlockAir)) count++;
	    						}
	    						if (count > 12) count = 12;
	    						chunk.func_150807_a(x - 1, y, z, GCBlocks.brightAir, 13 - count);
	                            ExtendedBlockStorage extendedblockstorage = chunk.getBlockStorageArray()[y >> 4];
	                            if (extendedblockstorage != null)
	                            {
	                                extendedblockstorage.setExtBlocklightValue(x - 1, y & 15, z, count + 2);
	                            }
	   						}
	    				}
	    			}
	    		}
	    	}

	    	chunk.isModified = true;
	    }
	
	  private class AsteroidData
	    {
	 		public boolean isHollow;
	    	public float[] sizeYArray;
	        public int xMinArray;
	        public int zMinArray;
	        public int xMax;
	        public int zMax;
	        public int zSizeArray;
	        public int asteroidSizeArray;
	        public int asteroidXArray;
	        public int asteroidYArray;
	        public int asteroidZArray;

	        public AsteroidData(boolean hollow, float[] sizeYArray2, int xMin, int zMin, int xmax, int zmax, int zSize, int size, int asteroidX, int asteroidY, int asteroidZ)
	        {
	 			this.isHollow = hollow;
	        	this.sizeYArray = sizeYArray2.clone();
	 			this.xMinArray = xMin;
	 			this.zMinArray = zMin;
	 			this.xMax = xmax;
	 			this.zMax = zmax;
	 			this.zSizeArray = zSize;
	 			this.asteroidSizeArray = size;
	 			this.asteroidXArray = asteroidX;
	 			this.asteroidYArray = asteroidY;
	 			this.asteroidZArray = asteroidZ;
	 		}
	   }
}
