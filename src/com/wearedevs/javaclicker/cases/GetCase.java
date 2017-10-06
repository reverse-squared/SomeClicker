package com.wearedevs.javaclicker.cases;

import java.awt.TrayIcon.MessageType;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.cases.ClickCase;
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
			if(get100case) {
				return;
			}else {
				get100case = true;
				NotificationUtil.displayCaseNotif("New Case!", "You Have a New Case! Click Cases to Open It!", MessageType.INFO);
				giveCases();
			}
			
		}
		
		if(Main.clicks >= 500) {
			if(get500case) {
				return;
			}else {
				get500case = true;
				NotificationUtil.displayCaseNotif("New Case!", "You Have a New Case! Click Cases to Open It!", MessageType.INFO);
				giveCases();
			}
			
		}
	}
	
	public static void giveCases() {
		if(!get100case) {
			CaseHandler.unlock(new ClickCase());
		}

		if(!get500case) {
			CaseHandler.unlock(new ClickCase());
		}
	}
}

