package method;
//3번 : 메소드 사용이유3 (유지보수에 유리함)
public class MethodBasic03 {
	public static void main(String[] args) {
		// 코드의 구조를 모듈화(=부품화)함으로써 수정과 확장이 쉬워진다
		// 하나의 메소드만 변경하면 해당 메소드를 호출하는 모든 코드에 자동으로 반영되므로
		// 수정 범위를 최소화 시킬 수 있다
		
		MethodBasic03 m = new MethodBasic03();
		System.out.println("메소드 이용 25의 제곱 : " + m.calSquare(25));
		System.out.println("메소드 이용 3의 제곱 : " + m.calSquare(3));
	}
	
	//거듭 제곱을 구하는 메소드
	int calSquare(int num) {
		return num * num;
	}
}
