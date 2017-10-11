package com.wearedevs.javaclicker.shop.items.mines.mine;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

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
