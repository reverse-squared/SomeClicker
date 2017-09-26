package wearedevs.javaclicker.shop.items.bombs;

import wearedevs.javaclicker.AutoHandler;
import wearedevs.javaclicker.shop.ShopItem;

public class Bomb2 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 200;
	}

	public int getPrice() {
		return 2000;
	}

	public String getName() {
		//200 Clicks Per 10 Seconds
		return "Click Bomb: Tier 2";
	}

}
