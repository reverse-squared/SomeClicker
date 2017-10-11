package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Factory2 extends ShopItem {

	public void onPurchase() {
		BaseMod.factory = 20;
		
		ShopHandler.unlock(new Factory3());
	}

	public int getPrice() {
		return 2000;
	}

	public String getName() {
		return "Click Factory: Tier 2";
	}
}
