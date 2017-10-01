package com.wearedevs.javaclicker.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.sound.Sound;

@SuppressWarnings("serial")
public class OptionsPanel extends JPanel {
	
	Sound[] clickSounds = new Sound[] {
			new Sound("Default", "default.wav"),
			new Sound("Bomb", "bomb.wav"),
			new Sound("Airhorn", "airhorn.wav"),
			new Sound("Fart", "fart.wav"),
			new Sound("Rainbow", "rainbow.wav")
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
		
		JComboBox<Sound> clickSound = new JComboBox<Sound>(clickSounds);
		clickSound.setBounds(224, 17, 97, 22);
		clickSound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sound.currentSound = (Sound) clickSound.getSelectedItem();
				
			}
		});
		add(clickSound);
	}

}
