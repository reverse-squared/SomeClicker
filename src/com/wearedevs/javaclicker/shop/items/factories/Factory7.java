package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Factory7 extends ShopItem {

	public void onPurchase() {
		AutoHandler.factory = 70;
		ShopHandler.unlock(new Factory8());
	}

	public int getPrice() {
		return 12000;
	}

	public String getName() {
		return "Click Factory: Tier 7";
	}
}
