package scanner;

import java.util.Scanner;

//7번 : 입력클래스, 입력메소드 연습1(주소입력)
public class ScannerTest03 {
	public static void main(String[] args) {
		//1. 사용자로부터 입력받아 주소를 출력하기
		//1) 입력 클래스 선언
		Scanner sc = new Scanner(System.in); // 입력 클래스 선언 및 객체 생성 대입
		//2) 입력 클래스 import
		// ctrl + shift + o
		
		//3) 문자열 변수 선언
		String address; // 문자열 변수 address 선언
		
		//+) 출력 메시지
		System.out.println("주소를 입력하세요."); // 출력
		
		//4) 입력메소드 사용
//		address = "서울시 강남구 역삼동";
		address = sc.next(); // address 변수에 입력 받은 문자열 대입
		
		//5) 결과 출력
		System.out.println("주소는 " + address + "입니다."); // 출력
		System.out.printf("주소는 %s입니다.", address); // 출력
		
		//6) 입력클래스 해제
		sc.close(); // 스캐너 해제
	}
}
