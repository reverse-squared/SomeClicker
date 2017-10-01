package com.wearedevs.javaclicker.handlers;

import utils.GameLoop;

/**
 * Handler for auto clicking related things
 * 
 * @author ImDaveead
 */
public class AutoHandler {
	public static GameLoop game_loop;
	
	public static int autoClick = 0;
	public static int clickBomb = 0;
	public static int factory = 0;
	public static int mine = 0;
	public static int portal = 0;
	
	public static boolean autoClickStarted = false;
	
	public static int ticks = 0;
	public static double seconds = 0; //large limit :)
	
	public static void initAutoThread() {
		if(autoClickStarted) {
			return;
		}
		
		autoClickStarted = true;
		
		game_loop = new GameLoop(60,new Runnable() {

			public void run() {
				ticks++;
				if(ticks>=60) {
					seconds++;
				}
			}
		});
	}
}
