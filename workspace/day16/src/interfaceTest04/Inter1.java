package interfaceTest04;
//14번 : 다중상속(모호성 해결방법 예제)
public interface Inter1 {
	default void printText() {
		System.out.println("Inter1 printText() 호출");
	}
}
