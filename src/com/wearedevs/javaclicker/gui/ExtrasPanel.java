package com.wearedevs.javaclicker.gui;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.wearedevs.javaclicker.Main;

/**
 * The Visual Panel for Showing Everything that Has to Do With Information About the Game.
 */
public class ExtrasPanel extends JPanel {
	private static final long serialVersionUID = -1523225555156016420L;

	public ExtrasPanel() throws URISyntaxException {
		final URI uri = new URI("https://github.com/WeAreDevs/JavaClicker/wiki/Modding");
		
		setLayout(null);
		setBounds(Main.panelSize);
		
		JLabel labelTitle = new JLabel("Extras");
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
		
		JLabel ownMod = new JLabel("Want to Make Your Own Mod?");
		ownMod.setFont(new Font("Tahoma", Font.BOLD, 15));
		ownMod.setBounds(12, 79, 240, 28);
		add(ownMod);
		
		JButton openLink = new JButton("Click Here!");
		openLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				open(uri);
			}
		});
		openLink.setBounds(244, 82, 97, 25);
		add(openLink);
	}
	
	private static void open(URI uri) {
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(uri);
			} catch (IOException e) {
				
			}
		}
	}

}
