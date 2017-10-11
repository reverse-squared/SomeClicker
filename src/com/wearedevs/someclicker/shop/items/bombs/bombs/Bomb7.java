package com.wearedevs.someclicker.shop.items.bombs.bombs;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

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
