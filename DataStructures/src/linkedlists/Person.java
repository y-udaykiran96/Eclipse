package linkedlists;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return ("Name:"+name+" age:"+age);
	}
	
	public String getname(){
		return this.name;
	}
}
