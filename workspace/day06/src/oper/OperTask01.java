package oper;

import java.util.Scanner;

//4번 : ~논리연산자까지 복습문제
public class OperTask01 {
	public static void main(String[] args) { // main 시작
		//사용자가 입력한 값 2개를 서로 비교하기
		//nextInt() 사용, 변수를 먼저 만들고 진행할 것!
		//변수 만들 때 의미있는 문자로 사용
		//로직구성부터!
		
//		//입력클래스 선언 및 정의
		Scanner sc = new Scanner(System.in);
//
//		//변수 선언
//		int firstNumber, secondNumber;
//		
//		//안내 문구 출력
//		System.out.print("숫자 입력 1 : ");
//		//변수에 정수형 입력 값 대입
//		firstNumber = sc.nextInt();
//		
//		//안내 문구 출력
//		System.out.print("숫자 입력 2 : ");
//		//변수에 정수형 입력 값 대입
//		secondNumber = sc.nextInt();
//		
//		//값 비교 및 출력
//		System.out.println(firstNumber + " < " + secondNumber + " : " + (firstNumber < secondNumber));
//		System.out.println(firstNumber + " >= " + secondNumber + " : " + (firstNumber >= secondNumber));
//		System.out.println(firstNumber + " != " + secondNumber + " : " + (firstNumber != secondNumber));
//		
//		
		//실수 관계연산자 사용
		double num3, num4;
		System.out.println("실수 2개를 띄어쓰기로 구분하여 입력하세요 : ");
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		System.out.println(num3 + "<" + num4 + " : " + (num3 < num4));
		
//		0.00000001 0.00000000001
//		1.0E-8<1.0E-11 : false
//		1.0E-8 10의 -8제곱 (소수점 아래 8자리)
//		1.0E-11 10의 -11제곱 (소수점 아래 11자리)
		
		//스캐너 해제
		sc.close();
	} // main 끝
}
