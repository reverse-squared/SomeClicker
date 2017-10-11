package com.wearedevs.javaclicker.handlers;

import java.util.ArrayList;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.anticheat.Anticheat;
import com.wearedevs.javaclicker.cases.GetCase;
import com.wearedevs.javaclicker.mod.Mod;
import com.wearedevs.javaclicker.mod.TickHook;
import com.wearedevs.javaclicker.util.GameLoop;

/**
 * Handler for auto clicking related things.
 * 
 * @author ImDaveead
 */
public class AutoHandler {
	public static GameLoop game_loop;
	

	
	public static boolean autoClickStarted = false;

	public static ArrayList<TickHook> hooks = new ArrayList<TickHook>();
	
	public static void initAutoThread() {
		if(autoClickStarted) return;
		autoClickStarted = true;
		game_loop = new GameLoop(60, new Runnable() {
			@SuppressWarnings("unchecked")
			public void run() {
				if(CaseHandler.ccase != null) {
					CaseHandler.tickCase(CaseHandler.ccase);
				}
				
				for(TickHook hook : (ArrayList<TickHook>)hooks.clone()) {
				    hook.run();
				}
				
				for(Mod mod : Main.mods) {
					mod.onTick();
				}
				
				GetCase.checkCases();
				Anticheat.checkCheats();
				Main.updateCounter();
			}
		});
	}
}
