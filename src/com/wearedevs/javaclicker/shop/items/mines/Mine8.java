package com.wearedevs.javaclicker.shop.items.mines;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Mine8 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 128;
	}

	public int getPrice() {
		return 120000;
	}

	public String getName() {
		return "Click Mine: Tier 6";
	}

}
