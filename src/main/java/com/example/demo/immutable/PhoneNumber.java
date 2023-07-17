package com.example.demo.immutable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneNumber implements Cloneable {
	private String phoneNumber;
	private PhoneType type;
		
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
