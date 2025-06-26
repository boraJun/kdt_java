package homework08;

public class ArrayTask01 {
	public static void main(String[] args) {
//		1. 100~1까지의 값을 배열에 넣고 출력
		
		//배열 선언 및 생성
		int[] numberArr = new int[100];
		
		for(int i = 0; i < numberArr.length; i++) {//i 값 0부터 배열의 길이(100)까지 반복하며 i 값 1씩 증가
			numberArr[i] = 100 - i; //numberArr 배열 i 번째 위치에 100 - i 값 대입
		}
		
		for(int i = 0; i < numberArr.length; i++) {//i 값 0부터 배열의 길이(100)까지 반복하며 i 값 1씩 증가
			System.out.print(numberArr[i] + " "); //출력
		}		
	}
}
