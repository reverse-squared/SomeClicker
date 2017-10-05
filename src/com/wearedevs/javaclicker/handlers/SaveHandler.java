package com.wearedevs.javaclicker.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import com.wearedevs.javaclicker.Main;

/**
 * Handles All The Saving and Loading Stuff
 *
 */
public class SaveHandler {
	
	static File clicksFile = new File(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/clicks.txt");
	static File clicksPath = new File(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/");
	static boolean exists = clicksFile.exists();
	static BufferedReader reader = null;
	
	/**
	 * Saves The Clicks
	 */
	public static void saveClicks() {		
		try{
			clicksPath.mkdirs();
			
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
		if(exists) {			
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
}
