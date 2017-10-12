package com.wearedevs.someclicker.shop.items.autoClickers;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Auto5 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 30;
		
		ShopHandler.unlock(new Auto6());
	}

	public int getPrice() {
		return 10000;
	}

	public String getName() {
		return "Auto Clicker: Tier 5";
	}

}
