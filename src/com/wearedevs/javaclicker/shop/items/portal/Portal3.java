package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

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
