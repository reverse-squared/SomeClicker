package com.wearedevs.someclicker.util;

public class GameLoop {
	public boolean running = true;
	public Thread thread;
	
	/**
	 * A Game Loop
	 * set running to false to stop
	 * 
	 * @param tps The Speed of calling tick.run()
	 * @param tick A <code>Runnable</code> that is ran `tps` times a second
	 * @param onCycle called every cycle
	 */	
	public GameLoop(int tps, Runnable tick, Runnable onCycle) {
		thread = new Thread(new Runnable() {
			public void run() {
				running = true;
				
				long lastTime = System.nanoTime();
				double ns = 1000000000 / tps;
				double delta = 0;
				
				while(running) {
					long now = System.nanoTime();
					delta += (now - lastTime) / ns;
					lastTime = now;
					while (delta >= 1) {
						tick.run();
						delta--;
					}
					
					onCycle.run();
				}
				try {
					thread.join();
					running = false;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		thread.start();
	}
	
	/**
	 * A Game Loop
	 * set running to false to stop
	 * 
	 * @param tps The Speed of calling tick.run()
	 * @param tick A <code>Runnable</code> that is ran `tps` times a second
	 * @param onCycle called every cycle
	 */
	public GameLoop(int tps, Runnable tick) {
		this(tps,tick,new Runnable() {public void run() {}});
	}
}