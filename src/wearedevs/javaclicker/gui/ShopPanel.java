package wearedevs.javaclicker.gui;

import javax.swing.JPanel;

import wearedevs.javaclicker.Main;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShopPanel extends JPanel {

	public ShopPanel() {
		setLayout(null);
		setBounds(Main.windowSize);
		
		JButton btnNewButton = new JButton("Go back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main.setContentPane(Main.main.mainPanel);
			}
		});
		btnNewButton.setBounds(12, 13, 270, 69);
		add(btnNewButton);
		
	}
}
