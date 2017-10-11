package com.wearedevs.someclicker.shop.items.factories;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/factories/Factory6.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/factories/Factory6.java

public class Factory6 extends ShopItem {

	public void onPurchase() {
		BaseMod.factory = 60;
		ShopHandler.unlock(new Factory7());
	}

	public int getPrice() {
		return 10000;
	}

	public String getName() {
		return "Click Factory: Tier 6";
	}
}
