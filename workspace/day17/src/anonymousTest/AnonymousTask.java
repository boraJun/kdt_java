package anonymousTest;
//3번 : Calculator 인터페이스를 만들고 익명클래스로 객체 생성 후 메소드 호출

interface Calculator{
	//추상메소드 2개 선언
	int add(int num1, int num2);
	int mul(int num1, int num2);
}

public class AnonymousTask {
	public static void main(String[] args) {
		//익명클래스로 객체 생성 후 메소드 호출
		Calculator cal = new Calculator() {
			
			@Override
			public int add(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 + num2;
			}
			
			@Override
			public int mul(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 * num2;
			}
			
		};
		
		System.out.println(cal.add(10, 20));
		System.out.println(cal.mul(10, 20));
	}
}
