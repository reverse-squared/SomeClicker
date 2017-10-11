package com.wearedevs.someclicker.shop.items.perClickUpgrades;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class PerClick10 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 10;
		
		ShopHandler.unlock(new PerClick15());
		Main.updateCounter();
	}

	public int getPrice() {
		return 2000;
	}

	public String getName() {
		return "10 Clicks Per Click";
	}

}
