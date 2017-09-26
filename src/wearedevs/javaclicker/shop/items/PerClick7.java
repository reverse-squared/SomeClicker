package wearedevs.javaclicker.shop.items;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.ShopItem;

public class PerClick7 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 7;
	}

	public int getPrice() {
		return 500;
	}

	public String getName() {
		return "2 Clicks Per Click";
	}

}
