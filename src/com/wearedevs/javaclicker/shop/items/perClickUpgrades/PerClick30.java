package com.wearedevs.javaclicker.shop.items.perClickUpgrades;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.shop.ShopItem;

public class PerClick30 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 30;
		
		Main.updateCounter();
	}

	public int getPrice() {
		return 30000;
	}

	public String getName() {
		return "30 Clicks Per Click";
	}

}
