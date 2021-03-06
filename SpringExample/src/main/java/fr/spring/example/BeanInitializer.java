package fr.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.spring.example.service.impl.BeanServiceImpl;
import fr.spring.example.service.impl.InjectedValueServiceImpl;
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
		
		// Bean initialization with injected values
		InjectedValueServiceImpl injectedValueBeanService = (InjectedValueServiceImpl) context.getBean("injectedValueServiceImpl");
		System.out.println(injectedValueBeanService.getDriverClassName());
		System.out.println(injectedValueBeanService.getUrl());
		System.out.println(injectedValueBeanService.getUsername());
		System.out.println(injectedValueBeanService.getPassword());
				
	}
}
