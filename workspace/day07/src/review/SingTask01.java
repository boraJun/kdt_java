package review;

import java.util.Scanner;

//과제1 : 금액과 곡 당 가격을 입력받아 부를 수 있는 곡 수와 잔돈 계산
public class SingTask01 {
	public static void main(String[] args) {
		
		//1) 입력클래스 import
		//2) 정수형변수 2개
		//3) 금액 입력 메시지 출력
		//4) 변수1 nextInt() 입력받아 저장
		//5) 곡 당 입력 메시지 출력
		//6) 변수2 nextInt() 입력받아 저장
		//7) if ~else문
			//if문 조건식 변수1 < 변수2
			//입력한 금액과 부족한 금액 출력
			//}else문{
			//변수3 변수1 / 변수2
			//변수4 변수1 % 변수2
			//부를 수 있는 곡 수와, 잔돈 출력
			//}
		//8) 스캐너 닫기
		
		Scanner sc = new Scanner(System.in);
		int money = 0, price = 0, song = 0, change = 0;
		
		System.out.println("금액 입력 : ");
		money = sc.nextInt();
		System.out.println("곡 당 가격 입력 : ");
		price = sc.nextInt();				
		
		if(money < price) {
			System.out.printf("입력한 금액은 %d원입니다. 한 곡 당 가격은 %d원으로 %d원이 부족합니다", money, price, price - money);
		}else {
			song = money / price;
			change = money % price;
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다", song, change);
		}
	}
}
