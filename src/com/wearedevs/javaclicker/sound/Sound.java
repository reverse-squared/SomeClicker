package com.wearedevs.javaclicker.sound;

public class Sound {
	public static Sound currentSound = new Sound("Default", "default.wav");
	public String label;
	public String fname;
	public Sound(String label,String fname) {
		this.label = label;
		this.fname = fname;
	}
	public String toString() {
		return label;
	}
}
