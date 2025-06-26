package constructorThis01;

//3-2번 : 생성자 this
public class ClassTest {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a); // heap 메모리의 주소값
		a.method(10);
		a.num = 100;
		a.method(10);
	}
}