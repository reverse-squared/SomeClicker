package com.wearedevs.javaclicker.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.Case;
import javax.swing.JButton;

public class CaseOpenPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public JLabel label_opening;
	public JLabel label_title;
	public JButton btnGoBack;
	
	/**
	 * Create the frame.
	 * @param c The Case Name
	 */
	public CaseOpenPanel(Case c) {
		setLayout(null);
		
		label_opening = new JLabel("<Dynamic>");
		label_opening.setFont(new Font("Tahoma", Font.PLAIN, 42));
		label_opening.setHorizontalAlignment(SwingConstants.CENTER);
		label_opening.setBounds(12, 117, 600, 51);
		add(label_opening);
		
		label_title = new JLabel("Opening a " + c.getName());
		label_title.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_title.setHorizontalAlignment(SwingConstants.CENTER);
		label_title.setBounds(12, 13, 600, 43);
		add(label_title);
		
		btnGoBack = new JButton("Go Back");
		btnGoBack.setVisible(false);
		btnGoBack.setBounds(265, 181, 97, 25);
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main.setContentPane(Main.mainPanel);
			}
		});
		add(btnGoBack);
	}
}
