package constructorOverloading;
//7번 : 생성자 오버로딩
public class Person {
	//필드
	String name;
	int age;
	String job;
	
	//1. 기본생성자
	public Person() {
		this.name = "이름없음";
		this.age = 0;
		
		System.out.println("기본 생성자가 호출되었습니다");
		System.out.println("생성자 : " + this);
	}

	//2. 이름만 초기화하는 생성자
	public Person(String name) {
		this.name = name;
		this.age = 10;
		System.out.println("이름은 인수로 받고 나이는 10살을 기본값으로 한 생성자가 호출되었습니다");
	}
	
	//3. 이름과 나이를 초기화하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		this.job = "미정";
		System.out.println("이름과 나이를 초기화한 생성자가 호출되었습니다");
	}
	
	//4.나이와 이름을 초기화하는 생성자
	public Person(int age, String name) {
		this(name, age);
	}

	//5. 이름과 직업을 초기화하는 생성자
	public Person(String name, String job) {
		this(name);
		this.job = job;
	}
	
	
	//6. 이름과 직업을 초기화하는 생성자
//	public Person(String job, String name) {
//		this.job = job;
//		this.name = name;
//	}

	
	//7. 이름과 나이와 직업을 초기화하는 생성자
	public Person(String name, int age, String job) {
		this(name, job);
		this.age = age;
	}
}
