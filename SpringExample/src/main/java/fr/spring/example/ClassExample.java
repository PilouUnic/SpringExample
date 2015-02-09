package fr.spring.example;

public class ClassExample {

	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
	}
}
