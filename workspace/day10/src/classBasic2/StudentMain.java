package classBasic2;

//11번 : Student 클래스 main
public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1); //classBasic2.Student@279f2327
		
		st1.name = "홍길동";
		st1.age = 17;
		st1.gpa = 4.5;

		System.out.println("이름 : " + st1.name);
		System.out.println("나이 : " + st1.age);
		System.out.println("학점 : " + st1.gpa);
	}
}
