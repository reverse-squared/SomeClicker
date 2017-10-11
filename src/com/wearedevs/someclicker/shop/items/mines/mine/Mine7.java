package com.wearedevs.someclicker.shop.items.mines.mine;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Mine7 extends ShopItem{
	
	public void onPurchase() {
		BaseMod.mine = 64;
		
		ShopHandler.unlock(new Mine8());
	}

	public int getPrice() {
		return 50000;
	}

	public String getName() {
		return "Click Mine: Tier 7";
	}

}
