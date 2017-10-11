package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Portal9 extends ShopItem {

	public void onPurchase() {
		BaseMod.portal = 25000;
	}

	public int getPrice() {
		return 10000000;
	}

	public String getName() {
		return "Click Portal: Tier 9";
	}

}
