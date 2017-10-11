package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

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
