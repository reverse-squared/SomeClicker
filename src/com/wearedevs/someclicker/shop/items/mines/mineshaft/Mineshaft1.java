package com.wearedevs.someclicker.shop.items.mines.mineshaft;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/mines/mineshaft/Mineshaft1.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.shop.ShopItem;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.shop.ShopItem;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/mines/mineshaft/Mineshaft1.java

public class Mineshaft1 extends ShopItem{
	
	public void onPurchase() {
		BaseMod.mine = 250;
	}

	public int getPrice() {
		return 25000;
	}

	public String getName() {
		return "Mineshaft: Tier 1";
	}

}
