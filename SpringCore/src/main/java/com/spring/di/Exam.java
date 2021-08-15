package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student bharanidharan = context.getBean("bharanidharan", Student.class);
		bharanidharan.displayStudentInfo();
		Student benny = context.getBean("benny", Student.class);
		benny.displayStudentInfo();
		
	}
}
