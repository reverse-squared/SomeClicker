package com.wearedevs.someclicker.shop.items.bombs.bombs;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Bomb6 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 600;
		
		ShopHandler.unlock(new Bomb7());
	}

	public int getPrice() {
		return 7000;
	}

	public String getName() {
		return "Click Bomb: Tier 6";
	}

}
