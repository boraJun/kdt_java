package task;

public class Animal {
	// Animal 클래스 => 3개 객체만들기
	// 필드 : 동물이름, 나이, 종
	String name;
	int age;
	String species;

	//멤버변수 초기화를 위한 함수
	// 리턴값 : void
	// 메소드명 : init
	// 매개변수 : String, int, String
	void init(String _name, int _age, String _species) {
		//멤버변수 정의
		name = _name;
		age = _age;
		species = _species;
	}
	
	// 메소드
	// 동물이 먹이를 먹는 메소드 매개변수 1개
	// => 동물이름이 00을 먹습니다 출력

	// 리턴값 : void
	// 메소드명 : eat
	// 매개변수 : String
	void eat(String feed) {
		// 결과 출력
		System.out.println(name + "이(가) " + feed +"을(를) 먹습니다");
	}
	
	// 동물이 잠을 잡니다 출력하는 메소드
	// => 동물이름이 잠을 잡니다 출력

	// 리턴값 : void
	// 메소드명 : sleep
	// 매개변수 : x
	void sleep() {
		// 결과 출력
		System.out.println(name + "이 잠을 잡니다");
	}

	// 동물의 생일 축하하는 메소드 출력 메소드
	// => 동물이름의 나이를 축하합니다 출력

	// 리턴값 : void
	// 메소드명 : celerbrateBirthday
	// 매개변수 : x
	void celerbrateBirthday() {
		// 결과 출력
		System.out.println(name + "의 " + age + "를 축하합니다");
	}
}
