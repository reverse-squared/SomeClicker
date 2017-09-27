package com.wearedevs.javaclicker.shop.items.mines;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Mine2 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 4;
		
		ShopHandler.unlock(new Mine3());
	}

	public int getPrice() {
		return 4000;
	}

	public String getName() {
		return "Click Mine: Tier 2";
	}

}
