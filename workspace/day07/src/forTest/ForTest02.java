package forTest;

import java.util.stream.IntStream;

public class ForTest02 {
	public static void main(String[] args) {
		// 1부터 100까지 수 중에서 짝수만 출력

		// 1) for문과 if문 사용
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}

		System.out.println();

		// 2) for문의 조건식을 50으로 사용
		for (int i = 0; i < 50; i++) {
			System.out.print((i + 1) * 2 + " ");
		}

		System.out.println();

		// 3) for문의 초기식을 2로 사용하여 증감식 변경
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1부터 100까지의 수 중에서 짝수의 합만 구하기
		// 1) 총 합 구할 변수 선언
		// 2) for문 		방법3 		방법2 		방법1
		// 		초기식 	int i = 2 	int i = 1 	int i = 0
		// 		조건식 	i <= 100 	i <= 50 	i <= 100
		// 		증감식 	i += 2 		i++ 		i++
		// {
		// 총합구할변수 += (i + 1) * 2
		// }
		// 3) 출력

		int total = 0;

		// 방법1
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0)
				total += i;
		}

		System.out.println("1) 짝수의 총합 : " + total);

		// 방법2
		total = 0;

		for (int i = 1; i <= 50; i++) {
			total += i * 2;
		}

		System.out.println("2) 짝수의 총합 : " +total);

		// 방법3
		total = 0;

		for (int i = 2; i <= 100; i += 2) {
			total += i;
		}

		System.out.println("3) 짝수의 총합 : " +total);
		
		//방법4) for문 사용하지 않기
		int num = 50;
		int sum = (num * (num + 1));
		
		System.out.println(sum);
		
		//방법5) 스트림
		int sum1 = IntStream.rangeClosed(1, 100).filter(i -> i % 2 ==0).sum();
		
		System.out.println(sum1);
	}
}
