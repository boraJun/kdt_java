package homework09;

import java.util.Arrays;
import java.util.Scanner;

public class MethodTask02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask02 mt = new MethodTask02();

		// 1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
		// 메소드명 : checkNum
		System.out.println("문제 1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환");

		System.out.print("정수 입력 : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println(mt.checkNum(number)); // 메소드 호출 및 반환값 출력

		// 2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
		// 메소드명 : getSum
		System.out.println();
		System.out.println("문제 2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환");
		int ar[] = new int[10]; // 배열 선언 및 생성

		for (int i = 0; i < ar.length; i++) // 배열의 길이만큼 반복
		{
			ar[i] = i + 1; // 배열 값 정의
		}

		// 메소드 호출 및 반환값 및 결과 출력
		System.out.println(Arrays.toString(ar) + "의 총합 : " + mt.getSum(ar));

		// 3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
		// 메소드명 : reverseStr
		// hello => olleh
		System.out.println();
		System.out.println("문제 3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환");
		String input = "hello"; // 변수 선언
		// 메소드 호출 및 반환값 및 결과 출력
		System.out.println(input + " -> " + mt.reverseStr(input));

		// 4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
		// 메소드명 : contains
		// 배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
//	      syso(메소드명(배열명, 10)) => true
		System.out.println();
		System.out.println("문제 4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환");
		int value = 10; // 변수 선언

		// 메소드 호출 및 반환값 및 결과 출력
		System.out.println(Arrays.toString(ar) + "배열에 " + value + " 존재 : " + mt.contains(ar, value));

		// 5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
		// 메소드명 : printGugudan
		// 3 x 1 = 3
		// ...
		// 3 x 19 = _
		System.out.println();
		System.out.println("문제 5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력");
		int dan = 5; // 변수 선언
		mt.printGugudan(dan); // 메소드 호출

		// 6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
		// 메소드명 : compareLength
		System.out.println();
		System.out.println("문제 6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환");
		String str1, str2;

		System.out.print("문자열 1 : ");
		str1 = sc.nextLine();
		System.out.print("문자열 2 : ");
		str2 = sc.nextLine();

		System.out.println(str1 + "과(와) " + str2 + "의 길이는 " + mt.compareLength(str1, str2));

		// 7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
		// loginTry
		System.out.println();
		System.out.println("문제 7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환");

		int tryCount = 0;
		String id, password, result;

		while (true) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			System.out.print("비밀번호 : ");
			password = sc.nextLine();

			result = mt.loginTry(id, password, tryCount);

			if (result.equals("실패")) {
				System.out.println("로그인 실패");
				tryCount++;
			} else if (result.equals("잠금")) {
				System.out.println("3회 이상 실패로 계정을 잠급니다.");
				break;
			} else if (result.equals("성공")) {
				System.out.println("로그인 성공");
				break;
			}
		}

		System.out.println();
		System.out.println("문제 7-수정. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환");

		tryCount = 0;
		id = "";
		password = "";
		boolean bResult = false;

		while (true) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			System.out.print("비밀번호 : ");
			password = sc.nextLine();

			tryCount++;
			
			if (tryCount > 3) {
				System.out.println("계정 잠김");
				continue;
			}
			
			bResult = mt.loginTry(id, password);
			
			if (!bResult) {
				System.out.println("로그인 실패");
			} else {
				System.out.println("로그인 성공");
				break;
			}

			if (tryCount == 3) {
				System.out.println("3회 이상 실패로 계정을 잠급니다.");
			}
			
		}

		sc.close();
	}

	// 1. 정수1개를 받아서 짝수입니다. 홀수입니다를 반환하는 메소드
	// 메소드명 : checkNum

	// 1) 기능 => 정수1개를 받아서 짝수입니다. 홀수입니다를 반환
	// 2) 리턴타입 => String
	// 3) 메소드명 => checkNum
	// 4) 매개변수 => int 1개
	// 5) 구현부{
	// 정수형매개변수 % 2 == 0? "짝수입니다": "홀수입니다";
	// }

	String checkNum(int number) {
		return number + "는 " + (number % 2 == 0 ? "짝수입니다" : "홀수입니다");
	}

	// 2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
	// 메소드명 : getSum

	// 1) 기능 => 10칸짜리 정수 배열을 받아 총합을 계산하여 반환
	// 2) 리턴타입 => int
	// 3) 메소드명 => getSum
	// 4) 매개변수 => int[]
	// 5) 구현부
	// {
	// 정수형 변수 총합 선언
	// for(int num : 배열)
	// 배열에 있는 값을 모두 더한다
	// return 총합;
	// }
	int getSum(int[] arr) {
		int sum = 0;

		for (int num : arr) {
			sum += num;
		}

		return sum;
	}

	// 3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
	// 메소드명 : reverseStr
	// hello => olleh

	// 1) 기능 => 문자열을 매개변수로 받아 거꾸로 뒤집어 반환
	// 2) 리턴타입 => String
	// 3) 메소드명 => reverseStr
	// 4) 매개변수 => String
	// 5) 구현부
	// {
	// 반환할 String 변수 선언
	// for(매개변수의 길이만큼 반복){
	// String 변수에 거꾸로 추가
	// }
	// String 변수 반환
	// }

	String reverseStr(String input) {
		if (input == null)
			return "";

		String result = "";

		for (int i = 0; i < input.length(); i++) {
			result += input.charAt(input.length() - i - 1);
		}

		return result;
	}

	// 3-선생님. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
	// 메소드명 : reverseStr
	// hello => olleh

	// 1) char[]을 이용한 방식
	// 리턴타입 => void
	// 메소드명 => reverseStr1
	// 매개변수 => String 1개
	// 실행할문장 =>
	// 조건식(if문) 매개변수 == null
	// { return; }
	// int 변수1 = 매개변수명.length();
	// 문자형배열 변수2 = new char[변수1];
	// 반복문(for문) int i = 0; i < 변수1; i++
	// { 변수1[i] = 매개변수.charAt(변수1 - 1 - i); }
	// return => 문자열변수

	// 매개변수 o, 리턴값 x 메소드 정의
	char[] resverseStr1(String str) {
//	      if(str == null) {
//	         return null;
//	      }
		int len = str.length();
		char[] reverse = new char[len];
		String result = "";
		for (int i = 0; i < len; i++) {
			reverse[i] = str.charAt(len - 1 - i);
//	         result += reverse[i];
		}
		return reverse;
	}

	// 2) 뒤에서부터 문자를 하나씩 더해서 새로운 문자열 만드는 방식
	// 리턴타입 => void
	// 메소드명 => reverseStr2
	// 매개변수 => String str
	// 실행할 문장 =>
	// 조건문 if(str == null){ return null; }
	// 문자열 변수 선언
	// 반복문(for문) int i = str.length() -1; i >= 0; i--
	// { 변수 += str.charAt(i); }
	// return => 변수
	// 리턴타입 변경 => String

	String reverseStr2(String str) {
		if (str == null) {
			return null;
		}
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}

	// 4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
	// 메소드명 : contains
	// 배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
	// syso(메소드명(배열명, 10)) => true

	// 1) 기능 => 수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환
	// 2) 리턴타입 => boolean
	// 3) 메소드명 => contains
	// 4) 매개변수 => int[] , int
	// 5) 구현부
	// {
	// for(int value : 배열){
	// if(value == 정수형매개변수)
	// return true;
	// }
	//
	// return false;
	// }

	boolean contains(int[] arr, int number) {
		if (arr == null)
			return false;

		for (int value : arr) {
			if (value == number)
				return true;
		}

		return false;
	}

	// 5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
	// 메소드명 : printGugudan
	// 3 x 1 = 3
	// ...
	// 3 x 19 = -

	// 1) 기능 => 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력
	// 2) 리턴타입 => void
	// 3) 메소드명 => printGugudan
	// 4) 매개변수 => int
	// 5) 구현부
//	{
//		for(i를 1부터 19까지 반복)
//		{
//			syso( 매개변수 + "x" + i + " = " + (매개변수 * i));
//		}
//	}

	void printGugudan(int dan) {
		for (int i = 1; i <= 19; i++) {
			System.out.println(dan + "x" + i + " = " + (dan * i));
		}
	}

	// 6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 길이가 같으면 같음, 다르면 다름 반환하는 메소드
	// 메소드명 : compareLength

	// 1) 기능 => 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 길이가 같으면 같음, 다르면 다름 반환
	// 2) 리턴타입 => String
	// 3) 메소드명 => compareLength
	// 4) 매개변수 => String 2개
	// 5) 구현부
//	{
//		return 매개변수1.길이 == 매개변수2.길이 ? "같음" : "다름";
//	}

	String compareLength(String str1, String str2) {
		return str1.length() == str2.length() ? "같음" : "다름";
	}

	// 7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3번 넘기면 잠금 반환
	// loginTry
	// 1) 기능 => 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3번 넘기면 잠금 반환
	// 2) 리턴타입 => String
	// 3) 메소드명 => loginTry
	// 4) 매개변수 => String 2개 , int 1개
	// 5) 구현부
//	{
//		id, password 변수 선언 및 정의
//		if(id, password를 각 매개변수와 같은지 비교) {
//			return "성공";
//		}
//		
//		정수형매개변수++;
//		
//		return 정수형매개변수 >= 3? "잠금" : "실패";
//	}

	String loginTry(String inputId, String inputPassword, int tryCount) {
		String id = "admin";
		String password = "1234";

		if (id.equals(inputId) && password.equals(inputPassword)) {
			return "성공";
		}

		tryCount++;

		return tryCount >= 3 ? "잠금" : "실패";
	}

	// 7-수정. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3번 넘기면 잠금 반환
	// loginTry
	// 1) 기능 => 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3번 넘기면 잠금 반환
	// 2) 리턴타입 => boolean
	// 3) 메소드명 => loginTry
	// 4) 매개변수 => String 2개
	// 5) 구현부
//		{
//		id, password 변수 선언 및 정의
//		if(id, password를 각 매개변수와 같은지 비교) {
//			return true;
//		}
	//
//		return false;
	// }
	boolean loginTry(String inputId, String inputPassword) {
		String id = "admin";
		String password = "1234";

		if (id.equals(inputId) && password.equals(inputPassword)) {
			return true;
		}

		return false;
	}

}
