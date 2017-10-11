package com.wearedevs.someclicker.shop.items.autoClickers;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/autoClickers/Auto6.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/autoClickers/Auto6.java

public class Auto6 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 69;
		
		ShopHandler.unlock(new Auto7());
	}

	public int getPrice() {
		return 20000;
	}

	public String getName() {
		return "Auto Clicker: Tier 6";
	}

}
