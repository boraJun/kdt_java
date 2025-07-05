package interfaceTest06;

//23번 : 어댑터클래스 (메인클래스)
public class CeilingFanMain {
	public static void main(String[] args) {
		CeilingFanMain m = new CeilingFanMain();
		
		m.method(new CeilingFan());
		m.method(new TableFan());
		m.method(new TowerFan());
	}
	
	void method(Fan fan) {
		fan.on();
		fan.off();
		fan.turbo();
	}
}
