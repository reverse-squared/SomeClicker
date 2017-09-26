package wearedevs.javaclicker.shop.items.autoClickers;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.ShopHandler;
import wearedevs.javaclicker.shop.ShopItem;

public class Auto1 extends ShopItem {

	public void onPurchase() {
		ShopHandler.unlock(new Auto2());
		
		Main.updateCounter();
	}

	public int getPrice() {
		return 700;
	}

	public String getName() {
		//5 Clicks a Second
		return "Auto Clicker: Tier 1";
	}

}
