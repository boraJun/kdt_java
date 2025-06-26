package scanner;

import java.util.Scanner;

//12번 : nextLine(), next(), nextInt(), nextDouble()
public class ScannerTest05 {
	public static void main(String[] args) {
		//입력클래스 import
		Scanner sc = new Scanner(System.in);
		
		//문자열 전체 입력(.nextLine())
		System.out.println("한 줄 전체 입력 : ");
		String line = sc.nextLine();
		
		//단어 하나 입력(.next())
		System.out.println("한 단어 입력 : ");
		String word = sc.next();
		
		//정수 입력(.nextInt())
		System.out.println("정수 입력 : ");
		int number = sc.nextInt();
		
		//실수 입력(.nextDouble())
		System.out.println("실수 입력 : ");
		double number2 = sc.nextDouble();
		
		System.out.println("==결과 출력==");
		System.out.println("nextLine()으로 입력받은 값 : " + line);
		System.out.println("next()으로 입력받은 값 : " + word);
		System.out.println("nextInt()으로 입력받은 값 : " + number);
		System.out.println("nextDouble()으로 입력받은 값 : " + number2);
	}
}
