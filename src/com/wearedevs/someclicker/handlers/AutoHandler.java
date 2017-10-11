package com.wearedevs.someclicker.handlers;

import java.util.ArrayList;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/handlers/AutoHandler.java
import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.anticheat.Anticheat;
import com.wearedevs.javaclicker.cases.GetCase;
import com.wearedevs.javaclicker.mod.Mod;
import com.wearedevs.javaclicker.mod.TickHook;
import com.wearedevs.javaclicker.util.GameLoop;
=======
import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.anticheat.Anticheat;
import com.wearedevs.someclicker.cases.GetCase;
import com.wearedevs.someclicker.mod.TickHook;
import com.wearedevs.someclicker.util.GameLoop;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/handlers/AutoHandler.java

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
