package com.wearedevs.someclicker.shop.items.bombs.nukes;

import com.wearedevs.someclicker.BaseMod;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
import com.wearedevs.someclicker.shop.items.portal.Portal1;

public class Nuke1 extends ShopItem {

	public void onPurchase() {
		BaseMod.clickBomb = 1000;
		
		ShopHandler.unlock(new Portal1());
		ShopHandler.unlock(new Nuke2());
	}

	public int getPrice() {
		return 20000;
	}

	public String getName() {
		return "Click Nuke: Tier 1";
	}

}
