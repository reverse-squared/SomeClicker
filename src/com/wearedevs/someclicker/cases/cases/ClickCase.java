package com.wearedevs.someclicker.cases.cases;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.cases.Case;
import com.wearedevs.someclicker.cases.CaseOutcome;
import com.wearedevs.someclicker.util.WeightedCollection;

public class ClickCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		final double clicks = 100 * Math.round(Main.clicks / 100);
		double w = 100;
		for (int i = 0; i <= clicks * 2; i += 1) {
			final int j = i;
			w-=0.003;
			out.add((int) w, new CaseOutcome() {
				public void onOutcome() {
					Main.clicks += clicks + j;
				}
				public String getName() {
					return (int)(clicks + j) + " Clicks";
				}
			});
			
		}
		return out;
	}

	public String getName() {
		return "Click Case";
	}

}
