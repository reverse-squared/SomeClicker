package com.wearedevs.javaclicker.util;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Used For Playing Sounds
 */
public class PlaySound {
	/**
	 * @param soundName The Path to the Sound Like {@code res/sound/clickSound/default.wav}
	 */
	public static void playSound(String soundName) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		} catch(Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace( );
			
		}
    }
}
