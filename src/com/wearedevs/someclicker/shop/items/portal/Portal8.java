package com.wearedevs.someclicker.shop.items.portal;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Portal8 extends ShopItem {

	public void onPurchase() {
		AutoHandler.portal = 15000;
		
		ShopHandler.unlock(new Portal9());
	}

	public int getPrice() {
		return 4000000;
	}

	public String getName() {
		return "Click Portal: Tier 8";
	}

}
