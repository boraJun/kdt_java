package methodTest;

//9번 : 메소드 정의
public class MethodTest01 {
	public static void main(String[] args) {
		// 메소드 호출
//		System.out.println(add(10, 20));
		MethodTest01 mt1 = new MethodTest01();
		
		System.out.println(mt1); //참조값
		System.out.println(mt1.add(10, 20));
	}

	// 메소드 정의 순서
	// 1) 기능을 생각한다 (두 수를 더하는 기능)
//		반환타입 메소드명(자료형 매개변수) {}
	// 2) 반환타입이 생각나지 않는다면 우선 void를 작성한다
//		void 메소드명() {}
	// 3) 메소드명을 생각한다(기능에 알맞은 이름으로, 가능하면 동사로)
//		add, sum, plus, ...
//		void add(자로형 매개변수){}
	// 4) 매개변수를 생각한다(매개변수 2개)
//		void add(int num1, int num2) {}
	// 5) 실행할 문장을 작성한다
//		void add(int num1, int num2){
//			syso(num1 + num2);
//			int result = num1 + num2;
//			
//		}
	// 6) 리턴값을 생각한다
//		void add(int num1, int num2){
//			int result = num1 + num2;
//			return result;
//		}
	// 7) 리턴타입을 리턴값에 맞는 타입으로 변경한다
	int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
