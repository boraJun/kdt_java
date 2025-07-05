package abstractTest01;

//4번 : 일반 클래스와 추상 클래스 객체화
public class AbstractTest {
	public static void main(String[] args) {
		//일반클래스 ClassA 객체화
		ClassA a = new ClassA();
		System.out.println(a);
		
		a.method1();
		
		//추상클래스 ClassB 객체화 불가능 - 미완성된 클래스
//		ClassB b = new ClassB();
		
		//추상클래스 ClassB를 상속받은 일반 클래스 ClassC 객체화
		ClassC c = new ClassC();
		System.out.println(c);
		
		c.method1();
		c.method2();
		c.printNumber();
	
		//업캐스팅
		ClassB b = new ClassC();
		System.out.println(b);
		b.method1(); //오버라이딩 된 메소드 호출
		//다운캐스팅
		((ClassC)b).printNumber();
	}
}
