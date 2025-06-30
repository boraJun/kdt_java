package review;

class Animal{
	//필드
	String name;
	int age;
	
	//생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	void eat(String food) {
		System.out.println(name + "이/가 " + food + "을/를 먹습니다");
	}
	
	void play() {
		System.out.println(name + "이/가 놀고있습니다");
	}
	
	void sleep() {
		System.out.println(name + "이/가 잠을 잡니다");
	}

	void sleep(int time) {
		System.out.println(name + "이/가 " + time + "시에 잠을 잡니다");
	}
}

public class Main {
	public static void main(String[] args) {
		//동물 클래스 작성
		//- Animal 클래스 정의
		// 필드 : 이름(name), 나이(age)
		// 메소드
		//	eat(String food) 	이름이 음식을 먹습니다 출력
		// 	play()				이름이 놀고있습니다 출력
		//	sleep()				이름이 잠을 잡니다 출력
		//	sleep(int time)		이름이 몇시에 잠을 잡니다 출력
		
		//main메소드에서 객체 2개 만들고 모든 메소드 호출하기
		
		Animal dog = new Animal("멍멍이", 3);
		Animal cat = new Animal("야옹이", 5);
		
		dog.eat("사료");
		cat.eat("츄르");
		
		dog.play();
		cat.play();
		
		dog.sleep();
		cat.sleep();
		
		dog.sleep(11);
		cat.sleep(10);
	}
}
