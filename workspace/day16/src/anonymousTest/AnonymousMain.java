package anonymousTest;
//29번 : 익명 클래스-메인 클래스
public class AnonymousMain {
	public static void main(String[] args) {
		InterA a = new ClassA();
		System.out.println(a);
		a.printTest();
		
		InterA aa = new InterA() {

			@Override
			public void printTest() {
				System.out.println("익명클래스에서 오버라이딩");
				System.out.println("수업끝!");
			}
			
		};
		
		System.out.println(aa);
		aa.printTest();
	}
}
