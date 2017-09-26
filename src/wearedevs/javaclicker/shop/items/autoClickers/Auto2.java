package wearedevs.javaclicker.shop.items.autoClickers;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.ShopItem;

public class Auto2 extends ShopItem {

	public void onPurchase() {
		Main.updateCounter();
	}

	public int getPrice() {
		return 1500;
	}

	public String getName() {
		//10 Clicks a Second
		return "Auto Clicker: Tier 1";
	}

}
