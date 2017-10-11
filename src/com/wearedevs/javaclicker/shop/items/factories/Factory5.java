package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

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
