package ex01_전보라;

public abstract class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	
	public abstract void score();
}
