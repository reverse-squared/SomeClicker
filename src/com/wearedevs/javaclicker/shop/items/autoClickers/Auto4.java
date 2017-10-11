package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Auto4 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 15;
		
		ShopHandler.unlock(new Auto5());
	}

	public int getPrice() {
		return 4000;
	}

	public String getName() {
		return "Auto Clicker: Tier 4";
	}

}
