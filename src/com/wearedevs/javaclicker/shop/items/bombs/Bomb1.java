package com.wearedevs.javaclicker.shop.items.bombs;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.factories.Factory1;

public class Bomb1 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 100;
		
		ShopHandler.unlock(new Bomb2());
		ShopHandler.unlock(new Factory1());
		
		//Init AutoClicker
		AutoHandler.initAutoThread();

	}

	public int getPrice() {
		return 666;
	}

	public String getName() {
		//100 Clicks Per 10 Seconds
		return "Click Bomb: Tier 1";
	}

}