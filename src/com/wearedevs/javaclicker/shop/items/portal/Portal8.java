package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

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
