package com.wearedevs.someclicker.shop.items.perClickUpgrades;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.shop.ShopItem;

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
