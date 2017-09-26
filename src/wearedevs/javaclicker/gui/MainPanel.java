package wearedevs.javaclicker.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import wearedevs.javaclicker.Main;

public class MainPanel extends JPanel {
	
	public MainPanel() {
		setLayout(null);
		setBounds(100, 100, 640, 480);
		
		
		JLabel lblClicks = new JLabel("Clicks: " + Main.clicks);
		lblClicks.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblClicks.setBounds(12, 13, 226, 34);
		add(lblClicks);
		
		JButton clicker = new JButton("Click Me!");
		clicker.setFont(new Font("Tahoma", Font.BOLD, 20));
		clicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.clicks += Main.perClick;
				lblClicks.setText("Clicks: " + Main.clicks);
			}
		});
		clicker.setBounds(12, 58, 610, 100);
		add(clicker);
		
		JButton shopButton = new JButton("The Shop");
		shopButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		shopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Do Stuff
			}
		});
		shopButton.setBounds(12, 377, 334, 55);
		add(shopButton);
	}

}
