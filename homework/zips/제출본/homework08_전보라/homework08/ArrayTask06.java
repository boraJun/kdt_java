package homework08;

public class ArrayTask06 {
	public static void main(String[] args) {
//		6. A ~ F까지 중 C만 제외하고 배열에 담아 출력
		
		// 배열 선언 및 생성
		char[] charArr = new char[5];
		// 변수 선언
		char value;
		
		// i 값 0부터 배열의 길이(5)까지 반복하며 i 값 1씩 증가
		for (int i = 0; i < charArr.length; i++) {
			value = (char)('A' + i); // value 변수에 A ~ F 까지 값 대입
			
			if(value >= 'C') { //value 변수 값이 C보다 클 경우
				value += 1; //value 변수에 1값 더하기
			}
			
			charArr[i] = value; // charArr배열의 i 번째 위치에 value 변수 값 대입
		}

		// i 값 0부터 배열의 길이(5)까지 반복하며 i 값 1씩 증가
		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i] + " "); // 결과 출력
		}
	}
}
