package com.wearedevs.someclicker.shop.items.factories;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Factory7 extends ShopItem {

	public void onPurchase() {
		AutoHandler.factory = 70;
		ShopHandler.unlock(new Factory8());
	}

	public int getPrice() {
		return 12000;
	}

	public String getName() {
		return "Click Factory: Tier 7";
	}
}
