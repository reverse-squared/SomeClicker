package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto314159265 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 314159265;

	}

	public int getPrice() {
		return 314159265;
	}

	public String getName() {
		return "Auto Clicker: Tier 314159265";
	}

}
