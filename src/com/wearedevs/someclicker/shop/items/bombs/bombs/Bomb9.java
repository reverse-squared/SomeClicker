package com.wearedevs.someclicker.shop.items.bombs.bombs;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
import com.wearedevs.someclicker.shop.items.bombs.nukes.Nuke1;

public class Bomb9 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 900;
		
		ShopHandler.unlock(new Nuke1());
	}

	public int getPrice() {
		return 18000;
	}

	public String getName() {
		return "Click Bomb: Tier 9";
	}

}
