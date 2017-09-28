package com.wearedevs.javaclicker.handlers;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.util.RandomUtil;

/**
 * Handler for auto clicking related things
 * 
 * @author ImDaveead
 */
public class AutoHandler {
	public static Thread autoThread;
	
	public static int autoClick = 0;
	public static int clickBomb = 0;
	public static int factory = 0;
	public static int mine = 0;
	public static int portal = 0;
	
	public static boolean autoClickStarted = false;
	
	public static void initAutoThread() {
		if(autoClickStarted) {
			return;
		}
		
		autoClickStarted = true;
		
		autoThread = new Thread(new Runnable() {
			public void run() {
				int bomb_count = 0;
				int factory_count = 0;
				int mine_count = 0;
				int portal_count = 0;
				
				try {
					while (autoClickStarted) {
						bomb_count++;
						factory_count++;
						mine_count++;
						portal_count++;
						
						//Bomb Cycle
						if (bomb_count > 100) {
							bomb_count = 0;
							double bomb = (clickBomb + RandomUtil.randomRange(clickBomb * -0.15, clickBomb * 0.15));
							Main.clicks += bomb;
						}
						
						//Factory Cycle
						if(factory_count > 50) {
							factory_count = 0;
							
							Main.clicks += factory;
						}
						
						//Mine Cycle
						if(mine_count > 10) {
							mine_count = 0;
							
							Main.clicks += mine;
						}
						
						//Portal Cycle
						if(portal_count > 150) {
							portal_count = 0;
							
							Main.clicks += portal;
						}
						Main.clicks += autoClick / 10d;
						Main.updateCounter();
						
						//TODO: Better Timer
						Thread.sleep(100L);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		
		autoThread.start();
	}
}
