package forTest;
//7번 : for문과 기타제어문
public class ForTest03 {
	public static void main(String[] args) {
		//1부터 10까지 출력하기
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		//1부터 10까지 중 5까지만 출력하기
//		for(int i = 0; i <= 9; i++) {
//			System.out.println(i + 1);
//			
//			if(i == 4)
//				break;
//		}
		
		//1부터 10까지 중 5만 제외하고 출력하기
		for(int i = 0; i < 10; i++) {
			if(i == 4) 
				continue;
			System.out.println(i + 1);
		}
	}
}
