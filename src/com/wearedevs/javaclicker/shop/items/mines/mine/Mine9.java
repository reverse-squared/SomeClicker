package com.wearedevs.javaclicker.shop.items.mines.mine;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.mines.mineshaft.Mineshaft1;

public class Mine9 extends ShopItem{
	
	public void onPurchase() {
		BaseMod.mine = 150;
		
		ShopHandler.unlock(new Mineshaft1());
	}

	public int getPrice() {
		return 17500;
	}

	public String getName() {
		return "Click Mine: Tier 9";
	}

}
