package com.wearedevs.javaclicker.handlers;

import java.util.ArrayList;

import com.wearedevs.javaclicker.sound.Sound;
import com.wearedevs.javaclicker.sound.sounds.Default;

/**
 * Used for Unlocking of Different Sounds Though the Game.
 */
public class SoundUnlocker {
	public static Sound currentSound = new Default();
	public static ArrayList<Sound> clickSounds = new ArrayList<Sound>();
	public static void unlock(Sound sound) {
		clickSounds.add(sound);
	}
}
