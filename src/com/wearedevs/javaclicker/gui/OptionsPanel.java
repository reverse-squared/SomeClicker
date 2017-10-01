package com.wearedevs.javaclicker.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.handlers.SoundHandler;
import com.wearedevs.javaclicker.sound.Sound;

@SuppressWarnings("serial")
public class OptionsPanel extends JPanel {
	
	public static JComboBox<Sound> clickSound;
	
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
		
		clickSound = new JComboBox<Sound>();
		
		refreshSoundChoice();
		
		clickSound.setBounds(224, 17, 97, 22);
		clickSound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoundHandler.currentSound = (Sound) clickSound.getSelectedItem();
				
			}
		});
		add(clickSound);
	}

	public static void refreshSoundChoice() {
		clickSound.setModel(new DefaultComboBoxModel<Sound>((Sound[]) SoundHandler.clickSounds.toArray()));
	}
}
