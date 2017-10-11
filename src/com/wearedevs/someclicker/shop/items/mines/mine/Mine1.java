package com.wearedevs.someclicker.shop.items.mines.mine;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Mine1 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 2;
		
		ShopHandler.unlock(new Mine2());
	}

	public int getPrice() {
		return 2500;
	}

	public String getName() {
		return "Click Mine: Tier 1";
	}

}
