package methodOverride01;
//6번 : 오버라이딩
//Animal 클래스 상속받은 자식 클래스
public class Dog extends Animal{

	//메소드 오버라이딩 : alt + shift + s + v
	//@Override : 오버라이딩 의도를 명시
	// 어노테이션, 컴파일러가 확인해줌
	@Override 
	void sound() {
		System.out.println("멍멍!!!");
	}
	
}
