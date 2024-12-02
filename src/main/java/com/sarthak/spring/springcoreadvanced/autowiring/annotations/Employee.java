package com.sarthak.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	// employee object is the object that depends on Address object
	// Address object is the dependency
	// Employee object is the dependent object

	// when @Autowired is used here, its the Field level
	@Autowired
	private Address address;

	Employee(Address address) {
		this.address = address;
	}// when @Autowired is used here, its the Constructor level

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}// when @Autowired is used here, its the Setter level

}
