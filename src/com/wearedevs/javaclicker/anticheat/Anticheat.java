package com.wearedevs.javaclicker.anticheat;

import com.wearedevs.javaclicker.Main;

public class Anticheat {

	private static double prevTime = 0;
	private static double time = 0;
	private static int suspic = 0;
	private static boolean run = false;
	
	public static void checkCheats() {
		
		if(run) {
			run = false;
			
			prevTime = time;
			
			if(prevTime == time) {
				suspic++;
				
				if(suspic >= 10) {
					cheater();
				}
			}
			
		}else {
			run = true;
			
			addTime();
		}
	}
	
	public static void addTime() {
		while(run) {
			time += 0.0001;
			
			System.out.println(time);
		}
	}
	
	public static void cheater() {
		Main.main.setContentPane(Main.cheaterPanel);
	}
}
