package com.wearedevs.javaclicker.shop;

import java.util.HashMap;

public abstract class ShopItem {
	public boolean unlocked;
	
	public ShopItem() {
		unlocked = false;
	}
	
	/**
	 * @return onPurchase What Happens When the User Buys the Item.
	 */
	public abstract void onPurchase();
	
	/**
	 * @return getPrice How Much the Item Costs.
	 */
	public abstract int getPrice();
	
	/**
	 * @return getName The Name of the Item.
	 */
	public abstract String getName();
}
