package oper;
//13번 : 산술연산자(+, -, *, /, %)
public class OperTest01 {
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20; //정수형 변수 num1, num2 선언 및 값 대입
		double num3 = 5.5, num4 = 2.5; // 실수형 변수 num3, num4 선언 및 값 대입
		
//		System.out.println("======덧셈======");
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // 정수 + 정수 => 정수
//		System.out.println(num3 + " + " + num4 + " = " + (num3 + num4)); // 실수 + 실수 => 실수
//		System.out.println(num1 + " + " + num4 + " = " + (num1 + num4)); // 정수 + 실수 => 실수
//		
//		System.out.println("\n======뺄셈======");
//		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // 정수 - 정수 => 정수
//		System.out.println(num3 + " - " + num4 + " = " + (num3 - num4)); // 실수 - 실수 => 실수
//		System.out.println(num1 + " - " + num4 + " = " + (num1 - num4)); // 정수 - 실수 => 실수
//		
//		System.out.println("\n======곱셈======");
//		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // 정수 * 정수 => 정수
//		System.out.println(num3 + " * " + num4 + " = " + (num3 * num4)); // 실수 * 실수 => 실수
//		System.out.println(num1 + " * " + num4 + " = " + (num1 * num4)); // 정수 * 실수 => 실수
//
//		System.out.println("\n======나눗셈======");
//		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // 정수 / 정수 => 정수
//		System.out.println(num3 + " / " + num4 + " = " + (num3 / num4)); // 실수 / 실수 => 실수
//		System.out.println(num1 + " / " + num4 + " = " + (num1 / num4)); // 정수 / 실수 => 실수
//	
//		System.out.println("\n======나머지======");
//		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); // 정수 % 정수 => 정수
//		System.out.println(num3 + " % " + num4 + " = " + (num3 % num4)); // 실수 % 실수 => 실수
//		System.out.println(num1 + " % " + num4 + " = " + (num1 % num4)); // 정수 % 실수 => 실수
		
		//복합대입연산자
		int num = 10; // 정수형 변수 num 선언 및 10 값 대입
		System.out.println("num의 현재 값 : " + num); // 10 출력
		num = num + 5;
		System.out.println("num의 현재 값 : " + num); // 10+5 => 15 출력
		num = num + 15;
		System.out.println("num의 현재 값 : " + num); // 15+15 => 30 출력
		num += 5; //num = num + 5
		System.out.println("num의 현재 값 : " + num); // 30+5 => 35 출력
		num -= 2.5;
		System.out.println(num); //32, 실제 계산값은 32.5인데 32로 나온 이유 int 변수에 저장했기 때문
		System.out.println(35-2.5); //정수 - 실수 = 실수
		num *= 2;
		System.out.println("num의 현재 값 : " + num); // 32*2 => 64 출력
		
		
		
	}
}






















