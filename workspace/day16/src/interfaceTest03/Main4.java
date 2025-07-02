package interfaceTest03;

class Parents {
	void parentsMethod() {
		System.out.println("Parents 클래스의 메소드");
	}
}

interface InterC {
	void interMethod1();
}

interface InterD {
	void interMethod2();

}

class C extends Parents implements InterC, InterD {

	@Override
	public void interMethod2() {
		System.out.println("InterA의 메소드 구현");

	}

	@Override
	public void interMethod1() {
		System.out.println("InterB의 메소드 구현");

	}

	@Override
	void parentsMethod() {
		System.out.println("자식클래스에서 메소드 오버라이딩");
	}

}

public class Main4 {
	public static void main(String[] args) {
		C obj = new C();
		obj.parentsMethod();
		obj.interMethod1();
		obj.interMethod2();
	}
}
