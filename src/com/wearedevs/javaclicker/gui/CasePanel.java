package com.wearedevs.javaclicker.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.wearedevs.javaclicker.Main;

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
