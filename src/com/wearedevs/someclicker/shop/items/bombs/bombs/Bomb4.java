package com.wearedevs.someclicker.shop.items.bombs.bombs;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Bomb4 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 4000;
		
		ShopHandler.unlock(new Bomb5());
	}

	public int getPrice() {
		return 5000;
	}

	public String getName() {
		return "Click Bomb: Tier 4";
	}

}
