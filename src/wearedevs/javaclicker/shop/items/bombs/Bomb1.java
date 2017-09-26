package wearedevs.javaclicker.shop.items.bombs;

import wearedevs.javaclicker.AutoHandler;
import wearedevs.javaclicker.shop.ShopHandler;
import wearedevs.javaclicker.shop.ShopItem;

public class Bomb1 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 100;
		
		ShopHandler.unlock(new Bomb2());
		
		//Init AutoClicker
		AutoHandler.initAutoThread();

	}

	public int getPrice() {
		return 666;
	}

	public String getName() {
		//100 Clicks Per 10 Seconds
		return "Click Bomb: Tier 1";
	}

}
