package interfaceTest05;
//22번 : 메인 메소드
//인터페이스 내에서 static 메소드, private 메소드, default 메소드만 있어도 인터페이스 자체로 객체화는 불가능하다
public class CalculMain {
	public static void main(String[] args) {
		Calculator c = new CalculImpl();
		System.out.println(c);
		
		System.out.println(c.add(10, 20));
		System.out.println(c.add(10, -20));
		
		Calculator.info();
	}
}
