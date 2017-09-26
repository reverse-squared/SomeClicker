package wearedevs.javaclicker.shop.items.autoClickers;

import wearedevs.javaclicker.handlers.AutoHandler;
import wearedevs.javaclicker.handlers.ShopHandler;
import wearedevs.javaclicker.shop.ShopItem;

public class Auto1 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 5;
		
		ShopHandler.unlock(new Auto2());
		
		//Init Auto Clicker
		AutoHandler.initAutoThread();

	}

	public int getPrice() {
		return 700;
	}

	public String getName() {
		//5 Clicks a Second
		return "Auto Clicker: Tier 1";
	}

}
