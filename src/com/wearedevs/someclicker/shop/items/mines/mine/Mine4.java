package com.wearedevs.someclicker.shop.items.mines.mine;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Mine4 extends ShopItem{
	
	public void onPurchase() {
		BaseMod.mine = 12;
		
		ShopHandler.unlock(new Mine5());
	}

	public int getPrice() {
		return 7000;
	}

	public String getName() {
		return "Click Mine: Tier 4";
	}

}
