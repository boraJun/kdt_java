package homework;
import java.util.Scanner;

public class Day05_1 {
	public static void main(String[] args) {
/*
		1. 물건값과 지불 금액을 입력받아 거스름돈을 출력하기
		단, 거스름돈을 1000원, 500원, 100원 짜리로 나누어 표시하세요.
		클래스명 : Day05_1

		[입출력예시]
		물건값 : 2700
		지불금액 : 5000
		거스름돈은 2300원입니다.
		1000원 : 2개
		500원 : 0개
		100원 : 3개
*/
		
		//입력 클래스 선언 후 정의
		Scanner sc = new Scanner(System.in);
		
		//입력 안내 문구 출력
		System.out.print("물건값 : ");
		//정수형 변수 선언 후, 입력 받은 문자열을 정수형으로 변환하여 대입
		int price = Integer.parseInt(sc.nextLine());
		
		//입력 안내 문구 출력
		System.out.print("지불금액 : ");
		//정수형 변수 선언 후, 입력 받은 문자열을 정수형으로 변환하여 대입
		int inputMoney = Integer.parseInt(sc.nextLine());
		
		//정수형 변수 선언 및 (지불금액 - 물건값) 대입
		int change = inputMoney - price;
		System.out.printf("거스름돈은 %d원입니다.\n", change); // 결과 출력
		
		int count; // 돈 수량을 위한 정수형 변수 선언
		int money; // 구하고자 하는 돈 단위를 위한 정수형 변수 선언
		
		money = 1000; 				// money 변수에 1000 대입
		count = change / money; 	// count 변수에 change 변수 값 나누기 money 변수 값을 통해 개수 구하여 대입
		change -= (money * count); 	// change 변수에 money 변수 값과 count 변수 값을 곱한 값을 뺴서 대입, 남은 돈 계산
		
		// 결과 출력
		System.out.println(money + "원 : " + count + "개"); 
		
		money = 500; 				// money 변수에 500 대입
		count = change / money; 	// count 변수에 change 변수 값 나누기 money 변수 값을 통해 개수 구하여 대입
		change -= (money * count); 	// change 변수에 money 변수 값과 count 변수 값을 곱한 값을 뺴서 대입, 남은 돈 계산
		
		// 결과 출력
		System.out.println(money + "원 : " + count + "개"); 
		
		money = 100; 				// money 변수에 100 대입
		count = change / money; 	// count 변수에 change 변수 값 나누기 money 변수 값을 통해 개수 구하여 대입
		change -= (money * count); 	// change 변수에 money 변수 값과 count 변수 값을 곱한 값을 뺴서 대입, 남은 돈 계산
		
		// 결과 출력
		System.out.println(money + "원 : " + count + "개"); 

		//스캐너 닫기
		sc.close();
	}
}
