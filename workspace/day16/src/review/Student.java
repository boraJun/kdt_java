package review;

public class Student extends Person {
//	Student 클래스
//	필드 : boolean stu
//	생성자 : 매개변수 stu도 포함
//	메소드 : study()
//		이름이 공부합니다 출력
//	메소드 오버라이딩: 이름은 학생입니다 출력
	
	//필드
	private boolean stu;
	
	public Student(String name, boolean stu) {
		super(name); //부모의 생성자
		this.stu = stu;
	}
	
	//boolean의 필드일 경우 setter, getter 생성 시 is + 필드명
	public boolean isStu() {
		return stu;
	}

	//메소드 오버라이딩
	@Override
	void introduce() {
		System.out.println(this.getName() + "은 학생입니다");
	}
	
	//자식클래스의 메소드 추가
	void study() {
		System.out.println(this.getName() + "이/가 공부합니다");
	}
}
