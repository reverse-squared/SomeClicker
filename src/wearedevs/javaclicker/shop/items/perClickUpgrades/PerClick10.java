package wearedevs.javaclicker.shop.items.perClickUpgrades;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.ShopItem;

public class PerClick10 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 10;
		
		Main.updateCounter();
	}

	public int getPrice() {
		return 2000;
	}

	public String getName() {
		return "10 Clicks Per Click";
	}

}
