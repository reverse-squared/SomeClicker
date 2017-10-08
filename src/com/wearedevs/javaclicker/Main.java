package com.wearedevs.javaclicker;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.swing.JFrame;
import javax.swing.UIManager;

import com.wearedevs.javaclicker.gui.CaseOpenPanel;
import com.wearedevs.javaclicker.gui.CasePanel;
import com.wearedevs.javaclicker.gui.CheaterPanel;
import com.wearedevs.javaclicker.gui.ExtrasPanel;
import com.wearedevs.javaclicker.gui.InfoPanel;
import com.wearedevs.javaclicker.gui.MainPanel;
import com.wearedevs.javaclicker.gui.OptionsPanel;
import com.wearedevs.javaclicker.gui.ShopPanel;
import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.SaveHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.handlers.SoundUnlocker;
import com.wearedevs.javaclicker.mod.ModLoader;
import com.wearedevs.javaclicker.sound.Sound;
import com.wearedevs.javaclicker.util.NotificationUtil;
import com.wearedevs.javaclicker.util.PlaySound;
import com.wearedevs.javaclicker.util.RandomUtil;

/**
 * Main, Where Everything Starts
 */
public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	public static double clicks = 0;
	public static int perClick = 1;
	public static double multiplier = 1.0;
	
	public static Main main;
	
	public static MainPanel mainPanel;
	public static ShopPanel shopPanel;
	public static OptionsPanel optionsPanel;
	public static CasePanel casePanel;
	public static InfoPanel infoPanel;
	public static CaseOpenPanel caseOpenPanel = null;
	public static CheaterPanel cheaterPanel;
	public static ExtrasPanel extrasPanel;
	
	public static final String VERSION = "DEV 0.8";
	public static final int VERSION_NUM = 1;
	
	public static final Rectangle windowSize = new Rectangle(100, 100, 640, 480);
	public static final Rectangle panelSize = new Rectangle(0, 0, windowSize.width, windowSize.height);
	
	public static final String path = System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/";
	public static final String modPath = System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/mods/";
	
	
	public static void main(String[] args) throws Exception {
		System.out.println("Loading Java Clicker " + VERSION);
		
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main = new Main();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		new File(path).mkdirs();
		
		SoundUnlocker.unlock(new Sound("Default", "default.wav"));
		
		//Init Shop
		ShopHandler.initializeShop();
		
		//Init all panels
		mainPanel = new MainPanel();
		shopPanel = new ShopPanel();
		optionsPanel = new OptionsPanel();
		casePanel = new CasePanel();
		infoPanel = new InfoPanel();
		try {
			extrasPanel = new ExtrasPanel();
		} catch (URISyntaxException e3) {
			e3.printStackTrace();
		}
		
		//Frame Properties
		setResizable(false);
		setLayout(null);
		
		//TODO: Change to JFrame.DISPOSE_ON_CLOSE on Release
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(mainPanel.getBounds()); //Set Bounds Identical to Panel
		setTitle("Java Clicker " + VERSION);
		setContentPane(mainPanel);
		
		NotificationUtil.init("Java Clicker " + VERSION, "Java Clicker " + VERSION, "textures/icon.png");
		
		setVisible(true);
		
		SaveHandler.load();
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			public void run() {
				SaveHandler.save();
			}
		}));
		
		AutoHandler.initAutoThread();
		
		new File(modPath).mkdirs();
		
		ModLoader ml = new ModLoader();
		
		File[] modfiles = new File(modPath).listFiles();
		for(File file : modfiles) {
			if(!file.isDirectory()) {				
				if(file.getName().endsWith(".jar")) {
					System.out.println("Fetching Mods...");
					
					JarFile jarfile = null;
					
					try {
						jarfile = new JarFile(file);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
					System.out.println("Reading Mods...");
					JarEntry entry = jarfile.getJarEntry("mod.txt");
					
					try {
						InputStream is = jarfile.getInputStream(entry);
						Scanner s = new Scanner(is);
						String str = "";
						
						while (s.hasNext()) {
							str += s.nextLine();
						}
						
						s.close();
						String[] modtxtarr = str.split(",");
						
						if(Integer.parseInt(modtxtarr[0]) != VERSION_NUM) {
							System.err.println("Failed to Load Mod '" + file.getName() + "': Version is Mismatched (Current is " + VERSION_NUM + ")");
							
							continue;
						} else {
							String name = modtxtarr[1];
							String vers = modtxtarr[2];
							String main = modtxtarr[3];
							System.out.println("Loading Mod '" + name + " v" + vers + "'");
							ml.Load(name + " v" + vers, file.getAbsolutePath(), main);
							System.out.println("Loaded Mod '" + name + " v" + vers + "'");
						}
					} catch (IOException e) {
						System.err.println("Failed to Load Mod '" + file.getName() + "': IOException (Missing mod.txt?)");
					}
				}
			}
		}
	}

	/**
	 * Updates the Counter
	 */
	public static void updateCounter() {
		mainPanel.labelClicks.setText("Clicks: " + Math.round(clicks));
		shopPanel.labelClicks.setText(Math.round(clicks)+" Clicks");
		casePanel.labelClicks.setText(Math.round(clicks)+" Clicks");
	}
	
	/**
	 * Uses Default Values | Calls The Other Click Method
	 */
	public static void click() {
		click(perClick, SoundUnlocker.currentSound);
	}
	
	/**
	 * Making {@code click(amount of clicks) work.}
	 */
	public static void click(double amount) {
		click(amount, null);
	}
	
	/**
	 * Handles All the Clicking
	 */
	public static void click(double ammount, Sound sound) {
		double click = ammount * multiplier;
		
		if(RandomUtil.randomRange(1, 20) == 10) {
			click *= 2;
		}
		
		if(RandomUtil.randomRange(1, 500) == 10) {
			click *= 10;
		}
		
		if(sound!=null) {
			PlaySound.playSound("/sound/clickSound/" + sound.fname);	
		}
		
		Main.clicks += click * multiplier;
		updateCounter();
	}
	
	public static void bringToFront() {
		main.setAlwaysOnTop(true);
		main.setAlwaysOnTop(false);
	}
	
	public static void openWindow() {
		main.setVisible(true);
	}

}
