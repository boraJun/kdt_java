package lambdaTest;

//6번 : 람다식 만드는 방법
public class LambdaTest {
//   매개변수 -> 바디

	void printHello() {
		System.out.println("안녕하세요");
	}

	// 매개변수x 리턴값x 출력문1개
//   void printHello() { System.out.println("안녕하세요"); }

//   1. 이름을 없애고 ()뒤에 ->를 붙인다
//   void () -> { System.out.println("안녕하세요"); }
//   2. 반환타입은 추론 가능하므로 생략한다
//   () -> { System.out.println("안녕하세요"); }
//   3. 명령문이 1줄이면 중괄호와 세미콜론 생략이 가능하다(선택)
//   () -> System.out.println("안녕하세요")

	int addTen(int number) {
		return number + 10;
	}

	// 매개변수 1개, 리턴값 o 명령문 1줄
//   int addTen(int number) { return number + 10; }

//   1. 이름을 없애고 -> 추가한다
//      int (int number) -> { return number + 10; }
//   2. 반환타입은 추론 가능하므로 생략한다
//      (int number) -> { return number + 10; }
//   3. 매개변수 타입은 추론이 가능하므로 생략 가능하다(선택)
//      (number) -> { return number + 10; }
//   4. 매개변수가 1개라면 () 생략 가능하다(선택)
//   단, 자료형을 생략하지 않았다면 ()를 생략할 수 없다.
//      number -> { return number + 10; }
//   5. 명령문이 1줄이면 중괄호와 세미콜론 생략가능하다(선택)
//   단, 중괄호와 세미콜론을 생략하면 return도 생략해야한다
//   바디의 결과가 값이라면 자동으로 return된다
//   단, 바디에 명령문이 1개이어야만 한다

	int add(int num1, int num2) {
		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
		return num1 + num2;
	}

//   매개변수 2개, 리턴값 o, 명령문 2줄

//   1. 이름을 지우고 -> 추가
//   2. 반환타입 추론 가능하므로 생략
//   3. 매개변수의 타입은 추론 가능하므로 생략 가능하다(선택)
//   4. 매개변수 2개 이상이므로 ()생략 불가
//   (num1, num2) -> {
//      System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
//      return num1 + num2;
//   }
//   5. 명령문이 2개 이상이므로 {}와 ; 생략 불가
//   6. 반환할 값이 있다면 return 사용한다
}



