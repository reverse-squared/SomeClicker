package com.wearedevs.someclicker.handlers;

import java.util.ArrayList;

import com.wearedevs.someclicker.sound.Sound;
import com.wearedevs.someclicker.sound.sounds.Default;

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
