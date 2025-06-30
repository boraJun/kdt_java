package day10;

public class Gugudan01 {
//	※ twoForTest 패키지에 Gugudan01, Gugudan02, Gugudan03, Gugudan04 클래스 만들고
//	   2단 ~ 9단까지 구구단 만들어서 출력하기
//
//	//로직구성
//	바깥for문 초기식, 조건식, 증감식
//	안쪽for문 초기식, 조건식, 증감식
//	각 중괄호 영역 안에서의 출력문이 어떻게 될지 작성
//
//	1) 단별로 세로로 출력하기 Gugudan01
//	2단
//	2 x 1 = 2
//	2 x 2 = 4
//	...
//	2 x 9 = 18
//
//	3단
//	3 x 1 = 3
//	3 x 2 = 6
//	...
//	3 x 9 = 27
//
//	...
//
//	9단
//	9 x 1 = 9
//	...
//	9 x 9 = 81
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
