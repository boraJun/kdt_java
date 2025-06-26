package review;

import java.util.Scanner;

public class ArrayTask08 {
	public static void main(String[] args) {
//		8. 5개의 정수를 입력받은 뒤 그 값을 배열에 담고 최대값과 최소값 출력
//		1) 정수형 5칸짜리 배열 선언
//		2) 출력메시지(String msg 변수 선언)
//		3) 입력클래스 import
//		4) 최대값, 최소값 변수 선언
//		5) for 입력값 대입 반복문(초기식 int i = 0;	조건식 i < 배열명.length; 	증감식 i++)
//			msg 입력
//			배열명[i] = sc.nextInt();
//		6) 최대값, 최소값 변수 = 0번째 인덱스 값 대입
//		7) 크기 비교할 for문
//				if(최대값 < 배열명[i]) { 최대값 = 현재인덱스값 대입 }
//				if(최소값 > 배열명[i]) { 최소값 = 현재인덱스값 대입 }
//		8) 최대값, 최소값 출력
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		String msg = "번째 정수 입력 : ";
		int max = 0, min = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + msg);
			arr[i] = sc.nextInt();
//			System.out.println(arr[i]);
		}
		
		max = arr[0];
		min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
