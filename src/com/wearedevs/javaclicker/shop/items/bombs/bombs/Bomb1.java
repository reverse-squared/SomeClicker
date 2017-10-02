package com.wearedevs.javaclicker.shop.items.bombs.bombs;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.factories.Factory1;

public class Bomb1 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 100;
		
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
