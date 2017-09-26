package wearedevs.javaclicker.shop.items;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.ShopItem;

public class PerClick1 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 2;
	}

	public int getPrice() {
		return 20;
	}

	public String getName() {
		return "Increase Clicks Per Click";
	}

}
