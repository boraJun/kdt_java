package package05;

public class Main {
	public static void main(String[] args) {
		System.out.println("Section 5)");
		System.out.println("예제 5-4. 이등변 삼각형 만들기 - 거꾸로");
		
		for(int i = 6; i >= 0; i--) {
			for(int j = 0; j < 7 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2*i) + 1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

		System.out.println();
		System.out.println("문제 3. 1부터 100 까지의 정수 중에서 짝수만을 더해 코드를 for문을 사용해 작성해 보세요.");
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if((i % 2) == 0) {
				sum += i;
			}
		}
		
		System.out.println("결과 : " + sum);
		
		System.out.println();
		System.out.println("문제 4. 두 개의 주사위가 같은 값이 나올 때까지 while 문을 사용해 반복하고, 반복 횟수와 주사위 눈의 번호를 출력해해보세요.");
		
		int count = 0;
		int first = 0;
		int second = 0;
		
		do {
			first = (((int)(Math.random() * 100)) % 6) + 1;
			second = (((int)(Math.random() * 100)) % 6) + 1;
			
//			System.out.println(first + ", " + second);
			
			count++;
		}while(first != second);
		
		System.out.println("반복 횟수 : " + count + ", 주사위 눈의 번호 : " + first);
		
		System.out.println();
		System.out.println("문제 5. 다중 반복문을 사용해 같은 모양의 *를 출력하는 코드를 작성해 보세요.");
		
		for(int i = 0; i < 4; i++) {
			for(int j = 4 - i;  j > 0; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < (i + 1); k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("문제 6. 다중 반복문을 사용해 같은 모양의 *를 출력하는 코드를 작성해 보세요.");
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 6 - i * 2;  j > 0; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < (i * 2 + 1); k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
}
