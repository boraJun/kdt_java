package accessModifier04;

//3번 : final
public class Car {
	// final : 최종을 의미하는 키워드
	// final 변수(상수) : 최종적인 값 => 값 변경 불가
	// final 클래스 : 최종적인 클래스 => 더 이상 상속 불가(자식클래스 만들 수 없다)
	// final 메소드 : 최종적인 메소드 => 오버라이딩 불가

	// 필드
	private int speed;

	// getter, setter : alt + shift + s + r
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// 메소드
	void speedUp() {
		speed += 10;
		System.out.println("현재시속 : " + this.speed);
	}

	// final 메소드 : 오버라이딩 불가한 메소드
	final void stop() {
		System.out.println("브레이크를 밟아 차를 멈춥니다");
		this.speed = 0;
	}
}
