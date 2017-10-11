package com.wearedevs.someclicker.shop.items.factories;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/factories/Factory5.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/factories/Factory5.java

public class Factory5 extends ShopItem {

	public void onPurchase() {
		BaseMod.factory = 50;
		ShopHandler.unlock(new Factory6());
	}

	public int getPrice() {
		return 8000;
	}

	public String getName() {
		return "Click Factory: Tier 5";
	}
}
