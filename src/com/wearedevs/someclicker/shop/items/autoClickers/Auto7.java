package com.wearedevs.someclicker.shop.items.autoClickers;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Auto7 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 100;
		
		ShopHandler.unlock(new Auto8());
	}

	public int getPrice() {
		return 45000;
	}

	public String getName() {
		return "Auto Clicker: Tier 7";
	}

}
