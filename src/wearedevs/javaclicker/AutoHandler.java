package wearedevs.javaclicker;
/**
 * Handler for auto clicking related things
 * 
 * @author ImDaveead
 */
public class AutoHandler {
	public static Thread autoThread;
	
	public static int autoClick = 0;
	public static int clickBomb = 0;
	
	public static void initAutoThread() {
		autoThread = new Thread(new Runnable() {
			public void run() {
				
			}
			
		});
		autoThread.start();
	}
}
