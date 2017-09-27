package com.wearedevs.javaclicker.shop.items.bombs.bombs;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Bomb7 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 700;
		
		ShopHandler.unlock(new Bomb8());
	}

	public int getPrice() {
		return 10000;
	}

	public String getName() {
		return "Click Bomb: Tier 7";
	}

}
