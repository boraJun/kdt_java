package accessModifier01;
//1번 : 접근제한자
public class AccessTarget {

	//생성자
	//기본생성자
	public AccessTarget() {
		System.out.println("public 생성자");
	}

	protected AccessTarget(String str) {
		System.out.println("protected 생성자 : " + str);
	}

	AccessTarget(int num) {
		System.out.println("default 생성자 : " + num);
	}
	
	private AccessTarget(double num) {
		System.out.println("private 생성자 : " + num);
	}
	
	//메소드
	public void publicMethod() {
		System.out.println("public Method");
	}
	
	protected void protectedMethod() {
		System.out.println("protected Method");
	}
	
	void defaultMethod() {
		System.out.println("default Method");
	}
	
	private void privateMethod() {
		System.out.println("private Method");
	}
}
