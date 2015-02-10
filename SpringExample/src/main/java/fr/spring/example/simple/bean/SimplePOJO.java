package fr.spring.example.simple.bean;

public class SimplePOJO {

	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
	}
}
