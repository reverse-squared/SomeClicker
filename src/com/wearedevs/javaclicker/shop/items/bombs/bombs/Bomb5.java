package com.wearedevs.javaclicker.shop.items.bombs.bombs;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Bomb5 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 5000;
		
		ShopHandler.unlock(new Bomb6());
	}

	public int getPrice() {
		return 5000;
	}

	public String getName() {
		return "Click Bomb: Tier 5";
	}

}
