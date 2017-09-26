package wearedevs.javaclicker.shop.items.perClickUpgrades;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.handlers.ShopHandler;
import wearedevs.javaclicker.shop.ShopItem;
import wearedevs.javaclicker.shop.items.autoClickers.Auto1;

public class PerClick5 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 5;
		
		ShopHandler.unlock(new PerClick7());
		ShopHandler.unlock(new Auto1());
		
		Main.updateCounter();
	}

	public int getPrice() {
		return 200;
	}

	public String getName() {
		return "5 Clicks Per Click";
	}

}
