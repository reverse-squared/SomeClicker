package com.wearedevs.someclicker.shop.items.perClickUpgrades;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class PerClick2 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 2;
		
		ShopHandler.unlock(new PerClick5());
		
		Main.updateCounter();
	}

	public int getPrice() {
		return 50;
	}

	public String getName() {
		return "2 Clicks Per Click";
	}

}
