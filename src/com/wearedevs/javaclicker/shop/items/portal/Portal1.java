package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Portal1 extends ShopItem {
	
	public void onPurchase() {
		AutoHandler.portal = 500;
		
		ShopHandler.unlock(new Portal2());
	}

	public int getPrice() {
		return 25000;
	}

	public String getName() {
		return "Click Portal: Tier 1";
	}

}
