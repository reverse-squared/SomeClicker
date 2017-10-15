# Modding
We don't know why, but we added mod support. This means you can run extra code every tick, add new shop items, and do anything.

## Step 1: Setting Up The Workspace

### Eclipse
Create a new project, and call it whatever you want. Next, create a package, and call it whatever you want. If you are using Eclipse to make a mod, you need to edit your build path. Right-click your project folder, click Build Path, then select Configure Build Path. If you are not already in the Libraries Tab, select Libraries, and Click Add External JARs... on the right. Next, you need to locate the directory where you saved our game. If you ever move this jar, you will need to repeat this process. After you have selected your jar and added it, you can now hit Apply and Close at the bottom. 

You are now ready to make your mod.

### NetBeans
We don't know.

### IntelliJ
We also don't know.

## Step 2: Developing the Mod

### Step 2.1: The Main Mod Class
To make a mod, create a class extending `Mod` (`com.wearedevs.javaclicker.mod.Mod`). In the constructor of your new class will contain all the code that is run (Registering Handlers and Shop Items).

```java
package com.imdaveead.javaclicker.examplemod;

import com.wearedevs.javaclicker.mod.Mod;

public class MyNewMod extends Mod {
	public MyNewMod() {
		//Code To Run When Mod is Loaded.

	public void preInit() {
		//Code to Run Before Loading the Save File.
	}

	public void postInit() {
		//Code to Run After Loading the Save File.
	}
	
	public String[] save() {
		//Save Your Mod Stuff.
		return null;
	}
	
	public void load(String[] savefile) {
		//Load Your Mod Stuff.
	}
}
```

### Step 2.2 (optional): Creating Shop Items
To create a shop item, make a new class that extends `ShopItem` (`com.wearedevs.javaclicker.shop.ShopItem`)

```java
import com.wearedevs.javaclicker.shop.ShopItem;

public class MyShopItem extends ShopItem {
	public void onPurchase() {
		//Run Code
	}

	public int getPrice() {
		return 100;
	}

	public String getName() {
		return "My Custom Item";
	}
}
```
Use `getPrice()` and `getName()` to return the price and name of the item. `onPurchase()` is called when the user successfully buys your item.

To add the item to the shop call `ShopHander.unlock(ShopItem item)` with your item. You can make shop item unlock trees by calling `ShopHander.unlock` after purchasing an item.

### Step 2.3 (optional): Running Extra Game Logic
To add code to the game loop, add a new class that extends `TickHook` (`com.wearedevs.javaclicker.mod.TickHook`). In the `run` method, add the code you want to run per tick. When you want to disable the hook, call `this.disable()`. To add the hook, just create a new instance of it.

```java
import com.wearedevs.javaclicker.mod.TickHook;

public class MyHook extends TickHook {
	public void run() {
		
	}
	
}
```

### Refrence
Important Variables:
<br>
```Main.clicks``` The Amount of Clicks the User Has.
<br>
```Main.perClick``` How Much the User Gets When He or She Clicks.
<br>
```Main.multiplier``` How much to multiply ```Main.perClick``` by.


## Step 3: Adding Your Mod to the Game

Once you have made your mod, you want to export it to a jar file. Then add a file called mod.txt in your jar containing four, comma-separated values.
```csv
<Game Version>,<Mod Name>,<Mod Version>,<Main Class>
```
1. **Game Version** the version id that the game is running. Currently 1.
2. **Mod Name** Your Mod Name
3. **Mod Version** The Version of Your Mod (Example: `1.0.0`)
4. **Main Class** Your Main Mod Class You Created in Step: 2.1 (Example: `imdaveead.javaclicker.examplemod.ExampleMod`)

## Step 4: Installing Your mod

To Install your mod to the game, navigate to `%appdata%/WeAreDevs/JavaClicker/mods/` by pressing the Windows Key + R. and typing `%appdata%`, navigating to the `WeAreDevs/JavaClicker/mods/` folder and place your jar file there. The game will handle the rest of it. 
