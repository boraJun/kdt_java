package abstractTest02;

//5번 : 추상클래스와 강제성
public class Cat extends Animal{

	public Cat() {
		super();
	}

	//추상 메소드
	@Override
	void crying() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
	
}
