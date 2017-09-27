package com.wearedevs.javaclicker.shop.items.perClickUpgrades;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class PerClick10 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 10;
		
		ShopHandler.unlock(new PerClick15());
		Main.updateCounter();
	}

	public int getPrice() {
		return 2000;
	}

	public String getName() {
		return "10 Clicks Per Click";
	}

}
