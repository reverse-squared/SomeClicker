package com.wearedevs.javaclicker.shop.items.mines.mineshaft;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Mineshaft1 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 250;
	}

	public int getPrice() {
		return 25000;
	}

	public String getName() {
		return "Mineshaft: Tier 1";
	}

}
