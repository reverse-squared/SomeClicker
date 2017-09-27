package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Factory3 extends ShopItem {

	public void onPurchase() {
		AutoHandler.factory = 30;
	}

	public int getPrice() {
		return 3500;
	}

	public String getName() {
		return "Click Factory: Tier 3";
	}
}
