package com.wearedevs.someclicker.handlers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.cases.Case;
import com.wearedevs.someclicker.cases.GetCase;
import com.wearedevs.someclicker.handlers.saveloaders.SaveLoader1;
import com.wearedevs.someclicker.handlers.saveloaders.SaveLoader2;
import com.wearedevs.someclicker.mod.Mod;
import com.wearedevs.someclicker.shop.ShopItem;
import com.wearedevs.someclicker.sound.Sound;

public class SaveHandler {

	public static final String saveFilePath = System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save.dat";
	public static File saveFile = new File(saveFilePath);
	
	public static void save() {
		System.out.print("Attempting to Save... ");
		try {
			if(!saveFile.exists()) {
				saveFile.createNewFile();
			}
			
			PrintWriter w = new PrintWriter(saveFile);
			
			w.print(Main.VERSION_NUM+";");
			
			w.print(Main.clicks+";");

			w.print(GetCase.caseGoal+";");
			
			w.print(SoundUnlocker.currentSound.getClass().getName()+";");

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
			
			w.print("END;");
			
			for (Mod mod : Main.mods) {
				try {
					String[] a = mod.save();
					if(a==null) continue;
					w.print(mod.getClass().getName()+";");
					String[] b = a;
					int i = 0;
					for(String s : a) {
						b[i] = s.replaceAll("\\\\", "\\\\\\\\\\\\");
						b[i] = b[i].replaceAll("END", "\\\\E");
						b[i] = b[i].replaceAll(":", "\\\\\\\\:");
						b[i] = b[i].replaceAll(";", "\\\\:");
						i++;
					}
					String o = String.join(";", b);
					w.print(o + ";END;");
				} catch(AbstractMethodError e) {
					//Not a Huge Problem
					continue;
				}
			}
			
			w.print("END");
			w.close();
			
			System.out.println("Saved!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void load() {
		File saveFile = new File(saveFilePath);
		if(saveFile.exists()) {
			System.out.print("Loading Savefile... ");
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
	
				if(savearr[0].equals("1")) {
					System.out.println("Beta 1");
					SaveLoader1.load(savearr);
				} else if(savearr[0].equals("2")) {
					System.out.println("Beta 4");
					SaveLoader2.load(savearr);
				} else {
					System.out.println("Unknown!");
					System.err.println("Invalid Save Version (" + savearr[0] + ")");
				}
				
				s.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
