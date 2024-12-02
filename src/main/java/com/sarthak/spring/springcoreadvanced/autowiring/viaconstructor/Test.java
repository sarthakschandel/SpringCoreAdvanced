package com.sarthak.spring.springcoreadvanced.autowiring.viaconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcoreadvanced/autowiring/viaconstructor/config.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println(e);
		//Employee [address=Address [hno=123, street=mira mesa, city=san diego]]
	}

}
