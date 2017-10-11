package com.wearedevs.javaclicker.mod;

import java.io.PrintStream;

public class ModPrintStream extends PrintStream {
	public String mod = "";
	public PrintStream ps;
	public ModPrintStream(PrintStream ps, String mod) {
		super(System.out);
		this.ps = ps;
		this.mod = mod;
	}
	
	public void println() {
		println("");
	}
	
	public void print(String x) {
		println(x);
	}
	
	public void println(String x) {
		ps.println("[" + mod + "] " + x);
	}
}
