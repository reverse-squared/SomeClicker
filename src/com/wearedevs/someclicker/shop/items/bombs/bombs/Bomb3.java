package com.wearedevs.someclicker.shop.items.bombs.bombs;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
import com.wearedevs.someclicker.shop.items.mines.mine.Mine1;

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
