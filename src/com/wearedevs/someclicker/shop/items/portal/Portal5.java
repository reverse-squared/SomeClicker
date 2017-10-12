package com.wearedevs.someclicker.shop.items.portal;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Portal5 extends ShopItem {
	
	public void onPurchase() {
		BaseMod.portal = 5000;
		
		ShopHandler.unlock(new Portal6());
	}

	public int getPrice() {
		return 500000;
	}

	public String getName() {
		return "Click Portal: Tier 5";
	}

}
