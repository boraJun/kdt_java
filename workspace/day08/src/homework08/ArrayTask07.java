package homework08;

public class ArrayTask07 {
	public static void main(String[] args) {
//		7. aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담고 출력
		
		final int ARRAY_LENGTH = 'z' - 'a' + 1; //상수 선언 및 알파벳 개수 구하여 대입
		
		//배열 선언 및 생성
		char[] alpha = new char[ARRAY_LENGTH];
		
		// i 값 0부터 배열의 길이까지 반복하며 i 값 1씩 증가
		for(int i = 0; i < alpha.length; i++) {
			// i 값의 짝수 여부에 따라 소문자 또는 대문자를 i 번째 배열 위치에 대입
			alpha[i] = ((i % 2 == 0)? (char)('a' + i) :(char)('A' + i));
		}
		
		// i 값 0부터 배열의 길이까지 반복하며 i 값 1씩 증가
		for(int i = 0; i < alpha.length; i++) {			
			System.out.print(alpha[i]); //결과 출력
		} 
	}
}
