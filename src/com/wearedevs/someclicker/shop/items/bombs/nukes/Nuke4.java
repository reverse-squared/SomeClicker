package com.wearedevs.someclicker.shop.items.bombs.nukes;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.shop.ShopItem;

public class Nuke4 extends ShopItem {

	public void onPurchase() {
		BaseMod.clickBomb = 100000;
	}

	public int getPrice() {
		return 15000;
	}

	public String getName() {
		return "Click Nuke: Tier 4";
	}

}
