package homework;

import java.util.Scanner;

public class SingTask01 {
	public static void main(String[] args) {
		
		/*
		 * 1) 한 곡당 금액도 입력받기 
		 * 금액입력 : 1000 
		 * 곡 당 가격 입력 : 300 
		 * [출력] 3곡을 부를 수 있으며 잔돈은 100원입니다
		 * 
		 * 2) 잔돈이 부족할 경우 안내하기 
		 * 금액입력 : 100 
		 * 곡 당 가격 입력 : 
		 * [출력] 
		 * 입력한 금액은 100원입니다. 곡 당 가격은 000원으로 000원이 부족하여 노래를 부를 수 없습니다
		 */
		

		//안내 문구 출력
		System.out.println("==========문제 1========== ");
		
		//입력 클래스 변수 선언 및 정의
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int inputMoney, price;
		
		//안내 문구 출력
		System.out.print("금액입력 : ");
		//변수에 입력 값 대입
		inputMoney = sc.nextInt();

		//안내 문구 출력
		System.out.print("곡 당 가격 입력 : ");
		//변수에 입력 값 대입
		price = sc.nextInt();
		
		//계산 및 결과 출력
		System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다", inputMoney / price, inputMoney % price);
		
		
//		2) 잔돈이 부족할 경우 안내하기
//		금액입력 : 100
//		곡 당 가격 입력 : 
//		[출력]
//		입력한 금액은 100원입니다. 곡 당 가격은 000원으로 000원이 부족하여 노래를 부를 수 없습니다 출력

		//안내 문구 출력
		System.out.println("\n\n==========문제 2==========");
		//안내 문구 출력
		System.out.print("금액입력 : ");
		//변수에 입력 값 대입
		inputMoney = sc.nextInt();
		
		//안내 문구 출력
		System.out.print("곡 당 가격 입력 : ");
		//변수에 입력 값 대입
		price = sc.nextInt();
		
		if(price > inputMoney) {
			System.out.printf("입력한 금액은 %d원입니다. 곡 당 가격은 %d원으로 %d원이 부족하여 노래를 부를 수 없습니다",
					inputMoney, price, price - inputMoney
					);
		}
		else {
			//계산 및 결과 출력
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다", inputMoney / price, inputMoney % price);
		}
		
		//스캐너 해제
		sc.close();
	}
}
