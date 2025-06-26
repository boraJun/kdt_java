package constructorBasic01;

public class Tv {
	// 필드
	// 채널, 볼륨, 전원, 색상, 브랜드
	boolean power; // 기본값 : false
	int ch;
	int vol;
	String color;
	String brand;

	final int MAX_VOL = 100;
	final int MAX_CH = 50;
	
	// 생성자 alt + shift + s + o
	// 기본 생성자 => 개발자가 생성자를 만들지 않으면 컴파일러가 자동으로 생성한다
	public Tv() {
		
	}

	// 매개변수가 5개 있는 생성자
	public Tv(int ch, int vol, String color, String brand) {
		this.ch = ch;
		this.vol = vol;
		this.color = color;
		this.brand = brand;
	}

	// 메소드
	// 전원이 꺼져있으면 켜고, 켜져있으면 끄는 메소드
	// 메소드명 : powerOnOff()
	void powerOnOff() {
		power = !power;
		System.out.println("전원상태 : " + (power ? "켜짐" : "꺼짐"));
	}

	// 볼륨을 올릴 수 있는 메소드
	// 메소드명 : increaseVolume()
	// if~else문
	// power => true 볼륨 + 1
	// power => false 전원을 켜주세요
	void increaseVolume() {
		if (!power) {
			System.out.println("전원을 켜주세요");
			return;
		}

		if (vol < MAX_VOL) {
			vol++;
		} else {
			System.out.println("현재 최대 볼륨입니다");
		}

		System.out.println("vol : " + vol);
	}

	// 볼륨을 내릴 수 있는 메소드
	// 메소드명 : decreaseVolmue()
	void decreaseVolmue() {
		if (!power) {
			System.out.println("전원을 켜주세요");
			return;
		}

		if (vol > 0) {
			vol--;
		} else {
			System.out.println("현재 최소 볼륨입니다");
		}

		System.out.println("vol : " + vol);
	}

	// 채널을 올리는 메소드
	// 메소드명 : nextChannel()
	void nextChannel() {
		if (!power) {
			System.out.println("전원을 켜주세요");
			return;
		}

		// ch : 0 ~ MAX_CH
		ch = (ch + 1) % (MAX_CH + 1);

		System.out.println("채널 : " + ch);
	}

	// 채널 내리는 메소드
	// 메소드명 : previousChannel()
	void previousChannel() {
		if (!power) {
			System.out.println("전원을 켜주세요");
			return;
		}

		ch--;
		if (ch < 0) {
			ch = MAX_CH;
		}

		System.out.println("채널 : " + ch);
	}

	
}
