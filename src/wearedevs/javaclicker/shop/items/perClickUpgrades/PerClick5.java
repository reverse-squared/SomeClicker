package wearedevs.javaclicker.shop.items.perClickUpgrades;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.ShopItem;

public class PerClick5 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 5;
	}

	public int getPrice() {
		return 200;
	}

	public String getName() {
		return "5 Clicks Per Click";
	}

}
