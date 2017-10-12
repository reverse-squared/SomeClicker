package com.wearedevs.someclicker.shop.items.bombs.nukes;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;

public class Nuke3 extends ShopItem {

	public void onPurchase() {
		BaseMod.clickBomb = 50000;
		
		ShopHandler.unlock(new Nuke4());
	}

	public int getPrice() {
		return 70000;
	}

	public String getName() {
		return "Click Nuke: Tier 3";
	}

}
