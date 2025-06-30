package inheritanceConstructor02;
//4번 : 상속관계-생성자 확인2
public class SuperCar extends Car{
	//필드
	boolean booster;

	//생성자
	public SuperCar(int price, boolean booster) {
		super("BMW", "RED", price);
		this.booster = booster;
	}
	public SuperCar(String brand, String color, int price, boolean booster) {
		super(brand, color, price);
		this.booster = booster;
	}
	
	//메소드
	void boosterOn() {
		System.out.println("부스터 가동");
	}
	
	void boosterOff() {
		System.out.println("부스터 중지");
	}
}
