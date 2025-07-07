package homework;

import java.util.Scanner;

public class SingTask03 {
	public static void main(String[] args) {
//		4) 총 부른 곡 수에 따른 보너스 곡 지급
//		5곡을 부르면 1곡 추가 제공

		// 입력 클래스 선언 및 정의
		Scanner sc = new Scanner(System.in);

		//변수 선언
		int inputMoney, price, songCount;
		//추가 제공 곡 단위 변수 선언 및 정의
		int freeCount = 5;
		
		// 안내 문구 출력
		System.out.println("==========문제 4==========");
		// 안내 문구 출력
		System.out.print("금액입력 : ");
		// 변수에 입력 값 대입
		inputMoney = sc.nextInt();

		// 안내 문구 출력
		System.out.print("곡 당 가격 입력 : ");
		// 변수에 입력 값 대입
		price = sc.nextInt();

		if (price > inputMoney) {
			System.out.printf("입력한 금액은 %d원입니다. 곡 당 가격은 %d원으로 %d원이 부족하여 노래를 부를 수 없습니다", inputMoney, price,
					price - inputMoney);
		} else {
			//곡 수 계산 및 변수에 대입
			songCount = inputMoney / price;
			
			// 계산 및 결과 출력
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다\n", songCount, inputMoney % price);
			System.out.println((songCount / freeCount) + "곡 추가 제공 ("+freeCount + "곡 당 1곡 추가 제공)");
		}

		// 스캐너 해제
		sc.close();
	}
}
