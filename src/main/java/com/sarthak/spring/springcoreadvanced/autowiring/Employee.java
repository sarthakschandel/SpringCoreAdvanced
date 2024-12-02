package com.sarthak.spring.springcoreadvanced.autowiring;

public class Employee {
	// employee object is the object that depends on Address object
	// Address object is the dependency
	// Employee object is the dependent object

	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
