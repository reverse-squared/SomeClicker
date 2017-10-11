package com.wearedevs.someclicker.shop.items.perClickUpgrades;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
import com.wearedevs.someclicker.shop.items.bombs.bombs.Bomb1;

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
