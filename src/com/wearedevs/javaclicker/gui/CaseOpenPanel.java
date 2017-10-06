package com.wearedevs.javaclicker.gui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.wearedevs.javaclicker.cases.Case;

public class CaseOpenPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public JLabel label_opening;
	public JLabel label_title;
	
	/**
	 * Create the frame.
	 * @param c The Case Name
	 */
	public CaseOpenPanel(Case c) {
		setLayout(null);
		
		label_opening = new JLabel("What you are opening right now");
		label_opening.setHorizontalAlignment(SwingConstants.CENTER);
		label_opening.setBounds(12, 117, 600, 43);
		add(label_opening);
		
		label_title = new JLabel("Opening a " + c.getName());
		label_title.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_title.setHorizontalAlignment(SwingConstants.CENTER);
		label_title.setBounds(12, 13, 600, 43);
		add(label_title);
	}
}
