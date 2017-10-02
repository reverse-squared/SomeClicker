package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Portal6 extends ShopItem {

	//TODO: 500 Clicks Every 15 Seconds
	
	public void onPurchase() {
		AutoHandler.portal = 100000;
		
		//Init AutoClicker
		AutoHandler.initAutoThread();
	}

	public int getPrice() {
		return 1000000;
	}

	public String getName() {
		return "Click Portal: Tier 1";
	}

}
