package innerTest;

//26번 : 내부클래스와 외부클래스의 객체화
public class InnerMain {
	public static void main(String[] args) {
		//외부클래스의 객체 생성
//		Outer outer = new Outer();
//		System.out.println("외부 클래스의 참조값 : " + outer);
//		System.out.println("외부 클래스의 데이터값 : " + outer.var1);
//		System.out.println("내부 클래스의 데이터값 : " + outer.var2); 
		//외부클래스의 객체로는 내부 클래스 멤버에 접근 불가
		
		//내부클래스의 객체 생성
//		Inner inner = new Inner();
//		Outer.Inner inner = outer.new Inner();
		Outer.Inner inner2 = new Outer().new Inner();
		
		System.out.println(inner2);
	}
}
