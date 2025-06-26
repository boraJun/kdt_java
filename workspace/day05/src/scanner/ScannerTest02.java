package scanner;

import java.util.Scanner;

//6번 : 입력메소드(next(), nextLine())
public class ScannerTest02 {
	public static void main(String[] args) {
		// import 단축키 : ctrl + shift + o
		Scanner sc = new Scanner(System.in);

		// next()는 임시 저장공간에서 엔터를 소모하지 않는다
		// 값을 입력하지 않고 엔터만 누르면 next()입장에서는 할일이 없기 때문에
		// 아무것도 하지 않고 계속 대기한다
		sc.next();
		sc.next();
		sc.next();

		// nextLine()은 하는일이 두가지이다
		// 1) 엔터 이전까지의 값을 가져온다
		// 2) 엔터를 임시 저장공간에서 지워준다(소모한다)
		// 값을 입력하지 않고 엔터만 눌러도 nextLine()은 엔터를 소모해야하는 일을 해야하므로
		// 엔터를 없애고 할 일을 마친다
		sc.nextLine();
		sc.nextLine();
		sc.nextLine();

//      sc.close(); //Scanner 객체 종료하고 내부에서 사용한 자원(메모리, 스트림 등)을 해제함
//      Scanner sc1 = new Scanner(System.in); //System.in 하나의 InputStream인데 sc.close가 System.in도 닫게된다
//      // new Scanner(System.in)을 사용하더라도 이미 닫힌 스트림의 재사용이기 때문에 에러 발생
//      sc1.nextLine();

	}
}
