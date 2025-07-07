package typeCasting;

//11번 : 자동 형변환
public class TypeCasting01 {
	public static void main(String[] args) { //main 메소드 중괄호영역 시작
		// 1) 작은 자료형의 값을 큰 자료형으로 변환
		// int(4byte) -> long(8byte)
		int iVal = 100; // 정수형 iVal 변수를 선언하고, 100 대입 
		long result1 = iVal; // int형 값 100을 long타입 변수에 대입(자동형변환)
		System.out.println(iVal); // iVal 변수 출력
		System.out.println(result1); // result1 변수 출력

//		long lVal = 100;

		// int(4byte) -> float(4byte)
		float result2 = iVal; // 실수형 result2 변수를 선언하고, result2 변수에 정수형 iVal 변수를  대입
		System.out.println(result2); // result2 변수 출력

		// int(4byte) -> double(8byte)
		double result3 = iVal; //실수형 result3 변수를 선언하고, 정수형 iVal 변수를 result3 변수에 대입
		System.out.println(result3); // result3 변수 출력

		// double(8byte) -> long(8byte)
//		long result4 = result3;
		// result3은 100.0 실수 타입으로 정수형 변수에 담길 경우 소수점의 손실이 발생하므로 자동형변환 불가능

		// float(4byte) -> double(8byte)
		double result4 = result2; // 실수형 result4 변수 선언 후, result2를 result4에 대입
//		float result5 = result3;
		// double 타입의 값은 float 타입에 담을 수 없다. 소수점의 손실이 발생하기 때문
		// double 타입 : 소수점 이하 15자리까지, float 타입 : 소수점 이하 6자리까지

		// 2) 연산시 자동 형변환
		// 정수와 실수의 연산
		int iVal2 = 10; // 정수형 iVal2 변수를 선언하고, 10 대입
		double dVal2 = 3.14; // 실수형 dVal2 변수를 선언하고, 3.14 대입
		System.out.println(iVal2 + dVal2); // iVal2 변수와 dVal2 변수를 더한 값인 13.14 출력
		double result6 = iVal2 + dVal2; // 실수형 result6 변수를 선언하고, iVal2 변수와 dVal2 변수를 더한 값인 13.1을 result6 변수에 대입
		System.out.println(result6); // result6 변수 출력

		// 3) 문자형에서 정수형으로 변환
		char letter = 'a'; // 문자형 letter 변수를 선언하고, a 값 대입
		int ascii = letter; // 정수형 ascii 변수를 선언하고, ascii 변수에 letter 변수를 대입
		System.out.println(letter); // letter 변수 출력
		System.out.println(ascii); // ascii 변수 출력

		char letter2 = 'b';// 문자형 letter2 변수를 선언하고, b 값 대입
		int ascii2 = letter2; // 정수형 ascii2 변수를 선언하고, ascii2 변수에 letter2 변수를 대입
		System.out.println(letter2); // letter2 변수 출력
		System.out.println(ascii2); // ascii2 변수 출력

		char letter3 = 'A'; // 문자형 letter3 변수를 선언하고, A 값 대입
		int ascii3 = letter3; // 정수형 ascii3 변수를 선언하고, ascii3 변수에 letter3 변수를 대입
		System.out.println(letter3); // letter3 변수 출력
		System.out.println(ascii3); // ascii3 변수 출력

		char letter4 = '가'; // 문자형 letter4 변수를 선언하고, 가 값 대입
		int ascii4 = letter4; // 정수형 ascii4 변수를 선언하고, ascii4 변수에 letter4 변수를 대입
		System.out.println(letter4); // letter4 변수 출력
		System.out.println(ascii4); // ascii4 변수 출력
	} //main 메소드 중괄호영역 끝
}
