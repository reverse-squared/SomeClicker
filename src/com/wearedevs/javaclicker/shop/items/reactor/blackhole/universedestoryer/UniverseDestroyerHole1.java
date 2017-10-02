package com.wearedevs.javaclicker.shop.items.reactor.blackhole.universedestoryer;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class UniverseDestroyerHole1 extends ShopItem {

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
		return "Blackhole: Tier 1";
	}

}
