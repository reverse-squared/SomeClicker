package com.wearedevs.someclicker.shop.items.factories;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Factory1 extends ShopItem {

	public void onPurchase() {
		AutoHandler.factory = 10;
		
		ShopHandler.unlock(new Factory2());
	}

	public int getPrice() {
		return 1000;
	}

	public String getName() {
		return "Click Factory: Tier 1";
	}
}
