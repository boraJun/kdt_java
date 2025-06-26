package scanner;

import java.util.Scanner;

// 9번 : 입력 메소드 실습1
public class ScannerTask01 {
	public static void main(String[] args) {
		// 1. 본인의 이름과 성별을 입력받고 출력하기 (next()만 사용)
		// 입력 예> 이름 입력 :
		// 입력 예> 성별 입력 :
		// 출력 예> 이름은 000이고 00입니다.

		// 입력 클래스를 선언하고, 정의한다
		Scanner sc = new Scanner(System.in);
		// 입력 클래스 임포트

		// 입력 안내를 위한 문자열 출력
		System.out.println("이름 입력 : ");
		// 이름 변수를 선언하고, 해당 변수에 입력받은 이름 값을 대입한다.
		String name = sc.next();

		// 입력 안내를 위한 문자열 출력
		System.out.println("성별 입력 : ");
		// 성별 변수를 선언하고, 해당 변수에 입력받은 성별 값을 대입한다.
		String gender = sc.next();

		// 입력 받은 이름과 성별을 출력한다
		System.out.printf("이름은 %s이고 %s입니다.", name, gender);
	}
}
