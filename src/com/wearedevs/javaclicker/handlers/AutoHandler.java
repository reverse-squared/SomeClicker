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
	
	public static boolean autoClickStarted = false;
	
	public static void initAutoThread() {
		if(autoClickStarted) {
			return;
		}
		
		autoClickStarted = true;
		
		autoThread = new Thread(new Runnable() {
			public void run() {
				int bomb_count = 0;
				
				try {
					while (autoClickStarted) {
						bomb_count++;
						
						if (bomb_count>100) {
							bomb_count = 0;
							double bomb = (clickBomb + RandomUtil.randomRange(clickBomb * -0.15, clickBomb * 0.15));
							Main.clicks += bomb;
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
