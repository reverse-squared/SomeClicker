package com.wearedevs.javaclicker.util;

import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import com.wearedevs.javaclicker.Main;

/**
 * Used For Playing Sounds
 */
public class PlaySound {
	/**
	 * @param soundName The Path to the Sound Like {@code sound/clickSound/default.wav}
	 */
	@SuppressWarnings("unused")
	public static void playSound(String soundName) {
		try {
		     InputStream is = Main.main.getClass().getResourceAsStream(soundName);
		     AudioInputStream inputStream = AudioSystem.getAudioInputStream(Main.main.getClass().getResource(soundName));
		     Clip clip = AudioSystem.getClip();
		     clip.open(inputStream);
		     clip.start();
			
		} catch(Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace( );
			
		}
    }
}
