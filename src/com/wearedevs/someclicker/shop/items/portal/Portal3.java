package com.wearedevs.someclicker.shop.items.portal;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Portal3 extends ShopItem {
	
	public void onPurchase() {
		BaseMod.portal = 1500;
		
		ShopHandler.unlock(new Portal4());
	}

	public int getPrice() {
		return 120000;
	}

	public String getName() {
		return "Click Portal: Tier 3";
	}

}
