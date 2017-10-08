package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Portal7 extends ShopItem {

	public void onPurchase() {
		AutoHandler.portal = 10000;
		
		ShopHandler.unlock(new Portal8());
	}

	public int getPrice() {
		return 2000000;
	}

	public String getName() {
		return "Click Portal: Tier 7";
	}

}
