package com.wearedevs.javaclicker.shop.items.mines.mine;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

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
