package com.wearedevs.someclicker.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.wearedevs.someclicker.Main;

/**
 * The Visual Panel for Showing Everything that Has to Do With Information About the Game.
 */
public class InfoPanel extends JPanel {
	private static final long serialVersionUID = -1523225555156016420L;

	public InfoPanel() {
		setLayout(null);
		setBounds(Main.panelSize);
		
		JLabel labelTitle = new JLabel("Info");
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
		labelTitle.setBounds(12, 13, 616, 67);
		add(labelTitle);
		
		JButton backBtn = new JButton("Go Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Main.main.setContentPane(Main.mainPanel);
			}
		});
		backBtn.setBounds(12, 398, 270, 40);
		add(backBtn);
		
		JLabel lblWelcomeToOur = new JLabel("We Would like to Thank you by Beta Testing Our Game. Please Report Bugs in Our Extras Panel.");
		lblWelcomeToOur.setBounds(39, 370, 553, 28);
		add(lblWelcomeToOur);
		
		JLabel lblWelcomeToJavaclicker = new JLabel("In the Shop, You Can Buy Upgrades to Help You Progress Faster and Lazier.");
		lblWelcomeToJavaclicker.setBounds(93, 93, 433, 16);
		add(lblWelcomeToJavaclicker);
		
		JLabel label = new JLabel("Welcome to JavaClicker! In this Game You Get to Click the Big Button That Says Click Me!");
		label.setBounds(61, 72, 507, 16);
		add(label);
		
		JLabel lblEverySoOften = new JLabel("Every So Often, You Can Get Cases You Can Open to Get Sweet Rewards!");
		lblEverySoOften.setBounds(100, 114, 422, 16);
		add(lblEverySoOften);
	}

}
