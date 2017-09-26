package wearedevs.javaclicker.shop.items;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.ShopItem;

public class PerClick2 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 2;
	}

	public int getPrice() {
		return 50;
	}

	public String getName() {
		return "2 Clicks Per Click";
	}

}
