package methodOverride01;
//6번 : 오버라이딩
public class Main {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.name = "동물";
		ani.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.name = "별이";
		cat.sound();
	}
}
