package com.wearedevs.someclicker.cases.cases;

import com.wearedevs.someclicker.cases.Case;
import com.wearedevs.someclicker.cases.CaseOutcome;
import com.wearedevs.someclicker.handlers.SoundUnlocker;
import com.wearedevs.someclicker.sound.sounds.MEME_YouNeedAWebsiteSound;
import com.wearedevs.someclicker.util.WeightedCollection;

public class MEMESoundCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		
		//Bass
		out.add(50, new CaseOutcome() {
			public void onOutcome() {
				SoundUnlocker.unlock(new MEME_YouNeedAWebsiteSound());
			}
			
			public String getName() {
				return "You Need a Website Sound";
			}
		});
		
		return out;
	}

	public String getName() {
		return "Meme Sound Case";
	}

}
