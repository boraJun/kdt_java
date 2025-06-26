package review;

public class ArrayTask01 {
	public static void main(String[] args) {
//		1. 100~1 까지의 값을 배열에 넣고 출력
		//1) 크기가 100인 배열 선언
		//2) for문을 통해 100부터 1까지 값 저장
		//3) for문 배열 출력
		
		int[] arr = new int[100];
		
		System.out.println(arr);
		
		// 값 저장하는 반복문
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 100 - i;
		}
		
		// 값 출력하는 반복문
		for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		}
	}
}
