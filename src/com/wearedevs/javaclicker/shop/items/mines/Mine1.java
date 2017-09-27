package com.wearedevs.javaclicker.shop.items.mines;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Mine1 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 2;
	}

	public int getPrice() {
		return 2500;
	}

	public String getName() {
		return "Click Mine: Tier 1";
	}

}
