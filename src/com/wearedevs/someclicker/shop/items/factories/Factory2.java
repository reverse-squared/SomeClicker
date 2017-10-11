package com.wearedevs.someclicker.shop.items.factories;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/factories/Factory2.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/factories/Factory2.java

public class Factory2 extends ShopItem {

	public void onPurchase() {
		BaseMod.factory = 20;
		
		ShopHandler.unlock(new Factory3());
	}

	public int getPrice() {
		return 2000;
	}

	public String getName() {
		return "Click Factory: Tier 2";
	}
}
