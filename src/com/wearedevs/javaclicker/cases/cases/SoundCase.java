package com.wearedevs.javaclicker.cases.cases;

import java.util.ArrayList;

import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.util.RandomUtil;

public class SoundCase extends Case {
	public ArrayList<String> getAllOutcomes() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Bomb Click");
		list.add("Rainbow Click");
		list.add("Gun Click");
		list.add("Bomb Click");
		
		return null;
	}
	
	public String getName() {
		return "Sound Case";
	}

}
