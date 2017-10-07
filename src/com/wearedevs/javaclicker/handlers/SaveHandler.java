package com.wearedevs.javaclicker.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.GetCase;

/**
 * Handles All The Saving and Loading Stuff
 *
 */
public class SaveHandler {
	
	private static final String line1 = null;
	private static final String line2 = null;

	public static File savePath = new File(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/");
	
	static File clicksFile = new File(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/clicks.txt");
	static boolean clicksExists = clicksFile.exists();
	
	static File casesFile = new File(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/cases.txt");
	static boolean casesExist = casesFile.exists();
	
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
		
		try {
			String line1 = Files.readAllLines(Paths.get(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/cases.txt")).get(0);
			String line2 = Files.readAllLines(Paths.get(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save/cases.txt")).get(1);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		if(casesExist) {			
			try {
			    try {
					reader = new BufferedReader(new FileReader(casesFile));
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			    
			    try {			    	
			    	GetCase.get100case = line1 != null;
			    	GetCase.get500case = line2 != null;
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			    
			}finally {
				
			}
		}else {
			saveCases();
		}
	}
}
