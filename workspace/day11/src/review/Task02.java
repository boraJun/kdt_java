package review;

public class Task02 {
	public static void main(String[] args) {

		Animal dog = new Animal();
		System.out.println(dog);
		System.out.println(dog.name); // null
		dog.name = "멍멍이";
		dog.age = 1;
		dog.species = "시츄";
		System.out.println(dog.name);
		dog.printBrithday();

		Animal cat = new Animal();
		cat.name = "빵빵이";
		cat.age = 3;
		cat.species = "코숏";
		System.out.println(cat.name);
		System.out.println(cat.age);
		cat.eat("츄르");
	}
}