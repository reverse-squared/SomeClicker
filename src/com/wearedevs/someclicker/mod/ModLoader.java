package com.wearedevs.someclicker.mod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

public class ModLoader {
	public static File modPath = new File(System.getenv("APPDATA") + "/WeAreDevs/JavaClicker/mods/");
	
	public static ArrayList<ClassLoader> classloaders = new ArrayList<ClassLoader>();
	
	/**
	 * Loads a Mod Jar in the Mods Folder in AppData
	 * @param modname The Name of Your Mod
	 * @param jar Path to Your Jar
	 * @param modclass Where Your Main Class Is
	 */
	public Mod Load(String modname, String jar, String modclass) {	
		try {
			URL[] urls = { new URL("jar:file:" + jar + "!/") };
			URLClassLoader cl = URLClassLoader.newInstance(urls);
			classloaders.add(cl);
			Class<?> classToLoad = cl.loadClass(modclass);
			Object instance = classToLoad.newInstance();
			
			if(instance instanceof Mod) {
				Mod mod = (Mod) instance;
				return mod;
			} else {
				System.err.println("Mod '" + modname + "' does not extend Mod (com.wearedevs.someclicker.mod.Mod)");
			}
		} catch (ClassNotFoundException e) {
			System.err.println("Mod '" + modname + "' caused a ClassNotFoundException.");
			e.printStackTrace();
		} catch (InstantiationException e) {
			System.err.println("Mod '" + modname + "' caused a InstantiationException.");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.err.println("Mod '" + modname + "' caused a IllegalAccessException.");
			e.printStackTrace();
		} catch (MalformedURLException e) {
			System.err.println("Mod '" + modname + "' caused a MalformedURLException.");
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static Class<?> loadClass(String name) throws ClassNotFoundException {
		for(ClassLoader cl : classloaders) {
			try {
				return cl.loadClass(name);
			} catch(ClassNotFoundException e) {
				continue;
			}
		}
		
		throw new ClassNotFoundException();
	}
}
