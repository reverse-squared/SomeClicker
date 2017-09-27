package com.wearedevs.javaclicker.shop.items.perClickUpgrades;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.shop.ShopItem;

public class PerClick15 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 15;
		
		Main.updateCounter();
	}

	public int getPrice() {
		return 5000;
	}

	public String getName() {
		return "15 Clicks Per Click";
	}

}
