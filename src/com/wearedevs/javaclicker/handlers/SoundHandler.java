package com.wearedevs.javaclicker.handlers;

import java.util.ArrayList;

import com.wearedevs.javaclicker.sound.Sound;

public class SoundHandler {
	//Handles Unlocking of Sounds
	public static Sound currentSound = new Sound("Default", "default.wav");
	public static ArrayList<Sound> clickSounds = new ArrayList<Sound>();
	public static void unlock(Sound sound) {
		clickSounds.add(sound);
	}
}
