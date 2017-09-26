package wearedevs.javaclicker.shop;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.items.perClickUpgrades.PerClick2;

public class ShopHandler {

	public static ArrayList<ShopItem> items = new ArrayList<ShopItem>();
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
			JButton button = new JButton(item.getName() + " ("+Main.CURRENCY_SYMBOL+item.getPrice()+")");
			
			button.setSize(new Dimension(170, 50));
			
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int price = item.getPrice();
					if(Main.clicks >= price) {
						Main.clicks -= price;
						item.onPurchase();
						items.remove(item);
						updateLayout();
					}
				}
			});
			
			Main.shopPanel.upgradesPanel.add(button);
		}
		
	}
}
