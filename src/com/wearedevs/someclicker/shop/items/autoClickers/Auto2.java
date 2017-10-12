package com.wearedevs.someclicker.shop.items.autoClickers;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Auto2 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 7;
		
		ShopHandler.unlock(new Auto3());
	}

	public int getPrice() {
		return 1500;
	}

	public String getName() {
		return "Auto Clicker: Tier 2";
	}

}
