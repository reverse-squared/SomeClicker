package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto9 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 300;
	}

	public int getPrice() {
		return 123000;
	}

	public String getName() {
		return "Auto Clicker: Tier 9";
	}

}
