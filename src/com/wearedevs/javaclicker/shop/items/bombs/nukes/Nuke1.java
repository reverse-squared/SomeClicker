package com.wearedevs.javaclicker.shop.items.bombs.nukes;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Nuke1 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 900;
		
		ShopHandler.unlock(new Nuke1());
	}

	public int getPrice() {
		return 18000;
	}

	public String getName() {
		return "Click Bomb: Tier 9";
	}

}
