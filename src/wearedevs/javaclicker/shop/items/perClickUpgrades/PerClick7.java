package wearedevs.javaclicker.shop.items.perClickUpgrades;

import wearedevs.javaclicker.Main;
import wearedevs.javaclicker.shop.ShopHandler;
import wearedevs.javaclicker.shop.ShopItem;
import wearedevs.javaclicker.shop.items.bombs.Bomb1;

public class PerClick7 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 7;
		
		ShopHandler.unlock(new PerClick10());
		ShopHandler.unlock(new Bomb1());
	}

	public int getPrice() {
		return 500;
	}

	public String getName() {
		return "7 Clicks Per Click";
	}

}
