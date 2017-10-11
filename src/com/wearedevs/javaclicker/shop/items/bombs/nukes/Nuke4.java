package com.wearedevs.javaclicker.shop.items.bombs.nukes;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.shop.ShopItem;

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
