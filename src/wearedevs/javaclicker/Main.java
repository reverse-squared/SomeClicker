package wearedevs.javaclicker;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.UIManager;

import wearedevs.javaclicker.gui.MainPanel;
import wearedevs.javaclicker.gui.ShopPanel;

@SuppressWarnings("serial")
public class Main extends JFrame {

	public static int clicks = 0;
	public static int perClick = 1;
	
	public static Main main;
	
	public static MainPanel mainPanel;
	public static ShopPanel shopPanel;
	
	public static final String VERSION = "DEV 0.1";
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
		//Init all panels
		mainPanel = new MainPanel();
		shopPanel = new ShopPanel();
		
		//Frame Properties
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(mainPanel.getBounds()); //Set Bounds Identical to Panel
		setTitle("Java Clicker "+VERSION);
		setContentPane(mainPanel);
		
		setVisible(true);
	}

}
