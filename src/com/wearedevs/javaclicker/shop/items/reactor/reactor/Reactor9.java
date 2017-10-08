package com.wearedevs.javaclicker.shop.items.reactor.reactor;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.reactor.blackhole.blackhole.Blackhole1;

public class Reactor9 extends ShopItem {

	public void onPurchase() {
		//TODO: Fix This
		AutoHandler.reactorGen = 10000;
		AutoHandler.reactorSuck = 10;
		
		ShopHandler.unlock(new Blackhole1());
	}

	public int getPrice() {
		//TODO: Fix Prices
		return 100000;
	}

	public String getName() {
		return "Reactor: Tier 9";
	}

}
