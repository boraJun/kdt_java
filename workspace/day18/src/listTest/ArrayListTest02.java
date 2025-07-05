package listTest;

class MyClass<T> {
	// 필드
	T data;

	// 생성자
	public MyClass(T data) {
		super();
		this.data = data;
	}

	// 메소드
	void printData() {
		System.out.println(data);
	}

}

public class ArrayListTest02 {
	public static void main(String[] args) {

		MyClass<Integer> mc1 = new MyClass<Integer>(1);

		System.out.println(mc1);
		mc1.printData();
		
		MyClass<String> mc2 = new MyClass<String>("java");
		System.out.println(mc2);
		mc2.printData();
	}
}