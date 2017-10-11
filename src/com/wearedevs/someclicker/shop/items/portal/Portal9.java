package com.wearedevs.someclicker.shop.items.portal;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Portal9 extends ShopItem {

	public void onPurchase() {
		AutoHandler.portal = 25000;
	}

	public int getPrice() {
		return 10000000;
	}

	public String getName() {
		return "Click Portal: Tier 9";
	}

}
