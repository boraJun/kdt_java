package abstractTest01;

//2번 : 추상 클래스(추상 메소드와 일반 메소드)
public abstract class ClassB {
	//추상 메소드
	abstract void method1();
	
	void method2() {
		System.out.println("추상클래스의 method2 호출");
	}
}
