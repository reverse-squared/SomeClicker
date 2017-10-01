package com.wearedevs.javaclicker.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.wearedevs.javaclicker.Main;

@SuppressWarnings("serial")
public class OptionsPanel extends JPanel {
	
	String[] clickSounds = new String[] {
			"Default",
			"Bomb",
			"Rainbow",
			"Airhorn",
			"Fart"
	};
	
	public OptionsPanel() {
		setLayout(null);
		setBounds(Main.panelSize);
		
		JButton backBtn = new JButton("Go Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.updateCounter();
				
				Main.main.setContentPane(Main.mainPanel);
			}
		});
		backBtn.setBounds(12, 398, 270, 40);
		add(backBtn);
		
		JLabel lblSelectYourClick = new JLabel("Select Your Click Sound: ");
		lblSelectYourClick.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSelectYourClick.setBounds(12, 13, 213, 27);
		add(lblSelectYourClick);
		
		JComboBox<Object> clickSound = new JComboBox<Object>(clickSounds);
		clickSound.setBounds(224, 17, 97, 22);
		add(clickSound);
		String selectedSound = String.valueOf(clickSound.getSelectedItem());
	}

}
