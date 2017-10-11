package com.wearedevs.someclicker.shop.items.autoClickers;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/autoClickers/Auto2.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/autoClickers/Auto2.java

public class Auto2 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 7;
		
		ShopHandler.unlock(new Auto3());
	}

	public int getPrice() {
		return 1500;
	}

	public String getName() {
		return "Auto Clicker: Tier 2";
	}

}
