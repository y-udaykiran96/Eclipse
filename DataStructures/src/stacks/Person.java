package stacks;

public class Person {
	private String name;
	private int age;
	
	public Person(String n, int a){
		this.name = n;
		this.age = a;
	}

	public String toString(){
		return ("Name:"+this.name+" Age:"+this.age);
	}
}
