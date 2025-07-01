package accessModifier04;
//3번 : final
public class CarMain {
	public static void main(String[] args) {
		Car c= new Car();
//		c.speed = 100;
		c.setSpeed(100);
		System.out.println(c.getSpeed());
		c.speedUp();
		
		SuperCar superCar = new SuperCar();
		superCar.speedUp(); 
		// 자식클래스의 객체는 오버라이딩 된 메소드를 호출
		superCar.stop();
		// 자식 클래스의 객체로 부모클래스의 final 메소드를 호출
	}
}
