package wearedevs.javaclicker;
/**
 * Handler for auto clicking related things
 * 
 * @author ImDaveead
 */
public class AutoHandler {
	public static Thread autoThread;
	
	public static int autoClick = 3;
	public static int clickBomb = 0;
	
	public static boolean autoClickStarted = false;
	
	public static void initAutoThread() {
		if(autoClickStarted) return;
		autoClickStarted = true;
		autoThread = new Thread(new Runnable() {
			public void run() {
				try {
					while (autoClickStarted) {
						System.out.println("e");
						Main.clicks += autoClick/10d;
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
