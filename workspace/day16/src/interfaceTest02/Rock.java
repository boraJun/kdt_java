package interfaceTest02;
//9번 : 인터페이스 , 참조변수의 다형성(캐스팅) 연습
public class Rock implements Music{
	@Override
	public void mode() {
		System.out.println("락 모드");
	}

	public void onlyRock() {
		System.out.println("오직 락만 실행");
	}
}
