package com.example.demo.immutable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
	
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	private String pincode;
	
	//copy constructor
	public Address(Address address) {
		this.addressLine1 = address.addressLine1;
		this.addressLine2 = address.addressLine2;
		this.city = address.city;
		this.state = address.state;
		this.country = address.country;
		this.pincode = address.pincode;
	}

}
