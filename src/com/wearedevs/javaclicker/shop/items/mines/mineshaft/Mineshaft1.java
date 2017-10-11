package com.wearedevs.javaclicker.shop.items.mines.mineshaft;

import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Mineshaft1 extends ShopItem{
	
	public void onPurchase() {
		BaseMod.mine = 250;
	}

	public int getPrice() {
		return 25000;
	}

	public String getName() {
		return "Mineshaft: Tier 1";
	}

}
