package com.wearedevs.someclicker.shop.items.factories;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Factory3 extends ShopItem {

	public void onPurchase() {
		AutoHandler.factory = 30;
		ShopHandler.unlock(new Factory4());
	}

	public int getPrice() {
		return 3500;
	}

	public String getName() {
		return "Click Factory: Tier 3";
	}
}
