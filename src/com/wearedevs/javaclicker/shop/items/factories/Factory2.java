package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Factory2 extends ShopItem {

	//TODO: 30 Clicks Every 5 Seconds
	public void onPurchase() {
		ShopHandler.unlock(new Factory3());
	}

	public int getPrice() {
		return 1000;
	}

	public String getName() {
		return "Click Factory: Tier 1";
	}
}
