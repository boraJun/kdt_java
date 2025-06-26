package method;

//1번 : 메소드사용이유1(중복된 코드의 제거)
public class MethodBasic01 {
	public static void main(String[] args) {
		//동일한 작업을 수행하는 코드를 여러번 작성하는 대신 메소드로 정의하면
		//코드의 가독성과 효율성이 향상된다
		
		//동일한 로직을 여러번 작성
		System.out.println("총 합 : " + (5 + 10));
		System.out.println("총 합 : " + (1 + 2));
		System.out.println("총 합 : " + (10 + 29));
		
		MethodBasic01 m = new MethodBasic01();
		
		m.printSum(5, 10);
		m.printSum(10, 29);
	}

	//메소드를 사용한 경우
	void printSum(int num1, int num2) {
		System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2);
		System.out.println("총 합 : " + (num1 + num2));
	}
}
