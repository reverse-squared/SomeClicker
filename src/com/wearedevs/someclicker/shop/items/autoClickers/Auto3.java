package com.wearedevs.someclicker.shop.items.autoClickers;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Auto3 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 10;
		
		ShopHandler.unlock(new Auto4());
	}

	public int getPrice() {
		return 2500;
	}

	public String getName() {
		return "Auto Clicker: Tier 3";
	}

}
