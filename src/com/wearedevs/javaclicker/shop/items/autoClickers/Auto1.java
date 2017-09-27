package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto1 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 3;
		
		ShopHandler.unlock(new Auto2());
		
		//Init Auto Clicker
		AutoHandler.initAutoThread();

	}

	public int getPrice() {
		return 700;
	}

	public String getName() {
		return "Auto Clicker: Tier 1";
	}

}
