package ex04_전보라;

public class ForGugudan {
	public static void main(String[] args) {
//		문제 4. 구구단을 2단부터 9단까지 출력하세요. (20점)
//		- for문 이용 (ForGugudan) 로직구성 필요없음		 
//		- while문 이용(WhileGugudan) 로직구성 필요없음
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + (j * i) + "\t");
			}
			
			System.out.println();
		}
	}
}
