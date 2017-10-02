package com.wearedevs.javaclicker.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

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
