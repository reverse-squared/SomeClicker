package com.wearedevs.someclicker.shop.items.mines.mine;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

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
