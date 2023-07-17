package com.example.demo.singleton;

public class LazyInitializing {
	
	private static LazyInitializing lazyInitializing;
	public String str;
	
	private LazyInitializing() {
	}
	
	public static LazyInitializing getInstance() {
		if(lazyInitializing == null) {
			lazyInitializing = new LazyInitializing();
		}
		return lazyInitializing;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
