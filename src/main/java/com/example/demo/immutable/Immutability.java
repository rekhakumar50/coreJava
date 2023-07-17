package com.example.demo.immutable;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Immutability {
	
	private final int id;
	private final String name;
	private final Double salary;
	private final PhoneNumber phoneNumber;
	private final List<Address> address;
	private final Set<String> departments;
	private final Map<String, String> map;
	
	public Immutability(int id, String name, Double salary, PhoneNumber phoneNumber, List<Address> address,
			Set<String> departments, Map<String, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.departments = departments;
		this.map = map;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public PhoneNumber getPhoneNumber() throws CloneNotSupportedException {
		return (PhoneNumber) phoneNumber.clone();
	}

	public List<Address> getAddress() {
		//return Collections.unmodifiableList(address); //till java 8
		return List.copyOf(address); //from java 9
	}

	public Set<String> getDepartments() {
		//return Collections.unmodifiableSet(departments); //till java 8
		return Set.copyOf(departments); //from java 9
	}

	public Map<String, String> getMap() {
		//return Collections.unmodifiableMap(map); //till java 8
		return Map.copyOf(map); //from java 9
	}
	
}
