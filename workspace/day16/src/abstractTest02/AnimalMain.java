package abstractTest02;
//5번 : 추상클래스와 강제성
public class AnimalMain {
	public static void main(String[] args) {
//		Animal animal = new Animal();
//		미완성된 클래스인 추상 클래스는 객체화 시킬 수 없다
		
		Animal dog = new Dog();
//		상속받은 자식 클래스에서 메소드 오버라이딩이 되면
//		부모타입(추상클래스타입)의 변수에 자식의 참조값을 넣어서 객체화 가능하다
//		이를 업캐스팅 이라고 한다
		
		Animal cat = new Cat();
		dog.crying(); //오버라이딩 된 메소드가 실행된다
		cat.crying();
	}
}
