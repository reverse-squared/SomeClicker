package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Factory7 extends ShopItem {

	public void onPurchase() {
		BaseMod.factory = 70;
		ShopHandler.unlock(new Factory8());
	}

	public int getPrice() {
		return 12000;
	}

	public String getName() {
		return "Click Factory: Tier 7";
	}
}
