package scanner;
import java.util.Scanner;

//5번 : 입력클래스(Scanner)
public class ScannerTest01 {
	public static void main(String[] args) {
//		System.out.println();
//		String name = "전보라";
		
		//입력 클래스
		//입력 메소드를 사용하기 위해서 아래 라인의 한줄이 반드시 작성되어야한다
		//자동 import 단축키 : ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");

//		String name = sc.next(); // next() 입력 메소드 : 입력을 받고 입력 받은 값을 String 타입으로 가져오는 기능을 한다				
//		System.out.println(name + "님 환영합니다.");

		String name1 = sc.nextLine();
		String name2 = sc.next();
//		String name3 = sc.next();

		System.out.println(name1);
		System.out.println(name2);
//		System.out.println(name3);
//		
//		String name4 = sc.nextLine();
//		System.out.println(name4);
	}
}
