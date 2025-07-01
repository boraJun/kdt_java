package ex05_전보라;

public class Person {
	//필드
	String name;

	//생성자
	//이름을 매개변수로 받아 초기화
	public Person(String name) {
		this.name = name; //매개변수로 전달받은 값을 통해 필드 초기화
	} 
	
	//메소드
	//기능: 이름 반환
	//반환타입 : String
	//매개변수 : x
	//구현부
	//{
	//	return this.name;
	//}
	String getName() {
		return this.name;
	}
}
