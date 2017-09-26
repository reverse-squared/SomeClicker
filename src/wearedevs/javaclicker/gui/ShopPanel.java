package wearedevs.javaclicker.gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import wearedevs.javaclicker.Main;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class ShopPanel extends JPanel {
	public JPanel upgradesPanel;

	public ShopPanel() {
		setLayout(null);
		setBounds(Main.panelSize);
		
		JButton backBtn = new JButton("Go back");
		backBtn.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				Main.main.setContentPane(Main.main.mainPanel);
			}
		});
		backBtn.setBounds(12, 398, 270, 69);
		add(backBtn);
		
		upgradesPanel = new JPanel();
		upgradesPanel.setBounds(12, 75, 616, 311);
		add(upgradesPanel);
		upgradesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setSize(new Dimension(170, 50));
		upgradesPanel.add(btnNewButton);
		
		JLabel labelTitle = new JLabel("The Shop");
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
		labelTitle.setBounds(12, 13, 616, 67);
		add(labelTitle);
		
	}
}
