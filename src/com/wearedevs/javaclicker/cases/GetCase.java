package com.wearedevs.javaclicker.cases;

import java.awt.TrayIcon.MessageType;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.cases.*;
import com.wearedevs.javaclicker.handlers.CaseHandler;
import com.wearedevs.javaclicker.util.NotificationUtil;

/**
 * Handles When and What Case a User Should Get.
 */
public class GetCase {
	private static boolean get100case = false;
	private static boolean get500case = false;
	
	public static void checkCases() {
		if(Main.clicks >= 100) {
			if(!get100case) {
				get100case = true;
				giveClickCase();
				NotificationUtil.displayCaseNotif("New Case!", "You Have a New Case! Click Cases to Open It!", MessageType.INFO);
			}
		}
		
		if(Main.clicks >= 500) {
			if(!get500case) {
				get500case = true;
				giveClickCase();
				NotificationUtil.displayCaseNotif("New Case!", "You Have a New Case! Click Cases to Open It!", MessageType.INFO);
			}
		}
	}
	
	public static void giveClickCase() {
		CaseHandler.unlock(new ClickCase());
	}
	
	public static void giveClickMultiplierCase() {
		CaseHandler.unlock(new ClickMultiplierCase());
	}
	
	public static void giveSoundCase() {
		CaseHandler.unlock(new SoundCase());
	}
}

