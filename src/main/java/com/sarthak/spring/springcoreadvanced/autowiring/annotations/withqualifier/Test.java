package com.sarthak.spring.springcoreadvanced.autowiring.annotations.withqualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcoreadvanced/autowiring/annotations/withqualifier/config.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println(e);
		//Employee [address=Address [hno=123, street=mira mesa, city=san diego]]
		//Employee [address=Address [hno=456, street=mira mesa, city=san diego]]
		//different values when @Qualifier is changed
	}

}
