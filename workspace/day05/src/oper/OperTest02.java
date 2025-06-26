package oper;

// 14번 : 증감연산자
public class OperTest02 {
	public static void main(String[] args) {

		int num = 1; // 정수형 변수 num 선언 및 1 값 대입
		System.out.println("num의 값 : " + num); //1 출력
//		System.out.println("num + 10의 값 : " + (num + 10));

		System.out.println("\n======증감연산자(전위형)======"); // 출력
		System.out.println("기존 num의 값 : " + num); // 1
		System.out.println("전위증감연산자를 사용한 num의 값 : " + ++num); // 2
		System.out.println("현재 num의 값 : " + num); // 2

		System.out.println("\n======증감연산자(후위형)=======");
		int num2 = 1; // 정수형 변수 num2 선언 및 1 값 대입
		System.out.println("기존 num2의 값 : " + num2); // 1
		System.out.println("후위증감연산자를 사용한 num2의 값 : " + num2++); // 1
		System.out.println("현재 num2의 값 : " + num2); //2

		System.out.println(); // 줄바꿈
		int num3 = 7, num4 = 7; // 정수형 변수 num3, num4 선언 및 값 대입
		int result1 = 0, result2 = 0; // 정수형 변수 result1, result2 선언 및 값 대입

		result1 = --num3 + 4; //전위형 증감연산자를 통해 num3값 7을 1 감소시킨 후, 4를 더하여 총 10의 값을 result1 변수에 대입
		System.out.println(result1); // 10 출력

//		result2 = num4++ - 4;
		result2 = (num4++) - 4; //num4 값 7에서 4를 뺀 3을 result2 변수에 대입 후, 후위형 증감연산자를 통해 num4 7 값을 1을 더한 8로 변경
		System.out.println(result2); //3 출력
		System.out.println(num4); //8 출력
	}
}







