package review;

import java.util.Scanner;

//3) 복습문제
public class Review01 {
	public static void main(String[] args) {
		//사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고
		//그 외 숫자를 입력 시에는 잘못 입력했습니다 출력하기
		
		//1)입력 클래스 선언 및 정의
		//2)숫자를 입력하세요 출력
		//3)정수형 변수 number 선언 및 입력받은 정수형 값을 대입
		//4)if(number >= 1 && number <= 10){ //1 ~ 10의 숫자인 경우
		//	//5) number * number 값 출력
		//}
		//6)else{
			//7) 잘못 입력했습니다 출력
		//}
		
		//스캐너 해제
		
		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		System.out.println("1부터 10사이의 숫자만 입력하세요");
//		num = sc.nextInt();
//		
//		if(1 <= num && num <= 10) {
//			System.out.println(num * num);
////			System.out.println(num * 2);
//		}else {
//			System.out.println("잘못 입력했습니다");
//		}
		
		//문자열끼리의 비교는 관계연산자(를) 사용하지 않고
		//.equals() 메소드를 사용해서 비교한다!!!
		
		System.out.println("문자열1 입력 : ");
		String data1 = sc.nextLine();
		System.out.println("문자열2 입력 : ");
		String data2 = sc.nextLine();
		System.out.println(data1 == data2);
		System.out.println(data1.equals(data2)); 
		
		
		if(data1.equals(data2)) {
			System.out.println("두 문자열은 같습니다");
		}else
		{
			System.out.println("두 문자열은 같지않습니다");
		}
		
		
		sc.close();
	}
}
