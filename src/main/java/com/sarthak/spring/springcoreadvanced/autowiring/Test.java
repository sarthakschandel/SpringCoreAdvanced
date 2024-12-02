package com.sarthak.spring.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcoreadvanced/autowiring/config.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println(e);
		// by Type
		// Employee [address=Address [hno=123, street=mira mesa, city=san diego]]

		// if there is no address bean
		// Employee [address=null]

		// by Name
		// Employee [address=Address [hno=123, street=mira mesa, city=san diego]]
	}

}
