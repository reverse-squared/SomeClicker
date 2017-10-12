package com.wearedevs.someclicker.shop.items.factories;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Factory5 extends ShopItem {

	public void onPurchase() {
		BaseMod.factory = 50;
		ShopHandler.unlock(new Factory6());
	}

	public int getPrice() {
		return 8000;
	}

	public String getName() {
		return "Click Factory: Tier 5";
	}
}
