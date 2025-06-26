package homework08;

import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
//		3. 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수를 출력

		// 입력 클래스 import
		Scanner sc = new Scanner(System.in);

		// 배열 선언 및 생성
		int[] mathScoreArr = new int[3];
		
		// 변수 선언 및 초기화
		double sumScore = 0;
		double avgScore = 0;

		// i 값 0부터 배열의 길이(3)까지 반복하며 i 값 1씩 증가
		for (int i = 0; i < mathScoreArr.length; i++) {
			System.out.print("점수입력 " + (i + 1) + " (총 " + mathScoreArr.length + "번) : ");
			mathScoreArr[i] = sc.nextInt(); // 입력 받은 정수값을 i 번째 배열 위치에 대입
		}

		// i 값 0부터 배열의 길이(3)까지 반복하며 i 값 1씩 증가
		for (int i = 0; i < mathScoreArr.length; i++) {
			sumScore += mathScoreArr[i]; // i 번째 배열 값을 변수에 더한다
		}

		avgScore = sumScore / mathScoreArr.length; // 평균 값 구하여 변수에 대입
		
		System.out.println("평균 점수 : " + avgScore); // 결과 출력
			
		// 스캐너 해제
		sc.close();
	}
}
