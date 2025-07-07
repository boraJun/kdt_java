package homework;

public class Employee extends Person {
//	Employee
//	필드 : x
//	메소드 : work()
//		업무를 처리중입니다 출력
//	메소드 오버라이딩 : 저의 이름은 이고 회사원입니다 출력

	public Employee(String name) {
		super(name);
	}

	@Override
	public void introduce() {
		System.out.println("저의 이름은 " + this.getName() + "이고 회사원입니다");
	}

	public void work() {
		System.out.println("업무를 처리 중입니다");
	}
}
