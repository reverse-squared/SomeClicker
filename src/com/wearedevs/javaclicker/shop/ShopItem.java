package com.wearedevs.javaclicker.shop;

/**
 * Stores the Default Options for an Upgrade.
 * 
 * @param onPurchase What Happens When the User Buys the Item.
 * @param getPrice How Much the Item Costs.
 * @param getName The Name of the Item.
 */
public abstract class ShopItem {
	public boolean unlocked;
	
	public ShopItem() {
		unlocked = false;
	}
	
	public abstract void onPurchase();
	
	public abstract int getPrice();
	
	public abstract String getName();
}
