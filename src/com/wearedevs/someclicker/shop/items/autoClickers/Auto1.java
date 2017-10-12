package com.wearedevs.someclicker.shop.items.autoClickers;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Auto1 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 5;
		
		ShopHandler.unlock(new Auto2());

	}

	public int getPrice() {
		return 700;
	}

	public String getName() {
		return "Auto Clicker: Tier 1";
	}

}
