package accessModifier01;

//7번 : 접근 제한자
public class Parents {
	// 필드
//   접근제한자 타입 변수
	public String publicVar = "public";
	protected String protectedVar = "protected";
	String defaultVar = "default";
	private String privateVar = "private";

	public Parents() {
		int a = 0;
	}
	// 메소드
//   접근제한자 리턴타입 메소드명(자료형 매개변수){}
	public void printAccess() {
		System.out.println("======같은 클래스 내에서 필드 출력======");
		System.out.println(this.publicVar);
		System.out.println(this.protectedVar);
		System.out.println(this.defaultVar);
		System.out.println(this.privateVar);
	}

	// 메인메소드
	public static void main(String[] args) {
		Parents p = new Parents();
		p.printAccess();
	}
}
