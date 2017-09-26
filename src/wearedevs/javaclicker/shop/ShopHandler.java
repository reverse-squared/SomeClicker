package wearedevs.javaclicker.shop;

import java.util.ArrayList;

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
}
