package com.wearedevs.javaclicker.handlers;

import java.util.ArrayList;

import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.CaseOutcome;
import com.wearedevs.javaclicker.util.WeightedCollection;

public class CaseHandler {
	public static ArrayList<Case> caseList = new ArrayList<Case>();
	public static int caseSpd;
	
	/**
	 * extra c because {@code case} keyword
	 */
	public static Case ccase;
	public static WeightedCollection<CaseOutcome> caseOutcomes;
	
	public static void openCase(Case c) {
		ccase = c;
		caseOutcomes = c.getAllOutcomes();
		caseSpd = 300;
		
	}
	/**
	 * Used By {@code AutoHandler}
	 */
	public static void tickCase(Case caseOpening) {
		caseSpd--;

		if (caseSpd <= 0) {
			//Open the case
			
			
			ccase = null;
			return;
		}
		
	}
}