package review;

import java.util.Scanner;

public class Day05_1 { // 클래스 중괄호 시작 영역
	public static void main(String[] args) { // main 중괄호 시작 영역

		/*
		 * 1. 물건값과 지불 금액을 입력받아 거스름돈을 출력하기 
		 * 단, 거스름돈을 1000원, 500원, 100원 짜리로 나누어 표시하세요. 
		 * 클래스명 : Day05_1
		 * 
		 * [입출력예시] 
		 * 물건값 : 2700 
		 * 지불금액 : 5000 
		 * 거스름돈은 2300원입니다. 
		 * 1000원 : 2개, 
		 * 500원 : 0개, 
		 * 100원 : 3개
		 */

		// 로직구성
		// 1) 입력클래스 import
		Scanner sc = new Scanner(System.in);
		// 2) 출력메시지
		System.out.println("물건값 입력 : ");
		// 3) 정수형 변수1 입력메소드(next())
		int price = Integer.parseInt(sc.next());
		// 4) 출력메시지
		System.out.println("지불금액 : ");
		// 5) 정수형 변수2 입력메소드(next())
		int paid = Integer.parseInt(sc.next());
		// 6) 정수형 변수3 변수2 - 변수1(산술연산자)
		int change = paid - price;
		// 7) 출력(거스름돈은 00원입니다)
		System.out.println("거스름돈은 " + change + "원 입니다.");
//방법1)      
		// 8) 출력(변수3 / 1000)
		// 9) 출력((변수3 % 1000) / 500)
		// 10) 출력((변수3 % 1000) % 500) / 100))

//방법2)
		// 8) 정수형변수 선언 = 변수3 / 1000;
		int thousand = change / 1000;
		// 9) 변수3 %= 1000;
		change %= 1000;
		// 10) 정수형변수 선언 = 변수3 / 500;
		int fiveHundred = change / 500;
		// 11) 변수3 %= 500;
		change %= 500;
		// 12) 정수형변수 선언 = 변수3 / 100;
		int hundred = change / 100;
		// 13) 출력
		System.out.println("1000원 : " + thousand + "개\n" + "500원 : " + fiveHundred + "개\n" + "100원 : " + hundred + "개");
	} // main 중괄호 끝 영역
} // 클래스 중괄호 끝 영역