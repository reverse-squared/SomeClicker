package com.wearedevs.javaclicker.cases;

import com.wearedevs.javaclicker.Main;

/**
 * Handles When and What Case a User Should Get.
 */
public class GetCase {
	private static boolean get100case = false;
	private static boolean get500case = false;
	
	public static void checkCases() {
		if(Main.clicks >= 100) {
			if(!get100case) {
				return;
			}
			
			get100case = true;
			giveCases();
		}
		
		if(Main.clicks >= 500) {
			if(!get500case) {
				return;
			}
			
			get500case = true;
			giveCases();
		}
	}
	
	public static void giveCases() {
		if(get100case) {
			//TODO: Add Achieved Cases to an Array?
		}

		if(get500case) {
			//TODO: Add Achieved Cases to an Array?
		}
	}
}

