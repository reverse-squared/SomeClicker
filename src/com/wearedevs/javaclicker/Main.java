package com.wearedevs.javaclicker;

import java.awt.EventQueue;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.UIManager;

import com.wearedevs.javaclicker.cases.GetCase;
import com.wearedevs.javaclicker.gui.MainPanel;
import com.wearedevs.javaclicker.gui.ShopPanel;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.util.NotificationUtil;
import com.wearedevs.javaclicker.util.RandomUtil;
import com.wearedevs.javaclicker.util.SoundUtil;

@SuppressWarnings("serial")
public class Main extends JFrame {

	public static double clicks = 0;
	public static int perClick = 1;
	public static double clickMultiplier = 1.0;
	public static int multiplier = 1;
	
	public static Main main;
	
	public static MainPanel mainPanel;
	public static ShopPanel shopPanel;
	
	public static final String VERSION = "DEV 0.5";
	
	public static final Rectangle windowSize = new Rectangle(100, 100, 640, 480);
	public static final Rectangle panelSize = new Rectangle(0, 0, windowSize.width, windowSize.height);
	
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
		//Init Shop
		ShopHandler.initializeShop();
		
		//Init all panels
		mainPanel = new MainPanel();
		shopPanel = new ShopPanel();
		
		//Frame Properties
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(mainPanel.getBounds()); //Set Bounds Identical to Panel
		setTitle("Java Clicker " + VERSION);
		setContentPane(mainPanel);
		
		NotificationUtil.init("Java Clicker 0.4 DEV", "Java Clicker 0.4 DEV", "textures/icon.png");
		
		setVisible(true);
	}

	public static void updateCounter() {
		mainPanel.labelClicks.setText("Clicks: " + Math.round(clicks));
		shopPanel.labelClicks.setText(Math.round(clicks)+" Clicks");
	}
	
	public static void click() {
		int click = perClick;
		
		if(RandomUtil.randomRange(1, 20) == 10) {
			click *= 2;
		}
		
		if(RandomUtil.randomRange(1, 500) == 10) {
			click *= 10;
		}
		
		Main.clicks += click;
		SoundUtil.playSound("res/sound/clickSound/click.wav");
	
		GetCase.checkCases();
		updateCounter();
	}

}
