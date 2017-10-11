package com.wearedevs.someclicker.shop.items.mines.mine;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

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
