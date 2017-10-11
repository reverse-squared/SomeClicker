package com.wearedevs.someclicker.cases;

import java.awt.TrayIcon.MessageType;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.cases.cases.ClickCase;
import com.wearedevs.someclicker.cases.cases.ClickMultiplierCase;
import com.wearedevs.someclicker.cases.cases.SoundCase;
import com.wearedevs.someclicker.handlers.CaseHandler;
import com.wearedevs.someclicker.util.NotificationUtil;
import com.wearedevs.someclicker.util.PlaySound;
import com.wearedevs.someclicker.util.WeightedCollection;

/**
 * Handles When and What Case a User Should Get.
 */
public class GetCase {
	public static double caseGoal = 100;
	
	public static void checkCases() {
		if(Main.clicks >= caseGoal) {
			caseGoal *= 2;
			WeightedCollection<Case> w = new WeightedCollection<Case>();
			
			w.add(50, new ClickCase());
			w.add(1, new ClickMultiplierCase());
			w.add(10, new SoundCase());
			
			CaseHandler.unlock(w.next());
			
			PlaySound.playSound("/sound/cases/get.wav");
			
			//TODO: Fix
			NotificationUtil.displayCaseNotif("New Case!", "You Have a New Case! Click Cases to Open It!", MessageType.INFO);
		}
	}
}

