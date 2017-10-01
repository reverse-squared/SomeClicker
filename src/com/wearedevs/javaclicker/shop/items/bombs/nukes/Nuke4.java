package com.wearedevs.javaclicker.shop.items.bombs.nukes;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.portal.Portal1;

public class Nuke4 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 100000;
		
		ShopHandler.unlock(new Portal1());
	}

	public int getPrice() {
		return 15000;
	}

	public String getName() {
		return "Click Nuke: Tier 4";
	}

}
