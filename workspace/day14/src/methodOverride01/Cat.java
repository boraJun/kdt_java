package methodOverride01;
//6번 : 오버라이딩
//Animal 클래스 상속받은 자식 클래스
public class Cat extends Animal{
	
	@Override
	void sound() {
		super.sound();
		System.out.println("야옹~");
	}	
}
