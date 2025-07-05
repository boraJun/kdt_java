package casting03;
//6번 : 캐스팅의 특징
public class Dog extends Animal{
	public Dog(String name, int age) {
		super(name, age);
	}
	
	//메소드 오버라이딩
	@Override
	void crying() {
		System.out.println("멍멍!!");
	}
	
	//메소드
	void walk() {
		System.out.println("산책가자!");
	}
}
