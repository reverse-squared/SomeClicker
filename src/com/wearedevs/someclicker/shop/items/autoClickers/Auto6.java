package com.wearedevs.someclicker.shop.items.autoClickers;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Auto6 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 69;
		
		ShopHandler.unlock(new Auto7());
	}

	public int getPrice() {
		return 20000;
	}

	public String getName() {
		return "Auto Clicker: Tier 6";
	}

}
