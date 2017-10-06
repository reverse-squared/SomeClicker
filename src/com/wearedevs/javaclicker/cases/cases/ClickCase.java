package com.wearedevs.javaclicker.cases.cases;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.CaseOutcome;
import com.wearedevs.javaclicker.util.WeightedCollection;

public class ClickCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		
		//500 Clicks
		out.add(75, new CaseOutcome() {
			public void onOutcome() {
				Main.clicks += 500;
			}
			
			public String getName() {
				return "500 Clicks";
			}
		});
		
		//750 Clicks
		out.add(50, new CaseOutcome() {
			public void onOutcome() {
				Main.clicks += 750;
			}
			
			public String getName() {
				return "750 Clicks";
			}
		});
		
		//1000 Clicks
		out.add(40, new CaseOutcome() {
			public void onOutcome() {
				Main.clicks += 1000;
			}
			
			public String getName() {
				return "1000 Clicks";
			}
		});
		
		//2000 Clicks
		out.add(30, new CaseOutcome() {
			public void onOutcome() {
				Main.clicks += 2000;
			}
			
			public String getName() {
				return "2000 Clicks";
			}
		});
		
		//4000 Clicks
		out.add(20, new CaseOutcome() {
			public void onOutcome() {
				Main.clicks += 4000;
			}
			public String getName() {
				return "4000 Clicks";
			}
		});
		
		//5000 Clicks
		out.add(10, new CaseOutcome() {
			public void onOutcome() {
				Main.clicks += 5000;
			}
			public String getName() {
				return "5000 Clicks";
			}
		});
		
		//6000 Clicks
		out.add(5, new CaseOutcome() {
			public void onOutcome() {
				Main.clicks += 6000;
			}
			public String getName() {
				return "6000 Clicks";
			}
		});

		
		//10000 Clicks
		out.add(1, new CaseOutcome() {
			public void onOutcome() {
				Main.clicks += 10000;
			}
			public String getName() {
				return "10,000 Clicks";
			}
		});
		
		return out;
	}

	public String getName() {
		return "Click Case";
	}

}
