package homework08;

public class ArrayTask05 {
	public static void main(String[] args) {
//		5. A ~ F까지를 배열에 값을 넣고 출력

		//배열 선언 및 생성
		char[] charArr = new char[6];

		//i 값 0부터 배열의 길이(6)까지 반복하며 i 값 1씩 증가
		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = (char)('A' + i); //charArr배열의 i 번째 값에 A ~ F 까지 값 대입
		}

		//i 값 0부터 배열의 길이(6)까지 반복하며 i 값 1씩 증가
		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i] + " "); //결과 출력
		}
	}
}
