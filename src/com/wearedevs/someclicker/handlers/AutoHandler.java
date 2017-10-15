package com.wearedevs.someclicker.handlers;

import java.util.ArrayList;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.anticheat.Anticheat;
import com.wearedevs.someclicker.mod.Mod;
import com.wearedevs.someclicker.mod.TickHook;
import com.wearedevs.someclicker.util.GameLoop;

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
		if(autoClickStarted) {
			return;
		}
		
		autoClickStarted = true;
		
		game_loop = new GameLoop(60, new Runnable() {
			@SuppressWarnings("unchecked")
			public void run() {
				double old = Main.clicks;
				
				if(CaseHandler.ccase != null) {
					CaseHandler.tickCase(CaseHandler.ccase);
				}
				
				for(TickHook hook : (ArrayList<TickHook>)hooks.clone()) {
				    hook.run();
				}
				
				for(Mod mod : Main.mods) {
					mod.onTick();
				}
				
				CaseHandler.checkCases();
				Anticheat.checkCheats();
				
				if(old != Main.clicks) {
					Main.updateCounter();
				}
			}
		});
	}
}
