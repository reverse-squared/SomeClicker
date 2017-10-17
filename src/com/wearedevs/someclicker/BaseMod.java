package com.wearedevs.someclicker;

import com.wearedevs.someclicker.cases.cases.ClickCase;
import com.wearedevs.someclicker.cases.cases.ClickMultiplierCase;
import com.wearedevs.someclicker.cases.cases.MEMESoundCase;
import com.wearedevs.someclicker.cases.cases.MLGSoundCase;
import com.wearedevs.someclicker.cases.cases.SoundCase;
import com.wearedevs.someclicker.handlers.CaseHandler;
import com.wearedevs.someclicker.handlers.ShopHandler;
import com.wearedevs.someclicker.handlers.SoundUnlocker;
import com.wearedevs.someclicker.mod.Mod;
import com.wearedevs.someclicker.shop.items.perClickUpgrades.PerClick2;
import com.wearedevs.someclicker.sound.sounds.Default;
import com.wearedevs.someclicker.util.RandomUtil;

public class BaseMod extends Mod {

	public static double multiplier = 1;

	public static double autoClick = 0;
	public static int clickBomb = 0;
	public static int factory = 0;
	public static int mine = 0;
	public static int portal = 0;

	public static int ticks = 0;
	public static double seconds = 0; //Large Limit :)

	public void preInit() {
		SoundUnlocker.unlock(new Default());
	
		ShopHandler.unlock(new PerClick2());
	
		CaseHandler.registerCase(100, new ClickCase());
		CaseHandler.registerCase(30, new SoundCase());
		CaseHandler.registerCase(3, new ClickMultiplierCase());
		CaseHandler.registerCase(20, new MLGSoundCase());
		CaseHandler.registerCase(20, new MEMESoundCase());
	}

	public void postInit() {
		
	}

	public String[] save() {
		return new String[] {Double.toString(multiplier)};
	}

	public void load(String[] save) {
		multiplier = Double.parseDouble(save[0]);
	}

	public double onClick(double click) {
		if(RandomUtil.randomRange(1, 20) == 10) {
			click *= 2;
		}

		if(RandomUtil.randomRange(1, 500) == 10) {
			click *= 10;
		}
		
		return click;
	}
	
	public void onTick() {
		ticks++;

		if(ticks >= 60) {
			ticks = 0;
			seconds++;
			//just in case
			seconds = Math.round(seconds);
		}

		//MINE: Ever Second
		if(ticks == 0) {
			//Every Second is the MINE
			Main.click(mine);
		}

		//AUTOCLICKER: Every Tick add
		Main.click(autoClick / 60);

		//BOMB: Every 10 Seconds
		if(seconds % 10 == 0 && ticks == 0) {
			Main.click(clickBomb);
		}

		//PORTAL: Every 15 Seconds
		if(seconds % 15 == 0 && ticks == 0) {
			Main.click(mine);
		}

		//FACTORY: Every 15 Seconds
		if(seconds % 15 == 0 && ticks == 0) {
			Main.click(portal);
		}
	}
}
