package oper;

import java.util.Scanner;

public class OperTask02 {
	public static void main(String[] args) { // main 시작
		//1. 두 수를 입력받아 비교
		//크다, 작다, 같다가 각각 상황에 맞게 출력되도록 로직 구성
		
		//입력 클래스 선언 및 정의
		Scanner sc = new Scanner(System.in);
		
		//출력
		System.out.println("비교할 두 숫자를 입력하세요");
		
		//정수형 변수 선언 및 입력값 대입
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//문자열 변수 선언 및 값 비교하여 결과 문자열 대입
		String result = num1 <= num2 ? num1 == num2 ?"두 수가 같습니다" : num2 + "가 큽니다" : num2 +"가 작습니다";
		
		//결과 출력
		System.out.println(num1 + "과" + num2+" 비교 결과는 "+ result);
		
		
		//2. 한 개의 정수를 입력받아서 짝수인지 아닌지 출력하기
		//짝수입니다 or 짝수가 아닙니다로 출력할 것
		System.out.println("숫자를 입력하세요");
		
		//정수형 변수 선언 및 입력값 대입
		int num = sc.nextInt();
		
		//값 계산하여 변수에 문자열 대입
		result = (num % 2) == 1 ? "짝수가 아닙니다" : "짝수입니다";
		
		//결과 출력
		System.out.println(result);
		
		//스캐너 해제
		sc.close();
	}// main 끝
}
