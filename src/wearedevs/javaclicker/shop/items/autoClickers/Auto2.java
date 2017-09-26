package wearedevs.javaclicker.shop.items.autoClickers;

import wearedevs.javaclicker.handlers.AutoHandler;
import wearedevs.javaclicker.shop.ShopItem;

public class Auto2 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 10;

	}

	public int getPrice() {
		return 1500;
	}

	public String getName() {
		//10 Clicks a Second
		return "Auto Clicker: Tier 1";
	}

}
