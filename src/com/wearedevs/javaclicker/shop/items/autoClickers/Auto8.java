package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto8 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 200;
		
		ShopHandler.unlock(new Auto9());
	}

	public int getPrice() {
		return 75000;
	}

	public String getName() {
		return "Auto Clicker: Tier 8";
	}

}
