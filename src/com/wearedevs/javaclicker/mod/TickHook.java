package com.wearedevs.javaclicker.mod;

import com.wearedevs.javaclicker.handlers.AutoHandler;

public abstract class TickHook {
	public TickHook() {
		add();
		
	}
	private void add() {
		AutoHandler.hooks.add(this);
	}
	public abstract void run();
	public void remove() {
		AutoHandler.hooks.remove(this);
	}
}
