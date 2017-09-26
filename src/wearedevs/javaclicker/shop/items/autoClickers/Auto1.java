package wearedevs.javaclicker.shop.items.autoClickers;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.ShopHandler;
import wearedevs.javaclicker.shop.ShopItem;
import wearedevs.javaclicker.shop.items.perClickUpgrades.PerClick5;

public class Auto1 extends ShopItem {

	public void onPurchase() {
		
		ShopHandler.unlock(new Auto2());
	}

	public int getPrice() {
		return 700;
	}

	public String getName() {
		//5 Clicks a Second
		return "Auto Clicker: Tier 1";
	}

}
