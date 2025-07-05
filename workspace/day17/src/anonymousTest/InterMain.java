package anonymousTest;

//5번 : 인터페이스 객체화 위한 Main 클래스
public class InterMain {
	public static void main(String[] args) {

		InterA i = new InterA() {

			@Override
			public void method() {
				System.out.println("익명 객체의 메소드 재정의");
			}

		};

		System.out.println(i);
		i.method();

		InterA ii = () -> System.out.println("람다식");
		System.out.println(ii);
		ii.method();
	}
}
