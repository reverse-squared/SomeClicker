package com.wearedevs.someclicker.mod;

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
	
	/**
	 * 	Use to Set the data
	 */
	public abstract String[] save();
	
	/**
	 * 	Get the data
	 */
	public abstract void load(String[] savefile);
}