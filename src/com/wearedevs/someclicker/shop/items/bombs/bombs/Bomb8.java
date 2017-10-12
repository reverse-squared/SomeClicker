package com.wearedevs.someclicker.shop.items.bombs.bombs;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Bomb8 extends ShopItem {

	public void onPurchase() {
		BaseMod.clickBomb = 800;
		
		ShopHandler.unlock(new Bomb9());
	}

	public int getPrice() {
		return 15000;
	}

	public String getName() {
		return "Click Bomb: Tier 8";
	}

}
