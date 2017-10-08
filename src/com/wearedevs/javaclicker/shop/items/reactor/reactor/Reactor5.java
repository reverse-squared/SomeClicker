package com.wearedevs.javaclicker.shop.items.reactor.reactor;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Reactor5 extends ShopItem {

	public void onPurchase() {
		//TODO: Fix This
		AutoHandler.reactorGen = 10000;
		AutoHandler.reactorSuck = 10;
		
		ShopHandler.unlock(new Reactor6());
	}

	public int getPrice() {
		//TODO: Fix Prices
		return 100000;
	}

	public String getName() {
		return "Reactor: Tier 5";
	}

}
