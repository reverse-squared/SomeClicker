package com.wearedevs.javaclicker.handlers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.handlers.saveloaders.SaveLoader1;
import com.wearedevs.javaclicker.shop.ShopItem;

public class SaveHandler {

	public static final String saveFilePath = System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/save.dat";
	
	public static void save() {
		try {
			File saveFile = new File(saveFilePath);
			if(!saveFile.exists()) {
				saveFile.createNewFile();
			}
			
			PrintWriter w = new PrintWriter(saveFile);
			
			w.print(Main.VERSION_NUM+";");
			
			w.print(Main.clicks+";");
			
			w.print(Main.multiplier+";");
			
			w.print(Main.perClick+";");
			
			w.print(AutoHandler.autoClick+";");
			
			w.print(AutoHandler.clickBomb+";");
			
			w.print(AutoHandler.factory+";");
			
			w.print(AutoHandler.mine+";");
			
			w.print(AutoHandler.portal+";");

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
			
			w.print("END");
			
			w.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void load() {
		File saveFile = new File(saveFilePath);
		if(saveFile.exists()) {
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
