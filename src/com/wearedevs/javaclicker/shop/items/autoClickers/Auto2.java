package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto2 extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = 7;
		
		ShopHandler.unlock(new Auto3());
	}

	public int getPrice() {
		return 1500;
	}

	public String getName() {
		return "Auto Clicker: Tier 2";
	}

}
