package com.wearedevs.javaclicker.handlers;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.util.GameLoop;

/**
 * Handler for auto clicking related things
 * 
 * @author ImDaveead
 */
public class AutoHandler {
	public static GameLoop game_loop;
	
	public static double autoClick = 0;
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
					ticks = 0;
					seconds++;
					//just in case
					seconds = Math.round(seconds);
				}
				
				//MINE: Ever Second
				if(ticks == 0) {
					//Every Second is the MINE
					Main.click(mine);
				}
				
				//AUTOCLICKER: Every Tick add
				Main.click(autoClick/60);
				
				//BOMB: Every 10 Seconds
				if(seconds % 10 == 0 && ticks == 0) {
					Main.click(clickBomb);
				}
				
				//PORTAL: Every 15 Seconds
				if(seconds % 15 == 0 && ticks == 0) {
					Main.click(mine);
				}
				
				//FACTORY: Every 15 Seconds
				if(seconds % 15 == 0 && ticks == 0) {
					Main.click(portal);
				}
				
				Main.updateCounter();
			}
		});
	}
}
