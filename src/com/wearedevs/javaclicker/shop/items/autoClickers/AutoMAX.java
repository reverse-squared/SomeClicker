package com.wearedevs.javaclicker.shop.items.autoClickers;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

/**
 * A stupid upgrade made by ImDaveead that should never exist. This autoclicker is the best autoclicker you can get since 
 * we use {@code Integer.MAX_VALUE} for clicks per second. The way we store the clicks in in a double so we don't run into
 * a problem later on about the user's amount of clicks being the integer limit, and not being able to increment it anymore.
 */
public class AutoMAX extends ShopItem {

	public void onPurchase() {
		AutoHandler.autoClick = Integer.MAX_VALUE;
	}

	public int getPrice() {
		return 314159265;
	}

	public String getName() {
		return "Auto Clicker: MAX";
	}

}
