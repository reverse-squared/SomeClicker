package com.wearedevs.someclicker.shop.items.autoClickers;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/autoClickers/Auto1.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/autoClickers/Auto1.java

public class Auto1 extends ShopItem {

	public void onPurchase() {
		BaseMod.autoClick = 5;
		
		ShopHandler.unlock(new Auto2());

	}

	public int getPrice() {
		return 700;
	}

	public String getName() {
		return "Auto Clicker: Tier 1";
	}

}
