package method;
//4번 : stack 메모리
public class StackMethod {
	public static void main(String[] args) {
		
		//1. main 메소드 실행 -> 스택에 main 스택프레임이 생성
		// 참조변수 s가 main 스택 프레임에 저장됨
		// 지역변수 result가 main 스택 프레임에 저장됨
		
		//2. add 메소드 호출 -> 스택에 add 스택프레임 생성
		// 매개변수 num1, num2 변수가 add 스택 프레임에 저장됨
		// 매개변수 값 num1 + num2 값을 가진 상태
		
		//3. add 메소드 종료 -> add 스택프레임 삭제
		// num1, num2가 메모리에서 제거됨
		
		//4. main 스택프레임의 result 변수에 num1+num2 저장됨
		
		//5. main 메소드 종료 -> main 스택프레임 삭제
		
		StackMethod s = new StackMethod();
		
		int result = s.add(10, 20);
		System.out.println(result);
	}
	
	//두 정수의 합을 더하는 메소드
	int add(int num1, int num2) {
		System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2 );
		return num1 + num2;
	}
}
