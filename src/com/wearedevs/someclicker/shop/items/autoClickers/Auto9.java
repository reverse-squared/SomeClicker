package com.wearedevs.someclicker.shop.items.autoClickers;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.shop.ShopItem;

public class Auto9 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 300;
	}

	public int getPrice() {
		return 123000;
	}

	public String getName() {
		return "Auto Clicker: Tier 9";
	}

}
