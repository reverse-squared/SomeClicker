package com.wearedevs.javaclicker.shop;

public abstract class ShopItem {
	public boolean unlocked;
	
	public ShopItem() {
		unlocked = false;
	}
	
	public abstract void onPurchase();
	
	public abstract int getPrice();
	
	public abstract String getName();
}
