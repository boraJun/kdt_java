package inheritanceConstructor02;
//4번 : 상속관계-생성자 확인2
public class Car {
	//필드
	String brand;
	String color;
	int price;
	
	//생성자
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	//메소드
	void engineStart() {
		System.out.println(this.brand + "의 시동이 켜졌습니다");
	}
	
	void engineStop() {
		System.out.println(this.brand + "의 시동이 꺼졌습니다");
	}
}
