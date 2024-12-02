package com.sarthak.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcoreadvanced/stereotype/annotations/config.xml");
		Instructor instructor = (Instructor) context.getBean("inst");
		System.out.println(instructor);

		Instructor instructor2 = (Instructor) context.getBean("inst");
		System.out.println(instructor2);

	}

}// storing outputs for 1st object only
//Instructor [id=10, name=Sarthak S Chandel, topics=[Java Web Services, Core java, Azure], active=false, profile=Profile [title=Java Learner, company=Life Consulting]]
//Instructor [id=110, name=Sarthak S Chandel, topics=[Java Web Services, Core java, Azure], active=false, profile=Profile [title=Java Learner, company=Life Consulting]]
//Instructor [id=99, name=Sarthak S Chandel, topics=[Java Web Services, Core java, Azure], active=false, profile=Profile [title=Java Learner, company=Life Consulting]]
//Instructor [id=88, name=Sarthak S Chandel, topics=[Java Web Services, Core java, Azure], active=false, profile=Profile [title=Java Learner, company=Life Consulting]]
//Instructor [id=-2147483648, name=Sarthak S Chandel, topics=[Java Web Services, Core java, Azure], active=false, profile=Profile [title=Java Learner, company=Life Consulting]]
