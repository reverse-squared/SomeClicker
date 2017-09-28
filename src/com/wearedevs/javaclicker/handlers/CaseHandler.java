package com.wearedevs.javaclicker.handlers;

import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.CaseOutcome;
import com.wearedevs.javaclicker.util.WeightedCollection;

public class CaseHandler {
	public static void openCase(Case c) {
		WeightedCollection<CaseOutcome> out = c.getAllOutcomes();
		
		
		//Chose the random
		CaseOutcome chosen = out.next();
		chosen.onOutcome();
		
		chosen.getClass();
		
	}
}