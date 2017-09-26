package wearedevs.javaclicker.gui;

import javax.swing.JPanel;

import wearedevs.javaclicker.Main;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ShopPanel extends JPanel {

	public ShopPanel() {
		setLayout(null);
		setBounds(Main.panelSize);
		
		JButton goBackButton = new JButton("Go back");
		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main.setContentPane(Main.main.mainPanel);
			}
		});
		goBackButton.setBounds(12, 13, 270, 69);
		add(goBackButton);
		
		//TODO: Properly Resize Button
		JButton twoClicksPerButton = new JButton("Two Clicks Per Click");
		twoClicksPerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Do Stuff
			}
		});
		twoClicksPerButton.setBounds(12, 100, 250, 75);
		add(twoClicksPerButton);
		
		
		
	}
}
