package com.sarthak.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcoreadvanced/autowiring/assignment/config.xml");
		Customer c = (Customer) context.getBean("customer");
		System.out.println(c);
		//Customer [name=Sarthak, reservation=Reservation [id=123456789, time=12:00:00]]
	}

}
