package com.wearedevs.someclicker.shop.items.perClickUpgrades;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class PerClick15 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 15;
		
		ShopHandler.unlock(new PerClick18());
		Main.updateCounter();
	}

	public int getPrice() {
		return 5000;
	}

	public String getName() {
		return "15 Clicks Per Click";
	}

}
