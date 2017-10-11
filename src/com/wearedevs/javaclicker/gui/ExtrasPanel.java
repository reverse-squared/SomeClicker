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
 * The Panel for Extra Stuff
 */
public class ExtrasPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public ExtrasPanel() throws URISyntaxException {
		final URI moddingUri = new URI("https://github.com/WeAreDevs/JavaClicker/wiki/Modding");
		final URI ideaUri = new URI("https://goo.gl/forms/LItqqg4Tj3jSViGw1");
		final URI bugUri = new URI("https://goo.gl/forms/ybr8MuioZHFgtoth1");
		
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
				open(moddingUri);
			}
		});
		openLink.setBounds(244, 82, 97, 25);
		add(openLink);
		
		
		
		JLabel ideaLabel = new JLabel("Have an Idea for This Game?");
		ideaLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		ideaLabel.setBounds(12, 115, 240, 28);
		add(ideaLabel);
		
		JButton ideaButton = new JButton("Click Here!");
		ideaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				open(ideaUri);
			}
		});
		ideaButton.setBounds(244, 118, 97, 25);
		add(ideaButton);
		
		
		
		JLabel bugLabel = new JLabel("Found a Bug / Glitch?");
		bugLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		bugLabel.setBounds(12, 150, 240, 28);
		add(bugLabel);
		
		JButton bugButton = new JButton("Click Here!");
		bugButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				open(bugUri);
			}
		});
		bugButton.setBounds(180, 153, 97, 25);
		add(bugButton);
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
