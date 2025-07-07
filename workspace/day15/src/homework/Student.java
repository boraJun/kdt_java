package homework;

public class Student extends Person {
//	Student 클래스
//	필드 : boolean stu
//	생성자 : 매개변수 stu도 포함
//	메소드 : study()
//		이름이 공부합니다 출력
//	메소드 오버라이딩: 이름은 학생입니다 출력
	
	private boolean stu;

	public Student(String name, boolean stu) {
		super(name);
		this.stu = stu;
	}

	@Override
	public void introduce() {
		System.out.println(this.getName() + "은/는 학생" + (this.stu?"입니다" : "이 아닙니다"));
	}
	
	public void study() {
		System.out.println(this.getName() + "이/가 공부합니다");
	}
}
