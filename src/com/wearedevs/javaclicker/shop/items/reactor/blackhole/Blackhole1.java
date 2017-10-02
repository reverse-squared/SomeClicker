package com.wearedevs.javaclicker.shop.items.reactor.blackhole;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Blackhole1 extends ShopItem {

	public void onPurchase() {
		//TODO: Add Price
		
		AutoHandler.initAutoThread();
	}

	public int getPrice() {
		//TODO: Add Price
		return 0;
	}

	public String getName() {
		return "Black Hole: Tier 1";
	}

}
