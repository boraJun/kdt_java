package scanner;

import java.util.Scanner;

//10번 : 입력 클래스, 입력 메소드 실습2
public class ScannerTask02 {
	public static void main(String[] args) {
		
		//1. 줄 단위로 입력받아 출력하기(입력은 반드시 3번 입력받을 것, 출력은 1번만 사용해서 출력형태만들기)
		//입력1 : 자바는
		//입력2 : 객체지향
		//입력3 : 언어입니다
		//[출력]
		//자바는
		//객체지향
		//언어입니다
		
		//1) 입력클래스 import
		//2) 출력메시지1
		//3) 문자열 변수1 선언, next()
		//4) 출력메시지2
		//5) 문자열 변수2 선언, next()
		//6) 출력메시지3
		//7) 문자열 변수3 선언, next()
		//8) 출력 println
		Scanner sc = new Scanner(System.in); //입력클래스 선언 및 객체 생성 대입
		System.out.print("입력1 : "); // 출력
		String str1 = sc.next(); // 문자열 변수 str1 선언 후 입력 받은 문자열 대입
		System.out.print("입력2 : "); // 출력
		String str2 = sc.next(); // 문자열 변수 str2 선언 후 입력 받은 문자열 대입
		System.out.print("입력3 : "); // 출력
		String str3 = sc.next(); // 문자열 변수 str3 선언 후 입력 받은 문자열 대입

		System.out.println(str1 + "\n" + str2 + "\n" + str3); // 출력
		sc.nextLine(); // 버퍼 비우기
		
		//2. 이름과 나이, 취미를 순서대로 입력받기(입력메소드 이름과 취미 nextLine()사용, 나이는 next()사용)
//		출력 시 printf 사용, 형변환 반드시 적용해서 출력할 것, 덧셈연산자 사용
		
		//이름입력 : 홍길동
		//나이입력 : 20
		//취미입력 : 여행
		//[출력]
		//홍길동은 20살이고 취미는 여행입니다.
		//홍길동은 2026년에 21살입니다.
		
		//1) 입력 클래스, import
		//2) 입력 메시지 출력
		System.out.print("이름 입력 : "); // 출력
		//3) String 변수 2개, int 변수 1개
		String name, age, hobby; // 문자열 변수 name, age, hobby 선언
		//4) name 변수 = nextLine()
		name = sc.nextLine(); // str1 변수에 입력 받은 문자열 대입
		//5) 입력 메시지 출력
		System.out.print("\n나이 입력 : "); // 출력
		//6) age 변수 = next()
		age = sc.next(); // age 변수에 입력 받은 문자열 대입
		//7) 버퍼 비우기
		sc.nextLine(); // 버퍼 비우기
		
		//8) 입력메시지 출력
		System.out.print("\n취미 입력 : "); // 출력
		//9) hobby 변수 = nextLine()
		hobby = sc.nextLine(); // hobby 변수에 입력 받은 문자열 대입
		//10) 결과 출력 printf(), 형변환 덧셈연산 후 출력
		System.out.printf("%s의 나이는 %d이고 취미는 %s입니다\n", name, Integer.parseInt(age), hobby); // 출력, age 변수 값은 정수형으로 형변환 후 출력
		System.out.printf("%s는 2026년에 %d입니다", name, Integer.parseInt(age) + 1); // 출력, age 변수 값은 정수형으로 형변환 후 1 더한 값 출력
		
		//11) Scanner 닫기
		sc.close(); // 스캐너 닫기
		
	}
}
