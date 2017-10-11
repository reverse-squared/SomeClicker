package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Portal4 extends ShopItem {
	
	public void onPurchase() {
		BaseMod.portal = 2000;
		
		ShopHandler.unlock(new Portal5());
	}

	public int getPrice() {
		return 200000;
	}

	public String getName() {
		return "Click Portal: Tier 4";
	}

}
