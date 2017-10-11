package com.wearedevs.javaclicker.shop.items.perClickUpgrades;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class PerClick20 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 20;
		
		ShopHandler.unlock(new PerClick30());
		
		Main.updateCounter();
	}

	public int getPrice() {
		return 10000;
	}

	public String getName() {
		return "20 Clicks Per Click";
	}

}
