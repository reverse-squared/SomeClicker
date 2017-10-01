package com.wearedevs.javaclicker.handlers;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.perClickUpgrades.PerClick2;
import com.wearedevs.javaclicker.util.SoundUtil;

public class ShopHandler {

	public static ArrayList<ShopItem> items;
	/**
	 * run once ok
	 * @author ImDaveead
	 */
	public static void initializeShop() {
		items = new ArrayList<ShopItem>();
		
		//Insert All Things By Default;
		unlock(new PerClick2());
		
	}
	public static void unlock(ShopItem item) {
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
						SoundUtil.playSound("res/sound/buy.wav");
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
