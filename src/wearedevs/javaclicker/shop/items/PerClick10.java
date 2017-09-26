package wearedevs.javaclicker.shop.items;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.ShopItem;

public class PerClick10 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 10;
	}

	public int getPrice() {
		return 2000;
	}

	public String getName() {
		return "2 Clicks Per Click";
	}

}
