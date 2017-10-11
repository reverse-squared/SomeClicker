package com.wearedevs.someclicker.shop.items.bombs.nukes;

<<<<<<< HEAD:src/com/wearedevs/javaclicker/shop/items/bombs/nukes/Nuke3.java
import com.wearedevs.javaclicker.BaseMod;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
=======
import com.wearedevs.someclicker.handlers.AutoHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.shop.ShopItem;
>>>>>>> fab0a8c2477e4d0dfc79301e48bec05a6d714da5:src/com/wearedevs/someclicker/shop/items/bombs/nukes/Nuke3.java

public class Nuke3 extends ShopItem {

	public void onPurchase() {
		BaseMod.clickBomb = 50000;
		
		ShopHandler.unlock(new Nuke4());
	}

	public int getPrice() {
		return 70000;
	}

	public String getName() {
		return "Click Nuke: Tier 3";
	}

}
