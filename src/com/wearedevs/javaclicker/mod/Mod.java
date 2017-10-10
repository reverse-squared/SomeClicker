package com.wearedevs.javaclicker.mod;

/**
 * Mods
 */
public abstract class Mod {
	
	public String name;

	/**
	 *  Do all your main code here
	 */
	public abstract void preInit();
	
	/**
	 * 	Use for communication between mods, or something?
	 */
	public abstract void postInit();
}