package com.wearedevs.someclicker.shop.items.portal;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/portal/Portal8.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/portal/Portal8.java

public class Portal8 extends ShopItem {

	public void onPurchase() {
		BaseMod.portal = 15000;
		
		ShopHandler.unlock(new Portal9());
	}

	public int getPrice() {
		return 4000000;
	}

	public String getName() {
		return "Click Portal: Tier 8";
	}

}
