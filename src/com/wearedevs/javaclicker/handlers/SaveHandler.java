package com.wearedevs.javaclicker.handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import com.wearedevs.javaclicker.Main;

public class SaveHandler {
	static File file = new File("clicks.txt");
	static boolean exists = file.exists();
	
	public static void save() {		
		try{
		    PrintWriter writer = new PrintWriter(file);
		    writer.println(Main.clicks);
		    writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void load() {
		if(exists) {
			//Read clicks.txt
		}else {
			save();
		}
	}
}
