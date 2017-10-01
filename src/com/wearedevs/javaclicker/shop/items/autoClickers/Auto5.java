package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto5 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 30;
	}

	public int getPrice() {
		return 10000;
	}

	public String getName() {
		return "Auto Clicker: Tier 5";
	}

}
