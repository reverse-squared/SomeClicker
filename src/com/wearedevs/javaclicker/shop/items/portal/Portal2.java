package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Portal2 extends ShopItem {
	
	public void onPurchase() {
		AutoHandler.portal = 1000;
		
		ShopHandler.unlock(new Portal3());
	}

	public int getPrice() {
		return 50000;
	}

	public String getName() {
		return "Click Portal: Tier 2";
	}

}
