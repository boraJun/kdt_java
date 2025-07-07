package homework07;

import java.util.Scanner;

public class SingTest {
	public static void main(String[] args) {
//		7. 코인 노래방 시스템을 구현하는 개발자입니다.
//		사용자로부터 금액을 입력받아 부를 수 있는 곡 수와 잔돈을 계산하고, 음료를 마실 수 있는지 여부도 안내하는 프로그램
//
//		[요구사항]
//		사용자에게 곡 당 가격을 입력받는다.
//		반복문을 사용하여 사용자에게 금액을 계속 입력받는다.
//		단, 0을 입력하면 프로그램은 종료된다.
//		입력받은 금액으로 부를 수 있는 곡 수와 잔돈을 출력한다.
//		곡 수 : 금액 ÷ 곡당 가격
//		보너스 : 5곡당 1곡 보너스 (예: 5곡 → 6곡, 10곡 → 12곡)
//		잔돈 : 금액 % 곡당 가격
//		음료(100원)를 마시고 싶다면, 음료 가격을 차감하고 노래를 줄이는 방식으로 대체 제안을 출력한다.
//		사용자에게 "음료를 구매하시겠습니까?" 라고 묻고
//		YES를 입력하면 대체 결과를 출력 NO를 입력하면 원래 계산된 노래 수를 유지한다
//		금액이 부족할 경우, 노래를 부를 수 없다는 안내 메시지를 출력한다.
//
//		입력은 정수로 받되, nextLine()을 사용하여 입력 오류를 방지한다.
//		대소문자 구분해서 YES/NO 처리한다.
//		Scanner는 한 번만 생성하고 마지막에 .close()로 닫을 것
//
//		[입출력 예시]
//		곡 당 가격 입력: 300
//		금액 입력 (0 입력 시 종료): 1000
//		3곡을 부를 수 있으며 잔돈은 100원입니다
//		음료를 마시고 싶으면 3곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 구매하시겠습니까? (YES/NO): YES
//		음료를 구매하셨습니다.
//		3곡을 부를 수 있으며 잔돈은 0원입니다
//		금액 입력 (0 입력 시 종료): 900
//		3곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 마시고 싶으면 2곡을 부를 수 있으며 잔돈은 200원입니다
//		음료를 구매하시겠습니까? (YES/NO): YES
//		음료를 구매하셨습니다.
//		2곡을 부를 수 있으며 잔돈은 200원입니다
//		금액 입력 (0 입력 시 종료): 900
//		3곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 마시고 싶으면 2곡을 부를 수 있으며 잔돈은 200원입니다
//		음료를 구매하시겠습니까? (YES/NO): NO
//		음료를 구매하지 않았습니다.
//		금액 입력 (0 입력 시 종료): 0
//		프로그램을 종료합니다.
		
		//곡당 가격 입력
		//금액 입력 (0이면 종료)

		//금액 부족할 경우, 노래 못불러요
		
		//곡 수, 보너스 곡, 잔돈 출력
		
		//음료 마실 돈 되고, 마셔도 곡 0곡 아니면 음료 내용 출력하고
		//YES면 대체, NO 입력하면 노래 수 유지
		
		//입력 클래스 import
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언 및 초기화
		int price = 0, money = 0, change = 0, songCnt = 0, bonusSongCnt = 0;
		int songCountWithDrink = 0, changeWithDrink = 0, bonusSongCntWithDrink = 0;
		String inputDrink = "";
		
		final int PRICE_DRINK = 100; // 상수 선언 및 정의
		final int FREE_SONG_COUNT = 5; // 상수 선언 및 정의
		
		System.out.print("곡 당 가격 입력: "); // 입력 문구 출력
		price = Integer.parseInt(sc.nextLine()); // 입력 받은 문자열 값을 정수형으로 변환하여 변수에 대입
		
		while(true) {
			//변수 값 초기화
			money = 0;
			change = 0;
			songCnt = 0;
			bonusSongCnt = 0;
			songCountWithDrink = 0;
			changeWithDrink = 0;
			bonusSongCntWithDrink = 0;
			inputDrink = "";
			
			System.out.print("\n금액 입력 (0 입력 시 종료): "); // 입력 문구 출력
			money = Integer.parseInt(sc.nextLine()); // 입력 받은 문자열 값을 정수형으로 변환하여 변수에 대입
			
			if(money == 0) // 0 입력 시
				break; // while 문 탈출
			
			if(money < price) // 금액이 부족할 경우
			{
				System.out.println("금액이 부족하여 노래를 부를 수 없습니다"); // 출력
				continue; // 반복 시작 지점으로 이동
			}

			songCnt = money / price;
			change = money % price;
			
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다.\n", songCnt , change);
			
			bonusSongCnt = songCnt / FREE_SONG_COUNT;
			
			System.out.printf("보너스 곡은 %d곡으로, 총 %d곡 부를 수 있습니다.\n\n", bonusSongCnt, songCnt + bonusSongCnt);
			
			if(money < (price + PRICE_DRINK)) { // 투입한 금액이 한 곡 + 음료수 가격보다 작을 경우
				continue; // 음료수 문구 안하고 반복문 시작 지점으로 이동
			}
			
			songCountWithDrink = (money - PRICE_DRINK) / price;
			changeWithDrink = (money - PRICE_DRINK) % price;
			
			bonusSongCntWithDrink = songCountWithDrink / FREE_SONG_COUNT;
			
			System.out.printf(
					"음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원입니다."
					+ "\n보너스 곡은 %d곡으로, 총 %d곡 부를 수 있습니다."
					+ "\n음료를 구매하시겠습니까? (YES/NO):",
					songCountWithDrink,  changeWithDrink,
					bonusSongCntWithDrink, songCountWithDrink + bonusSongCntWithDrink
					);
			
			inputDrink = sc.nextLine();
			
			if(inputDrink.equals("YES")) {
				System.out.printf(
						"음료를 구매하셨습니다.\n%d곡을 부를 수 있으며 잔돈은 %d원입니다."
						+ "\n보너스 곡은 %d곡으로, 총 %d곡 부를 수 있습니다.\n",
						songCountWithDrink,  changeWithDrink,
						bonusSongCntWithDrink, songCountWithDrink + bonusSongCntWithDrink
						);		
			}else if(inputDrink.equals("NO")) {
				System.out.println("음료를 구매하지 않았습니다.");
			}else{
				System.out.println("잘못된 입력으로 음료를 구매하지 않았습니다.");
			}
		}
		
		
		System.out.println("프로그램을 종료합니다."); // 안내 문구 출력
		
		//스캐너 해제
		sc.close();
	}
}
