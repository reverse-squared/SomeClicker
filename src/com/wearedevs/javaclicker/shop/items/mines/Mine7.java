package com.wearedevs.javaclicker.shop.items.mines;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Mine7 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 64;
	}

	public int getPrice() {
		return 50000;
	}

	public String getName() {
		return "Click Mine: Tier 6";
	}

}
