package wearedevs.javaclicker.shop;

import java.util.ArrayList;

import javax.swing.JButton;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.items.perClickUpgrades.PerClick2;

public class ShopHandler {

	public static ArrayList<ShopItem> items;
	/**
	 * @author ImDaveead
	 */
	public static void initializeShop() {
		//Insert All Things By Default;
		unlock(new PerClick2());
		
	}
	public static void unlock(ShopItem item) {
		items.add(item);
	}
	public static void updateLayout() {
		
		Main.shopPanel.upgradesPanel.removeAll();
		
		for(ShopItem item : items) {
			JButton button = new JButton(item.getName());
			
			Main.shopPanel.upgradesPanel.add(button);
		}
		
	}
}
