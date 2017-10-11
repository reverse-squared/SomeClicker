package com.wearedevs.someclicker.cases.cases;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.cases.Case;
import com.wearedevs.someclicker.cases.CaseOutcome;
import com.wearedevs.someclicker.util.WeightedCollection;

public class ClickMultiplierCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();

		//Double Clicks
		out.add(75, new CaseOutcome() {
			public void onOutcome() {
				BaseMod.multiplier *= 2;
			}

			public String getName() {
				return "Permanent Double Clicks";
			}
		});

		//Triple Clicks
		out.add(10, new CaseOutcome() {
			public void onOutcome() {
				BaseMod.multiplier *= 3;
			}

			public String getName() {
				return "Permanent Triple Clicks";
			}
		});

		//Quadruple Clicks
		out.add(5, new CaseOutcome() {
			public void onOutcome() {
				BaseMod.multiplier *= 4;
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
