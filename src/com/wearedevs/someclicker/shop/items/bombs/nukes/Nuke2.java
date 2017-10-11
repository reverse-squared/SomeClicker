package com.wearedevs.someclicker.shop.items.bombs.nukes;

import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Nuke2 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 2000;
		
		ShopHandler.unlock(new Nuke3());
	}

	public int getPrice() {
		return 40000;
	}

	public String getName() {
		return "Click Nuke: Tier 2";
	}

}
