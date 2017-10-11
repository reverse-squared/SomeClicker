package com.wearedevs.someclicker.shop.items.mines.mine;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Mine2 extends ShopItem{
	
	public void onPurchase() {
		BaseMod.mine = 4;
		
		ShopHandler.unlock(new Mine3());
	}

	public int getPrice() {
		return 4000;
	}

	public String getName() {
		return "Click Mine: Tier 2";
	}

}
