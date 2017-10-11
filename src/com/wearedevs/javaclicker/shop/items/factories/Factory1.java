package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Factory1 extends ShopItem {

	public void onPurchase() {
		BaseMod.factory = 10;
		
		ShopHandler.unlock(new Factory2());
	}

	public int getPrice() {
		return 1000;
	}

	public String getName() {
		return "Click Factory: Tier 1";
	}
}
