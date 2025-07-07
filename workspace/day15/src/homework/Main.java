package homework;

//공통메소드 : introduce()	자식클래스에서는 오버라이딩
//모든 필드는 private
//생성자는 이름을 갖고 있는 생성자

public class Main {
//	Main 클래스
//	static 메소드(printInfo())
//		객체 타입에 따라 다운 캐스팅하여 전용 메소드 실행
	public static void main(String[] args) {		
		Person[] people = {
				new Employee("노동자"),
				new Student("똑똑", true),
				new Teacher("티쳐")
		};
		
		String[] birtdayArr = {"19950121", "19900230", "20080510", "19910810"};
		
		for(int i = 0; i < people.length; i++) {
			people[i].setBirthday(birtdayArr[i]);
			
			printInfo(people[i]);
			System.out.println();
		}
	}
	
	static void printInfo(Person person) {
		person.introduce();
		
		if(person instanceof Employee) {
			((Employee) person).work();
		}else if(person instanceof Student) {
			((Student) person).study();
		}else if(person instanceof Teacher) {
			((Teacher) person).teach();
		}
	}
}
