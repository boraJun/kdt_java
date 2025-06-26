package variable;

// 1번 : 변수선언
public class Variable01 {
	public static void main(String[] args) { //main 메소드 중괄호영역 시작
		// 변수선언
		// 자료형 변수명;
		int number1; // 정수형 타입의 값을 저장할 수 있는 number1 변수를 만들었다
		boolean isTrue; // 논리형 타입의 값을 저장할 수 있는 isTrue 변수를 만들었다
		double number2; // 실수형 타입의 값을 저장할 수 있는 number2 변수를 만들었다

		// 변수에 값 저장(변수를 선언 후 값을 저장해야한다!!)
		// 변수명 = 값;
		number1 = 10; // 10이라는 정수형 값을 number1 변수에(저장공간) 대입한다
		isTrue = true; // true라는 논리형 값을 isTrue 변수에 대입한다
		number2 = 3.14; // 3.14라는 실수형 값을 number2 변수에 대입한다

		// 출력
		System.out.println(10); // 10이라는 정수값을 콘솔창에 출력하고 줄바꿈한다.
		System.out.println(number1); // number1이라는 변수에 저장된 10이라는 정수형 값을 콘솔창에 출력하고 줄바꿈한다.
		System.out.println(number2); // number2라는 변수에 저장된 3.14라는 실수형 값을 콘솔창에 출력하고 줄바꿈한다.
		System.out.println(isTrue); // isTrue라는 변수에 저장된 true라는 논리형 값을 콘솔창에 출력하고 줄바꿈한다.

		// 변수 선언과 동시에 초기화(처음으로 값을 저장하는 것)
		// 자료형 변수명 = 값;
		int number3 = 100; // 정수값을 저장할 수 있는 변수 number3를 선언하고 100이라는 정수형 값으로 초기화했다(저장했다)
		// int number3;
		// number3 = 100;
		System.out.println(number3); //number3 값 출력
		//ctrl + shift + f : 자동정렬 단축키
		
		int number = 1; // 정수형 타입의 number 변수를 선언하고, number 변수에 1 값을 대입한다.
		System.out.println(number); // number 변수에 저장된 1이라는 정수 값을 콘솔창에 출력하고 줄바꿈한다.
	}  //main 메소드 중괄호 영역 끝
}








