package com.wearedevs.javaclicker.cases.cases;

import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.CaseOutcome;
import com.wearedevs.javaclicker.util.WeightedCollection;

public class ClickCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		
		//Double Clicks
		out.add(94, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "Permanent Double Clicks";
			}
		});
		
		//Triple Clicks
		out.add(5, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "Permanent Triple Clicks";
			}
		});
		
		//Quadruple Clicks
		out.add(1, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "Permanent Quadruple Clicks";
			}
		});
		
		return out;
		
	}

	public String getName() {
		return "Click Mutiplier Case";
	}

}
