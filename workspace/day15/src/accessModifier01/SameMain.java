package accessModifier01;
//1번 : 접근제한자
public class SameMain {
	public static void main(String[] args) {
		System.out.println("======== 같은 패키지 내 접근 ========");
		
		AccessTarget a1 = new AccessTarget(); //public 생성자
		AccessTarget a2 = new AccessTarget("hello"); //protected 생성자
		AccessTarget a3 = new AccessTarget(123); //default 생성자
//		AccessTarget a4 = new AccessTarget(3.14); //private 생성자
		
		a1.publicMethod();
		a1.protectedMethod();
		a1.defaultMethod();
//		a1.privateMethod();
		a2.publicMethod();
		a2.protectedMethod();
		a2.defaultMethod();
//		a2.privateMethod();
	}
}
