package accessModifier03;
//2번 : private 접근제한자
public class Person {
	//필드
	private String name;
	private int age;
	
	//setter 메소드 : name 필드 값을 설정(매개변수)
	//getter 메소드 : name 필드의 값을 반환(리턴)
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	void printInfo() {
		System.out.println(this.name + "님 환영합니다!");
	}
}
