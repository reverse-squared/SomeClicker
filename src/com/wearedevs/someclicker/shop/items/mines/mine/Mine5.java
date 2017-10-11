package com.wearedevs.someclicker.shop.items.mines.mine;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Mine5 extends ShopItem{
	
	public void onPurchase() {
		BaseMod.mine = 16;
		
		ShopHandler.unlock(new Mine6());
	}

	public int getPrice() {
		return 10000;
	}

	public String getName() {
		return "Click Mine: Tier 5";
	}

}
