package com.wearedevs.someclicker.shop.items.autoClickers;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Auto4 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 15;
		
		ShopHandler.unlock(new Auto5());
	}

	public int getPrice() {
		return 4000;
	}

	public String getName() {
		return "Auto Clicker: Tier 4";
	}

}
