package com.wearedevs.someclicker.shop.items.mines.mine;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/mines/mine/Mine2.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/mines/mine/Mine2.java

public class Mine2 extends ShopItem{
	
	public void onPurchase() {
		BaseMod.mine = 4;
		
		ShopHandler.unlock(new Mine3());
	}

	public int getPrice() {
		return 4000;
	}

	public String getName() {
		return "Click Mine: Tier 2";
	}

}
