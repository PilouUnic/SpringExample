package fr.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
 
		ClassExample obj = (ClassExample) context.getBean("beanExample");
		obj.printHello();
	}
}
