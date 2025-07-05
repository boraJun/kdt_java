package interfaceTest06;
//23번 : 어댑터클래스
public class CeilingFan extends FanAdapter{
	//구현하는 클래스
	//CeilingFan 클래스
	//3개 메소드 천장선풍기를 켭니다, 천장선풍기를 끕니다, 비워두기
	
	@Override
	public void on() {
		System.out.println("천장선풍기를 켭니다");
	}

	@Override
	public void off() {
		System.out.println("천장선풍기를 끕니다");
	}
}
