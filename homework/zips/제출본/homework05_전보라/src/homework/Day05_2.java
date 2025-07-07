package homework;

import java.util.Scanner;

public class Day05_2 {
	public static void main(String[] args) {
/*
		2. 이름과 나이를 입력받아 내년 나이를 출력하기(nextInt() 사용금지)
		클래스명 : Day05_2

		[입출력예시]
		이름 : 홍길동
		나이 : 20
		홍길동님의 내년 나이는 21살입니다.
		만 나이는 19살입니다.
*/
		
		//입력 클래스 선언 후 정의
		Scanner sc = new Scanner(System.in);
		
		//입력 안내 문구 출력
		System.out.print("이름 : ");
		//문자열 변수 name 선언 후, 입력 값 대입
		String name = sc.nextLine();
		
		//입력 안내 문구 출력
		System.out.print("나이 : ");
		//정수형 변수 age 선언 후, 입력받은 문자열 값을 정수형으로 형변환하여 대입
		int age = Integer.parseInt(sc.nextLine());

		//결과 출력
		System.out.printf(
						"%s님의 내년 나이는 %d살입니다.\n" +
						"만 나이는 %d살입니다.",
						name, age + 1,
						age - 1
				);
		
		//스캐너 닫기
		sc.close();
	}
}
