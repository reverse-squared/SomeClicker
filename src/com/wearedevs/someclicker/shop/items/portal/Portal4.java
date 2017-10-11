package com.wearedevs.someclicker.shop.items.portal;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Portal4 extends ShopItem {
	
	public void onPurchase() {
		AutoHandler.portal = 2000;
		
		ShopHandler.unlock(new Portal5());
	}

	public int getPrice() {
		return 200000;
	}

	public String getName() {
		return "Click Portal: Tier 4";
	}

}
