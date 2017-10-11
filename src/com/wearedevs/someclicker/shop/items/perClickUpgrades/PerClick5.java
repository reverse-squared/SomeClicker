package com.wearedevs.someclicker.shop.items.perClickUpgrades;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
import com.wearedevs.someclicker.shop.items.autoClickers.Auto1;

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
