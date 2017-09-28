package com.wearedevs.javaclicker.cases.cases;

import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.CaseOutcome;
import com.wearedevs.javaclicker.util.WeightedCollection;

public class SoundCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		
		//Bomb Click
		out.add(1, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "Bomb Click";
			}
		});
		
		//Rainbow Click
		out.add(1, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "Rainbow Click";
			}
		});
		
		return out;
	}

	public String getName() {
		return "SoundCase";
	}

}
