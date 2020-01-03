package com;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
		Vehicle car= (Vehicle) context.getBean("car");
		Vehicle bike= (Vehicle) context.getBean("bike");
		car.drive();
		bike.drive();
		Tyre t = (Tyre) context.getBean("tyre");
		System.out.println(t);
		
		Xyz x= (Xyz) context.getBean("xyz");
		System.out.println(x);

	}

}
