package interfaceTest02;
//9번 : 인터페이스 , 참조변수의 다형성(캐스팅) 연습
public class Hiphop implements Music {
	@Override
	public void mode() {
		System.out.println("힙합 모드");
	}
	
	public void onlyHiphop() {
		System.out.println("오직 힙합만 실행");
	}
}
