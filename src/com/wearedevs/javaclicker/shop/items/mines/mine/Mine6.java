package com.wearedevs.javaclicker.shop.items.mines.mine;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Mine6 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 32;
		
		ShopHandler.unlock(new Mine7());
	}

	public int getPrice() {
		return 20000;
	}

	public String getName() {
		return "Click Mine: Tier 6";
	}

}
