package com.wearedevs.javaclicker.shop.items.mines.mine;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.mines.mineshaft.Mineshaft1;

public class Mine9 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 150;
		
		ShopHandler.unlock(new Mineshaft1());
	}

	public int getPrice() {
		return 17500;
	}

	public String getName() {
		return "Click Mine: Tier 9";
	}

}
