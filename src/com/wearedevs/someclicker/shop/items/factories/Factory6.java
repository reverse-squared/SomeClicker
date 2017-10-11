package com.wearedevs.someclicker.shop.items.factories;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Factory6 extends ShopItem {

	public void onPurchase() {
		BaseMod.factory = 60;
		ShopHandler.unlock(new Factory7());
	}

	public int getPrice() {
		return 10000;
	}

	public String getName() {
		return "Click Factory: Tier 6";
	}
}
