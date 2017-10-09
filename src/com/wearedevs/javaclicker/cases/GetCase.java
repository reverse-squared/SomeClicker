package com.wearedevs.javaclicker.cases;

import java.awt.TrayIcon.MessageType;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.cases.ClickCase;
import com.wearedevs.javaclicker.cases.cases.ClickMultiplierCase;
import com.wearedevs.javaclicker.cases.cases.SoundCase;
import com.wearedevs.javaclicker.handlers.CaseHandler;
import com.wearedevs.javaclicker.util.NotificationUtil;
import com.wearedevs.javaclicker.util.PlaySound;
import com.wearedevs.javaclicker.util.WeightedCollection;

/**
 * Handles When and What Case a User Should Get.
 */
public class GetCase {
	public static double caseGoal = 100;
	
	public static void checkCases() {
		if(Main.clicks >= caseGoal) {
			caseGoal *= 2;
			WeightedCollection<Case> w = new WeightedCollection<Case>();
			
			w.add(10, new ClickCase());
			w.add(1, new ClickMultiplierCase());
			w.add(8, new SoundCase());
			
			CaseHandler.unlock(w.next());
			
			PlaySound.playSound("/sound/cases/buy.wav");
			NotificationUtil.displayCaseNotif("New Case!", "You Have a New Case! Click Cases to Open It!", MessageType.INFO);
		}
	}
}

