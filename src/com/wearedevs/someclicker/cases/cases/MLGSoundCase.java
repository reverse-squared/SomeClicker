package com.wearedevs.someclicker.cases.cases;

import com.wearedevs.someclicker.cases.Case;
import com.wearedevs.someclicker.cases.CaseOutcome;
import com.wearedevs.someclicker.handlers.SoundUnlocker;
import com.wearedevs.someclicker.sound.sounds.MLG_BassSound;
import com.wearedevs.someclicker.sound.sounds.MLG_HitmarkerSound;
import com.wearedevs.someclicker.sound.sounds.MLG_SpookySound;
import com.wearedevs.someclicker.sound.sounds.MLG_WamSound;
import com.wearedevs.someclicker.sound.sounds.MLG_WowSound;
import com.wearedevs.someclicker.util.WeightedCollection;

public class MLGSoundCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		
		//Bass
		out.add(20, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new MLG_BassSound());
			}
			
			public String getName() {
				return "MLG Bass Sound";
			}
		});
		
		//Wow
		out.add(35, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new MLG_WowSound());
			}
			
			public String getName() {
				return "MLG Wow Sound";
			}
		});
		
		//Hitmarker
		out.add(30, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new MLG_HitmarkerSound());
			}
			
			public String getName() {
				return "MLG Hitmarker Sound";
			}
		});
		
		//Wam
		out.add(20, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new MLG_WamSound());
			}
			
			public String getName() {
				return "MLG Wam Sound";
			}
		});
		
		//Spooky
		out.add(20, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new MLG_SpookySound());
			}
			
			public String getName() {
				return "MLG Spooky Sound";
			}
		});
		
		return out;
	}

	public String getName() {
		return "MLG Sound Case";
	}

}
