package oper;
//3번 : 관계연산자와 논리연산자
public class OperTest01 {
	public static void main(String[] args) { // main 시작
		System.out.println("=======관계 연산자======="); // 출력
		
		int num1 = 10, num2 = 20, num3 = 10; //정수형 변수 선언 및 정의
		System.out.println(num1 + ">" + num2 +" : " + (num1 > num2)); // > 연산 비교 출력
		System.out.println(num1 + "<" + num2 +" : " + (num1 < num2)); // < 연산 비교 출력
		System.out.println(num1 + ">=" + num2 +" : " + (num1 >= num2)); // >= 연산 비교 출력
		System.out.println(num1 + ">=" + num2 +" : " + (num1 <= num2)); // <= 연산 비교 출력
		System.out.println(num1 + "==" + num2 +" : " + (num1 == num2)); // == 연산 비교 출력
		System.out.println(num1 + "!=" + num2 +" : " + (num1 != num2)); // != 연산 비교 출력
		System.out.println(num1 + "==" + num3 +" : " + (num1 == num3));// == 연산 비교 출력
		
		System.out.println(10 >= 10); // true 출력
		
		System.out.println("=======논리 연산자======="); // 출력
		System.out.println("and : 둘 다 참이면 참(&&)"); // 출력
		System.out.println(true && true);	//true
		System.out.println(true && false);	//false
		System.out.println(false && true);	//false
		System.out.println(false && false);	//false
		
		System.out.println("\nor : 둘 중 하나라도 참이면 참(||)"); // 출력
		System.out.println(true || true);	//true
		System.out.println(true || false);	//true
		System.out.println(false || true);	//true
		System.out.println(false || false);	//false
		
		System.out.println("\nnot : 참이면 거짓, 거짓이면 참(!)"); // 출력
		System.out.println(!true);	//false
		System.out.println(!false);	//true		
	}	// main 끝
}
