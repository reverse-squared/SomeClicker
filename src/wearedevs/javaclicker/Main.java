package wearedevs.javaclicker;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import wearedevs.javaclicker.gui.MainPanel;

public class Main extends JFrame {

	private JPanel mainPanel;
	
	public static final String VERSION = "DEV 0.1";
	
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
		int clickCount = 0;
		int inc = 1;
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new MainPanel();
		setTitle("Java Clicker DEV 0.1");
		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		//Set Bounds Identical to Panel
		setBounds(mainPanel.getBounds());
		
		JLabel lblClicks = new JLabel("Clicks: " + clickCount);
		lblClicks.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblClicks.setBounds(12, 13, 226, 34);
		mainPanel.add(lblClicks);
		
		JButton clicker = new JButton("Click Me!");
		clicker.setFont(new Font("Tahoma", Font.BOLD, 20));
		clicker.addActionListener(new ActionListener() {
			int clickCount = 0;
			
			public void actionPerformed(ActionEvent arg0) {
				clickCount += inc;
				lblClicks.setText("Clicks: " + clickCount);
			}
		});
		clicker.setBounds(12, 58, 610, 100);
		mainPanel.add(clicker);
	}

}
