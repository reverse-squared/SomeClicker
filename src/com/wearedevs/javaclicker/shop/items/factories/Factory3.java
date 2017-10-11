package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Factory3 extends ShopItem {

	public void onPurchase() {
		BaseMod.factory = 30;
		
		ShopHandler.unlock(new Factory4());
	}

	public int getPrice() {
		return 3500;
	}

	public String getName() {
		return "Click Factory: Tier 3";
	}
}
