package ex05_전보라;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력클래스 import
		Scanner sc = new Scanner(System.in);

		// 안내 문구 출력
		System.out.print("몇 명의 학생을 입력하겠습니다? ");

		int personCount = sc.nextInt(); // 정수형 변수 선언 및 정수 값을 입력받아 변수에 대입
		sc.nextLine(); // 버퍼소모
		System.out.println(); // 줄바꿈
		
		// Major 배열을 선언하고, 메소드 호출을 통해 Major 열거형의 상수들을 배열로 가져와 대입한다
		Major[] majors = Major.values();
		// 전공 선언 및 null로 초기화
		Major major = null;
		// 학생 배열 선언 - 배열의 크기는 입력 받은 학생의 수
		Student[] studentArr = new Student[personCount];

		// 입력받은 학생 수 만큼 반복
		for (int i = 0; i < personCount; i++) {
			// 변수 초기화
			major = null;

			// 안내 문구 출력
			System.out.println("[" + (i + 1) + "번째 학생 정보 입력]");
			System.out.print("이름: ");
			// 문자열 변수 선언 및 입력 받은 값 대입
			String name = sc.nextLine();

			System.out.print("전공(COMPUTER_SCIENCE, CYBER_SECURITY, ARTIFICIAL_INTELLIGENCE) : ");

			// 문자열 변수 선언 및 입력 받은 값을 변수에 대입
			String inputMajor = sc.nextLine();

			// majors 배열의 길이만큼 반복
			for (int j = 0; j < majors.length; j++) {
				// major 배열의 j 번째 값과 입력받은 문자열이 같을 경우
				if (majors[j].name().equals(inputMajor)) {
					major = majors[j]; // major 배열의 j 번째 값을 major에 대입
				}
			}

			// 전공이 null일 경우
			if (major == null) {
				System.out.println("존재하지 않는 전공입니다.");
				i--;
				continue;
			}

			// 점수 값 가질 정수형 변수 3개 선언
			int javaScore, dbmsScore, htmlScore;

			// 안내 문구 출력
			System.out.print("Java 점수 : ");
			javaScore = sc.nextInt(); // 입력 받은 정수 값을 변수에 대입
			sc.nextLine(); // 버퍼소모

			// 안내 문구 출력
			System.out.print("DBMS 점수 : ");
			dbmsScore = sc.nextInt();// 입력 받은 정수 값을 변수에 대입
			sc.nextLine(); // 버퍼소모

			// 안내 문구 출력
			System.out.print("HTMP 점수 : ");
			htmlScore = sc.nextInt();// 입력 받은 정수 값을 변수에 대입
			sc.nextLine(); // 버퍼소모

			// 학생 객체를 생성하여 학생 배열의 i 번째에 대입
			studentArr[i] = new Student(name, major, javaScore, dbmsScore, htmlScore);
			System.out.println(); // 줄바꿈
		}
		
		
		//안내 문구 출력
		System.out.println("==== 성적 출력 ====");

		// studentArr 배열의 길이(입력받은 학생 수)만큼 반복
		for (int i = 0; i < studentArr.length; i++) {
			//studentArr 배열의 i번째 객체의 값 및 메소드를 이용하여 결과 출력
			System.out.println(studentArr[i].name + "님의 전공은 " +studentArr[i].major.getKoreanName() + "입니다.");
			System.out.println("총점 : " +studentArr[i].getTotalScore()+"점");
			System.out.println("평균 : " +studentArr[i].getAverageScore()+"점");
			System.out.println(); // 줄바꿈
		}

		// 스캐너 해제
		sc.close();
	}
}
