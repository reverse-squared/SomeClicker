package com.wearedevs.javaclicker.cases;

import java.awt.TrayIcon.MessageType;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.cases.*;
import com.wearedevs.javaclicker.handlers.CaseHandler;
import com.wearedevs.javaclicker.handlers.SaveHandler;
import com.wearedevs.javaclicker.util.NotificationUtil;

/**
 * Handles When and What Case a User Should Get.
 */
public class GetCase {
	public static boolean get100case = true;
	public static boolean get500case = true;
	
	public static void checkCases() {
		if(Main.clicks >= 100 && !get100case) {
			get100case = true;
			giveClickCase();
			NotificationUtil.displayCaseNotif("New Case!", "You Have a New Case! Click Cases to Open It!", MessageType.INFO);
		}
		
		if(Main.clicks >= 500 && !get500case) {
			get500case = true;
			giveClickCase();
			NotificationUtil.displayCaseNotif("New Case!", "You Have a New Case! Click Cases to Open It!", MessageType.INFO);
		}
	}
	
	public static void giveClickCase() {
		CaseHandler.unlock(new ClickCase());
		saveCases();
	}
	
	public static void giveClickMultiplierCase() {
		CaseHandler.unlock(new ClickMultiplierCase());
		saveCases();
	}
	
	public static void giveSoundCase() {
		CaseHandler.unlock(new SoundCase());
		saveCases();
	}
	
	public static void saveCases() {
		SaveHandler.saveCases();
	}
}

