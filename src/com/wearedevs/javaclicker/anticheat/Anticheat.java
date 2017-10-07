package com.wearedevs.javaclicker.anticheat;

import com.wearedevs.javaclicker.Main;

@SuppressWarnings("unused")
public class Anticheat {
	private static double prevTime = 0;
	private static double time = 0;
	private static int suspic = 10;
	
	private static boolean run = false;
	private static boolean cheater = false;
	
	public static void checkCheats() {
		//TODO: Test CPS is >= 20 suspic++;
		
		if(suspic >= 10 && !cheater) {
			cheater();
		}
	}
	
	public static void cheater() {
		cheater = true;
		Main.main.setContentPane(Main.cheaterPanel);
	}
}
