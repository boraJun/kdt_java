package methodTest;

import java.util.Arrays;
import java.util.Scanner;

public class MethodTask {
	public static void main(String[] args) {
		//입력 클래스 선언 및 생성
		Scanner sc = new Scanner(System.in);
		
		//MethodTask 클래스 변수 선언 및 객체 생성
		MethodTask mt = new MethodTask();

		// 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
		// 매개변수o, 리턴값o
		// 메소드명 : changeSign
		System.out.println("문제 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드"); //출력
		System.out.print("숫자입력 : "); //출력

		double dNumber = sc.nextDouble(); //입력
		sc.nextLine(); //버퍼 소모

		double dResult = mt.changeSign(dNumber); //메소드 호출

		System.out.println("양수 <-> 음수 결과 : " + dResult); //결과 출력

		// 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
		// 매개변수o, 리턴값o
		// 메소드명 : printName
		System.out.println("\n문제 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드"); //출력
		String name = ""; //변수 선언
		int count = 0; //변수 선언

		System.out.print("이름 : "); // 출력
		name = sc.nextLine(); // 입력 값 대입
		System.out.print("반복 수 : "); // 출력
		count = sc.nextInt(); // 입력 값 대입
		sc.nextLine(); //버퍼 소모

		mt.printName(name, count); // 메소드 호출

		// 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
		// 매개변수o, 리턴값o
		// 메소드명 : changeNumber
		System.out.println("\n문제 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드"); //출력
		int iNumber = 0; // 변수 선언

		System.out.print("숫자입력 : "); //출력
		iNumber = sc.nextInt(); // 입력 값 대입
		sc.nextLine(); //버퍼 소모

		int iResult = mt.changeNumber(iNumber); //메소드 호출 및 반환값 변수에 대입
		System.out.println("10이하의 숫자는 1, 10을 초과하는 숫자는 100 : " + iResult);// 출력

		// 4. 5개의 정수 중 평균을 반환하는 메소드
		// 매개변수o(배열), 리턴값o
		// 메소드명 : getAvg
		System.out.println("\n문제 4. 5개의 정수 중 평균을 반환하는 메소드"); 
		int[] numberArr = new int[5]; //배열 선언 및 초기화

		for (int i = 0; i < numberArr.length; i++) {
			System.out.println((i + 1) + "번째 정수 입력 (총 " + numberArr.length + "개): ");

			numberArr[i] = sc.nextInt(); // 입력 값 대입
			sc.nextLine(); //버퍼 소모
		}

		System.out.println("입력받은 " + numberArr.length + "개 정수의 평균값은 " + mt.getAvg(numberArr) + "입니다");

		// 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
		// 매개변수o(배열), 리턴값x
		// 메소드명 : printMinMax
		System.out.println("\n문제 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드");// 출력
		
		mt.printMinMax(numberArr);  // 메소드 호출
		
		// 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
		// 예시 ) BanAnA => bANaNa
		// 메소드명 : changeCase
		// 매개변수와 반환값은 자유 => 단, 형변환 이용할것!
		System.out.println("\n문제 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드"); // 출력
		System.out.print("문자열 입력 : ");// 출력
		String inputMsg = sc.nextLine(); // 입력 값 대입
		
		System.out.println(mt.changeCase(inputMsg)); // 메소드 호출
		
		// 7. 아이디와 비밀번호를 입력받아 로그인하기
		// 매개변수o 리턴값o(리턴타입 boolean)
		// 메소드명 : login
		// main 메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
		// 둘중하나라도 틀리면 다시 확인하세요 출력
		System.out.println("\n문제 7. 아이디와 비밀번호를 입력받아 로그인하기"); // 출력
		
		boolean result = false; //변수 선언
		
		do { //반복문
		System.out.print("아이디 : "); // 출력
		String id = sc.nextLine();// 입력 값 대입
		
		System.out.print("패스워드 : "); // 출력
		String pw = sc.nextLine();// 입력 값 대입
		
		result = mt.login(id, pw); //메소드 호출
		
		if(result) //성공했을 경우
			System.out.println("관리자님 환영합니다"); // 결과 출력
		else //실패했을 경우
			System.out.println("다시 확인하세요"); // 결과 출력
		}while(!result); //실패 시 반복
		
		sc.close(); //스캐너 해제
	}

	// 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
	// 매개변수o, 리턴값o
	// 메소드명 : changeSign
	double changeSign(double number) {
		return number * -1; //-1곱하여 양수 <-> 음수 변환 값 반환
	}

	// 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
	// 매개변수o, 리턴값o
	// 메소드명 : printName
	String printName(String name, int count) {
		String printValue = ""; //반환할 문자열 변수 선언

		for (int i = 0; i < count; i++) { //count 수 만큼 반복
			printValue += name + "\n"; //반환할 문자열에 이름 변수 값 추가
		}

		System.out.print(printValue);

		return printValue; //반환
	}

	// 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
	// 매개변수o, 리턴값o
	// 메소드명 : changeNumber
//	int changeNumber(int number) {
//		if (number <= 10) //number 값이 10 이하일 경우
//			return 1;//1 반환
//		else//number 값이 10 초과일 경우
//			return 100; //100 반환
//	}
	
	int changeNumber(int number) {
		return number <= 10? 1 : 100;
	}

	// 4. 5개의 정수 중 평균을 반환하는 메소드
	// 매개변수o(배열), 리턴값o
	// 메소드명 : getAvg
	double getAvg(int[] numberArr) {
		double result = 0; //변수 선언

		//배열의 길이만큼 반복
		for (int i = 0; i < numberArr.length; i++) {
			result += numberArr[i]; // 반환할 실수형 변수에 numberArr배열의 i번째 값 더하기
		}

		result = result / (double)numberArr.length; // result 변수 값에 numberArr의 길이로 나눠 평균값 구함

		return result; // result 변수 값 반환
	}

	// 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
	// 매개변수o(배열), 리턴값x
	// 메소드명 : printMinMax
	void printMinMax(int[] numberArr) {
		if (numberArr == null) { // numberArr 배열이 null일 경우
			System.out.println("입력 받은 값이 없습니다"); // 출력
			return; //메소드 끝
		}
		if (numberArr.length == 0) {// numberArr 배열의 길이가 0일 경우
			System.out.println("입력 받은 값이 없습니다"); // 출력
			return; //메소드 끝
		}

		int min = numberArr[0], max = numberArr[0]; // 정수형 변수 선언 및 초기화

		//numberArr 배열의 길이만큼 반복
		for (int i = 0; i < numberArr.length; i++) {
			if (min > numberArr[i]) // numberArr 배열의 i번째 값이 min 변수 값 보다 작을 경우
				min = numberArr[i]; // min 변수에 numberArr 배열의 i번째 값 대입
			if (max < numberArr[i])// numberArr 배열의 i번째 값이 max 변수 값 보다 클 경우
				max = numberArr[i]; // max 변수에 numberArr 배열의 i번째 값 대입
		}
		
		//결과 출력
		System.out.println(Arrays.toString(numberArr) + "\n배열의 최소값은 " + min + " 최대값은 " + max + "입니다.");
	}

	// 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	// 예시 ) BanAnA => bANaNa
	// 메소드명 : changeCase
	// 매개변수와 반환값은 자유 => 단, 형변환 이용할것!
	String changeCase(String input) {
		String result = ""; // 변수 선언 및 초기화
		char c = ' '; // 변수 선언 및 초기화

		//input 문자열의 길이만큼 반복
		for (int i = 0; i < input.length(); i++) {
			c = input.charAt(i); //input 문자열의 i번째 문자를 c 변수에 대입
			if ('a' <= c && c <= 'z') { // c 변수가 a와 z 문자 사이에 있을 경우
				c += 'A' - 'a'; // A - a 문자의 유니코드 차이 값 만큼 더함
			}
			else if ('A' <= c && c <= 'Z') { // c 변수가 A와 Z 문자 사이에 있을 경우
				c += 'a' - 'A';// a - A 문자의 유니코드 차이 값 만큼 더함
			}

			result += c; // 반환할 문자열에 더함
		}

		return result; // 문자열 반환
	}

	// 7. 아이디와 비밀번호를 입력받아 로그인하기
	// 매개변수o 리턴값o(리턴타입 boolean)
	// 메소드명 : login
	// main 메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
	// 둘중하나라도 틀리면 다시 확인하세요 출력
	boolean login(String inputId, String inputPassword) {
		String id = "admin"; //변수 선언 및 정의
		String password = "1234"; //변수 선언 및 정의
		
		//id 변수 값이 inputId 매개변수 값과 같고, password변수 값이 inputPassword 매개변수값과 같은 경우
		if (id.equals(inputId) && password.equals(inputPassword)) {
			return true; //true 반환
		}

		return false; //false 반환
	}

}
