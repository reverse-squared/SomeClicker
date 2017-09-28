package com.wearedevs.javaclicker.cases;

import com.wearedevs.javaclicker.util.WeightedCollection;

public abstract class Case {
	
	/**
	 * When the case is open
	 * @return ArrayList of all things
	 */
	public abstract WeightedCollection<CaseOutcome> getAllOutcomes();
	
	public abstract String getName();
}
