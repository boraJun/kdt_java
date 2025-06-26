package staticTest;

//1번 : 정적블록
public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("메인메소드 실행");
	}
	
	//정적블록 : 클래스가 로드될 때 먼저 실행된다(main 메소드보다 먼저 출력)
	static {
		System.out.println("클래스가 로드될 때 이 블록이 실행됩니다");
	}
}
