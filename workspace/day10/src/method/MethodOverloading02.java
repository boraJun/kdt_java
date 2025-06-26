package method;

//7번 : 메소드 오버로딩2
public class MethodOverloading02 {
	public static void main(String[] args) {
		MethodOverloading02 m = new MethodOverloading02();
		
		System.out.println(m.add(10, 20));
		System.out.println(m.add(1, 2, 3));
		
		m.add(10.5, 0);
		m.add(3.3, 4);
		
		m.test(0);
	}
	
	void test(long number) {
		System.out.println("long");
	}
	void test(float number) {
		System.out.println("float");
	}
	void test(double number) {
		System.out.println("double");
	}
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	//매개변수의 개수가 다른 add 메소드
	int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	//매개변수의 타입이 다른 add 메소드
	void add(double num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	//매개변수의 순서가 다른 add 메소드
	void add(int num1, double num2) {
		System.out.println(num1 + num2);
	}
}
