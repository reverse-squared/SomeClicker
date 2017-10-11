package com.wearedevs.someclicker.shop.items.factories;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Factory8 extends ShopItem {

	public void onPurchase() {
		AutoHandler.factory = 80;
	}

	public int getPrice() {
		return 15000;
	}

	public String getName() {
		return "Click Factory: Tier 8";
	}
}
