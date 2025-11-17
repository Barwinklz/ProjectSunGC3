package geniussixtyfour.dev.mods.projectsun.Asteroids.Vulcanoids.worldgen;

import java.util.Random;

import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedCreeper;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSkeleton;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSpider;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedZombie;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import micdoodle8.mods.galacticraft.planets.asteroids.world.gen.BiomeGenBaseAsteroids;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.Height;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;
import net.minecraftforge.common.BiomeDictionary;

public class VulcanoidsBiomes extends BiomeGenBase
{
    public static final BiomeGenBase vulcanoids = new VulcanoidsBiomes(71).setBiomeName("vulcanoids");

    private VulcanoidsBiomes(int var1)
    {
        super(var1);
        this.spawnableWaterCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.resetMonsterListByMode(ConfigManagerCore.challengeMobDropsAndSpawning);
        this.rainfall = 0F;
        if (!ConfigManagerCore.disableBiomeTypeRegistrations)
        {
            BiomeDictionary.registerBiomeType(this, BiomeDictionary.Type.COLD, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.SPOOKY);
        }
    }
    
    public void resetMonsterListByMode(boolean challengeMode)
    {
        this.spawnableMonsterList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedZombie.class, 3000, 1, 3));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedSpider.class, 2000, 1, 2));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedSkeleton.class, 1500, 1, 1));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedCreeper.class, 2000, 1, 1));
        if (challengeMode) this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, 250, 1, 1));
    }

    @Override
    public VulcanoidsBiomes setColor(int var1)
    {
        return (VulcanoidsBiomes) super.setColor(var1);
    }

    @Override
    public float getSpawningChance()
    {
        return 0.01F;
    }
}
