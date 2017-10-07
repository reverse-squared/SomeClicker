package com.wearedevs.javaclicker.mod;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Modloader {
	public Mod load(String modname, String jar, String modclass) {
		try {
			URL[] urls = { new URL("jar:file:" + jar+"!/") };
			URLClassLoader cl = URLClassLoader.newInstance(urls);
			Class<?> classToLoad = cl.loadClass(modclass);
			Object instance = classToLoad.newInstance();
			if(instance instanceof Mod) {
				Mod mod = (Mod) instance;
				return mod;
			} else {
				System.err.println("Mod '" + modname + "' does not extend Mod (com.wearedevs.javaclicker.mod.Mod)");
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
}
