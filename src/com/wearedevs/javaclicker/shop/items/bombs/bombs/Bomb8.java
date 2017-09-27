package com.wearedevs.javaclicker.shop.items.bombs.bombs;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Bomb8 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 800;
		
		ShopHandler.unlock(new Bomb9());
	}

	public int getPrice() {
		return 15000;
	}

	public String getName() {
		return "Click Bomb: Tier 8";
	}

}
