package com.wearedevs.someclicker.sound;

public abstract class Sound {

	public String toString() {
		return getName();
	}

	public abstract String getName();
	
	public abstract String getFileName();
}
