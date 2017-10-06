package com.wearedevs.javaclicker.cases.cases;

import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.CaseOutcome;
import com.wearedevs.javaclicker.util.WeightedCollection;

public class BackgroundCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		
		//Earth
		out.add(40, new CaseOutcome() {
			public void onOutcome() {
				//TODO: Add Background Switcher
			}
			
			public String getName() {
				return "Earth Background";
			}
		});
		
		//Space
		out.add(20, new CaseOutcome() {
			public void onOutcome() {
				//TODO: Add Background Switcher
			}
			
			public String getName() {
				return "Space Background";
			}
		});
		
		//Stars
		out.add(40, new CaseOutcome() {
			public void onOutcome() {
				//TODO: Add Background Switcher
			}
			public String getName() {
				return "Stary Background";
			}
		});
		
		//TODO: More Backgrounds
		
		return out;
	}

	public String getName() {
		return "Click Case";
	}

}
