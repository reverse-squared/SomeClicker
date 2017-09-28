package com.wearedevs.javaclicker.handlers;

public abstract class CaseHandler {
	public boolean unlocked;
	
	public CaseHandler() {
		//Do Stuff
	}
	
	public abstract void openCase();
	public abstract void getItem();
	
	public abstract String getName();
}
