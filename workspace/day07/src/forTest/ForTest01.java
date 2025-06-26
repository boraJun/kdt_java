package forTest;

//4번 : for 문
public class ForTest01 {
	public static void main(String[] args) {
		
//		//for(초기식; 조건식; 증감식){}
//		for(int i = 0; i < 10; i++) {
//			//정수형 i가 0일 때부터 10보다 작을 떄까지 i를 1씩 증가시키면서 반복
//			System.out.println(i + "번 행복하다!");
////			break;
//		}
//		
//		for(int i = 1; i < 10; i++) {
//			System.out.println(i);
//		}
		
		//이름 10번 출력
		//초기식 i = 0; 
		//조건식 
		//증감식
		//출력 => 1번 000
		//		 2번 000
		//		 10번 000
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println((i + 1) + "번 000");
//		}
		
		//10번쨰
		//9번째
		//...
		//1번쨰
		
//		for(int i = 0; i < 10; i++) {
//			System.out.print((10 - i) + "번째\t");
//		}
//		
//		System.out.println();
//		
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i + "번째");
//		}
//
//		System.out.println();
//		
//		for(int i = 1; i < 11; i++) {
//			System.out.println((11 - i) + "번째");
//		}
		
		//첫번째 반복문
		//초기식 i = 0 	조건식 0 < 10 true	중괄호 	10-0이므로 10번째 출력	증감식 i++
		//현재 i = 1로 증가
		
		//두번째 반복문
		//				조건식 1 < 10 true	중괄호	10-1이므로 9번째 출력	증감식 i++
		//현재 i = 2로 증가
		
		//세번째 반복문
		//				조건식 2 < 10 true	중괄호	10-2이므로 8번째 출력	증감식 i++
		//현재 i = 3로 증가
		
		int number = 0;
		
		for(int i = 1; i <= 10; i++) {
			number += i;
		}
		
		System.out.println(number);
	}
}
