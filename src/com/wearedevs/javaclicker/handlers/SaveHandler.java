package com.wearedevs.javaclicker.handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import com.wearedevs.javaclicker.Main;

/**
 * Handles All The Saving and Loading Stuff
 *
 */
public class SaveHandler {
	static File file = new File("clicks.txt");
	static boolean exists = file.exists();
	
	/**
	 * Saves The Game
	 */
	public static void save() {		
		try{
		    PrintWriter writer = new PrintWriter(file);
		    writer.println(Main.clicks);
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
			//TODO: Read clicks.txt
		}else {
			save();
		}
	}
}
