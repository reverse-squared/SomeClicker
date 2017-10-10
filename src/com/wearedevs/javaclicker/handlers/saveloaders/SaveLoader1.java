package com.wearedevs.javaclicker.handlers.saveloaders;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.GetCase;
import com.wearedevs.javaclicker.handlers.CaseHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.handlers.SoundUnlocker;
import com.wearedevs.javaclicker.mod.ModLoader;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.sound.Sound;

public class SaveLoader1 {
	public static void load(String[] savearr) {
		Main.clicks = Double.parseDouble(savearr[1]);
		Main.updateCounter();
		
		GetCase.caseGoal = Double.parseDouble(savearr[2]);
		int i = 3;
		
		//Shop items
		while(!savearr[i].equals("END")) {
			try {
				Class<?> c = ModLoader.loadClass(savearr[i]);
				Object o = c.newInstance();
				
				if(o instanceof ShopItem) {
					//Its Good
					ShopHandler.items.add((ShopItem) o);
				} else {
					//Not extends
					System.err.println(savearr[i]+" does not extend ShopItem.");
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
					System.err.println(savearr[i]+" does not extend ShopItem.");
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
					System.err.println(savearr[i]+" does not extend Case.");
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
	}
}
