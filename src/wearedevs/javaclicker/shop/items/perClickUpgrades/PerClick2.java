package wearedevs.javaclicker.shop.items.perClickUpgrades;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.ShopHandler;
import wearedevs.javaclicker.shop.ShopItem;

public class PerClick2 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 2;
		ShopHandler.unlock(new PerClick5());
	}

	public int getPrice() {
		return 50;
	}

	public String getName() {
		return "2 Clicks Per Click";
	}

}
