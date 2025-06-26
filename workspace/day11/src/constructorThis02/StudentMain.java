package constructorThis02;

//5번 : 필드와 매개변수와 지역변수
class Student {
	// 필드
	String name;
	int age;

	// 생성자
	public Student(String name, int age) {
		this.name = name;
		this.age = age;

		System.out.println(this.name);
		System.out.println(name);
	}

	// 메소드
	void studentInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
	}

	void studentInfo(String name, int age) {
		System.out.println("이름 : " + name + ", 나이 : " + age);
		//위 라인의 name, age는 매개변수에 전달된 값(인수) stack 메모리
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
		//위 라인의 this.name, this.age는 객체의 필드에 저장된 값 heap 메모리
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student("짱구", 5);

		st1.studentInfo("철수", 6);
		System.out.println(st1.name);
	}
}
