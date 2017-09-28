package com.wearedevs.javaclicker.cases.cases;

import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.CaseOutcome;
import com.wearedevs.javaclicker.util.WeightedCollection;

public class SoundCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		
		//Bomb
		out.add(60, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "Bomb Click Sound";
			}
		});
		
		//Rainbow
		out.add(30, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "Rainbow Click Sound";
			}
		});
		
		//Airhorn
		out.add(10, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "Airhorn Click Sound";
			}
		});
		
		//Fart
		out.add(20, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "Fart Click Sound";
			}
		});
		
		return out;
	}

	public String getName() {
		return "Sound Case";
	}

}
