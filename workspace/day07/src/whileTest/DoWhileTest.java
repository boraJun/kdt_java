package whileTest;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
//		int i = 1;
//		
//		do {
//			System.out.println("i의 값" +  i++);
//		}while(i <= 3);
		
		//사용자가 100보다 큰 수를 입력할 때까지 반복
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.println("100보다 큰 수를 입력해야 반복문 탈출합니다");
			System.out.println("숫자를 입력하세요 : ");
			
			num = sc.nextInt();
			System.out.println("입력한 수는 " + num + "입니다.");
		}while(num <= 100);
		
		sc.close();
	}
}
