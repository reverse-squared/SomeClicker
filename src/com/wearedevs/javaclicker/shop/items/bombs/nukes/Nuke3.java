package com.wearedevs.javaclicker.shop.items.bombs.nukes;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.portal.Portal1;

public class Nuke3 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 9001;
		
		ShopHandler.unlock(new Nuke4());
	}

	public int getPrice() {
		return 120000;
	}

	public String getName() {
		return "Click Nuke: Tier 3";
	}

}
