package com.wearedevs.javaclicker.shop.items.perClickUpgrades;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

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
