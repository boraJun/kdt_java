package classBasic2;

//13번 : Car 클래스 main
public class CarMain {
	public static void main(String[] args) {
		//객체화(인스턴스화)
		Car myCar = new Car();
		
		myCar.model = "Tesla Model 3";
		myCar.color = "black";
		myCar.speed = 0;
		
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("현재 속도 : " + myCar.speed);
		
		myCar.accelerate(120);
		myCar.accelerate(180);
		System.out.println("현재 속도 : " + myCar.speed);
		
		myCar.stop();
		System.out.println("현재 속도 : " + myCar.speed);

		myCar.accelerate(20);
		System.out.println("현재 속도 : " + myCar.speed);
		
		myCar.decrease();
		System.out.println("현재 속도 : " + myCar.speed);

		myCar.decrease();
		System.out.println("현재 속도 : " + myCar.speed);

		myCar.decrease();
		System.out.println("현재 속도 : " + myCar.speed);
	}
}
