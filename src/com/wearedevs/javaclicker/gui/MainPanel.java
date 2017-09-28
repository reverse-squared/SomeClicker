package com.wearedevs.javaclicker.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.handlers.ShopHandler;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {
	public JLabel labelClicks;
	
	public MainPanel() {
		setLayout(null);
		setBounds(Main.windowSize);
		
		labelClicks = new JLabel("Click the Button!");
		labelClicks.setFont(new Font("Tahoma", Font.BOLD, 25));
		labelClicks.setBounds(12, 13, 377, 34);
		add(labelClicks);
		
		JButton clicker = new JButton("Click Me!");
		clicker.setFont(new Font("Tahoma", Font.BOLD, 20));
		clicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int rand = (int) Math.ceil(Math.random() * 20);
				
				if(rand == 20) {
					Main.clicks += Main.perClick * 2;
					playSound("res/sound/click.wav");
					
					Main.updateCounter();
				} else {
					Main.clicks += Main.perClick;
					playSound("res/sound/click.wav");
					
					Main.updateCounter();	
				}
			}
		});
		clicker.setBounds(12, 58, 610, 100);
		add(clicker);
		
		JButton shopButton = new JButton("The Shop");
		shopButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		shopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShopHandler.updateLayout();
				Main.main.setContentPane(Main.shopPanel);
			}
		});
		shopButton.setBounds(12, 398, 270, 40);
		add(shopButton);
	}


	public void updateCounter() {
		labelClicks.setText("Clicks: " + Main.clicks);
	}
	
	public void playSound(String soundName) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		} catch(Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace( );
			
		}
    }
}
