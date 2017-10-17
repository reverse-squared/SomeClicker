package com.wearedevs.someclicker.handlers;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.wearedevs.someclicker.sound.Sound;
import com.wearedevs.someclicker.sound.sounds.Default;

/**
 * Used for Unlocking of Different Sounds Though the Game.
 */
public class SoundUnlocker {
	public static Sound currentSound = new Default();
	public static ArrayList<Sound> clickSounds = new ArrayList<Sound>();
	private static boolean exit = false;
	public static void unlock(Sound sound) {
		exit = false;
		clickSounds.forEach(new Consumer<Sound>() {
			public void accept(Sound t) {
				if(t.getClass().getName() == sound.getClass().getName()) exit = true;
			}
		});
		if(exit) return;
		clickSounds.add(sound);
	}
}
