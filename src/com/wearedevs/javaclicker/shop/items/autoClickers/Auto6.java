package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto6 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 69;
		
		ShopHandler.unlock(new Auto7());
	}

	public int getPrice() {
		return 20000;
	}

	public String getName() {
		return "Auto Clicker: Tier 6";
	}

}
