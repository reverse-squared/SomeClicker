package com.wearedevs.someclicker.shop.items.portal;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Portal2 extends ShopItem {
	
	public void onPurchase() {
		BaseMod.portal = 1000;
		
		ShopHandler.unlock(new Portal3());
	}

	public int getPrice() {
		return 50000;
	}

	public String getName() {
		return "Click Portal: Tier 2";
	}

}
