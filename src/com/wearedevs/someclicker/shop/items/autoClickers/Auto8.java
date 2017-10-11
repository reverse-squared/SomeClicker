package com.wearedevs.someclicker.shop.items.autoClickers;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Auto8 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 200;
		
		ShopHandler.unlock(new Auto9());
	}

	public int getPrice() {
		return 75000;
	}

	public String getName() {
		return "Auto Clicker: Tier 8";
	}

}
