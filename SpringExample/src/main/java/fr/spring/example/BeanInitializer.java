package fr.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.spring.example.service.impl.BeanServiceImpl;
import fr.spring.example.simple.bean.SimplePOJO;

public class BeanInitializer {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
 
		// Bean initialization with applicationContext declaration
		SimplePOJO obj = (SimplePOJO) context.getBean("simplePojoBean");
		obj.printHello();
		
		// Bean initialization with annotation
		BeanServiceImpl beanService = (BeanServiceImpl) context.getBean("beanServiceImpl");
		System.out.println(beanService.toString());
				
	}
}
