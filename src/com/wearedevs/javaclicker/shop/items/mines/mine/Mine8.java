package com.wearedevs.javaclicker.shop.items.mines.mine;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Mine8 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 100;
		
		ShopHandler.unlock(new Mine9());
	}

	public int getPrice() {
		return 12000;
	}

	public String getName() {
		return "Click Mine: Tier 8";
	}

}
