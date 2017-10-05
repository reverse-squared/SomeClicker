package com.wearedevs.javaclicker.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.util.RandomUtil;

/**
 * Handles All The Saving and Loading Stuff
 *
 */
public class SaveHandler {
	
	static File file = new File("clicks.txt");
	static boolean exists = file.exists();
	static BufferedReader reader = null;
	
	/**
	 * Saves The Game
	 */
	public static void save() {		
		try{
		    PrintWriter writer = new PrintWriter(file);
		    writer.println(RandomUtil.randomRange(1, 1000) + Main.clicks + RandomUtil.randomRange(1, 1000));
		    writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Loads The Game
	 */
	public static void load() {
		if(exists) {			
			try {
			    try {
					reader = new BufferedReader(new FileReader(file));
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
			save();
		}
	}
}
