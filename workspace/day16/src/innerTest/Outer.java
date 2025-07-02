package innerTest;

//25번 : 내부클래스
public class Outer {
	// Outer 클래스의 필드
	int var1;
	String data1 = "Outer";
	
	// Outer 클래스의 기본 생성자
	public Outer() {
		super(); //Object 클래스의 생성자 호출
		System.out.println("외부 클래스의 기본 생성자");
	}

	// Outer 클래스의 인스턴스 메소드
	void outerMethod() {
		System.out.println("외부 클래스의 메소드 호출");
	}
	
	// 내부 클래스 Inner 정의
	class Inner{
		//필드, 생성자, 메소드
		//Inner클래스의 필드
		int var2 = 10;
		String data2 = "Inner";
		
		//Inner 클래스의 생성자
		public Inner() {
			super(); //Object 클래스의 생성자 호출
			System.out.println(this);
			System.out.println("내부클래스의 생성자");
		}
		
		//Inner 클래스의 메소드
		void innerMethod() {
			System.out.println("내부 클래스의 메소드 호출");
			var1 = 100;
			this.var2 = 20;
//			this.var1 = 100; 오류발생
			System.out.println("내부 클래스의 메소드에서 var1의 값 : " + var1);
			System.out.println("내부 클래스의 메소드에서 var2의 값 : " + var2);
		}
	} //내부 클래스의 중괄호 끝
}//외부 클래스 중괄호 끝
