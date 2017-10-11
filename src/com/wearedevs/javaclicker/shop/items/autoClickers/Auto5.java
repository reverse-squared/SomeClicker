package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto5 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 30;
		
		ShopHandler.unlock(new Auto6());
	}

	public int getPrice() {
		return 10000;
	}

	public String getName() {
		return "Auto Clicker: Tier 5";
	}

}
