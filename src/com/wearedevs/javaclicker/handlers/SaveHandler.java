package com.wearedevs.javaclicker.handlers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.handlers.saveloaders.SaveLoader1;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.sound.Sound;

public class SaveHandler {

	public static final String saveFilePath = System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save.dat";
	public static void save() {
		try {
			File saveFile = new File(saveFilePath);
			if(!saveFile.exists()) saveFile.createNewFile();
			
			PrintWriter w = new PrintWriter(saveFile);
			
			w.print(Main.VERSION_NUM+";");
			
			w.print(Main.clicks+";");

			for (ShopItem item : ShopHandler.items) {
				w.print(item.getClass().getName()+";");
			}
			
			w.print("END;");
			
			for (ShopItem item : ShopHandler.bought) {
				w.print(item.getClass().getName()+";");
			}
			
			w.print("END;");
			
			for (Case ccase : CaseHandler.caseList) {
				w.print(ccase.getClass().getName()+";");
			}
			
			w.print("END;");
			
			for (Sound snd : SoundUnlocker.clickSounds) {
				w.print(snd.getClass().getName()+";");
			}
			
			w.print("END");
			
			w.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void load() {
		File saveFile = new File(saveFilePath);
		if(saveFile.exists()) {
			ShopHandler.items = new ArrayList<ShopItem>();
			ShopHandler.bought = new ArrayList<ShopItem>();
			CaseHandler.caseList = new ArrayList<Case>();
			SoundUnlocker.clickSounds = new ArrayList<Sound>();
			try {
				Scanner s = new Scanner(saveFile);
				
				String str = "";
				
				while(s.hasNext()) {
					str += s.next();
				}
				
				String[] savearr = str.split(";");
				
				int vers = Integer.parseInt(savearr[0]);
				
				if(vers == 1) {
					SaveLoader1.load(savearr);
				} else {
					System.err.println("Invalid Save Version");
				}
				
				s.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
