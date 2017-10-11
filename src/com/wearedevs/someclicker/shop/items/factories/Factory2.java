package com.wearedevs.someclicker.shop.items.factories;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Factory2 extends ShopItem {

	public void onPurchase() {
		AutoHandler.factory = 20;
		
		ShopHandler.unlock(new Factory3());
	}

	public int getPrice() {
		return 2000;
	}

	public String getName() {
		return "Click Factory: Tier 2";
	}
}
