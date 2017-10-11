package com.wearedevs.javaclicker.cases;

import com.wearedevs.javaclicker.util.WeightedCollection;

public abstract class Case {
	
	/**
	 * When The Case is Open
	 * @return ArrayList of All Things
	 */
	public abstract WeightedCollection<CaseOutcome> getAllOutcomes();
	
	/**
	 * @return The Name of the Case
	 */
	public abstract String getName();
}
