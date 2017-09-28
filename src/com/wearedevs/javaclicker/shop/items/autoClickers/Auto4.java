package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto4 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 12;
	}

	public int getPrice() {
		return 4000;
	}

	public String getName() {
		return "Auto Clicker: Tier 4";
	}

}
