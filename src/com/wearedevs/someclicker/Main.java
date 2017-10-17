package com.wearedevs.someclicker;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.wearedevs.someclicker.gui.CaseOpenPanel;
import com.wearedevs.someclicker.gui.CasePanel;
import com.wearedevs.someclicker.gui.CheaterPanel;
import com.wearedevs.someclicker.gui.ExtrasPanel;
import com.wearedevs.someclicker.gui.InfoPanel;
import com.wearedevs.someclicker.gui.MainPanel;
import com.wearedevs.someclicker.gui.OptionsPanel;
import com.wearedevs.someclicker.gui.ShopPanel;
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.SaveHandler;
import com.wearedevs.someclicker.handlers.SoundUnlocker;
import com.wearedevs.someclicker.mod.Mod;
import com.wearedevs.someclicker.mod.ModLoader;
import com.wearedevs.someclicker.mod.ModPrintStream;
import com.wearedevs.someclicker.sound.Sound;
import com.wearedevs.someclicker.util.NotificationUtil;
import com.wearedevs.someclicker.util.PlaySound;

/**
 * Main, Where Everything Starts
 */
public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	public static double clicks = 0;
	public static int perClick = 1;
	public static ArrayList<Mod> mods = new ArrayList<Mod>();

	public static Main main;

	public static MainPanel mainPanel;
	public static ShopPanel shopPanel;
	public static OptionsPanel optionsPanel;
	public static CasePanel casePanel;
	public static InfoPanel infoPanel;
	public static CaseOpenPanel caseOpenPanel = null;
	public static CheaterPanel cheaterPanel;
	public static ExtrasPanel extrasPanel;

	public static final String VERSION = "v1.0";
	public static final int VERSION_NUM = 2;

	public static final Rectangle windowSize = new Rectangle(100, 100, 640, 480);
	public static final Rectangle panelSize = new Rectangle(0, 0, windowSize.width, windowSize.height);

	public static boolean resetOnClose = false;

	public static final String path = System.getenv("APPDATA") + "/WeAreDevs/SomeClicker/";

	public static final String modPath = System.getenv("APPDATA") + "/WeAreDevs/SomeClicker/mods/";
	public static final String lockFileLoc = System.getenv("APPDATA") + "/WeAreDevs/SomeClicker/startup.lock";

	public static final File modFile = new File(System.getenv("APPDATA") + "/WeAreDevs/SomeClicker/mods/modlist.txt");


	public static void main(String[] args) throws Exception {
		ModLoader.classloaders.add(ClassLoader.getSystemClassLoader());
		System.out.println("Loading Some Clicker " + VERSION);
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main = new Main();
					ModLoader ml = new ModLoader();

					System.out.println("== Loading Mods ==");
					System.out.println("Loading Mod 'Base Mod " + VERSION + "'");
					mods.add(new BaseMod());
					File[] modfiles = new File(modPath).listFiles();
					for(File file : modfiles) {
						if(!file.isDirectory()) {
							if(file.getName().endsWith(".jar")) {
								JarFile jarfile = null;

								try {
									jarfile = new JarFile(file);
								} catch (IOException e1) {
									e1.printStackTrace();
								}

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
										Mod mod = ml.Load(name + " v" + vers, file.getAbsolutePath(), main);
										mod.name = name;
										mods.add(mod);
									}
								} catch (IOException e) {
									System.err.println("Failed to Load Mod '" + file.getName() + "': IOException (Missing mod.txt?)");
								}
							}
						}
					}

					System.out.println("== Mods PreInit Stage ==");
					PrintStream ps = System.out;
					for(Mod mod : mods) {
						System.setOut(new ModPrintStream(System.out, mod.name));
						mod.preInit();
						System.setOut(ps);
					}

					System.out.println("== End PreInit Stage ==");

					System.out.println("== Mods PostInit Stage ==");
					SaveHandler.load();

					for(Mod mod : mods) {
						System.setOut(new ModPrintStream(System.out, mod.name));
						mod.postInit();
						System.setOut(ps);
					}
					System.out.println("== Game is Loaded ==");
					AutoHandler.initAutoThread();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		new File(path).mkdirs();
		new File(modPath).mkdirs();

		try {
		    File lockFile = new File(lockFileLoc);

		    if (lockFile.exists()) {
		    	lockFile.delete();
		    }
		    FileOutputStream lockFileOS = new FileOutputStream(lockFile);
		    lockFileOS.close();

		    @SuppressWarnings("resource")
			FileChannel lockChannel = new RandomAccessFile(lockFile,"rw").getChannel();
		    FileLock lock = lockChannel.tryLock();

		    if (lock == null) {
		    	throw new Exception("Unable to Obtain Lock");
		    }
		} catch (Exception e) {
		    e.printStackTrace();
			JOptionPane.showMessageDialog(this, "You Can Only Have One Instance of This Game Runnning!", "Can Not Start Game", JOptionPane.ERROR_MESSAGE);
		    System.exit(0);
		}

		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			public void run() {
				if(resetOnClose) {
					SaveHandler.saveFile.delete();
					System.out.println("Exiting and Deleting Save!");
				} else {
					SaveHandler.save();
					System.out.println("Exiting!");
				}
			}
		}));

		NotificationUtil.init("Some Clicker " + VERSION, "Some Clicker " + VERSION, "textures/icons/trayIcon.png");

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

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(mainPanel.getBounds()); //Set Bounds Identical to Panel
		setTitle("Java Clicker " + VERSION);
		setContentPane(mainPanel);
		setVisible(true);
	}

	/**
	 * Updates the Counter
	 */
	public static void updateCounter() {
		mainPanel.labelClicks.setText("Clicks: " + Math.round(clicks));
		shopPanel.labelClicks.setText(Math.round(clicks)+" Clicks");
		casePanel.labelClicks.setText(Math.round(clicks)+" Clicks");
		
		for(Mod m : mods) {
			m.onUpdateCounter(clicks);
		}
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
		double click = ammount;
		for(Mod m : mods) {
			click = m.onClick(click);
		}

		if(sound!=null) {
			PlaySound.playSound("/sound/clickSound/" + sound.getFileName());
		}

		Main.clicks += click;
		updateCounter();
	}

	public static void openWindow() {
		main.setVisible(true);
	}

}
