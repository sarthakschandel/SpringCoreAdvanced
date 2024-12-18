package com.sarthak.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	// @Value("10")
	// @Value("#{66+44}")
	// @Value("#{T(java.lang.Math).abs(-99)}")
	// @Value("#{new Integer(88)}")
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id = 15;// annotations override the values provided

	// @Value("Sarthak S Chandel")
	@Value("#{new java.lang.String('Sarthak S Chandel')}")
	private String name = "John";

	@Value("#{topics}")
	private List<String> topics;

	@Value("#{2+4>8?true:false}")
	private boolean active;

	@Autowired
	private Profile profile;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", active=" + active + ", profile="
				+ profile + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
