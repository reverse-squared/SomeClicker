package com.wearedevs.javaclicker.cases;

import java.util.ArrayList;

public abstract class Case {
	
	/**
	 * When the case is open
	 * @return ArrayList of all things
	 */
	public abstract ArrayList<String> getAllOutcomes();
	
	public abstract String getOutcome();
	
	public abstract String getName();
}
