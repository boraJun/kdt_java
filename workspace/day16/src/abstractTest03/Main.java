package abstractTest03;
//10번 : 클래스 단일 상속
class Parent{
	void printInfo() {
		System.out.println("부모 클래스");
	}
}

class Parent2{
	void printInfo2() {
		System.out.println("부모2 클래스");
	}
}

class Child extends Parent{
	void printShow() {
		System.out.println("자식 클래스");
	}
}

public class Main {

}
