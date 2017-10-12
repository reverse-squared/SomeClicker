package com.wearedevs.someclicker.shop.items.portal;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

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
