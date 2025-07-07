package homework;

import java.util.Scanner;

public class SingTask02 {
	public static void main(String[] args) {
		/*
		 * 3) 남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원) 
		 * 금액입력 : 1000 
		 * [출력] 
		 * 5곡을 부를 수 있으며 잔돈은 0원입니다 
		 * 음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다
		 */

		// 입력 클래스 변수 선언 및 정의
		Scanner sc = new Scanner(System.in);
		//변수 선언
		int inputMoney;
		//변수 선언 및 정의
		int price = 200, drinkPrice = 100;
		
		// 안내 문구 출력
		System.out.println("==========문제 3==========");
		// 안내 문구 출력
		System.out.print("금액입력 : ");
		// 변수에 입력 값 대입
		inputMoney = sc.nextInt();

		if (price > inputMoney) {
			System.out.printf("입력한 금액은 %d원입니다. 곡 당 가격은 %d원으로 %d원이 부족하여 노래를 부를 수 없습니다", inputMoney, price,
					price - inputMoney);
		} else {
			// 계산 및 결과 출력
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다\n", inputMoney / price, inputMoney % price);
			
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원입니다",
					(inputMoney - drinkPrice) / price,  (inputMoney - drinkPrice) % price
			);
		}
		
		// 스캐너 해제
		sc.close();
	}
}
