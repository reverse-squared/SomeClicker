package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class AutoMAX extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = Integer.MAX_VALUE;
	}

	public int getPrice() {
		return 100000;
	}

	public String getName() {
		return "Auto Clicker: Tier 5";
	}

}
