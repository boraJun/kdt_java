package variable;
//3번 : 변수명 선언시 주의사항
public class Variable03 {
	public static void main(String[] args) { //main 메소드 중괄호영역 시작

		// 1) 문자부터 시작한다
//		int 1num = 10; //숫자부터 시작시 오류 발생
		int num1 = 10; //정수형 num1 변수를 선언하고, 10이라는 값을 대입
		int nu1m = 10; //정수형 nu1m 변수를 선언하고, 10이라는 값을 대입
//		int num1 = 100; //같은 영역 내에서 같은 이름의 변수 선언시 오류발생

		// 2) 특수문자를 쓸 수 없다(단, _와 $는 가능)
//		int @#$%^& = 100; //특수기호로 선언시 오류발생
		int a$b_ = 100; ////정수형 a$b_ 변수를 선언하고, 100이라는 값을 대입
		int _ab$ = 100; // 가능하지만 1) 문자부터 시작한다를 생각한다!!
		System.out.println(a$b_); // a$b_ 변수 값 출력

		// 3) 공백을 사용할 수 없다(카멜표기법, 스네이크표기법, 파스칼표기법 등을 활용한다)
//		String user name = "김영선";
		String userName = "김영선"; // 문자열 타입의 userName 변수를 선언하고, "김영선"이라는 값을 대입
		// 첫단어 소문자로 시작, 단어가 바뀔 때 첫문자를 대문자로 작성(카멜표기법, 변수명/메소드명 작성시)
		String user_name = "김영선"; // 문자열 타입의 user_name 변수를 선언하고, "김영선"이라는 값을 대입
		// 첫단어 소문자로 시작, 단어가 바뀔 때 언더바로 연결해서 작성(스네이크 표기법, 상수 작성시)
		String UserName = "김영선"; // 문자열 타입의 UserName 변수를 선언하고, "김영선"이라는 값을 대입
		// 첫단어의 첫문자를 대문자로 시작, 단어가 바뀔 때 첫문자를 대문자로 작성(파스칼표기법, 클래스명 작성시)

		// 4) 키워드(예약어) 사용할 수 없다
//		int int = 10;
//		int for = 10;
//		int public = 10;

		// 5) 되도록 소문자로 시작한다(대소문자를 구분)
		int Abc = 100; // 정수형 Abc 변수를 선언하고, 100 값을 대입
		int abc = 200; // 정수형 abc 변수를 선언하고, 200 값을 대입
		System.out.println(Abc); // 정수형 Abc 변수 출력
		System.out.println(abc); // 정수형 abc 변수 출력

		// name, age, data, number, num1, ..
	}  //main 메소드 중괄호 영역 끝
}






