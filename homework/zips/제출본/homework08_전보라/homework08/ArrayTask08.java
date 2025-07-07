package homework08;

import java.util.Scanner;

public class ArrayTask08 {
	public static void main(String[] args) {
//		8. 5개의 정수를 입력받은 뒤 그 값을 배열에 담고 최대값과 최소값 출력

		// 입력클래스 선언 및 생성
		Scanner sc = new Scanner(System.in);

		//배열 변수 선언 및 초기화
		int[] numberArr = new int[5];
		
		// i 값 0부터 배열의 길이(5)까지 반복하며 i 값 1씩 증가
		for (int i = 0; i < numberArr.length; i++) {
			//입력 문구 출력
			System.out.println("정수 입력" + (i + 1) + " (총 " + numberArr.length + "번)");
			numberArr[i] = sc.nextInt(); //입력받은 정수 값을 numberArr의 i 번째 위치에 대입
		}
		
		//변수 선언 및 초기화
		int minValue = numberArr[0], maxValue = numberArr[0];
		
		// i 값 1부터 배열의 길이(5)까지 반복하며 i 값 1씩 증가
		for(int i = 1; i < numberArr.length; i++) {
			 if(numberArr[i] > maxValue) { //최대값 보다 numberArr배열의 i 번째 값이 클 경우
				 maxValue = numberArr[i]; //numberArr 배열의 i 번째 값을 최대값에 대입
			 }
			 if(numberArr[i] < minValue) { //최소값 보다 numberArr배열의 i 번째 값이 작을 경우
				 minValue = numberArr[i]; //numberArr 배열의 i 번째 값을 최소값에 대입
			 }
		}
		
		//결과 출력
		System.out.println("최소값 : " + minValue + ", 최대값 : " + maxValue);
		
		// 스캐너 해제
		sc.close();
	}
}
