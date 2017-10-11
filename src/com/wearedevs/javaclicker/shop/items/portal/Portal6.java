package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Portal6 extends ShopItem {

	public void onPurchase() {
		BaseMod.portal = 7000;
		
		ShopHandler.unlock(new Portal7());
	}

	public int getPrice() {
		return 1000000;
	}

	public String getName() {
		return "Click Portal: Tier 6";
	}

}
