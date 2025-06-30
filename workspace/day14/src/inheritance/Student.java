package inheritance;
//5번: this, this(), super, super()
//자식 클래스
public class Student extends Person{
	//필드
	String major;
	
	//기본생성자
	public Student() {
		this("이름 없음", 0, "전공 없음");	//같은 클래스의 다른 생성자 호출(자기자신의 생성자 호출)
		System.out.println("Student 기본 생성자 호출");
	}

	public Student(String name, int age, String major) {
		super(name, age);	//부모 클래스의 생성자 호출
		this.major = major;
		System.out.println("Student 매개변수 생성자 호출");
	}	
	
	//메소드
	void introduce() {
		super.introduce();	//부모 클래스의 멤버 참조
		System.out.println("전공 : " + this.major);	//현재 객체 자신을 참조
	}
}
