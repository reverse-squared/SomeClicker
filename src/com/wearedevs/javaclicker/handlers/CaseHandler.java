package com.wearedevs.javaclicker.handlers;

import java.util.ArrayList;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.CaseOutcome;
import com.wearedevs.javaclicker.gui.CaseOpenPanel;
import com.wearedevs.javaclicker.util.PlaySound;
import com.wearedevs.javaclicker.util.WeightedCollection;

public class CaseHandler {
	public static ArrayList<Case> caseList = new ArrayList<Case>();
	public static int caseSpd;
	public static int caseDelay;
	public static int caseDelay2;
	
	/**
	 * extra c because {@code case} keyword
	 */
	public static Case ccase;
	public static WeightedCollection<CaseOutcome> caseOutcomes;
	
	public static void openCase(Case c) {
		ccase = c;
		caseOutcomes = c.getAllOutcomes();
		caseSpd = 0;
		caseDelay = 100;
		caseDelay2 = 0;
		
		Main.caseOpenPanel = new CaseOpenPanel(c);
		Main.main.setContentPane(Main.caseOpenPanel);
	}
	
	/**
	 * Used By {@code AutoHandler}
	 */
	public static void tickCase(Case caseOpening) {
		if(caseDelay>0) {
			caseDelay--;
		}
		caseDelay2--;
		if(caseDelay2<=0) {
			//OPEN A CASE
			CaseOutcome open = caseOutcomes.next();
			if(caseDelay<=0) {
				caseSpd++;
				PlaySound.playSound("/sound/cases/tick.wav");
				System.out.println(caseSpd);
				if(caseSpd>25) {
					//Stop
					open.onOutcome();
					ccase = null;
					Main.caseOpenPanel.btnGoBack.setVisible(true);
					PlaySound.playSound("/sound/cases/buy.wav");
				}
			}
			
			caseDelay2 = caseSpd;
			//TODO: Sound
			Main.caseOpenPanel.label_opening.setText(open.getName());
		}
		
	}
}