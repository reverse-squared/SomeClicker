package com.wearedevs.javaclicker.shop.items.bombs;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Bomb6 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 6000;
	}

	public int getPrice() {
		return 7000;
	}

	public String getName() {
		return "Click Bomb: Tier 6";
	}

}
