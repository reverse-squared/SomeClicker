package com.wearedevs.someclicker.shop.items.portal;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Portal7 extends ShopItem {

	public void onPurchase() {
		BaseMod.portal = 10000;
		
		ShopHandler.unlock(new Portal8());
	}

	public int getPrice() {
		return 2000000;
	}

	public String getName() {
		return "Click Portal: Tier 7";
	}

}
