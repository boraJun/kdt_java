package inheritance;
//5번: this, this(), super, super()
//부모 클래스
public class Person {
	//필드
	String name;
	int age;
	
	//기본 생성자
	public Person() {
		super();
		System.out.println("Person 기본 생성자 호출");
	}
	//매개변수 2개 있는 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person 매개변수 생성자 호출");
	}
	
	//메소드
	void introduce() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
	}
}
