package com.wearedevs.someclicker.cases;

public interface CaseOutcome {
	/**
	 * @return What Happens When It Gets Chosen.
	 */
	public abstract void onOutcome();
	
	/**
	 * @return The Name of the Outcome
	 */
	public abstract String getName();
}
