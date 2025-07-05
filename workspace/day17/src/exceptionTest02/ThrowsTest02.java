package exceptionTest02;

import java.util.InputMismatchException;
import java.util.Scanner;

//14번 : 메소드 선언부에서의 throws
public class ThrowsTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			method(sc);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(InputMismatchException e){
			e.printStackTrace();
		}
		
		
		System.out.println("출력끝");
		
		sc.close();
	}
	
	static void method(Scanner sc) throws NumberFormatException {
		System.out.println("양수만 입력하세요!!");
		
		int result = sc.nextInt();
		
		if(result <= 0) {
//			throw new InputMismatchException();	
			throw new NumberFormatException();	
		}
			
		System.out.println("입력한 숫자는 " + result + "입니다");
	}
}
