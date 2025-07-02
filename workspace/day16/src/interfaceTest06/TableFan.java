package interfaceTest06;
//23번 : 어댑터클래스
public class TableFan extends FanAdapter{
	//TableFan
	//탁자 선풍기를 켭니다, 탁자 선풍기를 끕니다, 비워두기

	@Override
	public void on() {
		System.out.println("탁자 선풍기를 켭니다");
	}

	@Override
	public void off() {
		System.out.println("탁자 선풍기를 끕니다");
	}
}
