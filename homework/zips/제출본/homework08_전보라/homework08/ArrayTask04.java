package homework08;

public class ArrayTask04 {
	public static void main(String[] args) {
//		4. 0 1 2 3 0 1 2 3 배열에 담고 출력
		
		//배열 선언 및 생성
		int[] numberArr = new int[8];
		
		//i 값 0부터 배열의 길이(8)까지 반복하며 i 값 1씩 증가
		for(int i = 0; i < numberArr.length; i++) { 
			numberArr[i] = i % 4; //numberArr 배열 i 번째 위치에 i 값에 4나눈 나머지 값 대입
		}
		
		//i 값 0부터 배열의 길이(8)까지 반복하며 i 값 1씩 증가
		for(int i = 0; i < numberArr.length; i++) {
			System.out.print(numberArr[i] + " "); //결과 출력
		}
	}
}
