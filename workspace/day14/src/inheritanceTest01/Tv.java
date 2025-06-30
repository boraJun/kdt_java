package inheritanceTest01;
//1번 : 상속 기초
public class Tv {
	//필드
	int ch;
	int vol;
	boolean power;
	
	//메소드
	//전원 powerOnOff
	void powerOnOff() {
		if(power) {
			System.out.println("tv가 켜져있습니다");
		}else {
			System.out.println("tv가 꺼져있습니다");
		}
	}
	
	//chUp
	void chUp() {
		System.out.println("채널을 올립니다");
	}
	
	//chDown
	void chDown() {
		System.out.println("채널을 내립니다");
	}
	
	//volUp
	void volUp() {
		System.out.println("볼륨을 올립니다");
	}
	
	//volDown
	void volDown() {
		System.out.println("볼륨을 내립니다");
	}
}
