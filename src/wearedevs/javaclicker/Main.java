package wearedevs.javaclicker;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import wearedevs.javaclicker.gui.MainPanel;

@SuppressWarnings("serial")
public class Main extends JFrame {

	public static int clicks = 0;
	public static int perClick = 1;
	
	public static Main main;
	
	public JPanel mainPanel;
	
	public static final String VERSION = "DEV 0.1";
	public static final Rectangle windowSize = new Rectangle(100, 100, 640, 480);
	
	public static void main(String[] args) throws Exception {
		System.out.println("Loading Java Clicker "+VERSION);
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		//Allow Static Access
		main = this;
		
		mainPanel = new MainPanel();
		
		//Frame Properties
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(mainPanel.getBounds()); //Set Bounds Identical to Panel
		setTitle("Java Clicker "+VERSION);
		setContentPane(mainPanel);
	}

}
