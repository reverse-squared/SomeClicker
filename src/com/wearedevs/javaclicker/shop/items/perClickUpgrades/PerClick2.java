package com.wearedevs.javaclicker.shop.items.perClickUpgrades;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class PerClick2 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 2;
		
		ShopHandler.unlock(new PerClick5());
		
		Main.updateCounter();
	}

	public int getPrice() {
		return 50;
	}

	public String getName() {
		return "2 Clicks Per Click";
	}

}
