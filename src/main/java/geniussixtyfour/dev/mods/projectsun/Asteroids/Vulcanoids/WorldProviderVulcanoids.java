package geniussixtyfour.dev.mods.projectsun.Asteroids.Vulcanoids;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import geniussixtyfour.dev.mods.projectsun.ProjectSunCore;
import geniussixtyfour.dev.mods.projectsun.Asteroids.Vulcanoids.worldgen.ChunkProviderVulcanoids;
import geniussixtyfour.dev.mods.projectsun.Asteroids.Vulcanoids.worldgen.WorldChunkManagerVulcanoids;
import geniussixtyfour.dev.mods.projectsun.Proxy.ClientProxy;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IGalacticraftWorldProvider;
import micdoodle8.mods.galacticraft.api.world.ISolarLevel;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import net.minecraft.util.MathHelper;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;

public class WorldProviderVulcanoids extends WorldProviderSpace implements IGalacticraftWorldProvider, ISolarLevel {
	@Override
	public Vector3 getFogColor() {
		float f = 195F - this.getStarBrightness(0.35F);
		return new Vector3(0F / 0F * f, 0F / 0F * f, 0F / 0F * f);
	}

	@Override
	public Vector3 getSkyColor() {
		float f = 195F - this.getStarBrightness(0.35F);
		return new Vector3(0 / 0.0F * f, 0 / 0F * f, 0 / 0F * f);
	}

	@Override
	public boolean canRainOrSnow() {
		return false;
	}

	@Override
	public boolean hasSunset() {
		return false;
	}

	@Override
	public long getDayLength() {
		return 999999;
	}

	@Override
	public boolean shouldForceRespawn() {
		return !ConfigManagerCore.forceOverworldRespawn;
	}

	@Override
	public Class<? extends IChunkProvider> getChunkProviderClass() {
		return ChunkProviderVulcanoids.class;
	}

	@Override
	public Class<? extends WorldChunkManager> getWorldChunkManagerClass() {
		return WorldChunkManagerVulcanoids.class;
	}

	@Override
    @SideOnly(Side.CLIENT)
    public float getStarBrightness(float par1)
    {
        final float var2 = this.worldObj.getCelestialAngle(par1);
        float var3 = 0.35F - (MathHelper.cos(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.25F);

        if (var3 < 0.0F)
        {
            var3 = 0.0F;
        }

        if (var3 > 1.0F)
        {
            var3 = 1.0F;
        }

        return var3 * var3 * 0.5F + 0.3F;
    }

	@Override
	public boolean isSkyColored() {
		return true;
	}

	@Override
	public double getHorizon() {
		return 0;
	}

	@Override
	public int getAverageGroundLevel() {
		return 0;
	}

	@Override
	public boolean canCoordinateBeSpawn(int var1, int var2) {
		return true;
	}
	
	@Override
    public boolean isSurfaceWorld()
    {
        return false;
    }
	
	@Override
	public float getGravity() {
			return 0.0685F;
	}

	@Override
	public double getMeteorFrequency() {
		return 0D;
	}

	@Override
	public double getFuelUsageMultiplier() {
		return 1.5D;
	}

	@Override
	public double getSolarEnergyMultiplier() {
		return 5.0D;
	}

	@Override
	public boolean canSpaceshipTierPass(int tier) {
		return tier>1;
	}

	@Override
	public float getFallDamageModifier() {
		return 0;
	}

	@Override
	public float getSoundVolReductionAmount() {
		return 10.0F;
	}
	
	@Override
	public CelestialBody getCelestialBody() {
		return ProjectSunCore.solarSystemSolStar.getMainStar();
	}

	@SideOnly(Side.CLIENT)
	@Override 
	public IRenderHandler getSkyRenderer()
	{ 
		return ClientProxy.VulcanoidsSkyProvider; 
	}
	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getCloudRenderer(){
		
		return ClientProxy.CloudRenderer;
	}
	
	@Override
	public boolean hasBreathableAtmosphere() {
		return false;
	}

	@Override
	public float getThermalLevelModifier() {
		return 1;
	}

	@Override
	public float getWindLevel() {
		return 999.0F;
	}
}