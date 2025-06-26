package typeCasting;
//3번 : 문자열 자료형 -> 다른 기본 자료형으로
public class TypeCasting02 {
	public static void main(String[] args) {
		//기본자료형 -> 문자열 자료형

		// 문자열 변수 str1 선언 후, 정수값 3와 문자열 ""을 +를 통해 문자열로 자동형변환하여 "3" 대입
		String str1 = 3 + ""; 

		// 문자열 변수 str2 선언 후, 실수값 6.17과 문자열 ""을 +를 통해 문자열로 자동형변환하여 "6.17" 대입
		String str2 = 6.17 + "";

		// 문자열 변수 str3 선언 후, 문자값 a와 문자열 ""을 +를 통해 문자열로 자동형변환하여 "a" 대입
		String str3 = 'a' + "";

		// 문자열 변수 str4 선언 후, 논리값 true와 문자열 ""을 +를 통해 문자열로 자동형변환하여 "true" 대입
		String str4 = true + "";
		
		System.out.println(str1); // 출력
		System.out.println(str2); // 출력
		System.out.println(str3); // 출력
		System.out.println(str4); // 출력
		
		//문자열 -> 기본자료형으로
		
		//정수형 변수 number1 선언 후, 문자열 str1 변수 값을 정수형으로 변환하여 대입
		int number1 = Integer.parseInt(str1);
		System.out.println(number1); // 3 출력
		
		//실수형 변수 number2 선언 후, 문자열 str2 변수 값을 실수형으로 변환하여 대입
		double number2 = Double.parseDouble(str2);
		System.out.println(number2); // 6.17 출력
		
		//논리형 변수 isTrue2 선언 후, 문자열 str4 변수 값을 논리형으로 변환하여 대입
		boolean isTrue2 = Boolean.parseBoolean(str4);
		System.out.println(!isTrue2); // isTrue2 변수 값 true에 !(not)연산자를 사용하여 false 출력
		
		
		char ch = "hello".charAt(0); //문자형 변수 ch 선언 후, 문자열 "hello" 값의 0번째 문자인 h 대입
		System.out.println(ch);	// h 출력
	}
}
