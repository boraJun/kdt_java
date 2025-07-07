package variable;

//5번 : 변수와 상수의 차이
public class Variable04 {
	public static void main(String[] args) {  //main 메소드 중괄호영역 시작
		// 변수 선언
		// 자료형 변수명 = 값;

		// 상수 선언
		// final 자료형 변수명 = 값;

		// student라는 변수에 20이라는 값을 저장한다
		int student = 20;

		// MAX_STUDENT라는 상수에 25라는 값을 저장한다
		final int MAX_STUDENT = 25;

		// 출력
		System.out.println(student); // 정수형 studnet 변수 출력
		System.out.println(MAX_STUDENT); // 정수형 MAX_STUDENT 상수 출력

		// 변수에 저장되어있는 값 변경
		student = 25; // 정수형 student 변수에 25 값 대입
		System.out.println(student); // 정수형 student 변수 출력

		// 상수에 저장되어있는 값 변경 불가
//		MAX_STUDENT = 20;

	}  //main 메소드 중괄호 영역 끝
}
