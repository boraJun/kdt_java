package constructorThis01;

//3-1번 : 생성자 this
public class A {
	// 필드
	int num;
	int num2;

	// 메소드
	void method(int num) {
		int num2;
		
		System.out.println("객체 자기자신(참조값) : " + this);
		System.out.println("매개변수 num : " + num);
		System.out.println("필드의 num : " + this.num);
	}
}
