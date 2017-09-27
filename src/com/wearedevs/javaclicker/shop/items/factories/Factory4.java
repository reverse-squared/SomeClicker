package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Factory4 extends ShopItem {

	public void onPurchase() {
		AutoHandler.factory = 40;
		ShopHandler.unlock(new Factory5());
	}

	public int getPrice() {
		return 5000;
	}

	public String getName() {
		return "Click Factory: Tier 4";
	}
}
