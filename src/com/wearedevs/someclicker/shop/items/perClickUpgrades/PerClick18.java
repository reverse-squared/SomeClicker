package com.wearedevs.someclicker.shop.items.perClickUpgrades;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class PerClick18 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 18;
		
		ShopHandler.unlock(new PerClick20());
		Main.updateCounter();
	}

	public int getPrice() {
		return 7000;
	}

	public String getName() {
		return "18 Clicks Per Click";
	}

}
