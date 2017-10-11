package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Factory8 extends ShopItem {

	public void onPurchase() {
		BaseMod.factory = 80;
	}

	public int getPrice() {
		return 15000;
	}

	public String getName() {
		return "Click Factory: Tier 8";
	}
}
