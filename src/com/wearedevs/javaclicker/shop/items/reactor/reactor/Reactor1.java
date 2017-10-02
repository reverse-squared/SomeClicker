package com.wearedevs.javaclicker.shop.items.reactor.reactor;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Reactor1 extends ShopItem {

	public void onPurchase() {
		AutoHandler.reactorGen = 20000;
		AutoHandler.reactorSuck = 10; // 6000 sucked
		
		AutoHandler.initAutoThread();
	}

	public int getPrice() {
		return 100000;
	}

	public String getName() {
		return "Reactor: Tier 1";
	}

}
