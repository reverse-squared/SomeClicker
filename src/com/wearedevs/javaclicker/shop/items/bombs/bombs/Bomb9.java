package com.wearedevs.javaclicker.shop.items.bombs.bombs;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Bomb9 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 1000;
	}

	public int getPrice() {
		return 20000;
	}

	public String getName() {
		return "Click Nuke: Tier 1";
	}

}
