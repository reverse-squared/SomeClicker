package com.wearedevs.someclicker.gui;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.wearedevs.someclicker.Main;

/**
 * The Visual Panel for Showing Everything that Has to Do With Information About the Game.
 */
public class CheaterPanel extends JPanel {
	private static final long serialVersionUID = -1523225555156016420L;

	public CheaterPanel() {
		setLayout(null);
		setBounds(Main.panelSize);
		
		JLabel labelTitle = new JLabel("You Have Been Caught Cheating!");
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
		labelTitle.setBounds(12, 13, 615, 67);
		add(labelTitle);
	}

}
