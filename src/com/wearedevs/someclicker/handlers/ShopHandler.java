package com.wearedevs.someclicker.handlers;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.shop.ShopItem;
import com.wearedevs.someclicker.shop.items.perClickUpgrades.PerClick2;
import com.wearedevs.someclicker.util.PlaySound;

public class ShopHandler {
	public static boolean disable = false;
	public static ArrayList<ShopItem> items;
	public static ArrayList<ShopItem> bought;
	
	/**
	 * Run Once Okey
	 * @author ImDaveead
	 */
	public static void initializeShop() {
		items = new ArrayList<ShopItem>();
		bought = new ArrayList<ShopItem>();
		
		//Insert All Things By Default;
		unlock(new PerClick2());
		
	}
	
	public static void unlock(ShopItem item) {
		if(disable) return;
		items.add(item);
	}
	
	public static void updateLayout() {
		
		Main.shopPanel.shopPanel.removeAll();
		
		Main.shopPanel.shopPanel.repaint();
		
		for(ShopItem item : items) {
			JButton button = new JButton(item.getName() + " ("+item.getPrice()+" Clicks)");
			
			button.setSize(new Dimension(170, 50));
			
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int price = item.getPrice();
					if(Main.clicks >= price) {
						Main.clicks -= price;
						item.onPurchase();
						PlaySound.playSound("/sound/buy.wav");
						bought.add(item);
						items.remove(item);
						
						Main.updateCounter();
						updateLayout();
					}
				}
			});

			Main.shopPanel.shopPanel.add(button);
		}
		
	}
}
