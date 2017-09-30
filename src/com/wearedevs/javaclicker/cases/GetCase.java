package com.wearedevs.javaclicker.cases;

import java.awt.TrayIcon.MessageType;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.util.NotificationUtil;

public class GetCase {
	private static boolean get100case = false;
	private static boolean get500case = false;
	
	public static void checkCases() {
		if(Main.clicks >= 100) {
			if(!get100case) {
				return;
			}
			
			//Give Case Code Here
			NotificationUtil.displayNotif("You Have a New Case!", "Press the Cases Button to Open It!", MessageType.INFO);
			get100case = true;
		}
		
		if(Main.clicks >= 500) {
			if(!get500case) {
				return;
			}
			
			//Give Case Code Here
			NotificationUtil.displayNotif("You Have a New Case!", "Press the Cases Button to Open It!", MessageType.INFO);
			get500case = true;
		}
	}
}

