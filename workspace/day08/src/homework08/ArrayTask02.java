package homework08;

public class ArrayTask02 {
	public static void main(String[] args) {
//		2. 1~10까지의 값을 배열에 넣고 총 합을 출력
		
		// 배열 선언 및 생성
		int[] numberArr = new int[10];
		
		//i 값 0부터 배열의 길이(10)까지 반복하며 i 값 1씩 증가
		for(int i =0; i < numberArr.length; i++) { 
			numberArr[i] = i + 1; //numberArr 배열 i 번째 위치에 i + 1 대입
		}
		
		//변수 선언 및 초기화
		int result = 0;
		
		//i 값 0부터 배열의 길이(10)까지 반복하며 i 값 1씩 증가
		for(int i = 0; i < numberArr.length; i++) { 
			result += numberArr[i]; //numberArr 배열 i 번째 값을 result 변수에 더한다.
		}
		
		System.out.println("1 ~ 10까지의 총 합 : " + result); //결과 출력
	}
}
