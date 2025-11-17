package geniussixtyfour.dev.mods.projectsun.Handler;

import micdoodle8.mods.galacticraft.api.vector.Vector3;

public class ColorHelper extends Vector3{
	public ColorHelper(int r, int g, int b){
		this.x = (double) r / 255.0D;
		this.y = (double) g / 255.0D;
		this.z = (double) b / 255.0D;
	}

}
