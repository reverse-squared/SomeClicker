package com.wearedevs.someclicker.cases.cases;

import com.wearedevs.someclicker.cases.Case;
import com.wearedevs.someclicker.cases.CaseOutcome;
import com.wearedevs.someclicker.handlers.SoundUnlocker;
import com.wearedevs.someclicker.sound.sounds.AirhornSound;
import com.wearedevs.someclicker.sound.sounds.BombSound;
import com.wearedevs.someclicker.sound.sounds.DiscordMessageSound;
import com.wearedevs.someclicker.sound.sounds.FartSound;
import com.wearedevs.someclicker.sound.sounds.RainbowSound;
import com.wearedevs.someclicker.util.WeightedCollection;

public class SoundCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		
		//Bomb
		out.add(60, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new BombSound());
			}
			
			public String getName() {
				return "Bomb Click Sound";
			}
		});
		
		//Rainbow
		out.add(30, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new RainbowSound());
			}
			
			public String getName() {
				return "Rainbow Click Sound";
			}
		});
		
		//Airhorn
		out.add(10, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new AirhornSound());
			}
			
			public String getName() {
				return "Airhorn Click Sound";
			}
		});
		
		//Fart
		out.add(20, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new FartSound());
			}
			
			public String getName() {
				return "Fart Click Sound";
			}
		});
				
		//Discord Message
		out.add(20, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new DiscordMessageSound());
			}
			
			public String getName() {
				return "Discord Message Sound";
			}
		});
		
		return out;
	}

	public String getName() {
		return "Sound Case";
	}

}
