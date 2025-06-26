package homework07;

import java.util.Scanner;

public class AtmTest {
	public static void main(String[] args) {
//		6. ATM 메뉴에서 입금, 출금, 잔액조회 하기
//		   [조건]
//		   초기 잔액은 10000원으로 설정
//		   메뉴 선택에 따라 작업 수행
//		   종료시 프로그램 종료
//		   숫자(번호)로 입력받기
//
//		   String msg ="\nATM 기기의 메뉴 중 번호를 선택하세요."
//		      + "\n1. 잔액조회"
//		      + "\n2. 입금"
//		      + "\n3. 출금"
//		      + "\n4. 종료"
//		      + "\n선택 : ";
//		      System.out.println(msg);
//		   그 외의 번호 입력시 다시 선택하세요 출력 후 메뉴 보이기
//		   번호 입력시 해당 메시지만 출력
		
		//입력 클래스 import
		Scanner sc = new Scanner(System.in);
		
		int money = 10000;
		
		String msg ="\nATM 기기의 메뉴 중 번호를 선택하세요."
			      + "\n1. 잔액조회"
			      + "\n2. 입금"
			      + "\n3. 출금"
			      + "\n4. 종료"
			      + "\n선택 : ";
		
		int choice = 0; //정수형 변수 선언
		
		String resultMsg = ""; //문자열 변수 선언
		
		do { // 반복 수행
			System.out.println(msg); //입력 문구 출력
			
			choice = Integer.parseInt(sc.nextLine()); //변수에 입력받은 정수 대입
			
			switch(choice) {
			case 1:
				resultMsg = "잔액조회"; //변수에 출력할 메시지 대입
				break;
			case 2:
				resultMsg = "입금"; //변수에 출력할 메시지 대입
				break;
			case 3:
				resultMsg = "출금"; //변수에 출력할 메시지 대입
				break;
			case 4:
				resultMsg = "종료"; //변수에 출력할 메시지 대입
				break;
			default:
				resultMsg = "다시 선택하세요"; //변수에 출력할 메시지 대입
				break;
			}
			
			System.out.println(resultMsg); //결과 출력
		}while(choice != 4); //4(종료) 입력하지 않은 경우 반복 
		
		//스캐너 해제
		sc.close();
	}
}
