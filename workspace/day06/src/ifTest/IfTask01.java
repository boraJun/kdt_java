package ifTest;

import java.util.Scanner;

//11번 : if~else문 실습1
public class IfTask01 {
	public static void main(String[] args) { // main 시작
		//사용자로부터 숫자를 입력받아서 짝수인지 홀수인지 출력하기
		
		//입력 클래스 선언 및 정의
		Scanner sc = new Scanner(System.in);
		
		//안내 문구 출력
		System.out.print("숫자 입력 : ");
		//정수형 변수 선언 및 입력 받은 정수 값 대입
		int number = sc.nextInt();
		
		//짝수인지 여부 확인
		if((number % 2) == 0) { //number 변수 값을 2로 나눈 나머지가 0인가?
			//짝수일 경우
			//출력
			System.out.println(number + "는 짝수입니다.");
		}else{ //number 변수 값을 2로 나눈 나머지가 0이 아니다
			//홀수일 경우
			//출력
			System.out.println(number + "는 홀수입니다.");
		}
		
		//스캐너 해제
		sc.close();
		
		//삼항 연산자 사용하여 짝수, 홀수 여부 출력
		System.out.println((number % 2 == 0) ? "짝수입니다": "홀수입니다");
	}// main 끝
}
