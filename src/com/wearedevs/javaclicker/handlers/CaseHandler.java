package com.wearedevs.javaclicker.handlers;

import java.util.ArrayList;

import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.CaseOutcome;
import com.wearedevs.javaclicker.util.WeightedCollection;

public class CaseHandler {
	public static ArrayList<Case> caseList = new ArrayList<Case>();
	
	public static void openCase(Case c) {
		WeightedCollection<CaseOutcome> out = c.getAllOutcomes();
		caseList.add(new String("lol"));
		System.out.println(cases);
		
		//Chose the random
		CaseOutcome chosen = out.next();
		chosen.onOutcome();
		
		chosen.getClass();
		
	}
}