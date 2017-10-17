package com.wearedevs.someclicker.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.handlers.SoundUnlocker;
import com.wearedevs.someclicker.sound.Sound;

/**
 * The Panel for Changing Options Like Click Sounds and Backgrounds 
 */
public class OptionsPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public static JComboBox<Sound> clickSound;
	
	public OptionsPanel() {
		setLayout(null);
		setBounds(Main.panelSize);
		
		JButton backBtn = new JButton("Go Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main.setContentPane(Main.mainPanel);
			}
		});
		backBtn.setBounds(12, 398, 270, 40);
		add(backBtn);
		
		JButton resetData = new JButton("Reset Save Data");
		resetData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedOption = JOptionPane.showConfirmDialog(null, 
						"Are You Sure You Want To Reset All Save Data? \n" +
						"(This Can Not Be Undone!)", 
						"Reset Save Data", 
						JOptionPane.YES_NO_OPTION); 
				
				if (selectedOption == JOptionPane.YES_OPTION) {
					Main.resetOnClose = true;
					System.exit(0);
				}else {
					return;
				}
			}
		});
		resetData.setBounds(350, 398, 270, 40);
		add(resetData);
		
		JLabel lblSelectYourClick = new JLabel("Select Your Click Sound: ");
		lblSelectYourClick.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSelectYourClick.setBounds(12, 13, 213, 27);
		add(lblSelectYourClick);
		
		clickSound = new JComboBox<Sound>();
		clickSound.setBounds(224, 17, 97, 22);
		clickSound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoundUnlocker.currentSound = (Sound) clickSound.getSelectedItem();
				
			}
		});
		add(clickSound);
		
		refreshSoundChoice();
	}

	public static void refreshSoundChoice() {
		clickSound.setModel(new DefaultComboBoxModel<Sound>(SoundUnlocker.clickSounds.toArray(new Sound[] {})));
		SoundUnlocker.clickSounds.forEach(new Consumer<Sound>() {
			public void accept(Sound t) {
				if(t.getClass().getName() == SoundUnlocker.currentSound.getClass().getName()) clickSound.setSelectedItem(t);
			}
		});
	}
}
