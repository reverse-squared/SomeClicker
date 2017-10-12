package com.wearedevs.someclicker.shop.items.bombs.bombs;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
import com.wearedevs.someclicker.shop.items.factories.Factory1;

public class Bomb1 extends ShopItem {

	public void onPurchase() {
		BaseMod.clickBomb = 100;
		
		ShopHandler.unlock(new Bomb2());
		ShopHandler.unlock(new Factory1());

	}

	public int getPrice() {
		return 666;
	}

	public String getName() {
		return "Click Bomb: Tier 1";
	}

}
