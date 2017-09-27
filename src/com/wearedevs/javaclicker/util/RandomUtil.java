package com.wearedevs.javaclicker.util;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtil {
	public static int randomRange(int low, int high) {
		return ThreadLocalRandom.current().nextInt(low, high + 1);	
	}
	public static double randomRange(double low, double high) {
		return ThreadLocalRandom.current().nextDouble(low, high + 1);
	}
	public static long randomRange(long low, long high) {
		return ThreadLocalRandom.current().nextLong(low, high + 1);
	}
}
