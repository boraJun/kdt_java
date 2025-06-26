package review;

public class ArrayTask04 {
	public static void main(String[] args) {
//		4. 0 1 2 3 0 1 2 3 배열에 담고 출력
		
//		1) 정수형 8칸짜리 배열 선언
//		2) for문(초기식 int i = 0; 조건식 i < 배열명.length; 증감식 i++)
//				배열명[i] = i % 4;
//				[0] = 0 % 4;		=> 0
//				[1] = 1 % 4;		=> 1
//				[2] = 2 % 4;		=> 2
//				[3] = 3 % 4;		=> 3
//				[4] = 4 % 4;		=> 0
//		3) for문 출력
		
		int[] arr = new int[8];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i % 4;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
