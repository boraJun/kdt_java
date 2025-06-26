package task;

//메소드 문제
public class Task01 {
	// 1. 문자열 속의 단어를 공백 기준으로 세기
	// 메소드명 : countWord
	// 매개변수 : String str
	// ex) I love java => 3
	// ex) 안녕하세요 저는 김영선입니다 java 공부 중입니다=> 6

	// 리턴타입 : int
	// 매개변수 : String
	static int countWord(String str) {
		if (str == null) // str이 null일 때
			return 0; // 0 반환
		if (str.length() == 0)// str의 길이가 0일 때
			return 0; // 0 반환

		int word = 0; // 단어 개수 변수 선언
		boolean blank = true; // 빈칸 여부

		// str의 길이만큼 반복
		for (int i = 0; i < str.length(); i++) {
			// str의 i번째 문자가 ' ' 또는 '\n' 또는 '\t'일 경우
			if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') {
				blank = true; // 빈칸 변수에 true 대입
			} else {
				if (blank) // 빈칸 true일 경우
					word++; // 단어 수 1 증가
				blank = false;// 빈칸 변수에 false 대입
			}
		}

		return word; // 단어수 반환
	}

	// 2. 주민등록번호로 성별 판단하기
	// 메소드명 : getGender
	// 1, 3 => 남자
	// 2, 4 => 여자

	// 리턴타입 : String
	// 매개변수 : String
	static String getGender(String id) {
		if (id == null) // id 값이 null일 때
			return null; // null 반환
		if (id.length() != 14) // id 값의 길이가 14가 아닐 경우
			return null; // null 반환

		if (id.charAt(6) != '-') // id의 6번째 문자가 '-'가 아닐 경우
			return null; // null 반환

		for (int i = 0; i < id.length(); i++) {
			if (i == 6) // 6번째 문자일 경우
				continue; // 반복문 시작으로 이동

			// id의 i번째 문자가 0과 9사이의 값이 아닐 경우
			if (id.charAt(i) < '0' || '9' < id.charAt(i)) {
				return null; // null 반환
			}
		}

		char gender = id.charAt(7); // gender 변수 선언 및 id 값의 7번째 문자 값 대입

		// gender 변수의 값이 1 또는 3인 경우
		if (gender == '1' || gender == '3')
			return "남자"; // "남자" 반환
		// gender 변수의 값이 2 또는 4인 경우
		if (gender == '2' || gender == '4')
			return "여자"; // "여자" 반환

		return null; // null 반환
	}

	// 3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 평균을 구하여(정수형)
	// 각 학생별 학점 구하기
	// 메소드명 : getGrade
	// 95점 이상 A+
	// 90점 이상 A
	// 85점 이상 B+
	// 80점 이상 B
	// 75점 이상 C+
	// 70점 이상 C
	// 69점 이하 F

	// 리턴타입: void
	// 매개변수 : X
	static String getGrade(int math, int kor, int eng) {
		int avg = (math + kor + eng) / 3; // avg 변수 선언 및 평균 값 계산하여 대입

		if (avg > 100 || avg < 0) // avg 값이 0보다 작거나 100보다 큰 경우
			return "잘못된 입력"; // "잘못된 입력" 반환
		if (avg >= 95) // avg 값이 95점 이상인 경우
			return "A+";// 학점 반환
		if (avg >= 90) // avg 값이 90점 이상인 경우
			return "A";// 학점 반환
		if (avg >= 85) // avg 값이 85점 이상인 경우
			return "B+";// 학점 반환
		if (avg >= 80) // avg 값이 80점 이상인 경우
			return "B";// 학점 반환
		if (avg >= 75) // avg 값이 75점 이상인 경우
			return "C+";// 학점 반환
		if (avg >= 70) // avg 값이 70점 이상인 경우
			return "C";// 학점 반환

		return "F";// 학점 반환
	}

	public static void main(String[] args) {
		// 1. 문자열 속의 단어를 공백 기준으로 세기
		// 메소드명 : countWord
		System.out.println("문제 1. 문자열 속의 단어를 공백 기준으로 세기");

		//입력할 문자열 배열 선언 및 정의
		String[] input = { "I love java", " I love java", null, "안녕하세요 저는 김영선입니다 java 공부 중입니다",
				"안녕하세요\n 전보라입니다.\t    잘부탁드립니다." };

		int count = 0; //변수 선언

		//배열의 길이만큼 반복
		for (int i = 0; i < input.length; i++) {
			count = countWord(input[i]); // 메소드 호출 및 반환값 대입
			System.out.printf("\"%s\"의 단어 수 : %d\n", input[i], count); // 결과 출력
		}

		// 2. 주민등록번호로 성별 판단하기
		// 메소드명 : getGender
		System.out.println("\n문제 2. 주민등록번호로 성별 판단하기"); // 출력

		//입력할 문자열 배열 선언 및 정의
		input = new String[] { "123456-1222222", "123456-2222222", "123456-3222222", "123456-4222222", "11111111111111",
				"11111" };

		String gender = null; //변수 선언 및 초기화

		//배열의 길이만큼 반복
		for (int i = 0; i < input.length; i++) {
			gender = getGender(input[i]); //메소드 호출 및 반환 값 대입

			
			if (gender == null) //gender가 null일 경우
				System.out.println("잘못된 주민등록번호 : " + input[i]); //결과 출력
			else //gender가 null이 아닐 경우
				System.out.printf("주민등록번호 : %s, 성별 : %s\n", input[i], gender); //결과 출력
		}

		// 3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 평균을 구하여(정수형)
		// 각 학생별 학점 구하기
		// 메소드명 : getGrade

		//출력
		System.out.println("\n문제 3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 평균을 구하여(정수형) 각 학생별 학점 구하기");
		
		//변수 선언 및 정의
		int math = 100;
		int kor = 50;
		int eng = 75;
		//결과 출력
		System.out.println("학생 1의 평균 점수 : " + getGrade(math, kor, eng));

		//변수 정의
		math = 75;
		kor = 80;
		eng = 70;
		//결과 출력
		System.out.println("학생 2의 평균 점수 : " + getGrade(math, kor, eng));

		//변수 정의
		math = 100;
		kor = 80;
		eng = 80;
		//결과 출력
		System.out.println("학생 3의 평균 점수 : " + getGrade(math, kor, eng));
	}
}
