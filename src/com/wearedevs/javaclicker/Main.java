package com.wearedevs.javaclicker;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.jar.JarFile;

import javax.swing.JFrame;
import javax.swing.UIManager;

import com.wearedevs.javaclicker.gui.CaseOpenPanel;
import com.wearedevs.javaclicker.gui.CasePanel;
import com.wearedevs.javaclicker.gui.CheaterPanel;
import com.wearedevs.javaclicker.gui.ExtrasPanel;
import com.wearedevs.javaclicker.gui.InfoPanel;
import com.wearedevs.javaclicker.gui.MainPanel;
import com.wearedevs.javaclicker.gui.ModPanel;
import com.wearedevs.javaclicker.gui.OptionsPanel;
import com.wearedevs.javaclicker.gui.ShopPanel;
import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.SaveHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.handlers.SoundUnlocker;
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
	public static ModPanel modPanel;
	public static ExtrasPanel extrasPanel;
	
	public static final String VERSION = "DEV 0.8";
	
	public static final Rectangle windowSize = new Rectangle(100, 100, 640, 480);
	public static final Rectangle panelSize = new Rectangle(0, 0, windowSize.width, windowSize.height);
	
	public static final String path = System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/";
	public static final String modPath = System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/mods/";
	public static final String modList = System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/mods/modlist.txt";
	
	public static void main(String[] args) throws Exception {
		System.out.println("Loading Java Clicker "+VERSION);
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
		SaveHandler.savePath.mkdirs();
		
		SoundUnlocker.unlock(new Sound("Default", "default.wav"));
		
		//Init Shop
		ShopHandler.initializeShop();
		
		//Init all panels
		mainPanel = new MainPanel();
		shopPanel = new ShopPanel();
		optionsPanel = new OptionsPanel();
		casePanel = new CasePanel();
		infoPanel = new InfoPanel();
		modPanel = new ModPanel();
		try {
			extrasPanel = new ExtrasPanel();
		} catch (URISyntaxException e3) {
			e3.printStackTrace();
		}
		
		//Frame Properties
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(mainPanel.getBounds()); //Set Bounds Identical to Panel
		setTitle("Java Clicker " + VERSION);
		setContentPane(mainPanel);
		
		NotificationUtil.init("Java Clicker " + VERSION, "Java Clicker " + VERSION, "textures/icon.png");
		
		setVisible(true);
		
		SaveHandler.loadClicks();
		SaveHandler.loadCases();
		SaveHandler.loadMultiplier();
		SaveHandler.loadSounds();
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			public void run() {
				SaveHandler.saveClicks();
				SaveHandler.saveCases();
				SaveHandler.saveMultiplier();
				SaveHandler.saveSounds();
			}
		}));
		
		AutoHandler.initAutoThread();
		
		new File(modPath).mkdirs();
		
		File[] modfiles = new File(modPath).listFiles();
		for(File file : modfiles) {
			if(!file.isDirectory()) {
				String n = file.getName().replace(".jar", "");
				
//				PrintWriter writer = null;
//				try {
//					writer = new PrintWriter(modList);
//				} catch (FileNotFoundException e2) {
//					e2.printStackTrace();
//				}
//				
//				writer.println("Base " + VERSION);
//				writer.println(n);
//				writer.close();
				
				JarFile jarfile = null;
				try {
					jarfile = new JarFile(file);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
//				TODO: Panels Will Not Switch With This Code Below, Fix
//				JarEntry entry = jarfile.getJarEntry("/test/a.xml");
//				
//				try {
//					String content = jarfile.getInputStream(entry).toString();
//					System.out.println(content);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
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
