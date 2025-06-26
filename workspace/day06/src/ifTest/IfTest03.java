package ifTest;

//12번 : if ~ else if ~ else 문
public class IfTest03 {
	public static void main(String[] args) { //main 시작
		//양수, 음수, 0인지 출력
		
		System.out.println("출력 시작"); //출력
		
		int num = 0; //정수형 변수 선언 및 정의
		
		//num 변수 값 비교
		if (num > 0) { 
			//num 변수 값이 0보다 클 경우 출력
			System.out.println("양수입니다");
		}else if(num < 0) {
			//num 변수 값이 0보다 작을 경우 출력
			System.out.println("음수입니다");
		}else {
			//num 변수 값이 0보다 크지않고, 작지않은 경우 => 0일 경우 출력
			System.out.println("0입니다");
		}
		
		//num 변수 값 비교
		if (num > 5) { //num 변수 값이 5보다 큰가?
			//num 변수 값이 5보다 클 경우 출력
			System.out.println("5보다 큽니다");
		}else if(num > 3) { //num 변수 값이 3보다 큰가?
			//num 변수 값이 3보다 클 경우 출력
			System.out.println("3보다 큽입니다");
		}else { //num 변수 값이 5보다 크지 않고, 3보다 크지 않다
			//num 변수 값이 3보다 작거나 같을 경우 출력
			System.out.println(num);
		}

		System.out.println("출력 끝"); //출력
	} //main 끝
}
