package scanner;

import java.util.Scanner;

//11번 : 두 정수를 입력받아 합을 출력하기(next() 메소드를 사용하기)
public class ScannerTask03 {
	public static void main(String[] args) {
		//로직구성
		String msg1 ="정수1 입력 : ", msg2 = "정수2 입력 : ";
		
		//입력 클래스를 선언하고, 정의한다
		Scanner sc = new Scanner(System.in);
		//입력 클래스 임포트
		
		//입력을 위한 문구 출력
		System.out.print(msg1);
		//정수형 변수 선언 후, 입력값을 정수형으로 형반환하여 대입
		//int number1 = Integer.parseInt(sc.next());
		
		//정수형 변수 선언 후, 정수형 입력 받아 대입
		int number1 = sc.nextInt();
		
		//입력을 위한 문구 출력
		System.out.print(msg2);
		sc.nextLine();
		//정수형 변수 선언 후, 입력값을 정수형으로 형반환하여 대입
		//int number2 = Integer.parseInt(sc.next());
		
		//정수형 변수 선언 후, 정수형 입력 받아 대입
		int number2 = sc.nextInt();
		
		//결과 출력
		System.out.println(number1 + number2);
		
		//스캐너 해제
		sc.close();
	}
}
