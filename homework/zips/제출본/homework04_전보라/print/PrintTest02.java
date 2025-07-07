package print;

//9번 : printf() 출력메소드
public class PrintTest02 {
	public static void main(String[] args) { //main 메소드 중괄호영역 시작

//		String name = "김영선";
//		int age = 20;
//		System.out.println("제 이름은 김영선이고, 나이는 20살 입니다.");
//		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
//		System.out.printf("제 이름은 %s이고, 나이는 %d살 입니다.", name, age);

		// 정수형
		int num1 = 200; // 정수형 num1 변수 선언하고, 200 대입
		System.out.printf("10진수 : %d\n", num1); //10진수 : num1 변수 값 출력
		System.out.printf("10진수 : %d\n", 10); //10진수 : 10 출력
		System.out.printf("8진수 : %o\n", 8); //8진수 : 8 출력
		System.out.printf("16진수 : %x", 16); // 16진수는 10 A, 11 B, .. 15 F, 16 => 10

		// 실수형
		System.out.printf("\n실수형 : %f\n", 3.123456589); //실수형 : 3.123456589 출력
		// float 타입 => 소수점이하 6자리까지 정확하게 나옴, 7자리이상이면 7번째 자리에서 반올림
		System.out.printf("실수형 2자리까지 표현 : %.2f\n", 3.12345); //실수형 2자리까지 표현 : 3.12 출력

		// 문자형
		System.out.printf("\n문자형 : %c", 'a'); //문자형 : a 출력

		// 문자열
		System.out.printf("\n문자열 : %s\n", "hello"); //문자열 : hello 출력
		String data = "hello, java"; // 문자열 data 변수 선언 후, hello, java 대입
		System.out.println(data); // data 변수 출력
		System.out.printf("문자열 : %.5s", data); // 문자열 : hello 출력
		
		//논리형(형식지정자 x)
		System.out.printf("\n논리형 : %s", true); // 논리형 : true 출력
		System.out.printf("\n논리형 : %.1s", true); // 논리형 : t 출력

	} //main 메소드 중괄호영역 끝
}
