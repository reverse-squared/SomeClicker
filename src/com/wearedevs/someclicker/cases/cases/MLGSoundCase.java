package com.wearedevs.someclicker.cases.cases;

import com.wearedevs.someclicker.cases.Case;
import com.wearedevs.someclicker.cases.CaseOutcome;
import com.wearedevs.someclicker.handlers.SoundUnlocker;
import com.wearedevs.someclicker.sound.sounds.MLG_BassSound;
import com.wearedevs.someclicker.util.WeightedCollection;

public class MLGSoundCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		
		//Bass
		out.add(50, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new MLG_BassSound());
			}
			
			public String getName() {
				return "MLG Bass Sound";
			}
		});
		
		return out;
	}

	public String getName() {
		return "Sound Case";
	}

}
