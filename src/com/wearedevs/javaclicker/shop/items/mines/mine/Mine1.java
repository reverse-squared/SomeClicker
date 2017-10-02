package com.wearedevs.javaclicker.shop.items.mines.mine;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Mine1 extends ShopItem{
	
	public void onPurchase() {
		AutoHandler.mine = 2;
		
		ShopHandler.unlock(new Mine2());
		
		//Init AutoClicker
		AutoHandler.initAutoThread();
	}

	public int getPrice() {
		return 2500;
	}

	public String getName() {
		return "Click Mine: Tier 1";
	}

}
