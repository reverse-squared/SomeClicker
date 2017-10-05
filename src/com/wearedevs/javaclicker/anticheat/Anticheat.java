package com.wearedevs.javaclicker.anticheat;

import com.wearedevs.javaclicker.Main;

@SuppressWarnings("unused")
public class Anticheat {
	private static double prevTime = 0;
	private static double time = 0;
	private static int suspic = 0;
	private static boolean run = false;
	
	public static void checkCheats() {
		
	}
	
	public static void cheater() {
		Main.main.setContentPane(Main.cheaterPanel);
	}
}
