package com.wearedevs.javaclicker.handlers;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.wearedevs.javaclicker.Main;

/**
 * Handles All The Saving and Loading Stuff
 *
 */
public class SaveHandler {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	static File file = new File("clicks.txt");
	static boolean exists = file.exists();
	static BufferedReader reader = null;
	
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
			try {
			    try {
					reader = new BufferedReader(new FileReader(file));
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			    String text = null;

			    try {
					while ((text = reader.readLine()) != null) {
					    list.add(Integer.parseInt(text));
					}
				} catch (NumberFormatException | IOException e) {
					e.printStackTrace();
				}
			    
				Main.clicks = text;
			}finally {
				
			}
		}else {
			save();
		}
	}
}
