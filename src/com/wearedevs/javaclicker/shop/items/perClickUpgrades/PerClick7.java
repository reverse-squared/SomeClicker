package com.wearedevs.javaclicker.shop.items.perClickUpgrades;

import com.wearedevs.javaclicker.Main;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.bombs.Bomb1;

public class PerClick7 extends ShopItem {

	public void onPurchase() {
		Main.perClick = 7;
		
		ShopHandler.unlock(new PerClick10());
		ShopHandler.unlock(new Bomb1());
		
		Main.updateCounter();
	}

	public int getPrice() {
		return 500;
	}

	public String getName() {
		return "7 Clicks Per Click";
	}

}
