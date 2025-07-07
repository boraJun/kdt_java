package typeCasting;
//12번 : 강제형변환
public class TypeCasting02 {
	public static void main(String[] args) { //main 메소드 중괄호영역 시작
		// 형변환 연산자 (자료형)을 사용하여 강제 형변환을 한다
		// 큰 범위를 가진 자료형에서 작은 범위로 변환 시 데이터 손실이 발생할 수 있다
		// 컴파일러는 명시적인 강제 변환이 없으면 오류를 발생시킨다
		
		//1) 실수 -> 정수
		double num1 = 3.141592; // 실수형 num1 변수를 선언하고, 3.141592 값 대입
		int result1 = (int)num1; // 정수형 result1 변수를 선언하고, num1 변수 대입
		System.out.println(num1); // num1 변수 출력
		System.out.println(result1); // result1 변수 출력
		System.out.println("실수형 num1의 값 : " + num1 
				+ ", 정수형으로 변환된 값 : " + result1 ); // "실수형 num1의 값 : ", num1 변수,  ", 정수형으로 변환된 값 : ", resul1 변수를 연결하여 출력
		
		//2) 큰 범위 정수 -> 작은 범위 정수
		long num2 = 10L; //8byte // 정수형 num2 변수를 선언하고, 10 값 대입
		int result2 = (int)num2; //4byte // 정수형 result2 변수 선언하고, num2 변수 대입
		System.out.println("long 타입 num2의 값 : " + num2 
				+ ", int타입으로 변환된 값 : " + result2); // "long 타입 num2의 값 : ", num2 변수, ", int타입으로 변환된 값 : ", result2 변수 연결하여 출력
		 
		//3) 범위 초과
		long num3 = 2147483648L; // 정수형 num3 변수 선언하고, 2147483648 값 대입
		int result3 = (int) num3; // 정수형 result3 변수 선언하고, num3 변수 대입
		System.out.println("long타입 num3 값 : " + num3 + ", 왜곡된 값 : " + result3); // "long타입 num3 값 : ", num3 변수 ,", 왜곡된 값 : ", result3 변수 연결하여 출력
		// 음수가 나타나는 이유(overflow의 원리)
		// int의 범위는 32bit 자료형
		// 값의 범위 -2,147,483,648 ~ 2,147,483,647
		// long에서 int로 변환 => 2147483648은 int의 범위를 초과하므로 상위비트(초과된 비트)가 잘리게된다
		// 잘린값은 2의 보수 형식으로 계산되며 음수값으로 변환된다
		// 1000 0000 0000 0000 0000 0000 0000 0000(32비트)
		
		// 값 왜곡은 작은 자료형으로 형변환시 발생할 수 있는 문제이고 강제 형변환은 값의 범위를 
		// 초과하지 않을 때만 사용해야한다
		// 필요한 경우 변환하기 전에 범위를 확인해야한다
		
	} //main 메소드 중괄호영역 끝
}
