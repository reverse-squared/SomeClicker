package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto3 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 10;
		
		ShopHandler.unlock(new Auto4());
	}

	public int getPrice() {
		return 2500;
	}

	public String getName() {
		return "Auto Clicker: Tier 3";
	}

}
