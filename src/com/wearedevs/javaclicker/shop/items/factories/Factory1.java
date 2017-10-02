package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

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
