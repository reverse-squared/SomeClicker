package com.wearedevs.javaclicker.shop.items.bombs.bombs;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.mines.mine.Mine1;

public class Bomb3 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 300;
		
		ShopHandler.unlock(new Bomb4());
		ShopHandler.unlock(new Mine1());
	}

	public int getPrice() {
		return 3000;
	}

	public String getName() {
		return "Click Bomb: Tier 3";
	}

}
