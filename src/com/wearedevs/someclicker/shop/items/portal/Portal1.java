package com.wearedevs.someclicker.shop.items.portal;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Portal1 extends ShopItem {
	
	public void onPurchase() {
		BaseMod.portal = 500;
		
		ShopHandler.unlock(new Portal2());
	}

	public int getPrice() {
		return 25000;
	}

	public String getName() {
		return "Click Portal: Tier 1";
	}

}
