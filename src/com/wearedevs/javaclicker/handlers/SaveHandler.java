package com.wearedevs.javaclicker.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.GetCase;

/**
 * Handles All The Saving and Loading Stuff
 *
 */
public class SaveHandler {
	
	public static File savePath = new File(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/");
	
	static File clicksFile = new File(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/clicks.txt");
	static boolean clicksExists = clicksFile.exists();
	
	static File casesFile = new File(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/cases.txt");
	static boolean casesExist = casesFile.exists();
	
	static File multiplierFile = new File(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/multiplier.txt");
	static boolean multiplierExists = multiplierFile.exists();

	static File soundFile = new File(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/sounds.txt");
	static boolean soundExists = soundFile.exists();
	
	static BufferedReader reader = null;
	
	/**
	 * Saves The Clicks
	 */
	public static void saveClicks() {		
		try{			
		    PrintWriter writer = new PrintWriter(clicksFile);
		    writer.println(Main.clicks);
		    writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Loads The Clicks
	 */
	public static void loadClicks() {
		if(clicksExists) {			
			try {
			    try {
					reader = new BufferedReader(new FileReader(clicksFile));
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			    
			    String savedClicks = null;

			    try {
					while ((savedClicks = reader.readLine()) != null) {					    
					    double loadedClicks = Double.parseDouble(savedClicks);
					    Main.clicks = loadedClicks;
					    Main.updateCounter();
					}
				} catch (NumberFormatException | IOException e) {
					e.printStackTrace();
				}
			    
			}finally {
				
			}
		}else {
			saveClicks();
		}
	}
	
	/**
	 * Save The Cases
	 */
	public static void saveCases() {
		try{			
		    PrintWriter writer = new PrintWriter(casesFile);
		    writer.println(GetCase.get100case);
		    writer.println(GetCase.get500case);
		    writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Load The Cases
	 */
	public static void loadCases() {
		if(casesExist) {			
			try {
				String line1 = Files.readAllLines(Paths.get(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/cases.txt")).get(0);
				String line2 = Files.readAllLines(Paths.get(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/cases.txt")).get(1);
				
				boolean saveCase100 = Boolean.parseBoolean(line1);
		    	boolean saveCase500 = Boolean.parseBoolean(line2);
		    	
		    	GetCase.get100case = saveCase100;
		    	GetCase.get500case = saveCase500;
		    	
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}else {
			saveCases();
		}
	}

	/**
	 * Saves The Multiplier
	 */
	public static void saveMultiplier() {		
		try{			
		    PrintWriter writer = new PrintWriter(multiplierFile);
		    writer.println(Main.multiplier);
		    writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Loads The Multiplier
	 */
	public static void loadMultiplier() {
		if(multiplierExists) {			
			try {
			    try {
					reader = new BufferedReader(new FileReader(multiplierFile));
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}

			    String savedMultiplier = null;
			    
			    try {
					while ((savedMultiplier = reader.readLine()) != null) {					    
					    double loadedMultiplier = Double.parseDouble(savedMultiplier);
					    Main.multiplier = loadedMultiplier;
					}
				} catch (NumberFormatException | IOException e) {
					e.printStackTrace();
				}
			    
			}finally {
				
			}
		}else {
			saveMultiplier();
		}
	}
	
	/**
	 * Saves The Sounds
	 */
	public static void saveSounds() {
		try{			
		    PrintWriter writer = new PrintWriter(soundFile);
		    
		    for(int i = 0; i <= (SoundUnlocker.clickSounds.size() - 1); i++) {
		    	writer.println(SoundUnlocker.clickSounds.get(i));
		    }
		    
		    writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void loadSounds() {
		if(multiplierExists) {
			//TODO: Do This But For The Amount of Sounds You Have
//			try {
//				String line2 = Files.readAllLines(Paths.get(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/sounds.txt")).get(1);				
//				SoundUnlocker.unlock(new Sound(line2, line2 + ".wav"));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}else {
			saveSounds();
		}
	}
}
