package geniussixtyfour.dev.mods.projectsun.Asteroids.Vulcanoids.worldgen;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldChunkManagerSpace;
import net.minecraft.world.biome.BiomeGenBase;

public class WorldChunkManagerVulcanoids extends WorldChunkManagerSpace{

	@Override
	public BiomeGenBase getBiome() {
		return VulcanoidsBiomes.vulcanoids;
	}

}
