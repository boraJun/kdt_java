package casting03;
//6번 : 캐스팅의 특징
public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);
	}

	//메소드 오버라이딩
	@Override
	void crying() {
		System.out.println("야옹~");
	}
}
