package com.wearedevs.javaclicker.handlers.saveloaders;

import java.util.ArrayList;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.GetCase;
import com.wearedevs.javaclicker.handlers.CaseHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.handlers.SoundUnlocker;
import com.wearedevs.javaclicker.mod.Mod;
import com.wearedevs.javaclicker.mod.ModLoader;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.sound.Sound;
import com.wearedevs.javaclicker.sound.sounds.Default;

public class SaveLoader2 {
	public static void load(String[] savearr) {
		Main.clicks = Double.parseDouble(savearr[1]);
		Main.updateCounter();
		
		GetCase.caseGoal = Double.parseDouble(savearr[2]);
		
		Class<?> sc;
		try {
			sc = ModLoader.loadClass(savearr[3]);
			Object so = sc.newInstance();
			if(so instanceof Sound) {
				//Its Good
				SoundUnlocker.currentSound = (Sound) so;
			} else {
				System.err.println(savearr[3]+" does not Extend Sound.");
				SoundUnlocker.currentSound = new Default();
			}
		} catch (ClassNotFoundException e1) {
			System.err.println(savearr[3] + " is Missing! Cannot Add!");
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		int i = 4;
		
		//Shop items
		while(!savearr[i].equals("END")) {
			try {
				Class<?> c = ModLoader.loadClass(savearr[i]);
				Object o = c.newInstance();
				
				if(o instanceof ShopItem) {
					//Its Good
					ShopHandler.items.add((ShopItem) o);
				} else {
					//Not Extends
					System.err.println(savearr[i]+" does not Extend ShopItem.");
				}
			} catch (ClassNotFoundException e) {
				System.err.println(savearr[i] + " is Missing! Cannot Add!");
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
			i++;
		}
		i++;
		
		ShopHandler.disable = true;
		//Shop Bought
		while(!savearr[i].equals("END")) {
			try {
				Class<?> c = ModLoader.loadClass(savearr[i]);
				Object o = c.newInstance();
				if(o instanceof ShopItem) {
					//Its Good
					((ShopItem) o).onPurchase();
					ShopHandler.bought.add((ShopItem) o);
				} else {
					//Not extends
					System.err.println(savearr[i]+" does not Extend ShopItem.");
				}
			} catch (ClassNotFoundException e) {
				System.err.println(savearr[i] + " is Missing! Cannot Add!");
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
			i++;
		}
		i++;
		ShopHandler.disable = false;
		//Cases
		while(!savearr[i].equals("END")) {
			try {
				Class<?> c = ModLoader.loadClass(savearr[i]);
				Object o = c.newInstance();
				
				if(o instanceof Case) {
					//Its Good
					CaseHandler.caseList.add((Case) o);
				} else {
					//Not extends
					System.err.println(savearr[i]+" does not Extend Case.");
				}
			} catch (ClassNotFoundException e) {
				System.err.println(savearr[i] + " is Missing! Cannot Add!");
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
			i++;
		}
		i++;
		
		//Sounds
		while(!savearr[i].equals("END")) {
			try {
				Class<?> c = ModLoader.loadClass(savearr[i]);
				Object o = c.newInstance();
				if(o instanceof Sound) {
					//Its Good
					SoundUnlocker.clickSounds.add((Sound) o);
				} else {
					//Not extends
					System.err.println(savearr[i]+" does not extend Sound.");
				}
			} catch (ClassNotFoundException e) {
				System.err.println(savearr[i] + " is missing! Cannot add");
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
			i++;
		}
		
		i++;
		//Mod's Data
		while(!savearr[i].equals("END")) {
			try {
				Class<?> c = ModLoader.loadClass(savearr[i]);
				if(c.getSuperclass().getName().equals(Mod.class.getName())) {
					for (Mod mod : Main.mods) {
						if(mod.getClass().getName()==c.getName()) {
							ArrayList<String> a = new ArrayList<String>();
							
							i++;
							while(!savearr[i].equals("END")) {
								String s = savearr[i];
								
								s = s.replaceAll("\\\\\\\\:", ":");
								s = s.replaceAll("\\\\:", ";");
								s = s.replaceAll("\\\\E", "END");
								s = s.replaceAll("\\\\\\\\\\\\", "\\\\");

								a.add(s);
								
								i++;
							}
							
							mod.load(a.toArray(new String[] {}));
						}
					}
				}
			} catch (ClassNotFoundException e) {
				System.err.println(savearr[i] + " is missing! Cannot load its moddata");
				while(!savearr[i].equals("END")) {
					i++;
				}
			}
			i++;
		}
	}
}
