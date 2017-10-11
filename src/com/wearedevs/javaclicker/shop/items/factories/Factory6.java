package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

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
