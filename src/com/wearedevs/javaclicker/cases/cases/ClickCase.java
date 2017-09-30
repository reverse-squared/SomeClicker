package com.wearedevs.javaclicker.cases.cases;

import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.CaseOutcome;
import com.wearedevs.javaclicker.util.WeightedCollection;

public class ClickCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		
		//500 Clicks
		out.add(60, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "500 Clicks";
			}
		});
		
		//1000 Clicks
		out.add(30, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "1000 Clicks";
			}
		});
		
		//5000 Clicks
		out.add(10, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "5000 Clicks";
			}
		});
		
		return out;
	}

	public String getName() {
		return "Click Case";
	}

}
