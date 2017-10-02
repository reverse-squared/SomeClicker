package com.wearedevs.javaclicker.shop.items.reactor.blackhole.supermassiveblackhole;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class SupermassiveBlackhole4 extends ShopItem {

	public void onPurchase() {
		//TODO: Fix This
		AutoHandler.reactorGen = 10000;
		AutoHandler.reactorSuck = 10; // 6000 sucked
		
		//Init AutoClicker
		AutoHandler.initAutoThread();
	}

	public int getPrice() {
		//TODO: Fix Prices
		return 100000;
	}

	public String getName() {
		return "Supermassive Blackhole: Tier 4";
	}

}
