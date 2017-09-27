package com.wearedevs.javaclicker.shop.items.mines;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Mine5 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 16;
		
		ShopHandler.unlock(new Mine5());
	}

	public int getPrice() {
		return 10000;
	}

	public String getName() {
		return "Click Mine: Tier 5";
	}

}
