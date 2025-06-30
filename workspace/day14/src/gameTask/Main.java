package gameTask;

import java.util.Scanner;

public class Main {	
	//양의 정수만 가능
	static int parseInt(String inputStr, int ... inputArr) {
		if(inputStr == null || inputArr == null)
			return -1;
		if(inputStr.length() == 0 || inputArr.length == 0)
			return -1;
		
		for(int i = 0; i < inputStr.length(); i++) {
			if(inputStr.charAt(i) < '0'  || inputStr.charAt(i) > '9')
			{
				return -1;
			}
		}
		
		int value = Integer.parseInt(inputStr);
		for(int i = 0; i < inputArr.length; i++) {
			if(value == inputArr[i])
				return value;
		}
		
		return -1;
	}
	
	
	static void printMenu() {
		System.out.print(
					"1. 기본공격\n"
				+ 	"2. 스킬공격\n"
				+ 	"3. 특수공격\n"
				+ 	"4. 종료\n" 
				+	"입력 >> "
				);
	}
	
	static void printCharacter() {
		System.out.print(
					"1. 마법사\n"
				+ 	"2. 전사\n"
				+ 	"3. 로그"
				+	"입력 >> "
				);
	}
	
	public static void main(String[] args) {
		//1) 입력클래스 import
		Scanner sc = new Scanner(System.in);

		//2) Wizard 객체 생성 마법사, 전사, 로그 = null;
		Character character = null;		
		Wizard wizard = null;
		Warrior warrior = null;
		Rogue rogue = null;
		
		//3) 반복문(while(true))
		while(true) {
			//3-1) 캐릭터 선택 메시지 출력
			printCharacter();
			//3-2) int choice = sc.nextInt();
			int choice = sc.nextInt();	
			//3-3) sc.nextLine();
			sc.nextLine();
			//3-4) switch or if 문
			//			객체명 = new 생성자();
			
			if(choice == 1) {
				wizard = new Wizard();
				break;
			}else if(choice == 2) {
				warrior = new Warrior();
			}else if(choice == 3) {
				rogue = new Rogue();
			}else {
				System.out.println("번호를 다시 입력하세요");
			}
		}
		
		//4) String 변수 = 메뉴 출력 메시지
		String msg = "1. 기본공격\n2. 스킬공격\n3. 특수공격\n4. 종료\n번호입력 : ";
		
		//5) 반복문(while(true))
		while(true) {
			//5-1) 메뉴 출력
			System.out.println(msg);
			//5-2) choice = sc.nextInt()
			int choice = sc.nextInt(); //지역변수(인스턴스 변수)
			//5-3) switch (choice)
			switch(choice) {
			case 1:
				wizard.normalAttack();
				break;
			case 2:
				wizard.skillAttack();
				break;
			case 3:
				wizard.specialAttack();
				sc.close();
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}
		}

//		Wizard wizard = new Wizard();
//		boolean flag = true;
//		while(flag) {
//			printMenu();
//			int choice = parseInt(sc.nextLine(), 1, 2, 3, 4);
//			
//			switch(choice) {
//			case 1:
//				wizard.normalAttack();
//				break;
//			case 2:
//				wizard.skillAttack();
//				break;
//			case 3:
//				wizard.specialAttack();
//				break;
//			case 4:
//				flag = false;
//				System.out.println("선택 종료");
//				break;
//			default:
//				System.out.println("잘못된 입력입니다.");
//				break;
//			}
//			
//			System.out.println();
//		}
//		sc.close();
	}
}
