package com.sarthak.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcoreadvanced/injecting/interfaces/config.xml");
		OrderBO bo = (OrderBO) context.getBean("bo");// getting the bean
		bo.placeOrder();

	}

}
