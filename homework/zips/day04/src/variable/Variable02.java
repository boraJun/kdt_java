package variable;
//2번 : 여러개 변수 선언
public class Variable02 { //클래스 중괄호 영역 시작
	public static void main(String[] args) { //main 메소드 중괄호영역 시작
		//여러개의 변수를 선언하기
		int num1 = 10; //정수형 num1 변수선언후 10이라는 정수형 값을 대입
		int num2 = 20; //정수형 num2 변수선언후 20이라는 정수형 값을 대입
		int num3 = 30; //정수형 num3 변수선언후 30이라는 정수형 값을 대입
		System.out.println(num1); //num1 변수 출력
		System.out.println(num2); //num2 변수에 저장된 정수형 값을 출력하고 줄바꿈한다
		System.out.println(num3); //num3 변수 출력
		System.out.println(num1 + num2 + num3); //정수형은 덧셈연산결과 확인이 가능하다
		
		int num4 = 10, num5 = 20, num6 = 30;
		//정수형 변수 num4에 10이라는 정수형값을 저장, num5에 20이라는 정수형값 저장, num6에 30이라는 정수형값을 저장한다
		//여러개의 변수를 선언 시 같은 타입이라면 ,를 이용해서 여러개 선언할 수 있다
		
//		int num4 = 10;
//		int num5 = 20;
//		int num6 = 30;
		System.out.println(num4); //num4 변수 출력
		System.out.println(num5); //num5 변수 출력
		System.out.println(num6); //num6 변수 출력
		
		
	} //main 메소드 중괄호 영역 끝
} //클래스 중괄호 영역 끝
