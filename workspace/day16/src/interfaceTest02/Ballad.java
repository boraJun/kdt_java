package interfaceTest02;
//9번 : 인터페이스 , 참조변수의 다형성(캐스팅) 연습
public class Ballad implements Music {

	@Override
	public void mode() {
		System.out.println("발라드 모드");
	}

	public void onlyBallad() {
		System.out.println("오직 발라드만 실행");
	}
}
