package lambdaTest02;

//7번 : 함수형 인터페이스의 객체 람다식으로 만들기
public class FunctionalMain {
	public static void main(String[] args) {
		// 익명클래스로 객체 생성
		Func1 fi1 = new Func1() {

			@Override
			public void addTen(int number) {
				System.out.println(number + 10);
			}
		};

		fi1.addTen(10);

		// 람다식으로 객체 생성
		Func1 f1 = number -> System.out.println(number + 10);
//      1. 이름을 없애고 ()뒤에 -> 붙인다
//            void (int number) -> { 출력메소드 }
//      2. 반환타입 추론 가능하므로 생략한다
//            (int number) -> { 출력문 }
//      3. 매개변수의 타입 추론 가능하므로 생략가능
//      타입 생략 시 매개변수가 1개이므로 ()를 없앨 수 있다
//            number -> { 출력문 }
//      4. 바디가 1줄이니 중괄호와 ; 생략 가능
//            number -> 출력문
		System.out.println(f1);
		f1.addTen(100);

		// int printSum(int num1, int num2);
		Func2 fi2 = new Func2() {

			@Override
			public int printSum(int num1, int num2) {
				System.out.println("num1 의 값 : " + num1 + ", num2의 값 : " + num2);
				return num1 + num2;
			}
		};

		Func2 f2 = (num1, num2) -> {
			System.out.println("num1 의 값 : " + num1 + ", num2의 값 : " + num2);
			return num1 + num2;
		};
		System.out.println(f2);
		System.out.println(f2.printSum(1, 2));
//      1. 이름을 없애고 ()뒤에 -> 추가
//      2. 반환타입 추론가능하므로 생략한다
//      3. 매개변수의 타입 추론 가능하므로 생략 가능하다
//      4. 매개변수가 2개이므로 () 생략 불가능
//      5. 명령문 2줄이므로 {}, ; 생략 불가능
	}
}