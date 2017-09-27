package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Factory5 extends ShopItem {

	public void onPurchase() {
		AutoHandler.factory = 50;
		ShopHandler.unlock(new Factory6());
	}

	public int getPrice() {
		return 8000;
	}

	public String getName() {
		return "Click Factory: Tier 5";
	}
}
