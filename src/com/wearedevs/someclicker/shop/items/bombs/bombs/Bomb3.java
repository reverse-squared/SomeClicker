package com.wearedevs.someclicker.shop.items.bombs.bombs;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/bombs/bombs/Bomb3.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.mines.mine.Mine1;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
import com.wearedevs.someclicker.shop.items.mines.mine.Mine1;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/bombs/bombs/Bomb3.java

public class Bomb3 extends ShopItem {

	public void onPurchase() {
		BaseMod.clickBomb = 300;
		
		ShopHandler.unlock(new Bomb4());
		ShopHandler.unlock(new Mine1());
	}

	public int getPrice() {
		return 3000;
	}

	public String getName() {
		return "Click Bomb: Tier 3";
	}

}
