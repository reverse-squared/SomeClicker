package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto7 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 100;
		
		ShopHandler.unlock(new Auto8());
	}

	public int getPrice() {
		return 45000;
	}

	public String getName() {
		return "Auto Clicker: Tier 7";
	}

}
