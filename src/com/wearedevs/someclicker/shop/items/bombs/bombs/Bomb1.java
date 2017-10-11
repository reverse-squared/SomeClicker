package com.wearedevs.someclicker.shop.items.bombs.bombs;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/bombs/bombs/Bomb1.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.factories.Factory1;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
import com.wearedevs.someclicker.shop.items.factories.Factory1;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/bombs/bombs/Bomb1.java

public class Bomb1 extends ShopItem {

	public void onPurchase() {
		BaseMod.clickBomb = 100;
		
		ShopHandler.unlock(new Bomb2());
		ShopHandler.unlock(new Factory1());

	}

	public int getPrice() {
		return 666;
	}

	public String getName() {
		return "Click Bomb: Tier 1";
	}

}
