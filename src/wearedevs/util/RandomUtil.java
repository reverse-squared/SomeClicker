package wearedevs.util;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtil {
	public static int randomRange(int low, int high) {
		return ThreadLocalRandom.current().nextInt(low, high + 1);
		
	}
}
