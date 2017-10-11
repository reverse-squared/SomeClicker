package com.wearedevs.someclicker.shop.items.bombs.bombs;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Bomb2 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 200;
		
		ShopHandler.unlock(new Bomb3());
	}

	public int getPrice() {
		return 2000;
	}

	public String getName() {
		return "Click Bomb: Tier 2";
	}

}
