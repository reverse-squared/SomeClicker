package com.wearedevs.javaclicker.shop.items.mines;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Mine3 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 8;
		
		ShopHandler.unlock(new Mine4());
	}

	public int getPrice() {
		return 5000;
	}

	public String getName() {
		return "Click Mine: Tier 3";
	}

}
