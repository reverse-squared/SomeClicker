package com.wearedevs.javaclicker.shop.items.mines.mine;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

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
