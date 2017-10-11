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
	
	/**
	 * 	Use to Set the data
	 */
	public String[] save() {
		return null;
	}
	
	/**
	 * 	Get the data
	 */
	public void load(String[] savefile) {
		
	}
	
	/**
	 *  Called when the button is pressed, return the ammount of clicks should actually be clicked.
	 */
	public double onClick(double click) {
		return click;
	}
	
	/**
	 *  Called whenever the counter is updated.
	 */
	public void onUpdateCounter(double ammount) {

	}
	
	/**
	 *  Called 60 times a second.
	 *  Alternative to using TickHooks.
	 */
	public void onTick() {}
}