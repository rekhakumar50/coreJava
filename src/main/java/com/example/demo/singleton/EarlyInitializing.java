package com.example.demo.singleton;

public class EarlyInitializing {
	
	private static EarlyInitializing earlyInitializing = new EarlyInitializing();
	public String str;
	
	private EarlyInitializing() {
	}
	
	public static EarlyInitializing getInstance() {
		return earlyInitializing;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
