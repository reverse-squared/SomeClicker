package com.wearedevs.javaclicker.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.handlers.CaseHandler;


/**
 * The Visual Panel for Showing Everything that Has to Do With Cases.
 */
public class CasePanel extends JPanel {
	private static final long serialVersionUID = -2856455613720020251L;
	public JPanel casePanel;
	public JLabel labelClicks;
	public CasePanel() {
		setLayout(null);
		setBounds(Main.panelSize);

		casePanel = new JPanel();
		casePanel.setBounds(12, 75, 616, 311);
		add(casePanel);
		casePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton backBtn = new JButton("Go Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.updateCounter();
				
				Main.main.setContentPane(Main.mainPanel);
			}
		});
		backBtn.setBounds(12, 398, 270, 40);
		add(backBtn);
		
		JLabel labelTitle = new JLabel("Cases");
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
		labelTitle.setBounds(12, 13, 616, 67);
		add(labelTitle);

		labelClicks = new JLabel("0 Clicks");
		labelClicks.setBounds(290, 410, 345, 16);
		
		labelClicks.setHorizontalAlignment(SwingConstants.RIGHT);
		labelClicks.setFont(new Font("Tahoma", Font.BOLD, 25));
		labelClicks.setBounds(282, 398, 346, 60);
		add(labelClicks);
	}
	
	public static void updateLayout() {
		
		Main.casePanel.casePanel.removeAll();
		
		Main.casePanel.casePanel.repaint();
		
		for(Case c : CaseHandler.caseList) {
			JButton button = new JButton(c.getName());
			
			button.setSize(new Dimension(170, 50));
			
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CaseHandler.openCase(c);
				}
			});
			
			Main.casePanel.casePanel.add(button);
		}
		
	}
}
