package com.wearedevs.someclicker.shop.items.mines.mine;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Mine6 extends ShopItem{
	
	public void onPurchase() {
		BaseMod.mine = 32;
		
		ShopHandler.unlock(new Mine7());
	}

	public int getPrice() {
		return 20000;
	}

	public String getName() {
		return "Click Mine: Tier 6";
	}

}
