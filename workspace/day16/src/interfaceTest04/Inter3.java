package interfaceTest04;
//18번 : 다중상속(모호성 해결방법 예제)
public interface Inter3 {
	default void printText() {
		System.out.println("Inter3의 printText() 호출");
	}
}
