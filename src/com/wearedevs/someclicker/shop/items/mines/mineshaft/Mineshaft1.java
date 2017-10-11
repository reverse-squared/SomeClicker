package com.wearedevs.someclicker.shop.items.mines.mineshaft;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.shop.ShopItem;

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
