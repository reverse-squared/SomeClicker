package com.wearedevs.javaclicker.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.cases.*;
import com.wearedevs.javaclicker.handlers.CaseHandler;

/**
 * The Visual Panel for Showing Everything that Has to Do With Cases.
 */
public class CasePanel extends JPanel {
	private static final long serialVersionUID = -2856455613720020251L;

	public CasePanel() {
		setLayout(null);
		setBounds(Main.panelSize);
		
		JLabel labelTitle = new JLabel("Cases");
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
		labelTitle.setBounds(12, 13, 616, 67);
		add(labelTitle);
		
		JButton clickCase = new JButton("Open a Click Case (x999)");
		clickCase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CaseHandler.openCase(new ClickCase());
			}
		});
		clickCase.setBounds(12, 80, 270, 40);
		add(clickCase);
		
		JButton clickMultCase = new JButton("Open a Click Multiplier Case (x999)");
		clickMultCase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CaseHandler.openCase(new ClickMultiplierCase());
			}
		});
		clickMultCase.setBounds(12, 125, 270, 40);
		add(clickMultCase);
		
		JButton soundCase = new JButton("Open a Sound Case (x999)");
		soundCase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CaseHandler.openCase(new SoundCase());
			}
		});
		soundCase.setBounds(12, 170, 270, 40);
		add(soundCase);
		
		JButton backBtn = new JButton("Go Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.updateCounter();
				
				Main.main.setContentPane(Main.mainPanel);
			}
		});
		backBtn.setBounds(12, 398, 270, 40);
		add(backBtn);
	}

}
