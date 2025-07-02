package abstractTest01;
//3번 : 추상 클래스를 상속받은 일반 클래스
public class ClassC extends ClassB{

	@Override
	void method1() {
		System.out.println("추상 클래스를 상속받은 일반 클래스 - 메소드 오버라이딩");		
	}
	
	void printNumber() {
		System.out.println("숫자 출력 메소드");
	}
}
