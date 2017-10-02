package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Portal9 extends ShopItem {

	//TODO: 500 Clicks Every 15 Seconds
	
	public void onPurchase() {
		AutoHandler.portal = 500000;
		
		//Init AutoClicker
		AutoHandler.initAutoThread();
	}

	public int getPrice() {
		return 10000000;
	}

	public String getName() {
		return "Click Portal: Tier 1";
	}

}
