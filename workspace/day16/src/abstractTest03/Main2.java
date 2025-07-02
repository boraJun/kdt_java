package abstractTest03;
//11번 : 인터페이스 다중 구현
interface InterA{
	void methodA();
}

interface InterB{
	void methodB();
}

class ClassC implements InterA, InterB{
	@Override
	public void methodA() {
		System.out.println("InterA의 메소드 구현");
	}

	@Override
	public void methodB() {
		System.out.println("InterB의 메소드 구현");
	}
	
	
}

public class Main2 {
	public static void main(String[] args) {
		InterA a = new ClassC();
		InterB b = new ClassC();
		ClassC c = new ClassC();
		
		a.methodA();
		b.methodB();
		c.methodA();
		c.methodB();
	}
}
