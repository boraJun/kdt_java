package interfaceTest01;
//7번 : 인터페이스 객체화와 구현한 클래스 객체화 확인
public class InterMain {
	public static void main(String[] args) {
//		인터페이스 객체화 불가능 => 추상 메소드를 구현한 클래스로 객체화
//		Inter i = new Inter();
		
		ClassA a = new ClassA();
		System.out.println(a);
		a.method1();
		System.out.println(a.VAR1);
		System.out.println(Inter.VAR1);
		
		Inter i = new ClassA(); //업캐스팅
		System.out.println(i);
	}
}
